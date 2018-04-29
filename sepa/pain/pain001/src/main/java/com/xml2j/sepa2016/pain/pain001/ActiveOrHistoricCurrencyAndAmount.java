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

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * ActiveOrHistoricCurrencyAndAmount data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class ActiveOrHistoricCurrencyAndAmount extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for ActiveOrHistoricCurrencyAndAmount.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public ActiveOrHistoricCurrencyAndAmount(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type ActiveOrHistoricCurrencyAndAmount.
	 */
	static class Allocator implements TypeAllocator<ActiveOrHistoricCurrencyAndAmount> {
		/**
		 * method for getting a new instance of type ActiveOrHistoricCurrencyAndAmount.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public ActiveOrHistoricCurrencyAndAmount newInstance(String elementName, ComplexDataType parent) {
			return new ActiveOrHistoricCurrencyAndAmount(elementName, parent);
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
	
  	
  
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 
		return true;
	}	

  
  

//	/**
//	 * Get 'Ccy' attribute.
//	 * @return the item.
//	 */
//	public String getCcy() {
//		return getAttr("Ccy");
//	}

//	/**
//	 * Set 'Ccy' attribute.
//	 * 
//	 * Set (overwrite) the attribute data.
//	 * @param data the item that needs to be added.
//	 */
//	public void setCcy(String data) {
//		setAttr("Ccy", data);
//	}
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from ActiveOrHistoricCurrencyAndAmount.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
	}
}
