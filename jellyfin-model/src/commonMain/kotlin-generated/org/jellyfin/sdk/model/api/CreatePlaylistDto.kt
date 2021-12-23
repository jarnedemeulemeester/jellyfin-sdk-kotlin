// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(UUIDSerializer::class)

package org.jellyfin.sdk.model.api

import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.sdk.model.UUID
import org.jellyfin.sdk.model.serializer.UUIDSerializer

/**
 * Create new playlist dto.
 */
@Serializable
public data class CreatePlaylistDto(
	/**
	 * Gets or sets the name of the new playlist.
	 */
	@SerialName("Name")
	public val name: String? = null,
	/**
	 * Gets or sets item ids to add to the playlist.
	 */
	@SerialName("Ids")
	public val ids: List<UUID>? = null,
	/**
	 * Gets or sets the user id.
	 */
	@SerialName("UserId")
	public val userId: UUID? = null,
	/**
	 * Gets or sets the media type.
	 */
	@SerialName("MediaType")
	public val mediaType: String? = null
)