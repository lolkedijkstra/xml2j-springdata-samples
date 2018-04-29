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
 * OriginalPaymentInstruction16 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class OriginalPaymentInstruction16 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for OriginalPaymentInstruction16.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public OriginalPaymentInstruction16(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type OriginalPaymentInstruction16.
	 */
	static class Allocator implements TypeAllocator<OriginalPaymentInstruction16> {
		/**
		 * method for getting a new instance of type OriginalPaymentInstruction16.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public OriginalPaymentInstruction16 newInstance(String elementName, ComplexDataType parent) {
			return new OriginalPaymentInstruction16(elementName, parent);
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
	
  	
  
	/** element item for RvslPmtInfId element. 
	 *  @serial
	 */	
	private String m_rvslPmtInfId = null;
	
	/** element item for OrgnlPmtInfId element. 
	 *  @serial
	 */	
	private String m_orgnlPmtInfId = null;
	
	/** element item for OrgnlNbOfTxs element. 
	 *  @serial
	 */	
	private String m_orgnlNbOfTxs = null;
	
	/** element item for OrgnlCtrlSum element. 
	 *  @serial
	 */	
	private String m_orgnlCtrlSum = null;
	
	/** element item for BtchBookg element. 
	 *  @serial
	 */	
	private String m_btchBookg = null;
	
	/** element item for PmtInfRvsl element. 
	 *  @serial
	 */	
	private String m_pmtInfRvsl = null;
	
	/** list of RvslRsnInf element. 
	 *  @serial
	 */	
	private List<PaymentReversalReason7> m_rvslRsnInfList = new ArrayList<PaymentReversalReason7>();
	
	/** list of TxInf element. 
	 *  @serial
	 */	
	private List<PaymentTransaction64> m_txInfList = new ArrayList<PaymentTransaction64>();
	
	/**
	 * Get the embedded RvslPmtInfId element.
	 * @return the item.
	 */
	public String getRvslPmtInfId() {
		return m_rvslPmtInfId;
	}
		
	/**
	 * This method sets (overwrites) the element RvslPmtInfId.
	 * @param data the item that needs to be added.
	 */
	void setRvslPmtInfId(String data) {
		m_rvslPmtInfId = data;
	}
		
	/**
	 * Get the embedded OrgnlPmtInfId element.
	 * @return the item.
	 */
	public String getOrgnlPmtInfId() {
		return m_orgnlPmtInfId;
	}
		
	/**
	 * This method sets (overwrites) the element OrgnlPmtInfId.
	 * @param data the item that needs to be added.
	 */
	void setOrgnlPmtInfId(String data) {
		m_orgnlPmtInfId = data;
	}
		
	/**
	 * Get the embedded OrgnlNbOfTxs element.
	 * @return the item.
	 */
	public String getOrgnlNbOfTxs() {
		return m_orgnlNbOfTxs;
	}
		
	/**
	 * This method sets (overwrites) the element OrgnlNbOfTxs.
	 * @param data the item that needs to be added.
	 */
	void setOrgnlNbOfTxs(String data) {
		m_orgnlNbOfTxs = data;
	}
		
	/**
	 * Get the embedded OrgnlCtrlSum element.
	 * @return the item.
	 */
	public String getOrgnlCtrlSum() {
		return m_orgnlCtrlSum;
	}
		
	/**
	 * This method sets (overwrites) the element OrgnlCtrlSum.
	 * @param data the item that needs to be added.
	 */
	void setOrgnlCtrlSum(String data) {
		m_orgnlCtrlSum = data;
	}
		
	/**
	 * Get the embedded BtchBookg element.
	 * @return the item.
	 */
	public String getBtchBookg() {
		return m_btchBookg;
	}
		
	/**
	 * This method sets (overwrites) the element BtchBookg.
	 * @param data the item that needs to be added.
	 */
	void setBtchBookg(String data) {
		m_btchBookg = data;
	}
		
	/**
	 * Get the embedded PmtInfRvsl element.
	 * @return the item.
	 */
	public String getPmtInfRvsl() {
		return m_pmtInfRvsl;
	}
		
	/**
	 * This method sets (overwrites) the element PmtInfRvsl.
	 * @param data the item that needs to be added.
	 */
	void setPmtInfRvsl(String data) {
		m_pmtInfRvsl = data;
	}
		
	/**
	 * Get the embedded list of RvslRsnInf elements.
	 * @return list of items.
	 */
	public List<PaymentReversalReason7> getRvslRsnInfs() {
		return m_rvslRsnInfList;
	}
		
	/**
	 * This method adds data to the list of RvslRsnInf.
	 * @param data the item that needs to be added.
	 */
	void setRvslRsnInf(PaymentReversalReason7 data) {
		m_rvslRsnInfList.add(data);
	}
		
	/**
	 * Get the embedded list of TxInf elements.
	 * @return list of items.
	 */
	public List<PaymentTransaction64> getTxInfs() {
		return m_txInfList;
	}
		
	/**
	 * This method adds data to the list of TxInf.
	 * @param data the item that needs to be added.
	 */
	void setTxInf(PaymentTransaction64 data) {
		m_txInfList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	OriginalPaymentInstruction16 t = (OriginalPaymentInstruction16)that;
	 
		if (!Compare.equals(m_rvslPmtInfId, t.m_rvslPmtInfId))
			return false;
		
		if (!Compare.equals(m_orgnlPmtInfId, t.m_orgnlPmtInfId))
			return false;
		
		if (!Compare.equals(m_orgnlNbOfTxs, t.m_orgnlNbOfTxs))
			return false;
		
		if (!Compare.equals(m_orgnlCtrlSum, t.m_orgnlCtrlSum))
			return false;
		
		if (!Compare.equals(m_btchBookg, t.m_btchBookg))
			return false;
		
		if (!Compare.equals(m_pmtInfRvsl, t.m_pmtInfRvsl))
			return false;
		
		if (!Compare.equals(m_rvslRsnInfList, t.m_rvslRsnInfList))
			return false;
		
		if (!Compare.equals(m_txInfList, t.m_txInfList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from OriginalPaymentInstruction16.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_rvslPmtInfId != null) {
			out.print("\n<RvslPmtInfId>");
			out.print(m_rvslPmtInfId);
			out.print("</RvslPmtInfId>\n");
		}
		
		if (m_orgnlPmtInfId != null) {
			out.print("\n<OrgnlPmtInfId>");
			out.print(m_orgnlPmtInfId);
			out.print("</OrgnlPmtInfId>\n");
		}
		
		if (m_orgnlNbOfTxs != null) {
			out.print("\n<OrgnlNbOfTxs>");
			out.print(m_orgnlNbOfTxs);
			out.print("</OrgnlNbOfTxs>\n");
		}
		
		if (m_orgnlCtrlSum != null) {
			out.print("\n<OrgnlCtrlSum>");
			out.print(m_orgnlCtrlSum);
			out.print("</OrgnlCtrlSum>\n");
		}
		
		if (m_btchBookg != null) {
			out.print("\n<BtchBookg>");
			out.print(m_btchBookg);
			out.print("</BtchBookg>\n");
		}
		
		if (m_pmtInfRvsl != null) {
			out.print("\n<PmtInfRvsl>");
			out.print(m_pmtInfRvsl);
			out.print("</PmtInfRvsl>\n");
		}
		
		if (m_rvslRsnInfList != null) {
			for(PaymentReversalReason7 l_RvslRsnInf : m_rvslRsnInfList) {
				l_RvslRsnInf.print(out);
			}
		}	
		
		if (m_txInfList != null) {
			for(PaymentTransaction64 l_TxInf : m_txInfList) {
				l_TxInf.print(out);
			}
		}	
		
	}
}
