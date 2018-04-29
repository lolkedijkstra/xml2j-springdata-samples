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
 * GenericFinancialIdentification1 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class GenericFinancialIdentification1 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for GenericFinancialIdentification1.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public GenericFinancialIdentification1(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type GenericFinancialIdentification1.
	 */
	static class Allocator implements TypeAllocator<GenericFinancialIdentification1> {
		/**
		 * method for getting a new instance of type GenericFinancialIdentification1.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public GenericFinancialIdentification1 newInstance(String elementName, ComplexDataType parent) {
			return new GenericFinancialIdentification1(elementName, parent);
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
	
  	
  
	/** element item for Id element. 
	 *  @serial
	 */	
	private String m_id = null;
	
	/** element item for SchmeNm element. 
	 *  @serial
	 */	
	private FinancialIdentificationSchemeName1Choice m_schmeNm = null;
	
	/** element item for Issr element. 
	 *  @serial
	 */	
	private String m_issr = null;
	
	/**
	 * Get the embedded Id element.
	 * @return the item.
	 */
	public String getId() {
		return m_id;
	}
		
	/**
	 * This method sets (overwrites) the element Id.
	 * @param data the item that needs to be added.
	 */
	void setId(String data) {
		m_id = data;
	}
		
	/**
	 * Get the embedded SchmeNm element.
	 * @return the item.
	 */
	public FinancialIdentificationSchemeName1Choice getSchmeNm() {
		return m_schmeNm;
	}
		
	/**
	 * This method sets (overwrites) the element SchmeNm.
	 * @param data the item that needs to be added.
	 */
	void setSchmeNm(FinancialIdentificationSchemeName1Choice data) {
		m_schmeNm = data;
	}
		
	/**
	 * Get the embedded Issr element.
	 * @return the item.
	 */
	public String getIssr() {
		return m_issr;
	}
		
	/**
	 * This method sets (overwrites) the element Issr.
	 * @param data the item that needs to be added.
	 */
	void setIssr(String data) {
		m_issr = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	GenericFinancialIdentification1 t = (GenericFinancialIdentification1)that;
	 
		if (!Compare.equals(m_id, t.m_id))
			return false;
		
		if (!Compare.equals(m_schmeNm, t.m_schmeNm))
			return false;
		
		if (!Compare.equals(m_issr, t.m_issr))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from GenericFinancialIdentification1.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_id != null) {
			out.print("\n<Id>");
			out.print(m_id);
			out.print("</Id>\n");
		}
		
		if (m_schmeNm != null) {
			m_schmeNm.print(out);
		}	
		
		if (m_issr != null) {
			out.print("\n<Issr>");
			out.print(m_issr);
			out.print("</Issr>\n");
		}
		
	}
}
