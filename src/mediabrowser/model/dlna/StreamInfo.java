package mediabrowser.model.dlna;

import mediabrowser.model.drawing.*;
import mediabrowser.model.dto.*;
import mediabrowser.model.entities.*;
import mediabrowser.model.extensions.*;
import mediabrowser.model.mediainfo.*;
import mediabrowser.model.session.*;

/** 
 Class StreamInfo.
*/
public class StreamInfo
{
	private String ItemId;
	public final String getItemId()
	{
		return ItemId;
	}
	public final void setItemId(String value)
	{
		ItemId = value;
	}

	private PlayMethod PlayMethod = getPlayMethod().values()[0];
	public final PlayMethod getPlayMethod()
	{
		return PlayMethod;
	}
	public final void setPlayMethod(PlayMethod value)
	{
		PlayMethod = value;
	}
	private EncodingContext Context = EncodingContext.values()[0];
	public final EncodingContext getContext()
	{
		return Context;
	}
	public final void setContext(EncodingContext value)
	{
		Context = value;
	}

	private DlnaProfileType MediaType = DlnaProfileType.values()[0];
	public final DlnaProfileType getMediaType()
	{
		return MediaType;
	}
	public final void setMediaType(DlnaProfileType value)
	{
		MediaType = value;
	}

	private String Container;
	public final String getContainer()
	{
		return Container;
	}
	public final void setContainer(String value)
	{
		Container = value;
	}

	private String SubProtocol;
	public final String getSubProtocol()
	{
		return SubProtocol;
	}
	public final void setSubProtocol(String value)
	{
		SubProtocol = value;
	}

	private long StartPositionTicks;
	public final long getStartPositionTicks()
	{
		return StartPositionTicks;
	}
	public final void setStartPositionTicks(long value)
	{
		StartPositionTicks = value;
	}

	private String VideoCodec;
	public final String getVideoCodec()
	{
		return VideoCodec;
	}
	public final void setVideoCodec(String value)
	{
		VideoCodec = value;
	}
	private String VideoProfile;
	public final String getVideoProfile()
	{
		return VideoProfile;
	}
	public final void setVideoProfile(String value)
	{
		VideoProfile = value;
	}

	private Boolean Cabac = null;
	public final Boolean getCabac()
	{
		return Cabac;
	}
	public final void setCabac(Boolean value)
	{
		Cabac = value;
	}
	private String AudioCodec;
	public final String getAudioCodec()
	{
		return AudioCodec;
	}
	public final void setAudioCodec(String value)
	{
		AudioCodec = value;
	}

	private Integer AudioStreamIndex = null;
	public final Integer getAudioStreamIndex()
	{
		return AudioStreamIndex;
	}
	public final void setAudioStreamIndex(Integer value)
	{
		AudioStreamIndex = value;
	}

	private Integer SubtitleStreamIndex = null;
	public final Integer getSubtitleStreamIndex()
	{
		return SubtitleStreamIndex;
	}
	public final void setSubtitleStreamIndex(Integer value)
	{
		SubtitleStreamIndex = value;
	}

	private Integer MaxAudioChannels = null;
	public final Integer getMaxAudioChannels()
	{
		return MaxAudioChannels;
	}
	public final void setMaxAudioChannels(Integer value)
	{
		MaxAudioChannels = value;
	}

	private Integer AudioBitrate = null;
	public final Integer getAudioBitrate()
	{
		return AudioBitrate;
	}
	public final void setAudioBitrate(Integer value)
	{
		AudioBitrate = value;
	}

	private Integer VideoBitrate = null;
	public final Integer getVideoBitrate()
	{
		return VideoBitrate;
	}
	public final void setVideoBitrate(Integer value)
	{
		VideoBitrate = value;
	}

	private Integer VideoLevel = null;
	public final Integer getVideoLevel()
	{
		return VideoLevel;
	}
	public final void setVideoLevel(Integer value)
	{
		VideoLevel = value;
	}

