package MediaBrowser.Model.ApiClient;

import MediaBrowser.Model.Connect.*;
import MediaBrowser.Model.System.*;

public class ServerInfo
{
	private String Name;
	public final String getName()
	{
		return Name;
	}
	public final void setName(String value)
	{
		Name = value;
	}
	private String Id;
	public final String getId()
	{
		return Id;
	}
	public final void setId(String value)
	{
		Id = value;
	}
	private String LocalAddress;
	public final String getLocalAddress()
	{
		return LocalAddress;
	}
	public final void setLocalAddress(String value)
	{
		LocalAddress = value;
	}
	private String RemoteAddress;
	public final String getRemoteAddress()
	{
		return RemoteAddress;
	}
	public final void setRemoteAddress(String value)
	{
		RemoteAddress = value;
	}
	private String UserId;
	public final String getUserId()
	{
		return UserId;
	}
	public final void setUserId(String value)
	{
		UserId = value;
	}
	private String AccessToken;
	public final String getAccessToken()
	{
		return AccessToken;
	}
	public final void setAccessToken(String value)
	{
		AccessToken = value;
	}
	private java.util.ArrayList<WakeOnLanInfo> WakeOnLanInfos;
	public final java.util.ArrayList<WakeOnLanInfo> getWakeOnLanInfos()
	{
		return WakeOnLanInfos;
	}
	public final void setWakeOnLanInfos(java.util.ArrayList<WakeOnLanInfo> value)
	{
		WakeOnLanInfos = value;
	}
	private java.util.Date DateLastAccessed = new java.util.Date(0);
	public final java.util.Date getDateLastAccessed()
	{
		return DateLastAccessed;
	}
	public final void setDateLastAccessed(java.util.Date value)
	{
		DateLastAccessed = value;
	}
	private String ExchangeToken;
	public final String getExchangeToken()
	{
		return ExchangeToken;
	}
	public final void setExchangeToken(String value)
	{
		ExchangeToken = value;
	}
	private UserLinkType UserLinkType = null;
	public final UserLinkType getUserLinkType()
	{
		return UserLinkType;
	}
	public final void setUserLinkType(UserLinkType value)
	{
		UserLinkType = value;
	}

	public ServerInfo()
	{
		setWakeOnLanInfos(new java.util.ArrayList<WakeOnLanInfo>());
	}

	public final void ImportInfo(PublicSystemInfo systemInfo)
	{
		setName(systemInfo.getServerName());
		setId(systemInfo.getId());

		if (!tangible.DotNetToJavaStringHelper.isNullOrEmpty(systemInfo.getLocalAddress()))
		{
			setLocalAddress(systemInfo.getLocalAddress());
		}
		if (!tangible.DotNetToJavaStringHelper.isNullOrEmpty(systemInfo.getWanAddress()))
		{
			setRemoteAddress(systemInfo.getWanAddress());
		}

		SystemInfo fullSystemInfo = (SystemInfo)((systemInfo instanceof SystemInfo) ? systemInfo : null);

		if (fullSystemInfo != null)
		{
			setWakeOnLanInfos(new java.util.ArrayList<WakeOnLanInfo>());

			if (!tangible.DotNetToJavaStringHelper.isNullOrEmpty(fullSystemInfo.getMacAddress()))
			{
				WakeOnLanInfo tempVar = new WakeOnLanInfo();
				tempVar.setMacAddress(fullSystemInfo.getMacAddress());
				getWakeOnLanInfos().add(tempVar);
			}
		}
	}

}