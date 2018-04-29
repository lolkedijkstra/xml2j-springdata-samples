package com.xml2j.sepa2016.pain.pain007;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: PAIN007 
  Generation date: Sun Apr 29 21:09:42 CEST 2018 
  Author: XML2J-GEN

******************************************************************************/

import com.xml2j.util.Printer;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * CustomerPaymentReversalV06Document data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class CustomerPaymentReversalV06Document extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for CustomerPaymentReversalV06Document.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public CustomerPaymentReversalV06Document(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type CustomerPaymentReversalV06Document.
	 */
	static class Allocator implements TypeAllocator<CustomerPaymentReversalV06Document> {
		/**
		 * method for getting a new instance of type CustomerPaymentReversalV06Document.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public CustomerPaymentReversalV06Document newInstance(String elementName, ComplexDataType parent) {
			return new CustomerPaymentReversalV06Document(elementName, parent);
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
	
  	
  
	/** element item for CstmrPmtRvsl element. 
	 *  @serial
	 */	
	private CustomerPaymentReversalV06 m_cstmrPmtRvsl = null;
	
	/**
	 * Get the embedded CstmrPmtRvsl element.
	 * @return the item.
	 */
	public CustomerPaymentReversalV06 getCstmrPmtRvsl() {
		return m_cstmrPmtRvsl;
	}
		
	/**
	 * This method sets (overwrites) the element CstmrPmtRvsl.
	 * @param data the item that needs to be added.
	 */
	void setCstmrPmtRvsl(CustomerPaymentReversalV06 data) {
		m_cstmrPmtRvsl = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	CustomerPaymentReversalV06Document t = (CustomerPaymentReversalV06Document)that;
	 
		if (!Compare.equals(m_cstmrPmtRvsl, t.m_cstmrPmtRvsl))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from CustomerPaymentReversalV06Document.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_cstmrPmtRvsl != null) {
			m_cstmrPmtRvsl.print(out);
		}	
		
	}
}
