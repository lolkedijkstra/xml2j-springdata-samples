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
 * NumberOfTransactionsPerStatus3 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class NumberOfTransactionsPerStatus3 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for NumberOfTransactionsPerStatus3.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public NumberOfTransactionsPerStatus3(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type NumberOfTransactionsPerStatus3.
	 */
	static class Allocator implements TypeAllocator<NumberOfTransactionsPerStatus3> {
		/**
		 * method for getting a new instance of type NumberOfTransactionsPerStatus3.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public NumberOfTransactionsPerStatus3 newInstance(String elementName, ComplexDataType parent) {
			return new NumberOfTransactionsPerStatus3(elementName, parent);
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
	
  	
  
	/** element item for DtldNbOfTxs element. 
	 *  @serial
	 */	
	private String m_dtldNbOfTxs = null;
	
	/** element item for DtldSts element. 
	 *  @serial
	 */	
	private String m_dtldSts = null;
	
	/** element item for DtldCtrlSum element. 
	 *  @serial
	 */	
	private String m_dtldCtrlSum = null;
	
	/**
	 * Get the embedded DtldNbOfTxs element.
	 * @return the item.
	 */
	public String getDtldNbOfTxs() {
		return m_dtldNbOfTxs;
	}
		
	/**
	 * This method sets (overwrites) the element DtldNbOfTxs.
	 * @param data the item that needs to be added.
	 */
	void setDtldNbOfTxs(String data) {
		m_dtldNbOfTxs = data;
	}
		
	/**
	 * Get the embedded DtldSts element.
	 * @return the item.
	 */
	public String getDtldSts() {
		return m_dtldSts;
	}
		
	/**
	 * This method sets (overwrites) the element DtldSts.
	 * @param data the item that needs to be added.
	 */
	void setDtldSts(String data) {
		m_dtldSts = data;
	}
		
	/**
	 * Get the embedded DtldCtrlSum element.
	 * @return the item.
	 */
	public String getDtldCtrlSum() {
		return m_dtldCtrlSum;
	}
		
	/**
	 * This method sets (overwrites) the element DtldCtrlSum.
	 * @param data the item that needs to be added.
	 */
	void setDtldCtrlSum(String data) {
		m_dtldCtrlSum = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	NumberOfTransactionsPerStatus3 t = (NumberOfTransactionsPerStatus3)that;
	 
		if (!Compare.equals(m_dtldNbOfTxs, t.m_dtldNbOfTxs))
			return false;
		
		if (!Compare.equals(m_dtldSts, t.m_dtldSts))
			return false;
		
		if (!Compare.equals(m_dtldCtrlSum, t.m_dtldCtrlSum))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from NumberOfTransactionsPerStatus3.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_dtldNbOfTxs != null) {
			out.print("\n<DtldNbOfTxs>");
			out.print(m_dtldNbOfTxs);
			out.print("</DtldNbOfTxs>\n");
		}
		
		if (m_dtldSts != null) {
			out.print("\n<DtldSts>");
			out.print(m_dtldSts);
			out.print("</DtldSts>\n");
		}
		
		if (m_dtldCtrlSum != null) {
			out.print("\n<DtldCtrlSum>");
			out.print(m_dtldCtrlSum);
			out.print("</DtldCtrlSum>\n");
		}
		
	}
}