	private Integer MaxWidth = null;
	public final Integer getMaxWidth()
	{
		return MaxWidth;
	}
	public final void setMaxWidth(Integer value)
	{
		MaxWidth = value;
	}
	private Integer MaxHeight = null;
	public final Integer getMaxHeight()
	{
		return MaxHeight;
	}
	public final void setMaxHeight(Integer value)
	{
		MaxHeight = value;
	}

	private Integer MaxVideoBitDepth = null;
	public final Integer getMaxVideoBitDepth()
	{
		return MaxVideoBitDepth;
	}
	public final void setMaxVideoBitDepth(Integer value)
	{
		MaxVideoBitDepth = value;
	}
	private Integer MaxRefFrames = null;
	public final Integer getMaxRefFrames()
	{
		return MaxRefFrames;
	}
	public final void setMaxRefFrames(Integer value)
	{
		MaxRefFrames = value;
	}

	private Float MaxFramerate = null;
	public final Float getMaxFramerate()
	{
		return MaxFramerate;
	}
	public final void setMaxFramerate(Float value)
	{
		MaxFramerate = value;
	}

	private DeviceProfile DeviceProfile;
	public final DeviceProfile getDeviceProfile()
	{
		return DeviceProfile;
	}
	public final void setDeviceProfile(DeviceProfile value)
	{
		DeviceProfile = value;
	}
	private String DeviceProfileId;
	public final String getDeviceProfileId()
	{
		return DeviceProfileId;
	}
	public final void setDeviceProfileId(String value)
	{
		DeviceProfileId = value;
	}
	private String DeviceId;
	public final String getDeviceId()
	{
		return DeviceId;
	}
	public final void setDeviceId(String value)
	{
		DeviceId = value;
	}

	private Long RunTimeTicks = null;
	public final Long getRunTimeTicks()
	{
		return RunTimeTicks;
	}
	public final void setRunTimeTicks(Long value)
	{
		RunTimeTicks = value;
	}

	private TranscodeSeekInfo TranscodeSeekInfo = getTranscodeSeekInfo().values()[0];
	public final TranscodeSeekInfo getTranscodeSeekInfo()
	{
		return TranscodeSeekInfo;
	}
	public final void setTranscodeSeekInfo(TranscodeSeekInfo value)
	{
		TranscodeSeekInfo = value;
	}

	private boolean EstimateContentLength;
	public final boolean getEstimateContentLength()
	{
		return EstimateContentLength;
	}
	public final void setEstimateContentLength(boolean value)
	{
		EstimateContentLength = value;
	}

	private MediaSourceInfo MediaSource;
	public final MediaSourceInfo getMediaSource()
	{
		return MediaSource;
	}
	public final void setMediaSource(MediaSourceInfo value)
	{
		MediaSource = value;
	}

	private SubtitleDeliveryMethod SubtitleDeliveryMethod = getSubtitleDeliveryMethod().values()[0];
	public final SubtitleDeliveryMethod getSubtitleDeliveryMethod()
	{
		return SubtitleDeliveryMethod;
	}
	public final void setSubtitleDeliveryMethod(SubtitleDeliveryMethod value)
	{
		SubtitleDeliveryMethod = value;
	}
	private String SubtitleFormat;
	public final String getSubtitleFormat()
	{
		return SubtitleFormat;
	}
	public final void setSubtitleFormat(String value)
	{
		SubtitleFormat = value;
	}

	private PlaybackInfoResponse PlaybackInfo;
	public final PlaybackInfoResponse getPlaybackInfo()
	{
		return PlaybackInfo;
	}
	public final void setPlaybackInfo(PlaybackInfoResponse value)
	{
		PlaybackInfo = value;
	}

	public final String getMediaSourceId()
	{
		return getMediaSource() == null ? null : getMediaSource().getId();
	}

	public final boolean getIsDirectStream()
	{
		return getPlayMethod() == PlayMethod.DirectStream || getPlayMethod() == PlayMethod.DirectPlay;
	}

