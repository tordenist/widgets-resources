// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testsuite.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the TestSuite module
	public static boolean aCT_AfterStartup(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "TestSuite.ACT_AfterStartup", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_CreateData(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "TestSuite.ACT_CreateData", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_onclickCircle(IContext context, testsuite.proxies.Progress _progress)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Progress", _progress == null ? null : _progress.getMendixObject());
			Core.execute(context, "TestSuite.ACT_onclickCircle", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_onclickCircle_closePage(IContext context, testsuite.proxies.Progress _progress)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Progress", _progress == null ? null : _progress.getMendixObject());
			Core.execute(context, "TestSuite.ACT_onclickCircle_closePage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_onclickCircle_Error(IContext context, testsuite.proxies.Progress _progress)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Progress", _progress == null ? null : _progress.getMendixObject());
			Core.execute(context, "TestSuite.ACT_onclickCircle_Error", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static testsuite.proxies.Progress dS_DecimalValue(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "TestSuite.DS_DecimalValue", params);
			return result == null ? null : testsuite.proxies.Progress.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static testsuite.proxies.Progress dS_InvalidBoth(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "TestSuite.DS_InvalidBoth", params);
			return result == null ? null : testsuite.proxies.Progress.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static testsuite.proxies.Progress dS_LongValue(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "TestSuite.DS_LongValue", params);
			return result == null ? null : testsuite.proxies.Progress.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static testsuite.proxies.Progress dS_NegativeValue(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "TestSuite.DS_NegativeValue", params);
			return result == null ? null : testsuite.proxies.Progress.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static testsuite.proxies.Progress dSS_GetProgress(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "TestSuite.DSS_GetProgress", params);
			return result == null ? null : testsuite.proxies.Progress.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static testsuite.proxies.Progress dSS_GetProgress_NoAttributeNoMaximumAttribut(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "TestSuite.DSS_GetProgress_NoAttributeNoMaximumAttribut", params);
			return result == null ? null : testsuite.proxies.Progress.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static testsuite.proxies.Progress dSS_NoContext(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "TestSuite.DSS_NoContext", params);
			return result == null ? null : testsuite.proxies.Progress.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}