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
	public static void aCT_Campaign_Delete(IContext context, testsuite.proxies.Campaign _campaign)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Campaign", _campaign == null ? null : _campaign.getMendixObject());
			Core.execute(context, "TestSuite.ACT_Campaign_Delete", params);
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
	public static void aCT_OnChange(IContext context, testsuite.proxies.Rate _rate)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Rate", _rate == null ? null : _rate.getMendixObject());
			Core.execute(context, "TestSuite.ACT_OnChange", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_OnChange_ClosePage(IContext context, testsuite.proxies.Rate _rate)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Rate", _rate == null ? null : _rate.getMendixObject());
			Core.execute(context, "TestSuite.ACT_OnChange_ClosePage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_OnChange_Commit(IContext context, testsuite.proxies.Rate _rate)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Rate", _rate == null ? null : _rate.getMendixObject());
			Core.execute(context, "TestSuite.ACT_OnChange_Commit", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_OnChange_Error(IContext context, testsuite.proxies.Rate _rate)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Rate", _rate == null ? null : _rate.getMendixObject());
			Core.execute(context, "TestSuite.ACT_OnChange_Error", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean bCO_Rate(IContext context, testsuite.proxies.Rate _rate)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Rate", _rate == null ? null : _rate.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "TestSuite.BCO_Rate", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void calculateAverageRate(IContext context, testsuite.proxies.Rate _rate)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Rate", _rate == null ? null : _rate.getMendixObject());
			Core.execute(context, "TestSuite.CalculateAverageRate", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static testsuite.proxies.Campaign dSS_GetCampaign(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "TestSuite.DSS_GetCampaign", params);
			return result == null ? null : testsuite.proxies.Campaign.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static testsuite.proxies.Campaign dSS_GetCampaign_Testing(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "TestSuite.DSS_GetCampaign_Testing", params);
			return result == null ? null : testsuite.proxies.Campaign.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static testsuite.proxies.Rate dSS_GetCampaignRateForTesting(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "TestSuite.DSS_GetCampaignRateForTesting", params);
			return result == null ? null : testsuite.proxies.Rate.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static testsuite.proxies.Rate dSS_GetCampaignRateForTesting_CurrentUser(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "TestSuite.DSS_GetCampaignRateForTesting_CurrentUser", params);
			return result == null ? null : testsuite.proxies.Rate.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static testsuite.proxies.Rate dSS_GetRateForCurrentUser(IContext context, testsuite.proxies.Campaign _campaign)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Campaign", _campaign == null ? null : _campaign.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "TestSuite.DSS_GetRateForCurrentUser", params);
			return result == null ? null : testsuite.proxies.Rate.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static testsuite.proxies.Rate dSS_NoContext(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "TestSuite.DSS_NoContext", params);
			return result == null ? null : testsuite.proxies.Rate.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void onCommitRate(IContext context, testsuite.proxies.Rate _rate)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Rate", _rate == null ? null : _rate.getMendixObject());
			Core.execute(context, "TestSuite.OnCommitRate", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	/**
	 * Share URL: https://modelshare.mendix.com/models/d7ece331-49d4-4464-a2e2-ea75528a0367/rate-me
	 */
	public static void oPN_RateNew(IContext context, testsuite.proxies.Campaign _campaign)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Campaign", _campaign == null ? null : _campaign.getMendixObject());
			Core.execute(context, "TestSuite.OPN_RateNew", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}