	public final String ToUrl(String baseUrl, String accessToken)
	{
		if (getPlayMethod() == PlayMethod.DirectPlay)
		{
			return getMediaSource().getPath();
		}

		if (tangible.DotNetToJavaStringHelper.isNullOrEmpty(baseUrl))
		{
			throw new IllegalArgumentException(baseUrl);
		}

		java.util.ArrayList<String> list = new java.util.ArrayList<String>();
		for (NameValuePair pair : BuildParams(this, accessToken))
		{
			if (tangible.DotNetToJavaStringHelper.isNullOrEmpty(pair.getValue()))
			{
				continue;
			}

			// Try to keep the url clean by omitting defaults
			if (StringHelper.EqualsIgnoreCase(pair.getName(), "StartTimeTicks") && StringHelper.EqualsIgnoreCase(pair.getValue(), "0"))
			{
				continue;
			}
			if (StringHelper.EqualsIgnoreCase(pair.getName(), "SubtitleStreamIndex") && StringHelper.EqualsIgnoreCase(pair.getValue(), "-1"))
			{
				continue;
			}
			if (StringHelper.EqualsIgnoreCase(pair.getName(), "Static") && StringHelper.EqualsIgnoreCase(pair.getValue(), "false"))
			{
				continue;
			}

			list.add(String.format("%1$s=%2$s", pair.getName(), pair.getValue()));
		}

		String queryString = tangible.DotNetToJavaStringHelper.join("&", list.toArray(new String[0]));

		return GetUrl(baseUrl, queryString);
	}

	public final String ToDlnaUrl(String baseUrl, String accessToken)
	{
		if (getPlayMethod() == PlayMethod.DirectPlay)
		{
			return getMediaSource().getPath();
		}

		String dlnaCommand = BuildDlnaParam(this, accessToken);
		return GetUrl(baseUrl, dlnaCommand);
	}

	private String GetUrl(String baseUrl, String queryString)
	{
		if (tangible.DotNetToJavaStringHelper.isNullOrEmpty(baseUrl))
		{
			throw new IllegalArgumentException(baseUrl);
		}

		String extension = tangible.DotNetToJavaStringHelper.isNullOrEmpty(getContainer()) ? "" : "." + getContainer();

		baseUrl = tangible.DotNetToJavaStringHelper.trimEnd(baseUrl, '/');

		if (getMediaType() == DlnaProfileType.Audio)
		{
			return String.format("%1$s/audio/%2$s/stream%3$s?%4$s", baseUrl, getItemId(), extension, queryString);
		}

		if (StringHelper.EqualsIgnoreCase(getSubProtocol(), "hls"))
		{
			return String.format("%1$s/videos/%2$s/master.m3u8?%3$s", baseUrl, getItemId(), queryString);
		}

		return String.format("%1$s/videos/%2$s/stream%3$s?%4$s", baseUrl, getItemId(), extension, queryString);
	}

	private static String BuildDlnaParam(StreamInfo item, String accessToken)
	{
		java.util.ArrayList<String> list = new java.util.ArrayList<String>();

		for (NameValuePair pair : BuildParams(item, accessToken))
		{
			list.add(pair.getValue());
		}

		return String.format("Params=%1$s", tangible.DotNetToJavaStringHelper.join(";", list.toArray(new String[0])));
	}

