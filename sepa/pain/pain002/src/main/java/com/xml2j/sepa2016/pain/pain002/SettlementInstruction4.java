package com.xml2j.sepa2016.pain.pain002;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: PAIN002 
  Generation date: Sun Apr 29 21:09:42 CEST 2018 
  Author: XML2J-GEN

******************************************************************************/

import com.xml2j.util.Printer;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * SettlementInstruction4 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class SettlementInstruction4 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for SettlementInstruction4.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public SettlementInstruction4(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type SettlementInstruction4.
	 */
	static class Allocator implements TypeAllocator<SettlementInstruction4> {
		/**
		 * method for getting a new instance of type SettlementInstruction4.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public SettlementInstruction4 newInstance(String elementName, ComplexDataType parent) {
			return new SettlementInstruction4(elementName, parent);
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
	
  	
  
	/** element item for SttlmMtd element. 
	 *  @serial
	 */	
	private String m_sttlmMtd = null;
	
	/** element item for SttlmAcct element. 
	 *  @serial
	 */	
	private CashAccount24 m_sttlmAcct = null;
	
	/** element item for ClrSys element. 
	 *  @serial
	 */	
	private ClearingSystemIdentification3Choice m_clrSys = null;
	
	/** element item for InstgRmbrsmntAgt element. 
	 *  @serial
	 */	
	private BranchAndFinancialInstitutionIdentification5 m_instgRmbrsmntAgt = null;
	
	/** element item for InstgRmbrsmntAgtAcct element. 
	 *  @serial
	 */	
	private CashAccount24 m_instgRmbrsmntAgtAcct = null;
	
	/** element item for InstdRmbrsmntAgt element. 
	 *  @serial
	 */	
	private BranchAndFinancialInstitutionIdentification5 m_instdRmbrsmntAgt = null;
	
	/** element item for InstdRmbrsmntAgtAcct element. 
	 *  @serial
	 */	
	private CashAccount24 m_instdRmbrsmntAgtAcct = null;
	
	/** element item for ThrdRmbrsmntAgt element. 
	 *  @serial
	 */	
	private BranchAndFinancialInstitutionIdentification5 m_thrdRmbrsmntAgt = null;
	
	/** element item for ThrdRmbrsmntAgtAcct element. 
	 *  @serial
	 */	
	private CashAccount24 m_thrdRmbrsmntAgtAcct = null;
	
	/**
	 * Get the embedded SttlmMtd element.
	 * @return the item.
	 */
	public String getSttlmMtd() {
		return m_sttlmMtd;
	}
		
	/**
	 * This method sets (overwrites) the element SttlmMtd.
	 * @param data the item that needs to be added.
	 */
	void setSttlmMtd(String data) {
		m_sttlmMtd = data;
	}
		
	/**
	 * Get the embedded SttlmAcct element.
	 * @return the item.
	 */
	public CashAccount24 getSttlmAcct() {
		return m_sttlmAcct;
	}
		
	/**
	 * This method sets (overwrites) the element SttlmAcct.
	 * @param data the item that needs to be added.
	 */
	void setSttlmAcct(CashAccount24 data) {
		m_sttlmAcct = data;
	}
		
	/**
	 * Get the embedded ClrSys element.
	 * @return the item.
	 */
	public ClearingSystemIdentification3Choice getClrSys() {
		return m_clrSys;
	}
		
	/**
	 * This method sets (overwrites) the element ClrSys.
	 * @param data the item that needs to be added.
	 */
	void setClrSys(ClearingSystemIdentification3Choice data) {
		m_clrSys = data;
	}
		
	/**
	 * Get the embedded InstgRmbrsmntAgt element.
	 * @return the item.
	 */
	public BranchAndFinancialInstitutionIdentification5 getInstgRmbrsmntAgt() {
		return m_instgRmbrsmntAgt;
	}
		
	/**
	 * This method sets (overwrites) the element InstgRmbrsmntAgt.
	 * @param data the item that needs to be added.
	 */
	void setInstgRmbrsmntAgt(BranchAndFinancialInstitutionIdentification5 data) {
		m_instgRmbrsmntAgt = data;
	}
		
	/**
	 * Get the embedded InstgRmbrsmntAgtAcct element.
	 * @return the item.
	 */
	public CashAccount24 getInstgRmbrsmntAgtAcct() {
		return m_instgRmbrsmntAgtAcct;
	}
		
	/**
	 * This method sets (overwrites) the element InstgRmbrsmntAgtAcct.
	 * @param data the item that needs to be added.
	 */
	void setInstgRmbrsmntAgtAcct(CashAccount24 data) {
		m_instgRmbrsmntAgtAcct = data;
	}
		
	/**
	 * Get the embedded InstdRmbrsmntAgt element.
	 * @return the item.
	 */
	public BranchAndFinancialInstitutionIdentification5 getInstdRmbrsmntAgt() {
		return m_instdRmbrsmntAgt;
	}
		
	/**
	 * This method sets (overwrites) the element InstdRmbrsmntAgt.
	 * @param data the item that needs to be added.
	 */
	void setInstdRmbrsmntAgt(BranchAndFinancialInstitutionIdentification5 data) {
		m_instdRmbrsmntAgt = data;
	}
		
	/**
	 * Get the embedded InstdRmbrsmntAgtAcct element.
	 * @return the item.
	 */
	public CashAccount24 getInstdRmbrsmntAgtAcct() {
		return m_instdRmbrsmntAgtAcct;
	}
		
	/**
	 * This method sets (overwrites) the element InstdRmbrsmntAgtAcct.
	 * @param data the item that needs to be added.
	 */
	void setInstdRmbrsmntAgtAcct(CashAccount24 data) {
		m_instdRmbrsmntAgtAcct = data;
	}
		
	/**
	 * Get the embedded ThrdRmbrsmntAgt element.
	 * @return the item.
	 */
	public BranchAndFinancialInstitutionIdentification5 getThrdRmbrsmntAgt() {
		return m_thrdRmbrsmntAgt;
	}
		
	/**
	 * This method sets (overwrites) the element ThrdRmbrsmntAgt.
	 * @param data the item that needs to be added.
	 */
	void setThrdRmbrsmntAgt(BranchAndFinancialInstitutionIdentification5 data) {
		m_thrdRmbrsmntAgt = data;
	}
		
	/**
	 * Get the embedded ThrdRmbrsmntAgtAcct element.
	 * @return the item.
	 */
	public CashAccount24 getThrdRmbrsmntAgtAcct() {
		return m_thrdRmbrsmntAgtAcct;
	}
		
	/**
	 * This method sets (overwrites) the element ThrdRmbrsmntAgtAcct.
	 * @param data the item that needs to be added.
	 */
	void setThrdRmbrsmntAgtAcct(CashAccount24 data) {
		m_thrdRmbrsmntAgtAcct = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	SettlementInstruction4 t = (SettlementInstruction4)that;
	 
		if (!Compare.equals(m_sttlmMtd, t.m_sttlmMtd))
			return false;
		
		if (!Compare.equals(m_sttlmAcct, t.m_sttlmAcct))
			return false;
		
		if (!Compare.equals(m_clrSys, t.m_clrSys))
			return false;
		
		if (!Compare.equals(m_instgRmbrsmntAgt, t.m_instgRmbrsmntAgt))
			return false;
		
		if (!Compare.equals(m_instgRmbrsmntAgtAcct, t.m_instgRmbrsmntAgtAcct))
			return false;
		
		if (!Compare.equals(m_instdRmbrsmntAgt, t.m_instdRmbrsmntAgt))
			return false;
		
		if (!Compare.equals(m_instdRmbrsmntAgtAcct, t.m_instdRmbrsmntAgtAcct))
			return false;
		
		if (!Compare.equals(m_thrdRmbrsmntAgt, t.m_thrdRmbrsmntAgt))
			return false;
		
		if (!Compare.equals(m_thrdRmbrsmntAgtAcct, t.m_thrdRmbrsmntAgtAcct))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from SettlementInstruction4.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_sttlmMtd != null) {
			out.print("\n<SttlmMtd>");
			out.print(m_sttlmMtd);
			out.print("</SttlmMtd>\n");
		}
		
		if (m_sttlmAcct != null) {
			m_sttlmAcct.print(out);
		}	
		
		if (m_clrSys != null) {
			m_clrSys.print(out);
		}	
		
		if (m_instgRmbrsmntAgt != null) {
			m_instgRmbrsmntAgt.print(out);
		}	
		
		if (m_instgRmbrsmntAgtAcct != null) {
			m_instgRmbrsmntAgtAcct.print(out);
		}	
		
		if (m_instdRmbrsmntAgt != null) {
			m_instdRmbrsmntAgt.print(out);
		}	
		
		if (m_instdRmbrsmntAgtAcct != null) {
			m_instdRmbrsmntAgtAcct.print(out);
		}	
		
		if (m_thrdRmbrsmntAgt != null) {
			m_thrdRmbrsmntAgt.print(out);
		}	
		
		if (m_thrdRmbrsmntAgtAcct != null) {
			m_thrdRmbrsmntAgtAcct.print(out);
		}	
		
	}
}
