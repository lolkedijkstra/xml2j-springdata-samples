package com.xml2j.sepa2016.pain.pain014;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: PAIN014 
  Generation date: Sun Apr 29 21:09:44 CEST 2018 
  Author: XML2J-GEN

******************************************************************************/

import com.xml2j.util.Printer;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * TaxParty1 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class TaxParty1 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for TaxParty1.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public TaxParty1(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type TaxParty1.
	 */
	static class Allocator implements TypeAllocator<TaxParty1> {
		/**
		 * method for getting a new instance of type TaxParty1.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public TaxParty1 newInstance(String elementName, ComplexDataType parent) {
			return new TaxParty1(elementName, parent);
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
	
  	
  
	/** element item for TaxId element. 
	 *  @serial
	 */	
	private String m_taxId = null;
	
	/** element item for RegnId element. 
	 *  @serial
	 */	
	private String m_regnId = null;
	
	/** element item for TaxTp element. 
	 *  @serial
	 */	
	private String m_taxTp = null;
	
	/**
	 * Get the embedded TaxId element.
	 * @return the item.
	 */
	public String getTaxId() {
		return m_taxId;
	}
		
	/**
	 * This method sets (overwrites) the element TaxId.
	 * @param data the item that needs to be added.
	 */
	void setTaxId(String data) {
		m_taxId = data;
	}
		
	/**
	 * Get the embedded RegnId element.
	 * @return the item.
	 */
	public String getRegnId() {
		return m_regnId;
	}
		
	/**
	 * This method sets (overwrites) the element RegnId.
	 * @param data the item that needs to be added.
	 */
	void setRegnId(String data) {
		m_regnId = data;
	}
		
	/**
	 * Get the embedded TaxTp element.
	 * @return the item.
	 */
	public String getTaxTp() {
		return m_taxTp;
	}
		
	/**
	 * This method sets (overwrites) the element TaxTp.
	 * @param data the item that needs to be added.
	 */
	void setTaxTp(String data) {
		m_taxTp = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	TaxParty1 t = (TaxParty1)that;
	 
		if (!Compare.equals(m_taxId, t.m_taxId))
			return false;
		
		if (!Compare.equals(m_regnId, t.m_regnId))
			return false;
		
		if (!Compare.equals(m_taxTp, t.m_taxTp))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from TaxParty1.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_taxId != null) {
			out.print("\n<TaxId>");
			out.print(m_taxId);
			out.print("</TaxId>\n");
		}
		
		if (m_regnId != null) {
			out.print("\n<RegnId>");
			out.print(m_regnId);
			out.print("</RegnId>\n");
		}
		
		if (m_taxTp != null) {
			out.print("\n<TaxTp>");
			out.print(m_taxTp);
			out.print("</TaxTp>\n");
		}
		
	}
}
