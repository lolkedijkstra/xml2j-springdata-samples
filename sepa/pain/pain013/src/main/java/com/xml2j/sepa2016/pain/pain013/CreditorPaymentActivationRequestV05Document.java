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
 * CreditorPaymentActivationRequestV05Document data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class CreditorPaymentActivationRequestV05Document extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for CreditorPaymentActivationRequestV05Document.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public CreditorPaymentActivationRequestV05Document(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type CreditorPaymentActivationRequestV05Document.
	 */
	static class Allocator implements TypeAllocator<CreditorPaymentActivationRequestV05Document> {
		/**
		 * method for getting a new instance of type CreditorPaymentActivationRequestV05Document.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public CreditorPaymentActivationRequestV05Document newInstance(String elementName, ComplexDataType parent) {
			return new CreditorPaymentActivationRequestV05Document(elementName, parent);
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
	
  	
  
	/** element item for CdtrPmtActvtnReq element. 
	 *  @serial
	 */	
	private CreditorPaymentActivationRequestV05 m_cdtrPmtActvtnReq = null;
	
	/**
	 * Get the embedded CdtrPmtActvtnReq element.
	 * @return the item.
	 */
	public CreditorPaymentActivationRequestV05 getCdtrPmtActvtnReq() {
		return m_cdtrPmtActvtnReq;
	}
		
	/**
	 * This method sets (overwrites) the element CdtrPmtActvtnReq.
	 * @param data the item that needs to be added.
	 */
	void setCdtrPmtActvtnReq(CreditorPaymentActivationRequestV05 data) {
		m_cdtrPmtActvtnReq = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	CreditorPaymentActivationRequestV05Document t = (CreditorPaymentActivationRequestV05Document)that;
	 
		if (!Compare.equals(m_cdtrPmtActvtnReq, t.m_cdtrPmtActvtnReq))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from CreditorPaymentActivationRequestV05Document.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_cdtrPmtActvtnReq != null) {
			m_cdtrPmtActvtnReq.print(out);
		}	
		
	}
}