	private static java.util.ArrayList<NameValuePair> BuildParams(StreamInfo item, String accessToken)
	{
		java.util.ArrayList<NameValuePair> list = new java.util.ArrayList<NameValuePair>();

		String tempVar = item.getDeviceProfileId();
		list.add(new NameValuePair("DeviceProfileId", (tempVar != null) ? tempVar : ""));
		String tempVar2 = item.getDeviceId();
		list.add(new NameValuePair("DeviceId", (tempVar2 != null) ? tempVar2 : ""));
		String tempVar3 = item.getMediaSourceId();
		list.add(new NameValuePair("MediaSourceId", (tempVar3 != null) ? tempVar3 : ""));
		list.add(new NameValuePair("Static", (new Boolean(item.getIsDirectStream())).toString().toLowerCase()));
		String tempVar4 = item.getVideoCodec();
		list.add(new NameValuePair("VideoCodec", (tempVar4 != null) ? tempVar4 : ""));
		String tempVar5 = item.getAudioCodec();
		list.add(new NameValuePair("AudioCodec", (tempVar5 != null) ? tempVar5 : ""));
		list.add(new NameValuePair("AudioStreamIndex", item.getAudioStreamIndex() != null ? StringHelper.ToStringCultureInvariant(item.getAudioStreamIndex()) : ""));
		list.add(new NameValuePair("SubtitleStreamIndex", item.getSubtitleStreamIndex() != null && item.getSubtitleDeliveryMethod() != mediabrowser.model.dlna.SubtitleDeliveryMethod.External ? StringHelper.ToStringCultureInvariant(item.getSubtitleStreamIndex()) : ""));
		list.add(new NameValuePair("VideoBitrate", item.getVideoBitrate() != null ? StringHelper.ToStringCultureInvariant(item.getVideoBitrate()) : ""));
		list.add(new NameValuePair("AudioBitrate", item.getAudioBitrate() != null ? StringHelper.ToStringCultureInvariant(item.getAudioBitrate()) : ""));
		list.add(new NameValuePair("MaxAudioChannels", item.getMaxAudioChannels() != null ? StringHelper.ToStringCultureInvariant(item.getMaxAudioChannels()) : ""));
		list.add(new NameValuePair("MaxFramerate", item.getMaxFramerate() != null ? StringHelper.ToStringCultureInvariant(item.getMaxFramerate()) : ""));
		list.add(new NameValuePair("MaxWidth", item.getMaxWidth() != null ? StringHelper.ToStringCultureInvariant(item.getMaxWidth()) : ""));
		list.add(new NameValuePair("MaxHeight", item.getMaxHeight() != null ? StringHelper.ToStringCultureInvariant(item.getMaxHeight()) : ""));
		list.add(new NameValuePair("StartTimeTicks", StringHelper.ToStringCultureInvariant(item.getStartPositionTicks())));
		list.add(new NameValuePair("Level", item.getVideoLevel() != null ? StringHelper.ToStringCultureInvariant(item.getVideoLevel()) : ""));

		list.add(new NameValuePair("ClientTime", item.getIsDirectStream() ? "" : String.valueOf(new java.util.Date().getTime())));
		list.add(new NameValuePair("MaxRefFrames", item.getMaxRefFrames() != null ? StringHelper.ToStringCultureInvariant(item.getMaxRefFrames()) : ""));
		list.add(new NameValuePair("MaxVideoBitDepth", item.getMaxVideoBitDepth() != null ? StringHelper.ToStringCultureInvariant(item.getMaxVideoBitDepth()) : ""));
		String tempVar6 = item.getVideoProfile();
		list.add(new NameValuePair("Profile", (tempVar6 != null) ? tempVar6 : ""));
		list.add(new NameValuePair("Cabac", item.getCabac() != null ? item.getCabac().toString() : ""));

		String streamId = item.getPlaybackInfo() == null ? null : item.getPlaybackInfo().getStreamId();
		list.add(new NameValuePair("StreamId", (streamId != null) ? streamId : ""));
		list.add(new NameValuePair("api_key", (accessToken != null) ? accessToken : ""));

		return list;
	}

	public final java.util.ArrayList<SubtitleStreamInfo> GetExternalSubtitles(boolean includeSelectedTrackOnly)
	{
		java.util.ArrayList<SubtitleStreamInfo> list = new java.util.ArrayList<SubtitleStreamInfo>();

		// First add the selected track
		if (getSubtitleStreamIndex() != null)
		{
			for (MediaStream stream : getMediaSource().getMediaStreams())
			{
				if (stream.getType() == MediaStreamType.Subtitle && stream.getIndex() == getSubtitleStreamIndex())
				{
					SubtitleStreamInfo info = GetSubtitleStreamInfo(stream);

					if (info != null)
					{
						list.add(info);
					}
				}
			}
		}

		if (!includeSelectedTrackOnly)
		{
			for (MediaStream stream : getMediaSource().getMediaStreams())
			{
				if (stream.getType() == MediaStreamType.Subtitle && (getSubtitleStreamIndex() == null || stream.getIndex() != getSubtitleStreamIndex()))
				{
					SubtitleStreamInfo info = GetSubtitleStreamInfo(stream);

					if (info != null)
					{
						list.add(info);
					}
				}
			}
		}

		return list;
	}

