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
 * Frequency21Choice data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class Frequency21Choice extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for Frequency21Choice.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public Frequency21Choice(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type Frequency21Choice.
	 */
	static class Allocator implements TypeAllocator<Frequency21Choice> {
		/**
		 * method for getting a new instance of type Frequency21Choice.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public Frequency21Choice newInstance(String elementName, ComplexDataType parent) {
			return new Frequency21Choice(elementName, parent);
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
	
  	
  
	/** element item for Tp element. 
	 *  @serial
	 */	
	private String m_tp = null;
	
	/** element item for Prd element. 
	 *  @serial
	 */	
	private FrequencyPeriod1 m_prd = null;
	
	/**
	 * Get the embedded Tp element.
	 * @return the item.
	 */
	public String getTp() {
		return m_tp;
	}
		
	/**
	 * This method sets (overwrites) the element Tp.
	 * @param data the item that needs to be added.
	 */
	void setTp(String data) {
		m_tp = data;
	}
		
	/**
	 * Get the embedded Prd element.
	 * @return the item.
	 */
	public FrequencyPeriod1 getPrd() {
		return m_prd;
	}
		
	/**
	 * This method sets (overwrites) the element Prd.
	 * @param data the item that needs to be added.
	 */
	void setPrd(FrequencyPeriod1 data) {
		m_prd = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	Frequency21Choice t = (Frequency21Choice)that;
	 
		if (!Compare.equals(m_tp, t.m_tp))
			return false;
		
		if (!Compare.equals(m_prd, t.m_prd))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from Frequency21Choice.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_tp != null) {
			out.print("\n<Tp>");
			out.print(m_tp);
			out.print("</Tp>\n");
		}
		
		if (m_prd != null) {
			m_prd.print(out);
		}	
		
	}
}
