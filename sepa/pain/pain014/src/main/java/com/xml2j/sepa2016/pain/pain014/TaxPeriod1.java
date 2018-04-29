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
 * TaxPeriod1 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class TaxPeriod1 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for TaxPeriod1.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public TaxPeriod1(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type TaxPeriod1.
	 */
	static class Allocator implements TypeAllocator<TaxPeriod1> {
		/**
		 * method for getting a new instance of type TaxPeriod1.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public TaxPeriod1 newInstance(String elementName, ComplexDataType parent) {
			return new TaxPeriod1(elementName, parent);
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
	
  	
  
	/** element item for Yr element. 
	 *  @serial
	 */	
	private String m_yr = null;
	
	/** element item for Tp element. 
	 *  @serial
	 */	
	private String m_tp = null;
	
	/** element item for FrToDt element. 
	 *  @serial
	 */	
	private DatePeriodDetails m_frToDt = null;
	
	/**
	 * Get the embedded Yr element.
	 * @return the item.
	 */
	public String getYr() {
		return m_yr;
	}
		
	/**
	 * This method sets (overwrites) the element Yr.
	 * @param data the item that needs to be added.
	 */
	void setYr(String data) {
		m_yr = data;
	}
		
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
	 * Get the embedded FrToDt element.
	 * @return the item.
	 */
	public DatePeriodDetails getFrToDt() {
		return m_frToDt;
	}
		
	/**
	 * This method sets (overwrites) the element FrToDt.
	 * @param data the item that needs to be added.
	 */
	void setFrToDt(DatePeriodDetails data) {
		m_frToDt = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	TaxPeriod1 t = (TaxPeriod1)that;
	 
		if (!Compare.equals(m_yr, t.m_yr))
			return false;
		
		if (!Compare.equals(m_tp, t.m_tp))
			return false;
		
		if (!Compare.equals(m_frToDt, t.m_frToDt))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from TaxPeriod1.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_yr != null) {
			out.print("\n<Yr>");
			out.print(m_yr);
			out.print("</Yr>\n");
		}
		
		if (m_tp != null) {
			out.print("\n<Tp>");
			out.print(m_tp);
			out.print("</Tp>\n");
		}
		
		if (m_frToDt != null) {
			m_frToDt.print(out);
		}	
		
	}
}
