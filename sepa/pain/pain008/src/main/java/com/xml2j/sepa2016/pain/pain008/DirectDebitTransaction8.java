package com.xml2j.sepa2016.pain.pain008;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: PAIN008 
  Generation date: Sun Apr 29 21:09:43 CEST 2018 
  Author: XML2J-GEN

******************************************************************************/

import com.xml2j.util.Printer;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * DirectDebitTransaction8 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class DirectDebitTransaction8 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for DirectDebitTransaction8.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public DirectDebitTransaction8(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type DirectDebitTransaction8.
	 */
	static class Allocator implements TypeAllocator<DirectDebitTransaction8> {
		/**
		 * method for getting a new instance of type DirectDebitTransaction8.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public DirectDebitTransaction8 newInstance(String elementName, ComplexDataType parent) {
			return new DirectDebitTransaction8(elementName, parent);
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
	
  	
  
	/** element item for MndtRltdInf element. 
	 *  @serial
	 */	
	private MandateRelatedInformation10 m_mndtRltdInf = null;
	
	/** element item for CdtrSchmeId element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_cdtrSchmeId = null;
	
	/** element item for PreNtfctnId element. 
	 *  @serial
	 */	
	private String m_preNtfctnId = null;
	
	/** element item for PreNtfctnDt element. 
	 *  @serial
	 */	
	private String m_preNtfctnDt = null;
	
	/**
	 * Get the embedded MndtRltdInf element.
	 * @return the item.
	 */
	public MandateRelatedInformation10 getMndtRltdInf() {
		return m_mndtRltdInf;
	}
		
	/**
	 * This method sets (overwrites) the element MndtRltdInf.
	 * @param data the item that needs to be added.
	 */
	void setMndtRltdInf(MandateRelatedInformation10 data) {
		m_mndtRltdInf = data;
	}
		
	/**
	 * Get the embedded CdtrSchmeId element.
	 * @return the item.
	 */
	public PartyIdentification43 getCdtrSchmeId() {
		return m_cdtrSchmeId;
	}
		
	/**
	 * This method sets (overwrites) the element CdtrSchmeId.
	 * @param data the item that needs to be added.
	 */
	void setCdtrSchmeId(PartyIdentification43 data) {
		m_cdtrSchmeId = data;
	}
		
	/**
	 * Get the embedded PreNtfctnId element.
	 * @return the item.
	 */
	public String getPreNtfctnId() {
		return m_preNtfctnId;
	}
		
	/**
	 * This method sets (overwrites) the element PreNtfctnId.
	 * @param data the item that needs to be added.
	 */
	void setPreNtfctnId(String data) {
		m_preNtfctnId = data;
	}
		
	/**
	 * Get the embedded PreNtfctnDt element.
	 * @return the item.
	 */
	public String getPreNtfctnDt() {
		return m_preNtfctnDt;
	}
		
	/**
	 * This method sets (overwrites) the element PreNtfctnDt.
	 * @param data the item that needs to be added.
	 */
	void setPreNtfctnDt(String data) {
		m_preNtfctnDt = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	DirectDebitTransaction8 t = (DirectDebitTransaction8)that;
	 
		if (!Compare.equals(m_mndtRltdInf, t.m_mndtRltdInf))
			return false;
		
		if (!Compare.equals(m_cdtrSchmeId, t.m_cdtrSchmeId))
			return false;
		
		if (!Compare.equals(m_preNtfctnId, t.m_preNtfctnId))
			return false;
		
		if (!Compare.equals(m_preNtfctnDt, t.m_preNtfctnDt))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from DirectDebitTransaction8.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_mndtRltdInf != null) {
			m_mndtRltdInf.print(out);
		}	
		
		if (m_cdtrSchmeId != null) {
			m_cdtrSchmeId.print(out);
		}	
		
		if (m_preNtfctnId != null) {
			out.print("\n<PreNtfctnId>");
			out.print(m_preNtfctnId);
			out.print("</PreNtfctnId>\n");
		}
		
		if (m_preNtfctnDt != null) {
			out.print("\n<PreNtfctnDt>");
			out.print(m_preNtfctnDt);
			out.print("</PreNtfctnDt>\n");
		}
		
	}
}
