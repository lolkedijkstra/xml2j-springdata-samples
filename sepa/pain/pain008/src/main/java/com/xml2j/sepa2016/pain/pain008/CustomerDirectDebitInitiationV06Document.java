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
 * CustomerDirectDebitInitiationV06Document data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class CustomerDirectDebitInitiationV06Document extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for CustomerDirectDebitInitiationV06Document.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public CustomerDirectDebitInitiationV06Document(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type CustomerDirectDebitInitiationV06Document.
	 */
	static class Allocator implements TypeAllocator<CustomerDirectDebitInitiationV06Document> {
		/**
		 * method for getting a new instance of type CustomerDirectDebitInitiationV06Document.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public CustomerDirectDebitInitiationV06Document newInstance(String elementName, ComplexDataType parent) {
			return new CustomerDirectDebitInitiationV06Document(elementName, parent);
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
	
  	
  
	/** element item for CstmrDrctDbtInitn element. 
	 *  @serial
	 */	
	private CustomerDirectDebitInitiationV06 m_cstmrDrctDbtInitn = null;
	
	/**
	 * Get the embedded CstmrDrctDbtInitn element.
	 * @return the item.
	 */
	public CustomerDirectDebitInitiationV06 getCstmrDrctDbtInitn() {
		return m_cstmrDrctDbtInitn;
	}
		
	/**
	 * This method sets (overwrites) the element CstmrDrctDbtInitn.
	 * @param data the item that needs to be added.
	 */
	void setCstmrDrctDbtInitn(CustomerDirectDebitInitiationV06 data) {
		m_cstmrDrctDbtInitn = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	CustomerDirectDebitInitiationV06Document t = (CustomerDirectDebitInitiationV06Document)that;
	 
		if (!Compare.equals(m_cstmrDrctDbtInitn, t.m_cstmrDrctDbtInitn))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from CustomerDirectDebitInitiationV06Document.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_cstmrDrctDbtInitn != null) {
			m_cstmrDrctDbtInitn.print(out);
		}	
		
	}
}
