package com.xml2j.sepa2016.pain.pain002;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: PAIN002 
  Generation date: Sun Apr 29 21:09:42 CEST 2018 
  Author: XML2J-GEN

******************************************************************************/

import com.xml2j.util.Printer;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * EquivalentAmount2 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class EquivalentAmount2 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for EquivalentAmount2.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public EquivalentAmount2(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type EquivalentAmount2.
	 */
	static class Allocator implements TypeAllocator<EquivalentAmount2> {
		/**
		 * method for getting a new instance of type EquivalentAmount2.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public EquivalentAmount2 newInstance(String elementName, ComplexDataType parent) {
			return new EquivalentAmount2(elementName, parent);
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
	
  	
  
	/** element item for Amt element. 
	 *  @serial
	 */	
	private ActiveOrHistoricCurrencyAndAmount m_amt = null;
	
	/** element item for CcyOfTrf element. 
	 *  @serial
	 */	
	private String m_ccyOfTrf = null;
	
	/**
	 * Get the embedded Amt element.
	 * @return the item.
	 */
	public ActiveOrHistoricCurrencyAndAmount getAmt() {
		return m_amt;
	}
		
	/**
	 * This method sets (overwrites) the element Amt.
	 * @param data the item that needs to be added.
	 */
	void setAmt(ActiveOrHistoricCurrencyAndAmount data) {
		m_amt = data;
	}
		
	/**
	 * Get the embedded CcyOfTrf element.
	 * @return the item.
	 */
	public String getCcyOfTrf() {
		return m_ccyOfTrf;
	}
		
	/**
	 * This method sets (overwrites) the element CcyOfTrf.
	 * @param data the item that needs to be added.
	 */
	void setCcyOfTrf(String data) {
		m_ccyOfTrf = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	EquivalentAmount2 t = (EquivalentAmount2)that;
	 
		if (!Compare.equals(m_amt, t.m_amt))
			return false;
		
		if (!Compare.equals(m_ccyOfTrf, t.m_ccyOfTrf))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from EquivalentAmount2.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_amt != null) {
			m_amt.print(out);
		}	
		
		if (m_ccyOfTrf != null) {
			out.print("\n<CcyOfTrf>");
			out.print(m_ccyOfTrf);
			out.print("</CcyOfTrf>\n");
		}
		
	}
}
