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

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * TaxAmount1 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class TaxAmount1 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for TaxAmount1.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public TaxAmount1(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type TaxAmount1.
	 */
	static class Allocator implements TypeAllocator<TaxAmount1> {
		/**
		 * method for getting a new instance of type TaxAmount1.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public TaxAmount1 newInstance(String elementName, ComplexDataType parent) {
			return new TaxAmount1(elementName, parent);
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
	
  	
  
	/** element item for Rate element. 
	 *  @serial
	 */	
	private String m_rate = null;
	
	/** element item for TaxblBaseAmt element. 
	 *  @serial
	 */	
	private ActiveOrHistoricCurrencyAndAmount m_taxblBaseAmt = null;
	
	/** element item for TtlAmt element. 
	 *  @serial
	 */	
	private ActiveOrHistoricCurrencyAndAmount m_ttlAmt = null;
	
	/** list of Dtls element. 
	 *  @serial
	 */	
	private List<TaxRecordDetails1> m_dtlsList = new ArrayList<TaxRecordDetails1>();
	
	/**
	 * Get the embedded Rate element.
	 * @return the item.
	 */
	public String getRate() {
		return m_rate;
	}
		
	/**
	 * This method sets (overwrites) the element Rate.
	 * @param data the item that needs to be added.
	 */
	void setRate(String data) {
		m_rate = data;
	}
		
	/**
	 * Get the embedded TaxblBaseAmt element.
	 * @return the item.
	 */
	public ActiveOrHistoricCurrencyAndAmount getTaxblBaseAmt() {
		return m_taxblBaseAmt;
	}
		
	/**
	 * This method sets (overwrites) the element TaxblBaseAmt.
	 * @param data the item that needs to be added.
	 */
	void setTaxblBaseAmt(ActiveOrHistoricCurrencyAndAmount data) {
		m_taxblBaseAmt = data;
	}
		
	/**
	 * Get the embedded TtlAmt element.
	 * @return the item.
	 */
	public ActiveOrHistoricCurrencyAndAmount getTtlAmt() {
		return m_ttlAmt;
	}
		
	/**
	 * This method sets (overwrites) the element TtlAmt.
	 * @param data the item that needs to be added.
	 */
	void setTtlAmt(ActiveOrHistoricCurrencyAndAmount data) {
		m_ttlAmt = data;
	}
		
	/**
	 * Get the embedded list of Dtls elements.
	 * @return list of items.
	 */
	public List<TaxRecordDetails1> getDtlss() {
		return m_dtlsList;
	}
		
	/**
	 * This method adds data to the list of Dtls.
	 * @param data the item that needs to be added.
	 */
	void setDtls(TaxRecordDetails1 data) {
		m_dtlsList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	TaxAmount1 t = (TaxAmount1)that;
	 
		if (!Compare.equals(m_rate, t.m_rate))
			return false;
		
		if (!Compare.equals(m_taxblBaseAmt, t.m_taxblBaseAmt))
			return false;
		
		if (!Compare.equals(m_ttlAmt, t.m_ttlAmt))
			return false;
		
		if (!Compare.equals(m_dtlsList, t.m_dtlsList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from TaxAmount1.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_rate != null) {
			out.print("\n<Rate>");
			out.print(m_rate);
			out.print("</Rate>\n");
		}
		
		if (m_taxblBaseAmt != null) {
			m_taxblBaseAmt.print(out);
		}	
		
		if (m_ttlAmt != null) {
			m_ttlAmt.print(out);
		}	
		
		if (m_dtlsList != null) {
			for(TaxRecordDetails1 l_Dtls : m_dtlsList) {
				l_Dtls.print(out);
			}
		}	
		
	}
}
