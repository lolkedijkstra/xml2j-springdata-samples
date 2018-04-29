package com.xml2j.sepa2016.pain.pain013;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: PAIN013 
  Generation date: Sun Apr 29 21:09:43 CEST 2018 
  Author: XML2J-GEN

******************************************************************************/

import com.xml2j.util.Printer;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * TaxAmountAndType1 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class TaxAmountAndType1 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for TaxAmountAndType1.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public TaxAmountAndType1(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type TaxAmountAndType1.
	 */
	static class Allocator implements TypeAllocator<TaxAmountAndType1> {
		/**
		 * method for getting a new instance of type TaxAmountAndType1.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public TaxAmountAndType1 newInstance(String elementName, ComplexDataType parent) {
			return new TaxAmountAndType1(elementName, parent);
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
	private TaxAmountType1Choice m_tp = null;
	
	/** element item for Amt element. 
	 *  @serial
	 */	
	private ActiveOrHistoricCurrencyAndAmount m_amt = null;
	
	/**
	 * Get the embedded Tp element.
	 * @return the item.
	 */
	public TaxAmountType1Choice getTp() {
		return m_tp;
	}
		
	/**
	 * This method sets (overwrites) the element Tp.
	 * @param data the item that needs to be added.
	 */
	void setTp(TaxAmountType1Choice data) {
		m_tp = data;
	}
		
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
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	TaxAmountAndType1 t = (TaxAmountAndType1)that;
	 
		if (!Compare.equals(m_tp, t.m_tp))
			return false;
		
		if (!Compare.equals(m_amt, t.m_amt))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from TaxAmountAndType1.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_tp != null) {
			m_tp.print(out);
		}	
		
		if (m_amt != null) {
			m_amt.print(out);
		}	
		
	}
}
