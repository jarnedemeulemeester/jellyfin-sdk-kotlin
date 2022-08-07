package org.jellyfin.openapi.builder.extra

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName
import com.squareup.kotlinpoet.TypeName
import org.jellyfin.openapi.constants.Types
import org.jellyfin.openapi.model.ApiServiceOperationParameter
import org.jellyfin.openapi.model.CustomDefaultValue
import org.jellyfin.openapi.model.ObjectApiModelProperty

fun ParameterSpec.Builder.defaultValue(
	type: TypeName,
	defaultValue: Any?,
	allowEmptyCollection: Boolean,
) {
	// Determine class name without parameters
	val typeClassName = when (type) {
		is ClassName -> type
		is ParameterizedTypeName -> type.rawType
		else -> null
	}

	// Set default value
	when (defaultValue) {
		is String -> defaultValue("%S", defaultValue)
		is Int -> defaultValue("%L", defaultValue)
		is Boolean -> defaultValue("%L", defaultValue)
		is CustomDefaultValue -> defaultValue(defaultValue.build())
		// Set value to null by default for nullable values
		null -> when {
			typeClassName == Types.COLLECTION && allowEmptyCollection ->
				defaultValue("%M()", MemberName("kotlin.collections", "emptyList"))

			typeClassName == Types.LIST && allowEmptyCollection ->
				defaultValue("%M()", MemberName("kotlin.collections", "emptyList"))

			typeClassName == Types.MAP && allowEmptyCollection ->
				defaultValue("%M()", MemberName("kotlin.collections", "emptyMap"))

			type.isNullable -> defaultValue("%L", "null")
		}
	}
}

fun ParameterSpec.Builder.defaultValue(parameter: ApiServiceOperationParameter) = defaultValue(
	type = parameter.type,
	defaultValue = parameter.defaultValue,
	allowEmptyCollection = true,
)

fun ParameterSpec.Builder.defaultValue(property: ObjectApiModelProperty) = defaultValue(
	type = property.type,
	defaultValue = property.defaultValue,
	allowEmptyCollection = false,
)