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
 * DocumentAdjustment1 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class DocumentAdjustment1 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for DocumentAdjustment1.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public DocumentAdjustment1(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type DocumentAdjustment1.
	 */
	static class Allocator implements TypeAllocator<DocumentAdjustment1> {
		/**
		 * method for getting a new instance of type DocumentAdjustment1.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public DocumentAdjustment1 newInstance(String elementName, ComplexDataType parent) {
			return new DocumentAdjustment1(elementName, parent);
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
	
  	
  
	/** element item for Amt element. 
	 *  @serial
	 */	
	private ActiveOrHistoricCurrencyAndAmount m_amt = null;
	
	/** element item for CdtDbtInd element. 
	 *  @serial
	 */	
	private String m_cdtDbtInd = null;
	
	/** element item for Rsn element. 
	 *  @serial
	 */	
	private String m_rsn = null;
	
	/** element item for AddtlInf element. 
	 *  @serial
	 */	
	private String m_addtlInf = null;
	
	/**
	 * Get the embedded Amt element.
	 * @return the item.
	 */
	public ActiveOrHistoricCurrencyAndAmount getAmt() {
		return m_amt;
	}
		
	/**
	 * This method sets (overwrites) the element Amt.
	 * @param data the item that needs to be added.
	 */
	void setAmt(ActiveOrHistoricCurrencyAndAmount data) {
		m_amt = data;
	}
		
	/**
	 * Get the embedded CdtDbtInd element.
	 * @return the item.
	 */
	public String getCdtDbtInd() {
		return m_cdtDbtInd;
	}
		
	/**
	 * This method sets (overwrites) the element CdtDbtInd.
	 * @param data the item that needs to be added.
	 */
	void setCdtDbtInd(String data) {
		m_cdtDbtInd = data;
	}
		
	/**
	 * Get the embedded Rsn element.
	 * @return the item.
	 */
	public String getRsn() {
		return m_rsn;
	}
		
	/**
	 * This method sets (overwrites) the element Rsn.
	 * @param data the item that needs to be added.
	 */
	void setRsn(String data) {
		m_rsn = data;
	}
		
	/**
	 * Get the embedded AddtlInf element.
	 * @return the item.
	 */
	public String getAddtlInf() {
		return m_addtlInf;
	}
		
	/**
	 * This method sets (overwrites) the element AddtlInf.
	 * @param data the item that needs to be added.
	 */
	void setAddtlInf(String data) {
		m_addtlInf = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	DocumentAdjustment1 t = (DocumentAdjustment1)that;
	 
		if (!Compare.equals(m_amt, t.m_amt))
			return false;
		
		if (!Compare.equals(m_cdtDbtInd, t.m_cdtDbtInd))
			return false;
		
		if (!Compare.equals(m_rsn, t.m_rsn))
			return false;
		
		if (!Compare.equals(m_addtlInf, t.m_addtlInf))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from DocumentAdjustment1.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_amt != null) {
			m_amt.print(out);
		}	
		
		if (m_cdtDbtInd != null) {
			out.print("\n<CdtDbtInd>");
			out.print(m_cdtDbtInd);
			out.print("</CdtDbtInd>\n");
		}
		
		if (m_rsn != null) {
			out.print("\n<Rsn>");
			out.print(m_rsn);
			out.print("</Rsn>\n");
		}
		
		if (m_addtlInf != null) {
			out.print("\n<AddtlInf>");
			out.print(m_addtlInf);
			out.print("</AddtlInf>\n");
		}
		
	}
}
