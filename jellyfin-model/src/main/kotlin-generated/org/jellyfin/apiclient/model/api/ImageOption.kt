// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlin.Int
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class ImageOption(
	@SerialName("Type")
	public val type: ImageType? = null,
	/**
	 * Gets or sets the limit.
	 */
	@SerialName("Limit")
	public val limit: Int,
	/**
	 * Gets or sets the minimum width.
	 */
	@SerialName("MinWidth")
	public val minWidth: Int
)