	public final java.util.ArrayList<SubtitleStreamInfo> GetExternalSubtitles(String baseUrl, String accessToken, boolean includeSelectedTrackOnly)
	{
		if (tangible.DotNetToJavaStringHelper.isNullOrEmpty(baseUrl))
		{
			throw new IllegalArgumentException(baseUrl);
		}

		java.util.ArrayList<SubtitleStreamInfo> list = new java.util.ArrayList<SubtitleStreamInfo>();

		// HLS will preserve timestamps so we can just grab the full subtitle stream
		long startPositionTicks = StringHelper.EqualsIgnoreCase(getSubProtocol(), "hls") ? 0 : getStartPositionTicks();

		// First add the selected track
		if (getSubtitleStreamIndex() != null)
		{
			for (MediaStream stream : getMediaSource().getMediaStreams())
			{
				if (stream.getType() == MediaStreamType.Subtitle && stream.getIndex() == getSubtitleStreamIndex())
				{
					SubtitleStreamInfo info = GetSubtitleStreamInfo(stream, baseUrl, accessToken, startPositionTicks);

					if (info != null)
					{
						list.add(info);
					}
				}
			}
		}

		if (!includeSelectedTrackOnly)
		{
			for (MediaStream stream : getMediaSource().getMediaStreams())
			{
				if (stream.getType() == MediaStreamType.Subtitle && (getSubtitleStreamIndex() == null || stream.getIndex() != getSubtitleStreamIndex()))
				{
					SubtitleStreamInfo info = GetSubtitleStreamInfo(stream, baseUrl, accessToken, startPositionTicks);

					if (info != null)
					{
						list.add(info);
					}
				}
			}
		}

		return list;
	}

	private SubtitleStreamInfo GetSubtitleStreamInfo(MediaStream stream, String baseUrl, String accessToken, long startPositionTicks)
	{
		SubtitleStreamInfo info = GetSubtitleStreamInfo(stream);

		if (info != null)
		{
			info.setUrl(String.format("%1$s/Videos/%2$s/%3$s/Subtitles/%4$s/%5$s/Stream.%6$s", baseUrl, getItemId(), getMediaSourceId(), StringHelper.ToStringCultureInvariant(stream.getIndex()), StringHelper.ToStringCultureInvariant(startPositionTicks), getSubtitleFormat()));
		}

		return info;
	}

	private SubtitleStreamInfo GetSubtitleStreamInfo(MediaStream stream)
	{
		SubtitleProfile subtitleProfile = StreamBuilder.GetSubtitleProfile(stream, getDeviceProfile().getSubtitleProfiles(), getContext());

		if (subtitleProfile.getMethod() != SubtitleDeliveryMethod.External)
		{
			return null;
		}

		SubtitleStreamInfo tempVar = new SubtitleStreamInfo();
		tempVar.setIsForced(stream.getIsForced());
		tempVar.setLanguage(stream.getLanguage());
		String tempVar2 = stream.getLanguage();
		tempVar.setName((tempVar2 != null) ? tempVar2 : "Unknown");
		tempVar.setFormat(getSubtitleFormat());
		tempVar.setIndex(stream.getIndex());
		return tempVar;
	}

	/** 
	 Returns the audio stream that will be used
	*/
	public final MediaStream getTargetAudioStream()
	{
		if (getMediaSource() != null)
		{
			return getMediaSource().GetDefaultAudioStream(getAudioStreamIndex());
		}

		return null;
	}

