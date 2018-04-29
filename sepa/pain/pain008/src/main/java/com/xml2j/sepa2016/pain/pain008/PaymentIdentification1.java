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
 * PaymentIdentification1 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class PaymentIdentification1 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for PaymentIdentification1.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public PaymentIdentification1(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type PaymentIdentification1.
	 */
	static class Allocator implements TypeAllocator<PaymentIdentification1> {
		/**
		 * method for getting a new instance of type PaymentIdentification1.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public PaymentIdentification1 newInstance(String elementName, ComplexDataType parent) {
			return new PaymentIdentification1(elementName, parent);
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
	
  	
  
	/** element item for InstrId element. 
	 *  @serial
	 */	
	private String m_instrId = null;
	
	/** element item for EndToEndId element. 
	 *  @serial
	 */	
	private String m_endToEndId = null;
	
	/**
	 * Get the embedded InstrId element.
	 * @return the item.
	 */
	public String getInstrId() {
		return m_instrId;
	}
		
	/**
	 * This method sets (overwrites) the element InstrId.
	 * @param data the item that needs to be added.
	 */
	void setInstrId(String data) {
		m_instrId = data;
	}
		
	/**
	 * Get the embedded EndToEndId element.
	 * @return the item.
	 */
	public String getEndToEndId() {
		return m_endToEndId;
	}
		
	/**
	 * This method sets (overwrites) the element EndToEndId.
	 * @param data the item that needs to be added.
	 */
	void setEndToEndId(String data) {
		m_endToEndId = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	PaymentIdentification1 t = (PaymentIdentification1)that;
	 
		if (!Compare.equals(m_instrId, t.m_instrId))
			return false;
		
		if (!Compare.equals(m_endToEndId, t.m_endToEndId))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from PaymentIdentification1.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_instrId != null) {
			out.print("\n<InstrId>");
			out.print(m_instrId);
			out.print("</InstrId>\n");
		}
		
		if (m_endToEndId != null) {
			out.print("\n<EndToEndId>");
			out.print(m_endToEndId);
			out.print("</EndToEndId>\n");
		}
		
	}
}
