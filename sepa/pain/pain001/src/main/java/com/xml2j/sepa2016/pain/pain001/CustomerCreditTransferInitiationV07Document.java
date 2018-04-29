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
 * CustomerCreditTransferInitiationV07Document data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class CustomerCreditTransferInitiationV07Document extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for CustomerCreditTransferInitiationV07Document.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public CustomerCreditTransferInitiationV07Document(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type CustomerCreditTransferInitiationV07Document.
	 */
	static class Allocator implements TypeAllocator<CustomerCreditTransferInitiationV07Document> {
		/**
		 * method for getting a new instance of type CustomerCreditTransferInitiationV07Document.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public CustomerCreditTransferInitiationV07Document newInstance(String elementName, ComplexDataType parent) {
			return new CustomerCreditTransferInitiationV07Document(elementName, parent);
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
	
  	
  
	/** element item for CstmrCdtTrfInitn element. 
	 *  @serial
	 */	
	private CustomerCreditTransferInitiationV07 m_cstmrCdtTrfInitn = null;
	
	/**
	 * Get the embedded CstmrCdtTrfInitn element.
	 * @return the item.
	 */
	public CustomerCreditTransferInitiationV07 getCstmrCdtTrfInitn() {
		return m_cstmrCdtTrfInitn;
	}
		
	/**
	 * This method sets (overwrites) the element CstmrCdtTrfInitn.
	 * @param data the item that needs to be added.
	 */
	void setCstmrCdtTrfInitn(CustomerCreditTransferInitiationV07 data) {
		m_cstmrCdtTrfInitn = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	CustomerCreditTransferInitiationV07Document t = (CustomerCreditTransferInitiationV07Document)that;
	 
		if (!Compare.equals(m_cstmrCdtTrfInitn, t.m_cstmrCdtTrfInitn))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from CustomerCreditTransferInitiationV07Document.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_cstmrCdtTrfInitn != null) {
			m_cstmrCdtTrfInitn.print(out);
		}	
		
	}
}
