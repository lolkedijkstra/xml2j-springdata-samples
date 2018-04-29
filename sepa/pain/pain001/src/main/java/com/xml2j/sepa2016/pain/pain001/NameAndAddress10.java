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
 * NameAndAddress10 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class NameAndAddress10 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for NameAndAddress10.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public NameAndAddress10(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type NameAndAddress10.
	 */
	static class Allocator implements TypeAllocator<NameAndAddress10> {
		/**
		 * method for getting a new instance of type NameAndAddress10.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public NameAndAddress10 newInstance(String elementName, ComplexDataType parent) {
			return new NameAndAddress10(elementName, parent);
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
	
  	
  
	/** element item for Nm element. 
	 *  @serial
	 */	
	private String m_nm = null;
	
	/** element item for Adr element. 
	 *  @serial
	 */	
	private PostalAddress6 m_adr = null;
	
	/**
	 * Get the embedded Nm element.
	 * @return the item.
	 */
	public String getNm() {
		return m_nm;
	}
		
	/**
	 * This method sets (overwrites) the element Nm.
	 * @param data the item that needs to be added.
	 */
	void setNm(String data) {
		m_nm = data;
	}
		
	/**
	 * Get the embedded Adr element.
	 * @return the item.
	 */
	public PostalAddress6 getAdr() {
		return m_adr;
	}
		
	/**
	 * This method sets (overwrites) the element Adr.
	 * @param data the item that needs to be added.
	 */
	void setAdr(PostalAddress6 data) {
		m_adr = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	NameAndAddress10 t = (NameAndAddress10)that;
	 
		if (!Compare.equals(m_nm, t.m_nm))
			return false;
		
		if (!Compare.equals(m_adr, t.m_adr))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from NameAndAddress10.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_nm != null) {
			out.print("\n<Nm>");
			out.print(m_nm);
			out.print("</Nm>\n");
		}
		
		if (m_adr != null) {
			m_adr.print(out);
		}	
		
	}
}
