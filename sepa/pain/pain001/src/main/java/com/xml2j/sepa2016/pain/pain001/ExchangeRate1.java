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
 * ExchangeRate1 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class ExchangeRate1 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for ExchangeRate1.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public ExchangeRate1(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type ExchangeRate1.
	 */
	static class Allocator implements TypeAllocator<ExchangeRate1> {
		/**
		 * method for getting a new instance of type ExchangeRate1.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public ExchangeRate1 newInstance(String elementName, ComplexDataType parent) {
			return new ExchangeRate1(elementName, parent);
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
	
  	
  
	/** element item for UnitCcy element. 
	 *  @serial
	 */	
	private String m_unitCcy = null;
	
	/** element item for XchgRate element. 
	 *  @serial
	 */	
	private String m_xchgRate = null;
	
	/** element item for RateTp element. 
	 *  @serial
	 */	
	private String m_rateTp = null;
	
	/** element item for CtrctId element. 
	 *  @serial
	 */	
	private String m_ctrctId = null;
	
	/**
	 * Get the embedded UnitCcy element.
	 * @return the item.
	 */
	public String getUnitCcy() {
		return m_unitCcy;
	}
		
	/**
	 * This method sets (overwrites) the element UnitCcy.
	 * @param data the item that needs to be added.
	 */
	void setUnitCcy(String data) {
		m_unitCcy = data;
	}
		
	/**
	 * Get the embedded XchgRate element.
	 * @return the item.
	 */
	public String getXchgRate() {
		return m_xchgRate;
	}
		
	/**
	 * This method sets (overwrites) the element XchgRate.
	 * @param data the item that needs to be added.
	 */
	void setXchgRate(String data) {
		m_xchgRate = data;
	}
		
	/**
	 * Get the embedded RateTp element.
	 * @return the item.
	 */
	public String getRateTp() {
		return m_rateTp;
	}
		
	/**
	 * This method sets (overwrites) the element RateTp.
	 * @param data the item that needs to be added.
	 */
	void setRateTp(String data) {
		m_rateTp = data;
	}
		
	/**
	 * Get the embedded CtrctId element.
	 * @return the item.
	 */
	public String getCtrctId() {
		return m_ctrctId;
	}
		
	/**
	 * This method sets (overwrites) the element CtrctId.
	 * @param data the item that needs to be added.
	 */
	void setCtrctId(String data) {
		m_ctrctId = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	ExchangeRate1 t = (ExchangeRate1)that;
	 
		if (!Compare.equals(m_unitCcy, t.m_unitCcy))
			return false;
		
		if (!Compare.equals(m_xchgRate, t.m_xchgRate))
			return false;
		
		if (!Compare.equals(m_rateTp, t.m_rateTp))
			return false;
		
		if (!Compare.equals(m_ctrctId, t.m_ctrctId))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from ExchangeRate1.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_unitCcy != null) {
			out.print("\n<UnitCcy>");
			out.print(m_unitCcy);
			out.print("</UnitCcy>\n");
		}
		
		if (m_xchgRate != null) {
			out.print("\n<XchgRate>");
			out.print(m_xchgRate);
			out.print("</XchgRate>\n");
		}
		
		if (m_rateTp != null) {
			out.print("\n<RateTp>");
			out.print(m_rateTp);
			out.print("</RateTp>\n");
		}
		
		if (m_ctrctId != null) {
			out.print("\n<CtrctId>");
			out.print(m_ctrctId);
			out.print("</CtrctId>\n");
		}
		
	}
}
