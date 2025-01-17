// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package videoplayer.proxies;

public class VideoPlayer
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject videoPlayerMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "VideoPlayer.VideoPlayer";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		url("url");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public VideoPlayer(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "VideoPlayer.VideoPlayer"));
	}

	protected VideoPlayer(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject videoPlayerMendixObject)
	{
		if (videoPlayerMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("VideoPlayer.VideoPlayer", videoPlayerMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a VideoPlayer.VideoPlayer");

		this.videoPlayerMendixObject = videoPlayerMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'VideoPlayer.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static videoplayer.proxies.VideoPlayer initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return videoplayer.proxies.VideoPlayer.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static videoplayer.proxies.VideoPlayer initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new videoplayer.proxies.VideoPlayer(context, mendixObject);
	}

	public static videoplayer.proxies.VideoPlayer load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return videoplayer.proxies.VideoPlayer.initialize(context, mendixObject);
	}

	public static java.util.List<videoplayer.proxies.VideoPlayer> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<videoplayer.proxies.VideoPlayer> result = new java.util.ArrayList<videoplayer.proxies.VideoPlayer>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//VideoPlayer.VideoPlayer" + xpathConstraint))
			result.add(videoplayer.proxies.VideoPlayer.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of url
	 */
	public final java.lang.String geturl()
	{
		return geturl(getContext());
	}

	/**
	 * @param context
	 * @return value of url
	 */
	public final java.lang.String geturl(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.url.toString());
	}

	/**
	 * Set value of url
	 * @param url
	 */
	public final void seturl(java.lang.String url)
	{
		seturl(getContext(), url);
	}

	/**
	 * Set value of url
	 * @param context
	 * @param url
	 */
	public final void seturl(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String url)
	{
		getMendixObject().setValue(context, MemberNames.url.toString(), url);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return videoPlayerMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final videoplayer.proxies.VideoPlayer that = (videoplayer.proxies.VideoPlayer) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "VideoPlayer.VideoPlayer";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
