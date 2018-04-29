package com.xml2j.sepa2016.pain.pain007;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: PAIN007 
  Generation date: Sun Apr 29 21:09:42 CEST 2018 
  Author: XML2J-GEN

******************************************************************************/

import com.xml2j.util.Printer;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * MandateRelatedInformation10 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class MandateRelatedInformation10 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for MandateRelatedInformation10.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public MandateRelatedInformation10(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type MandateRelatedInformation10.
	 */
	static class Allocator implements TypeAllocator<MandateRelatedInformation10> {
		/**
		 * method for getting a new instance of type MandateRelatedInformation10.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public MandateRelatedInformation10 newInstance(String elementName, ComplexDataType parent) {
			return new MandateRelatedInformation10(elementName, parent);
		}
	}
	
	/** instance of allocator class for this data class. */
	private static Allocator allocator = new Allocator();
	
	/**
	 * Get Allocator for this data class.
	 * This method is used by the handler class.
	 *
	 * @return instance of Allocator
	 */
	static public Allocator getAllocator() {
		return allocator;
	}
	
  	
  
	/** element item for MndtId element. 
	 *  @serial
	 */	
	private String m_mndtId = null;
	
	/** element item for DtOfSgntr element. 
	 *  @serial
	 */	
	private String m_dtOfSgntr = null;
	
	/** element item for AmdmntInd element. 
	 *  @serial
	 */	
	private String m_amdmntInd = null;
	
	/** element item for AmdmntInfDtls element. 
	 *  @serial
	 */	
	private AmendmentInformationDetails10 m_amdmntInfDtls = null;
	
	/** element item for ElctrncSgntr element. 
	 *  @serial
	 */	
	private String m_elctrncSgntr = null;
	
	/** element item for FrstColltnDt element. 
	 *  @serial
	 */	
	private String m_frstColltnDt = null;
	
	/** element item for FnlColltnDt element. 
	 *  @serial
	 */	
	private String m_fnlColltnDt = null;
	
	/** element item for Frqcy element. 
	 *  @serial
	 */	
	private Frequency21Choice m_frqcy = null;
	
	/** element item for Rsn element. 
	 *  @serial
	 */	
	private MandateSetupReason1Choice m_rsn = null;
	
	/**
	 * Get the embedded MndtId element.
	 * @return the item.
	 */
	public String getMndtId() {
		return m_mndtId;
	}
		
	/**
	 * This method sets (overwrites) the element MndtId.
	 * @param data the item that needs to be added.
	 */
	void setMndtId(String data) {
		m_mndtId = data;
	}
		
	/**
	 * Get the embedded DtOfSgntr element.
	 * @return the item.
	 */
	public String getDtOfSgntr() {
		return m_dtOfSgntr;
	}
		
	/**
	 * This method sets (overwrites) the element DtOfSgntr.
	 * @param data the item that needs to be added.
	 */
	void setDtOfSgntr(String data) {
		m_dtOfSgntr = data;
	}
		
	/**
	 * Get the embedded AmdmntInd element.
	 * @return the item.
	 */
	public String getAmdmntInd() {
		return m_amdmntInd;
	}
		
	/**
	 * This method sets (overwrites) the element AmdmntInd.
	 * @param data the item that needs to be added.
	 */
	void setAmdmntInd(String data) {
		m_amdmntInd = data;
	}
		
	/**
	 * Get the embedded AmdmntInfDtls element.
	 * @return the item.
	 */
	public AmendmentInformationDetails10 getAmdmntInfDtls() {
		return m_amdmntInfDtls;
	}
		
	/**
	 * This method sets (overwrites) the element AmdmntInfDtls.
	 * @param data the item that needs to be added.
	 */
	void setAmdmntInfDtls(AmendmentInformationDetails10 data) {
		m_amdmntInfDtls = data;
	}
		
	/**
	 * Get the embedded ElctrncSgntr element.
	 * @return the item.
	 */
	public String getElctrncSgntr() {
		return m_elctrncSgntr;
	}
		
	/**
	 * This method sets (overwrites) the element ElctrncSgntr.
	 * @param data the item that needs to be added.
	 */
	void setElctrncSgntr(String data) {
		m_elctrncSgntr = data;
	}
		
	/**
	 * Get the embedded FrstColltnDt element.
	 * @return the item.
	 */
	public String getFrstColltnDt() {
		return m_frstColltnDt;
	}
		
	/**
	 * This method sets (overwrites) the element FrstColltnDt.
	 * @param data the item that needs to be added.
	 */
	void setFrstColltnDt(String data) {
		m_frstColltnDt = data;
	}
		
	/**
	 * Get the embedded FnlColltnDt element.
	 * @return the item.
	 */
	public String getFnlColltnDt() {
		return m_fnlColltnDt;
	}
		
	/**
	 * This method sets (overwrites) the element FnlColltnDt.
	 * @param data the item that needs to be added.
	 */
	void setFnlColltnDt(String data) {
		m_fnlColltnDt = data;
	}
		
	/**
	 * Get the embedded Frqcy element.
	 * @return the item.
	 */
	public Frequency21Choice getFrqcy() {
		return m_frqcy;
	}
		
	/**
	 * This method sets (overwrites) the element Frqcy.
	 * @param data the item that needs to be added.
	 */
	void setFrqcy(Frequency21Choice data) {
		m_frqcy = data;
	}
		
	/**
	 * Get the embedded Rsn element.
	 * @return the item.
	 */
	public MandateSetupReason1Choice getRsn() {
		return m_rsn;
	}
		
	/**
	 * This method sets (overwrites) the element Rsn.
	 * @param data the item that needs to be added.
	 */
	void setRsn(MandateSetupReason1Choice data) {
		m_rsn = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	MandateRelatedInformation10 t = (MandateRelatedInformation10)that;
	 
		if (!Compare.equals(m_mndtId, t.m_mndtId))
			return false;
		
		if (!Compare.equals(m_dtOfSgntr, t.m_dtOfSgntr))
			return false;
		
		if (!Compare.equals(m_amdmntInd, t.m_amdmntInd))
			return false;
		
		if (!Compare.equals(m_amdmntInfDtls, t.m_amdmntInfDtls))
			return false;
		
		if (!Compare.equals(m_elctrncSgntr, t.m_elctrncSgntr))
			return false;
		
		if (!Compare.equals(m_frstColltnDt, t.m_frstColltnDt))
			return false;
		
		if (!Compare.equals(m_fnlColltnDt, t.m_fnlColltnDt))
			return false;
		
		if (!Compare.equals(m_frqcy, t.m_frqcy))
			return false;
		
		if (!Compare.equals(m_rsn, t.m_rsn))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from MandateRelatedInformation10.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_mndtId != null) {
			out.print("\n<MndtId>");
			out.print(m_mndtId);
			out.print("</MndtId>\n");
		}
		
		if (m_dtOfSgntr != null) {
			out.print("\n<DtOfSgntr>");
			out.print(m_dtOfSgntr);
			out.print("</DtOfSgntr>\n");
		}
		
		if (m_amdmntInd != null) {
			out.print("\n<AmdmntInd>");
			out.print(m_amdmntInd);
			out.print("</AmdmntInd>\n");
		}
		
		if (m_amdmntInfDtls != null) {
			m_amdmntInfDtls.print(out);
		}	
		
		if (m_elctrncSgntr != null) {
			out.print("\n<ElctrncSgntr>");
			out.print(m_elctrncSgntr);
			out.print("</ElctrncSgntr>\n");
		}
		
		if (m_frstColltnDt != null) {
			out.print("\n<FrstColltnDt>");
			out.print(m_frstColltnDt);
			out.print("</FrstColltnDt>\n");
		}
		
		if (m_fnlColltnDt != null) {
			out.print("\n<FnlColltnDt>");
			out.print(m_fnlColltnDt);
			out.print("</FnlColltnDt>\n");
		}
		
		if (m_frqcy != null) {
			m_frqcy.print(out);
		}	
		
		if (m_rsn != null) {
			m_rsn.print(out);
		}	
		
	}
}
