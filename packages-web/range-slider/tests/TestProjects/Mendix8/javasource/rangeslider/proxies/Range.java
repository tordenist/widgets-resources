// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package rangeslider.proxies;

public class Range
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject rangeMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "RangeSlider.Range";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		MinValueDecimal("MinValueDecimal"),
		MaxValueDecimal("MaxValueDecimal"),
		Step("Step"),
		LowerBoundDecimal("LowerBoundDecimal"),
		UpperBoundDecimal("UpperBoundDecimal"),
		LowerBoundLong("LowerBoundLong"),
		UpperBoundLong("UpperBoundLong"),
		MaxLong("MaxLong"),
		MinLong("MinLong"),
		MinValueInt("MinValueInt"),
		MaxValueInt("MaxValueInt"),
		UpperBoundInteger("UpperBoundInteger"),
		LoverBoundInteger("LoverBoundInteger");

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

	public Range(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "RangeSlider.Range"));
	}

	protected Range(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject rangeMendixObject)
	{
		if (rangeMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("RangeSlider.Range", rangeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a RangeSlider.Range");

		this.rangeMendixObject = rangeMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Range.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static rangeslider.proxies.Range initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return rangeslider.proxies.Range.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static rangeslider.proxies.Range initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new rangeslider.proxies.Range(context, mendixObject);
	}

	public static rangeslider.proxies.Range load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return rangeslider.proxies.Range.initialize(context, mendixObject);
	}

	public static java.util.List<rangeslider.proxies.Range> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<rangeslider.proxies.Range> result = new java.util.ArrayList<rangeslider.proxies.Range>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//RangeSlider.Range" + xpathConstraint))
			result.add(rangeslider.proxies.Range.initialize(context, obj));
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
	 * @return value of MinValueDecimal
	 */
	public final java.math.BigDecimal getMinValueDecimal()
	{
		return getMinValueDecimal(getContext());
	}

	/**
	 * @param context
	 * @return value of MinValueDecimal
	 */
	public final java.math.BigDecimal getMinValueDecimal(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.MinValueDecimal.toString());
	}

	/**
	 * Set value of MinValueDecimal
	 * @param minvaluedecimal
	 */
	public final void setMinValueDecimal(java.math.BigDecimal minvaluedecimal)
	{
		setMinValueDecimal(getContext(), minvaluedecimal);
	}

	/**
	 * Set value of MinValueDecimal
	 * @param context
	 * @param minvaluedecimal
	 */
	public final void setMinValueDecimal(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal minvaluedecimal)
	{
		getMendixObject().setValue(context, MemberNames.MinValueDecimal.toString(), minvaluedecimal);
	}

	/**
	 * @return value of MaxValueDecimal
	 */
	public final java.math.BigDecimal getMaxValueDecimal()
	{
		return getMaxValueDecimal(getContext());
	}

	/**
	 * @param context
	 * @return value of MaxValueDecimal
	 */
	public final java.math.BigDecimal getMaxValueDecimal(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.MaxValueDecimal.toString());
	}

	/**
	 * Set value of MaxValueDecimal
	 * @param maxvaluedecimal
	 */
	public final void setMaxValueDecimal(java.math.BigDecimal maxvaluedecimal)
	{
		setMaxValueDecimal(getContext(), maxvaluedecimal);
	}

	/**
	 * Set value of MaxValueDecimal
	 * @param context
	 * @param maxvaluedecimal
	 */
	public final void setMaxValueDecimal(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal maxvaluedecimal)
	{
		getMendixObject().setValue(context, MemberNames.MaxValueDecimal.toString(), maxvaluedecimal);
	}

	/**
	 * @return value of Step
	 */
	public final java.math.BigDecimal getStep()
	{
		return getStep(getContext());
	}

	/**
	 * @param context
	 * @return value of Step
	 */
	public final java.math.BigDecimal getStep(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Step.toString());
	}

	/**
	 * Set value of Step
	 * @param step
	 */
	public final void setStep(java.math.BigDecimal step)
	{
		setStep(getContext(), step);
	}

	/**
	 * Set value of Step
	 * @param context
	 * @param step
	 */
	public final void setStep(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal step)
	{
		getMendixObject().setValue(context, MemberNames.Step.toString(), step);
	}

	/**
	 * @return value of LowerBoundDecimal
	 */
	public final java.math.BigDecimal getLowerBoundDecimal()
	{
		return getLowerBoundDecimal(getContext());
	}

	/**
	 * @param context
	 * @return value of LowerBoundDecimal
	 */
	public final java.math.BigDecimal getLowerBoundDecimal(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.LowerBoundDecimal.toString());
	}

	/**
	 * Set value of LowerBoundDecimal
	 * @param lowerbounddecimal
	 */
	public final void setLowerBoundDecimal(java.math.BigDecimal lowerbounddecimal)
	{
		setLowerBoundDecimal(getContext(), lowerbounddecimal);
	}

	/**
	 * Set value of LowerBoundDecimal
	 * @param context
	 * @param lowerbounddecimal
	 */
	public final void setLowerBoundDecimal(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal lowerbounddecimal)
	{
		getMendixObject().setValue(context, MemberNames.LowerBoundDecimal.toString(), lowerbounddecimal);
	}

	/**
	 * @return value of UpperBoundDecimal
	 */
	public final java.math.BigDecimal getUpperBoundDecimal()
	{
		return getUpperBoundDecimal(getContext());
	}

	/**
	 * @param context
	 * @return value of UpperBoundDecimal
	 */
	public final java.math.BigDecimal getUpperBoundDecimal(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.UpperBoundDecimal.toString());
	}

	/**
	 * Set value of UpperBoundDecimal
	 * @param upperbounddecimal
	 */
	public final void setUpperBoundDecimal(java.math.BigDecimal upperbounddecimal)
	{
		setUpperBoundDecimal(getContext(), upperbounddecimal);
	}

	/**
	 * Set value of UpperBoundDecimal
	 * @param context
	 * @param upperbounddecimal
	 */
	public final void setUpperBoundDecimal(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal upperbounddecimal)
	{
		getMendixObject().setValue(context, MemberNames.UpperBoundDecimal.toString(), upperbounddecimal);
	}

	/**
	 * @return value of LowerBoundLong
	 */
	public final java.lang.Long getLowerBoundLong()
	{
		return getLowerBoundLong(getContext());
	}

	/**
	 * @param context
	 * @return value of LowerBoundLong
	 */
	public final java.lang.Long getLowerBoundLong(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.LowerBoundLong.toString());
	}

	/**
	 * Set value of LowerBoundLong
	 * @param lowerboundlong
	 */
	public final void setLowerBoundLong(java.lang.Long lowerboundlong)
	{
		setLowerBoundLong(getContext(), lowerboundlong);
	}

	/**
	 * Set value of LowerBoundLong
	 * @param context
	 * @param lowerboundlong
	 */
	public final void setLowerBoundLong(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long lowerboundlong)
	{
		getMendixObject().setValue(context, MemberNames.LowerBoundLong.toString(), lowerboundlong);
	}

	/**
	 * @return value of UpperBoundLong
	 */
	public final java.lang.Long getUpperBoundLong()
	{
		return getUpperBoundLong(getContext());
	}

	/**
	 * @param context
	 * @return value of UpperBoundLong
	 */
	public final java.lang.Long getUpperBoundLong(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.UpperBoundLong.toString());
	}

	/**
	 * Set value of UpperBoundLong
	 * @param upperboundlong
	 */
	public final void setUpperBoundLong(java.lang.Long upperboundlong)
	{
		setUpperBoundLong(getContext(), upperboundlong);
	}

	/**
	 * Set value of UpperBoundLong
	 * @param context
	 * @param upperboundlong
	 */
	public final void setUpperBoundLong(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long upperboundlong)
	{
		getMendixObject().setValue(context, MemberNames.UpperBoundLong.toString(), upperboundlong);
	}

	/**
	 * @return value of MaxLong
	 */
	public final java.lang.Long getMaxLong()
	{
		return getMaxLong(getContext());
	}

	/**
	 * @param context
	 * @return value of MaxLong
	 */
	public final java.lang.Long getMaxLong(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.MaxLong.toString());
	}

	/**
	 * Set value of MaxLong
	 * @param maxlong
	 */
	public final void setMaxLong(java.lang.Long maxlong)
	{
		setMaxLong(getContext(), maxlong);
	}

	/**
	 * Set value of MaxLong
	 * @param context
	 * @param maxlong
	 */
	public final void setMaxLong(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long maxlong)
	{
		getMendixObject().setValue(context, MemberNames.MaxLong.toString(), maxlong);
	}

	/**
	 * @return value of MinLong
	 */
	public final java.lang.Long getMinLong()
	{
		return getMinLong(getContext());
	}

	/**
	 * @param context
	 * @return value of MinLong
	 */
	public final java.lang.Long getMinLong(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.MinLong.toString());
	}

	/**
	 * Set value of MinLong
	 * @param minlong
	 */
	public final void setMinLong(java.lang.Long minlong)
	{
		setMinLong(getContext(), minlong);
	}

	/**
	 * Set value of MinLong
	 * @param context
	 * @param minlong
	 */
	public final void setMinLong(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long minlong)
	{
		getMendixObject().setValue(context, MemberNames.MinLong.toString(), minlong);
	}

	/**
	 * @return value of MinValueInt
	 */
	public final java.lang.Integer getMinValueInt()
	{
		return getMinValueInt(getContext());
	}

	/**
	 * @param context
	 * @return value of MinValueInt
	 */
	public final java.lang.Integer getMinValueInt(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.MinValueInt.toString());
	}

	/**
	 * Set value of MinValueInt
	 * @param minvalueint
	 */
	public final void setMinValueInt(java.lang.Integer minvalueint)
	{
		setMinValueInt(getContext(), minvalueint);
	}

	/**
	 * Set value of MinValueInt
	 * @param context
	 * @param minvalueint
	 */
	public final void setMinValueInt(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer minvalueint)
	{
		getMendixObject().setValue(context, MemberNames.MinValueInt.toString(), minvalueint);
	}

	/**
	 * @return value of MaxValueInt
	 */
	public final java.lang.Integer getMaxValueInt()
	{
		return getMaxValueInt(getContext());
	}

	/**
	 * @param context
	 * @return value of MaxValueInt
	 */
	public final java.lang.Integer getMaxValueInt(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.MaxValueInt.toString());
	}

	/**
	 * Set value of MaxValueInt
	 * @param maxvalueint
	 */
	public final void setMaxValueInt(java.lang.Integer maxvalueint)
	{
		setMaxValueInt(getContext(), maxvalueint);
	}

	/**
	 * Set value of MaxValueInt
	 * @param context
	 * @param maxvalueint
	 */
	public final void setMaxValueInt(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer maxvalueint)
	{
		getMendixObject().setValue(context, MemberNames.MaxValueInt.toString(), maxvalueint);
	}

	/**
	 * @return value of UpperBoundInteger
	 */
	public final java.lang.Integer getUpperBoundInteger()
	{
		return getUpperBoundInteger(getContext());
	}

	/**
	 * @param context
	 * @return value of UpperBoundInteger
	 */
	public final java.lang.Integer getUpperBoundInteger(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.UpperBoundInteger.toString());
	}

	/**
	 * Set value of UpperBoundInteger
	 * @param upperboundinteger
	 */
	public final void setUpperBoundInteger(java.lang.Integer upperboundinteger)
	{
		setUpperBoundInteger(getContext(), upperboundinteger);
	}

	/**
	 * Set value of UpperBoundInteger
	 * @param context
	 * @param upperboundinteger
	 */
	public final void setUpperBoundInteger(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer upperboundinteger)
	{
		getMendixObject().setValue(context, MemberNames.UpperBoundInteger.toString(), upperboundinteger);
	}

	/**
	 * @return value of LoverBoundInteger
	 */
	public final java.lang.Integer getLoverBoundInteger()
	{
		return getLoverBoundInteger(getContext());
	}

	/**
	 * @param context
	 * @return value of LoverBoundInteger
	 */
	public final java.lang.Integer getLoverBoundInteger(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.LoverBoundInteger.toString());
	}

	/**
	 * Set value of LoverBoundInteger
	 * @param loverboundinteger
	 */
	public final void setLoverBoundInteger(java.lang.Integer loverboundinteger)
	{
		setLoverBoundInteger(getContext(), loverboundinteger);
	}

	/**
	 * Set value of LoverBoundInteger
	 * @param context
	 * @param loverboundinteger
	 */
	public final void setLoverBoundInteger(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer loverboundinteger)
	{
		getMendixObject().setValue(context, MemberNames.LoverBoundInteger.toString(), loverboundinteger);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return rangeMendixObject;
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
			final rangeslider.proxies.Range that = (rangeslider.proxies.Range) obj;
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
		return "RangeSlider.Range";
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
