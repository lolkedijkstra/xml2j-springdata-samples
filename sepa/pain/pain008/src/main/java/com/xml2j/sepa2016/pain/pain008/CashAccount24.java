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
 * CashAccount24 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class CashAccount24 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for CashAccount24.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public CashAccount24(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type CashAccount24.
	 */
	static class Allocator implements TypeAllocator<CashAccount24> {
		/**
		 * method for getting a new instance of type CashAccount24.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public CashAccount24 newInstance(String elementName, ComplexDataType parent) {
			return new CashAccount24(elementName, parent);
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
	
  	
  
	/** element item for Id element. 
	 *  @serial
	 */	
	private AccountIdentification4Choice m_id = null;
	
	/** element item for Tp element. 
	 *  @serial
	 */	
	private CashAccountType2Choice m_tp = null;
	
	/** element item for Ccy element. 
	 *  @serial
	 */	
	private String m_ccy = null;
	
	/** element item for Nm element. 
	 *  @serial
	 */	
	private String m_nm = null;
	
	/**
	 * Get the embedded Id element.
	 * @return the item.
	 */
	public AccountIdentification4Choice getId() {
		return m_id;
	}
		
	/**
	 * This method sets (overwrites) the element Id.
	 * @param data the item that needs to be added.
	 */
	void setId(AccountIdentification4Choice data) {
		m_id = data;
	}
		
	/**
	 * Get the embedded Tp element.
	 * @return the item.
	 */
	public CashAccountType2Choice getTp() {
		return m_tp;
	}
		
	/**
	 * This method sets (overwrites) the element Tp.
	 * @param data the item that needs to be added.
	 */
	void setTp(CashAccountType2Choice data) {
		m_tp = data;
	}
		
	/**
	 * Get the embedded Ccy element.
	 * @return the item.
	 */
	public String getCcy() {
		return m_ccy;
	}
		
	/**
	 * This method sets (overwrites) the element Ccy.
	 * @param data the item that needs to be added.
	 */
	void setCcy(String data) {
		m_ccy = data;
	}
		
	/**
	 * Get the embedded Nm element.
	 * @return the item.
	 */
	public String getNm() {
		return m_nm;
	}
		
	/**
	 * This method sets (overwrites) the element Nm.
	 * @param data the item that needs to be added.
	 */
	void setNm(String data) {
		m_nm = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	CashAccount24 t = (CashAccount24)that;
	 
		if (!Compare.equals(m_id, t.m_id))
			return false;
		
		if (!Compare.equals(m_tp, t.m_tp))
			return false;
		
		if (!Compare.equals(m_ccy, t.m_ccy))
			return false;
		
		if (!Compare.equals(m_nm, t.m_nm))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from CashAccount24.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_id != null) {
			m_id.print(out);
		}	
		
		if (m_tp != null) {
			m_tp.print(out);
		}	
		
		if (m_ccy != null) {
			out.print("\n<Ccy>");
			out.print(m_ccy);
			out.print("</Ccy>\n");
		}
		
		if (m_nm != null) {
			out.print("\n<Nm>");
			out.print(m_nm);
			out.print("</Nm>\n");
		}
		
	}
}
