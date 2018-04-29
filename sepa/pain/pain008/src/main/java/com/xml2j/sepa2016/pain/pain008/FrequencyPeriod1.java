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
 * FrequencyPeriod1 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class FrequencyPeriod1 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for FrequencyPeriod1.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public FrequencyPeriod1(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type FrequencyPeriod1.
	 */
	static class Allocator implements TypeAllocator<FrequencyPeriod1> {
		/**
		 * method for getting a new instance of type FrequencyPeriod1.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public FrequencyPeriod1 newInstance(String elementName, ComplexDataType parent) {
			return new FrequencyPeriod1(elementName, parent);
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
	
	/** element item for CntPerPrd element. 
	 *  @serial
	 */	
	private String m_cntPerPrd = null;
	
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
	 * Get the embedded CntPerPrd element.
	 * @return the item.
	 */
	public String getCntPerPrd() {
		return m_cntPerPrd;
	}
		
	/**
	 * This method sets (overwrites) the element CntPerPrd.
	 * @param data the item that needs to be added.
	 */
	void setCntPerPrd(String data) {
		m_cntPerPrd = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	FrequencyPeriod1 t = (FrequencyPeriod1)that;
	 
		if (!Compare.equals(m_tp, t.m_tp))
			return false;
		
		if (!Compare.equals(m_cntPerPrd, t.m_cntPerPrd))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from FrequencyPeriod1.
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
		
		if (m_cntPerPrd != null) {
			out.print("\n<CntPerPrd>");
			out.print(m_cntPerPrd);
			out.print("</CntPerPrd>\n");
		}
		
	}
}