	/** 
	 Returns the video stream that will be used
	*/
	public final MediaStream getTargetVideoStream()
	{
		if (getMediaSource() != null)
		{
			return getMediaSource().getVideoStream();
		}

		return null;
	}

	/** 
	 Predicts the audio sample rate that will be in the output stream
	*/
	public final Integer getTargetAudioSampleRate()
	{
		MediaStream stream = getTargetAudioStream();
		return stream == null ? null : stream.getSampleRate();
	}

	/** 
	 Predicts the audio sample rate that will be in the output stream
	*/
	public final Integer getTargetVideoBitDepth()
	{
		MediaStream stream = getTargetVideoStream();
		return stream == null || !getIsDirectStream() ? null : stream.getBitDepth();
	}

	/** 
	 Gets the target reference frames.
	 
	 <value>The target reference frames.</value>
	*/
	public final Integer getTargetRefFrames()
	{
		MediaStream stream = getTargetVideoStream();
		return stream == null || !getIsDirectStream() ? null : stream.getRefFrames();
	}

	/** 
	 Predicts the audio sample rate that will be in the output stream
	*/
	public final Float getTargetFramerate()
	{
		MediaStream stream = getTargetVideoStream();
		Float tempVar = stream.getAverageFrameRate();
		return getMaxFramerate() != null && !getIsDirectStream() ? getMaxFramerate() : stream == null ? null : (tempVar != null) ? tempVar : stream.getRealFrameRate();
	}

	/** 
	 Predicts the audio sample rate that will be in the output stream
	*/
	public final Double getTargetVideoLevel()
	{
		MediaStream stream = getTargetVideoStream();
		return getVideoLevel() != null && !getIsDirectStream() ? getVideoLevel() : stream == null ? null : stream.getLevel();
	}

	/** 
	 Predicts the audio sample rate that will be in the output stream
	*/
	public final Integer getTargetPacketLength()
	{
		MediaStream stream = getTargetVideoStream();
		return !getIsDirectStream() ? null : stream == null ? null : stream.getPacketLength();
	}

	/** 
	 Predicts the audio sample rate that will be in the output stream
	*/
	public final String getTargetVideoProfile()
	{
		MediaStream stream = getTargetVideoStream();
		return !tangible.DotNetToJavaStringHelper.isNullOrEmpty(getVideoProfile()) && !getIsDirectStream() ? getVideoProfile() : stream == null ? null : stream.getProfile();
	}

	/** 
	 Predicts the audio bitrate that will be in the output stream
	*/
	public final Integer getTargetAudioBitrate()
	{
		MediaStream stream = getTargetAudioStream();
		return getAudioBitrate() != null && !getIsDirectStream() ? getAudioBitrate() : stream == null ? null : stream.getBitRate();
	}

	/** 
	 Predicts the audio channels that will be in the output stream
	*/
	public final Integer getTargetAudioChannels()
	{
		MediaStream stream = getTargetAudioStream();
		Integer streamChannels = stream == null ? null : stream.getChannels();

		if (getMaxAudioChannels() != null && !getIsDirectStream())
		{
			if (streamChannels != null)
			{
				return Math.min(getMaxAudioChannels(), streamChannels);
			}

			return getMaxAudioChannels();
		}

		return streamChannels;
	}

	/** 
	 Predicts the audio codec that will be in the output stream
	*/
	public final String getTargetAudioCodec()
	{
		MediaStream stream = getTargetAudioStream();

		return getIsDirectStream() ? (stream == null ? null : stream.getCodec()) : getAudioCodec();
	}

	/** 
	 Predicts the audio channels that will be in the output stream
	*/
	public final Long getTargetSize()
	{
		if (getIsDirectStream())
		{
			return getMediaSource().getSize();
		}

		if (getRunTimeTicks() != null)
		{
			Integer totalBitrate = getTargetTotalBitrate();

			double totalSeconds = getRunTimeTicks();
				// Convert to ms
			totalSeconds /= 10000;
				// Convert to seconds
			totalSeconds /= 1000;

			return totalBitrate != null ? java.lang.Math.round(totalBitrate * totalSeconds) : (Long)null;
		}

		return null;
	}

