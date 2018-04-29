package com.xml2j.sepa2016.pain.pain001;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: PAIN001 
  Generation date: Sun Apr 29 21:09:41 CEST 2018 
  Author: XML2J-GEN

******************************************************************************/

import com.xml2j.util.Printer;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * GarnishmentType1 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class GarnishmentType1 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for GarnishmentType1.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public GarnishmentType1(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type GarnishmentType1.
	 */
	static class Allocator implements TypeAllocator<GarnishmentType1> {
		/**
		 * method for getting a new instance of type GarnishmentType1.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public GarnishmentType1 newInstance(String elementName, ComplexDataType parent) {
			return new GarnishmentType1(elementName, parent);
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
	
  	
  
	/** element item for CdOrPrtry element. 
	 *  @serial
	 */	
	private GarnishmentType1Choice m_cdOrPrtry = null;
	
	/** element item for Issr element. 
	 *  @serial
	 */	
	private String m_issr = null;
	
	/**
	 * Get the embedded CdOrPrtry element.
	 * @return the item.
	 */
	public GarnishmentType1Choice getCdOrPrtry() {
		return m_cdOrPrtry;
	}
		
	/**
	 * This method sets (overwrites) the element CdOrPrtry.
	 * @param data the item that needs to be added.
	 */
	void setCdOrPrtry(GarnishmentType1Choice data) {
		m_cdOrPrtry = data;
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
      
	 	GarnishmentType1 t = (GarnishmentType1)that;
	 
		if (!Compare.equals(m_cdOrPrtry, t.m_cdOrPrtry))
			return false;
		
		if (!Compare.equals(m_issr, t.m_issr))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from GarnishmentType1.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_cdOrPrtry != null) {
			m_cdOrPrtry.print(out);
		}	
		
		if (m_issr != null) {
			out.print("\n<Issr>");
			out.print(m_issr);
			out.print("</Issr>\n");
		}
		
	}
}
