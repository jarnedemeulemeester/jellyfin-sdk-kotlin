// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.api.operations

import io.ktor.utils.io.ByteReadChannel
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.buildMap
import kotlin.collections.emptyMap
import org.jellyfin.sdk.api.client.ApiClient
import org.jellyfin.sdk.api.client.Response
import org.jellyfin.sdk.api.client.extensions.`get`
import org.jellyfin.sdk.api.client.extensions.post

public class DlnaServerApi(
	private val api: ApiClient,
) : Api {
	/**
	 * Gets Dlna media receiver registrar xml.
	 *
	 * @param serverId Server UUID.
	 */
	public suspend fun getConnectionManager(serverId: String): Response<String> {
		val pathParameters = buildMap<String, Any?>(1) {
			put("serverId", serverId)
		}
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<String>("/Dlna/{serverId}/ConnectionManager", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets Dlna media receiver registrar xml.
	 *
	 * @param serverId Server UUID.
	 */
	public suspend fun getConnectionManager2(serverId: String): Response<String> {
		val pathParameters = buildMap<String, Any?>(1) {
			put("serverId", serverId)
		}
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<String>("/Dlna/{serverId}/ConnectionManager/ConnectionManager",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets Dlna media receiver registrar xml.
	 *
	 * @param serverId Server UUID.
	 */
	public suspend fun getConnectionManager3(serverId: String): Response<String> {
		val pathParameters = buildMap<String, Any?>(1) {
			put("serverId", serverId)
		}
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<String>("/Dlna/{serverId}/ConnectionManager/ConnectionManager.xml",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets Dlna content directory xml.
	 *
	 * @param serverId Server UUID.
	 */
	public suspend fun getContentDirectory(serverId: String): Response<String> {
		val pathParameters = buildMap<String, Any?>(1) {
			put("serverId", serverId)
		}
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<String>("/Dlna/{serverId}/ContentDirectory", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets Dlna content directory xml.
	 *
	 * @param serverId Server UUID.
	 */
	public suspend fun getContentDirectory2(serverId: String): Response<String> {
		val pathParameters = buildMap<String, Any?>(1) {
			put("serverId", serverId)
		}
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<String>("/Dlna/{serverId}/ContentDirectory/ContentDirectory",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets Dlna content directory xml.
	 *
	 * @param serverId Server UUID.
	 */
	public suspend fun getContentDirectory3(serverId: String): Response<String> {
		val pathParameters = buildMap<String, Any?>(1) {
			put("serverId", serverId)
		}
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<String>("/Dlna/{serverId}/ContentDirectory/ContentDirectory.xml",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Get Description Xml.
	 *
	 * @param serverId Server UUID.
	 */
	public suspend fun getDescriptionXml(serverId: String): Response<String> {
		val pathParameters = buildMap<String, Any?>(1) {
			put("serverId", serverId)
		}
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<String>("/Dlna/{serverId}/description", pathParameters, queryParameters,
				data)
		return response
	}

	/**
	 * Get Description Xml.
	 *
	 * @param serverId Server UUID.
	 */
	public suspend fun getDescriptionXml2(serverId: String): Response<String> {
		val pathParameters = buildMap<String, Any?>(1) {
			put("serverId", serverId)
		}
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<String>("/Dlna/{serverId}/description.xml", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets a server icon.
	 *
	 * @param fileName The icon filename.
	 */
	public suspend fun getIcon(fileName: String): Response<ByteReadChannel> {
		val pathParameters = buildMap<String, Any?>(1) {
			put("fileName", fileName)
		}
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<ByteReadChannel>("/Dlna/icons/{fileName}", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets a server icon.
	 *
	 * @param fileName The icon filename.
	 * @param includeCredentials Add the access token to the url to make an authenticated request.
	 */
	public fun getIconUrl(fileName: String, includeCredentials: Boolean = false): String {
		val pathParameters = buildMap<String, Any?>(1) {
			put("fileName", fileName)
		}
		val queryParameters = emptyMap<String, Any?>()
		return api.createUrl("/Dlna/icons/{fileName}", pathParameters, queryParameters,
				includeCredentials)
	}

	/**
	 * Gets a server icon.
	 *
	 * @param serverId Server UUID.
	 * @param fileName The icon filename.
	 */
	public suspend fun getIconId(serverId: String, fileName: String): Response<ByteReadChannel> {
		val pathParameters = buildMap<String, Any?>(2) {
			put("serverId", serverId)
			put("fileName", fileName)
		}
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<ByteReadChannel>("/Dlna/{serverId}/icons/{fileName}", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets a server icon.
	 *
	 * @param serverId Server UUID.
	 * @param fileName The icon filename.
	 * @param includeCredentials Add the access token to the url to make an authenticated request.
	 */
	public fun getIconIdUrl(
		serverId: String,
		fileName: String,
		includeCredentials: Boolean = false,
	): String {
		val pathParameters = buildMap<String, Any?>(2) {
			put("serverId", serverId)
			put("fileName", fileName)
		}
		val queryParameters = emptyMap<String, Any?>()
		return api.createUrl("/Dlna/{serverId}/icons/{fileName}", pathParameters, queryParameters,
				includeCredentials)
	}

	/**
	 * Gets Dlna media receiver registrar xml.
	 *
	 * @param serverId Server UUID.
	 */
	public suspend fun getMediaReceiverRegistrar(serverId: String): Response<String> {
		val pathParameters = buildMap<String, Any?>(1) {
			put("serverId", serverId)
		}
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<String>("/Dlna/{serverId}/MediaReceiverRegistrar", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets Dlna media receiver registrar xml.
	 *
	 * @param serverId Server UUID.
	 */
	public suspend fun getMediaReceiverRegistrar2(serverId: String): Response<String> {
		val pathParameters = buildMap<String, Any?>(1) {
			put("serverId", serverId)
		}
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<String>("/Dlna/{serverId}/MediaReceiverRegistrar/MediaReceiverRegistrar",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets Dlna media receiver registrar xml.
	 *
	 * @param serverId Server UUID.
	 */
	public suspend fun getMediaReceiverRegistrar3(serverId: String): Response<String> {
		val pathParameters = buildMap<String, Any?>(1) {
			put("serverId", serverId)
		}
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response =
				api.`get`<String>("/Dlna/{serverId}/MediaReceiverRegistrar/MediaReceiverRegistrar.xml",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Process a connection manager control request.
	 *
	 * @param serverId Server UUID.
	 */
	public suspend fun processConnectionManagerControlRequest(serverId: String): Response<String> {
		val pathParameters = buildMap<String, Any?>(1) {
			put("serverId", serverId)
		}
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.post<String>("/Dlna/{serverId}/ConnectionManager/Control", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Process a content directory control request.
	 *
	 * @param serverId Server UUID.
	 */
	public suspend fun processContentDirectoryControlRequest(serverId: String): Response<String> {
		val pathParameters = buildMap<String, Any?>(1) {
			put("serverId", serverId)
		}
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.post<String>("/Dlna/{serverId}/ContentDirectory/Control", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Process a media receiver registrar control request.
	 *
	 * @param serverId Server UUID.
	 */
	public suspend fun processMediaReceiverRegistrarControlRequest(serverId: String):
			Response<String> {
		val pathParameters = buildMap<String, Any?>(1) {
			put("serverId", serverId)
		}
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.post<String>("/Dlna/{serverId}/MediaReceiverRegistrar/Control", pathParameters,
				queryParameters, data)
		return response
	}
}