	public final Integer getTargetVideoBitrate()
	{
		MediaStream stream = getTargetVideoStream();

		return getVideoBitrate() != null && !getIsDirectStream() ? getVideoBitrate() : stream == null ? null : stream.getBitRate();
	}

	public final TransportStreamTimestamp getTargetTimestamp()
	{
		TransportStreamTimestamp defaultValue = StringHelper.EqualsIgnoreCase(getContainer(), "m2ts") ? TransportStreamTimestamp.Valid : TransportStreamTimestamp.None;

		TransportStreamTimestamp tempVar = getMediaSource().getTimestamp();
		return !getIsDirectStream() ? defaultValue : getMediaSource() == null ? defaultValue : (tempVar != null) ? tempVar : TransportStreamTimestamp.None;
	}

	public final Integer getTargetTotalBitrate()
	{
		Integer tempVar = getTargetAudioBitrate();
		Integer tempVar2 = getTargetVideoBitrate();
		return ((tempVar != null) ? tempVar : 0) + ((tempVar2 != null) ? tempVar2 : 0);
	}

	public final Boolean getIsTargetAnamorphic()
	{
		if (getIsDirectStream())
		{
			return getTargetVideoStream() == null ? null : getTargetVideoStream().getIsAnamorphic();
		}

		return false;
	}

	public final Boolean getIsTargetCabac()
	{
		if (getIsDirectStream())
		{
			return getTargetVideoStream() == null ? null : getTargetVideoStream().getIsCabac();
		}

		return true;
	}

	public final Integer getTargetWidth()
	{
		MediaStream videoStream = getTargetVideoStream();

		if (videoStream != null && videoStream.getWidth() != null && videoStream.getHeight() != null)
		{
			ImageSize tempVar = new ImageSize();
			tempVar.setWidth(videoStream.getWidth());
			tempVar.setHeight(videoStream.getHeight());
			ImageSize size = tempVar.clone();

			Double maxWidth = getMaxWidth() != null ? (double)getMaxWidth() : (Double)null;
			Double maxHeight = getMaxHeight() != null ? (double)getMaxHeight() : (Double)null;

			ImageSize newSize = DrawingUtils.Resize(size.clone(), null, null, maxWidth, maxHeight);

			return (int)newSize.getWidth();
		}

		return getMaxWidth();
	}

	public final Integer getTargetHeight()
	{
		MediaStream videoStream = getTargetVideoStream();

		if (videoStream != null && videoStream.getWidth() != null && videoStream.getHeight() != null)
		{
			ImageSize tempVar = new ImageSize();
			tempVar.setWidth(videoStream.getWidth());
			tempVar.setHeight(videoStream.getHeight());
			ImageSize size = tempVar.clone();

			Double maxWidth = getMaxWidth() != null ? (double)getMaxWidth() : (Double)null;
			Double maxHeight = getMaxHeight() != null ? (double)getMaxHeight() : (Double)null;

			ImageSize newSize = DrawingUtils.Resize(size.clone(), null, null, maxWidth, maxHeight);

			return (int)newSize.getHeight();
		}

		return getMaxHeight();
	}

	public final java.util.ArrayList<MediaStream> GetSelectableAudioStreams()
	{
		return GetSelectableStreams(MediaStreamType.Audio);
	}

	public final java.util.ArrayList<MediaStream> GetSelectableSubtitleStreams()
	{
		return GetSelectableStreams(MediaStreamType.Subtitle);
	}

	public final java.util.ArrayList<MediaStream> GetSelectableStreams(MediaStreamType type)
	{
		java.util.ArrayList<MediaStream> list = new java.util.ArrayList<MediaStream>();

		for (MediaStream stream : getMediaSource().getMediaStreams())
		{
			if (type == stream.getType())
			{
				list.add(stream);
			}
		}

		return list;
	}
}