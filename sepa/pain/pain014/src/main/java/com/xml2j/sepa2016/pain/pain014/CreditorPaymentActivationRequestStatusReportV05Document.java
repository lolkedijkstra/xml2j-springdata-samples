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
 * CreditorPaymentActivationRequestStatusReportV05Document data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class CreditorPaymentActivationRequestStatusReportV05Document extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for CreditorPaymentActivationRequestStatusReportV05Document.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public CreditorPaymentActivationRequestStatusReportV05Document(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type CreditorPaymentActivationRequestStatusReportV05Document.
	 */
	static class Allocator implements TypeAllocator<CreditorPaymentActivationRequestStatusReportV05Document> {
		/**
		 * method for getting a new instance of type CreditorPaymentActivationRequestStatusReportV05Document.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public CreditorPaymentActivationRequestStatusReportV05Document newInstance(String elementName, ComplexDataType parent) {
			return new CreditorPaymentActivationRequestStatusReportV05Document(elementName, parent);
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
	
  	
  
	/** element item for CdtrPmtActvtnReqStsRpt element. 
	 *  @serial
	 */	
	private CreditorPaymentActivationRequestStatusReportV05 m_cdtrPmtActvtnReqStsRpt = null;
	
	/**
	 * Get the embedded CdtrPmtActvtnReqStsRpt element.
	 * @return the item.
	 */
	public CreditorPaymentActivationRequestStatusReportV05 getCdtrPmtActvtnReqStsRpt() {
		return m_cdtrPmtActvtnReqStsRpt;
	}
		
	/**
	 * This method sets (overwrites) the element CdtrPmtActvtnReqStsRpt.
	 * @param data the item that needs to be added.
	 */
	void setCdtrPmtActvtnReqStsRpt(CreditorPaymentActivationRequestStatusReportV05 data) {
		m_cdtrPmtActvtnReqStsRpt = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	CreditorPaymentActivationRequestStatusReportV05Document t = (CreditorPaymentActivationRequestStatusReportV05Document)that;
	 
		if (!Compare.equals(m_cdtrPmtActvtnReqStsRpt, t.m_cdtrPmtActvtnReqStsRpt))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from CreditorPaymentActivationRequestStatusReportV05Document.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_cdtrPmtActvtnReqStsRpt != null) {
			m_cdtrPmtActvtnReqStsRpt.print(out);
		}	
		
	}
}
