package MediaBrowser.Model.Dlna;

import MediaBrowser.Model.Extensions.*;

public class Filter
{
	private java.util.ArrayList<String> _fields;
	private boolean _all;

	public Filter()
	{
		this("*");

	}

	public Filter(String filter)
	{
		_all = StringHelper.EqualsIgnoreCase(filter, "*");

		java.util.ArrayList<String> list = new java.util.ArrayList<String>();
		for (String s : ((filter != null) ? filter : "").split(new char[] {','}, StringSplitOptions.RemoveEmptyEntries))
		{
			list.add(s);
		}
		_fields = list;
	}

	public final boolean Contains(String field)
	{
		// Don't bother with this. Some clients (media monkey) use the filter and then don't display very well when very little data comes back.
		return true;
		//return _all || ListHelper.ContainsIgnoreCase(_fields, field);
	}
}