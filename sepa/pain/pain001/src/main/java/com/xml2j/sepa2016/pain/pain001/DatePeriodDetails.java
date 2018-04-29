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
 * DatePeriodDetails data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class DatePeriodDetails extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for DatePeriodDetails.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public DatePeriodDetails(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type DatePeriodDetails.
	 */
	static class Allocator implements TypeAllocator<DatePeriodDetails> {
		/**
		 * method for getting a new instance of type DatePeriodDetails.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public DatePeriodDetails newInstance(String elementName, ComplexDataType parent) {
			return new DatePeriodDetails(elementName, parent);
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
	
  	
  
	/** element item for FrDt element. 
	 *  @serial
	 */	
	private String m_frDt = null;
	
	/** element item for ToDt element. 
	 *  @serial
	 */	
	private String m_toDt = null;
	
	/**
	 * Get the embedded FrDt element.
	 * @return the item.
	 */
	public String getFrDt() {
		return m_frDt;
	}
		
	/**
	 * This method sets (overwrites) the element FrDt.
	 * @param data the item that needs to be added.
	 */
	void setFrDt(String data) {
		m_frDt = data;
	}
		
	/**
	 * Get the embedded ToDt element.
	 * @return the item.
	 */
	public String getToDt() {
		return m_toDt;
	}
		
	/**
	 * This method sets (overwrites) the element ToDt.
	 * @param data the item that needs to be added.
	 */
	void setToDt(String data) {
		m_toDt = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	DatePeriodDetails t = (DatePeriodDetails)that;
	 
		if (!Compare.equals(m_frDt, t.m_frDt))
			return false;
		
		if (!Compare.equals(m_toDt, t.m_toDt))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from DatePeriodDetails.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_frDt != null) {
			out.print("\n<FrDt>");
			out.print(m_frDt);
			out.print("</FrDt>\n");
		}
		
		if (m_toDt != null) {
			out.print("\n<ToDt>");
			out.print(m_toDt);
			out.print("</ToDt>\n");
		}
		
	}
}
