// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.api.operations

import java.util.UUID
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import org.jellyfin.apiclient.api.client.KtorClient
import org.jellyfin.apiclient.api.client.Response
import org.jellyfin.apiclient.model.api.BaseItemDtoQueryResult
import org.jellyfin.apiclient.model.api.CreatePlaylistDto
import org.jellyfin.apiclient.model.api.ImageType
import org.jellyfin.apiclient.model.api.ItemFields
import org.jellyfin.apiclient.model.api.PlaylistCreationResult

public class PlaylistsApi(
	private val api: KtorClient
) {
	/**
	 * For backwards compatibility parameters can be sent via Query or Body, with Query having higher
	 * precedence.
	 *
	 * @param name The playlist name.
	 * @param ids The item ids.
	 * @param userId The user id.
	 * @param mediaType The media type.
	 */
	public suspend fun createPlaylist(
		name: String? = null,
		ids: List<UUID>? = emptyList(),
		userId: UUID? = null,
		mediaType: String? = null,
		`data`: CreatePlaylistDto
	): Response<PlaylistCreationResult> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["name"] = name
		queryParameters["ids"] = ids
		queryParameters["userId"] = userId
		queryParameters["mediaType"] = mediaType
		val response = api.post<PlaylistCreationResult>("/Playlists", pathParameters, queryParameters,
				data)
		return response
	}

	/**
	 * Gets the original items of a playlist.
	 *
	 * @param playlistId The playlist id.
	 * @param userId User id.
	 * @param startIndex Optional. The record index to start at. All items with a lower index will be
	 * dropped from the results.
	 * @param limit Optional. The maximum number of records to return.
	 * @param fields Optional. Specify additional fields of information to return in the output.
	 * @param enableImages Optional. Include image information in output.
	 * @param enableUserData Optional. Include user data.
	 * @param imageTypeLimit Optional. The max number of images to return, per image type.
	 * @param enableImageTypes Optional. The image types to include in the output.
	 */
	public suspend fun getPlaylistItems(
		playlistId: UUID,
		userId: UUID,
		startIndex: Int? = null,
		limit: Int? = null,
		fields: List<ItemFields>? = emptyList(),
		enableImages: Boolean? = null,
		enableUserData: Boolean? = null,
		imageTypeLimit: Int? = null,
		enableImageTypes: List<ImageType>? = emptyList()
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["playlistId"] = playlistId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["userId"] = userId
		queryParameters["startIndex"] = startIndex
		queryParameters["limit"] = limit
		queryParameters["fields"] = fields
		queryParameters["enableImages"] = enableImages
		queryParameters["enableUserData"] = enableUserData
		queryParameters["imageTypeLimit"] = imageTypeLimit
		queryParameters["enableImageTypes"] = enableImageTypes
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/Playlists/{playlistId}/Items", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Adds items to a playlist.
	 *
	 * @param playlistId The playlist id.
	 * @param ids Item id, comma delimited.
	 * @param userId The userId.
	 */
	public suspend fun addToPlaylist(
		playlistId: UUID,
		ids: List<UUID>? = emptyList(),
		userId: UUID? = null
	): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["playlistId"] = playlistId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["ids"] = ids
		queryParameters["userId"] = userId
		val data = null
		val response = api.post<Unit>("/Playlists/{playlistId}/Items", pathParameters, queryParameters,
				data)
		return response
	}

	/**
	 * Removes items from a playlist.
	 *
	 * @param playlistId The playlist id.
	 * @param entryIds The item ids, comma delimited.
	 */
	public suspend fun removeFromPlaylist(playlistId: String, entryIds: List<String>? = emptyList()):
			Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["playlistId"] = playlistId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["entryIds"] = entryIds
		val data = null
		val response = api.delete<Unit>("/Playlists/{playlistId}/Items", pathParameters, queryParameters,
				data)
		return response
	}

	/**
	 * Moves a playlist item.
	 *
	 * @param playlistId The playlist id.
	 * @param itemId The item id.
	 * @param newIndex The new index.
	 */
	public suspend fun moveItem(
		playlistId: String,
		itemId: String,
		newIndex: Int
	): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["playlistId"] = playlistId
		pathParameters["itemId"] = itemId
		pathParameters["newIndex"] = newIndex
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.post<Unit>("/Playlists/{playlistId}/Items/{itemId}/Move/{newIndex}",
				pathParameters, queryParameters, data)
		return response
	}
}