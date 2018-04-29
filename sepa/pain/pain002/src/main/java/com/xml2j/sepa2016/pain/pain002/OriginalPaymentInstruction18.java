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

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * OriginalPaymentInstruction18 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class OriginalPaymentInstruction18 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for OriginalPaymentInstruction18.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public OriginalPaymentInstruction18(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type OriginalPaymentInstruction18.
	 */
	static class Allocator implements TypeAllocator<OriginalPaymentInstruction18> {
		/**
		 * method for getting a new instance of type OriginalPaymentInstruction18.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public OriginalPaymentInstruction18 newInstance(String elementName, ComplexDataType parent) {
			return new OriginalPaymentInstruction18(elementName, parent);
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
	
	/** element item for PmtInfSts element. 
	 *  @serial
	 */	
	private String m_pmtInfSts = null;
	
	/** list of StsRsnInf element. 
	 *  @serial
	 */	
	private List<StatusReasonInformation9> m_stsRsnInfList = new ArrayList<StatusReasonInformation9>();
	
	/** list of NbOfTxsPerSts element. 
	 *  @serial
	 */	
	private List<NumberOfTransactionsPerStatus3> m_nbOfTxsPerStsList = new ArrayList<NumberOfTransactionsPerStatus3>();
	
	/** list of TxInfAndSts element. 
	 *  @serial
	 */	
	private List<PaymentTransaction68> m_txInfAndStsList = new ArrayList<PaymentTransaction68>();
	
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
	 * Get the embedded PmtInfSts element.
	 * @return the item.
	 */
	public String getPmtInfSts() {
		return m_pmtInfSts;
	}
		
	/**
	 * This method sets (overwrites) the element PmtInfSts.
	 * @param data the item that needs to be added.
	 */
	void setPmtInfSts(String data) {
		m_pmtInfSts = data;
	}
		
	/**
	 * Get the embedded list of StsRsnInf elements.
	 * @return list of items.
	 */
	public List<StatusReasonInformation9> getStsRsnInfs() {
		return m_stsRsnInfList;
	}
		
	/**
	 * This method adds data to the list of StsRsnInf.
	 * @param data the item that needs to be added.
	 */
	void setStsRsnInf(StatusReasonInformation9 data) {
		m_stsRsnInfList.add(data);
	}
		
	/**
	 * Get the embedded list of NbOfTxsPerSts elements.
	 * @return list of items.
	 */
	public List<NumberOfTransactionsPerStatus3> getNbOfTxsPerStss() {
		return m_nbOfTxsPerStsList;
	}
		
	/**
	 * This method adds data to the list of NbOfTxsPerSts.
	 * @param data the item that needs to be added.
	 */
	void setNbOfTxsPerSts(NumberOfTransactionsPerStatus3 data) {
		m_nbOfTxsPerStsList.add(data);
	}
		
	/**
	 * Get the embedded list of TxInfAndSts elements.
	 * @return list of items.
	 */
	public List<PaymentTransaction68> getTxInfAndStss() {
		return m_txInfAndStsList;
	}
		
	/**
	 * This method adds data to the list of TxInfAndSts.
	 * @param data the item that needs to be added.
	 */
	void setTxInfAndSts(PaymentTransaction68 data) {
		m_txInfAndStsList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	OriginalPaymentInstruction18 t = (OriginalPaymentInstruction18)that;
	 
		if (!Compare.equals(m_orgnlPmtInfId, t.m_orgnlPmtInfId))
			return false;
		
		if (!Compare.equals(m_orgnlNbOfTxs, t.m_orgnlNbOfTxs))
			return false;
		
		if (!Compare.equals(m_orgnlCtrlSum, t.m_orgnlCtrlSum))
			return false;
		
		if (!Compare.equals(m_pmtInfSts, t.m_pmtInfSts))
			return false;
		
		if (!Compare.equals(m_stsRsnInfList, t.m_stsRsnInfList))
			return false;
		
		if (!Compare.equals(m_nbOfTxsPerStsList, t.m_nbOfTxsPerStsList))
			return false;
		
		if (!Compare.equals(m_txInfAndStsList, t.m_txInfAndStsList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from OriginalPaymentInstruction18.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
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
		
		if (m_pmtInfSts != null) {
			out.print("\n<PmtInfSts>");
			out.print(m_pmtInfSts);
			out.print("</PmtInfSts>\n");
		}
		
		if (m_stsRsnInfList != null) {
			for(StatusReasonInformation9 l_StsRsnInf : m_stsRsnInfList) {
				l_StsRsnInf.print(out);
			}
		}	
		
		if (m_nbOfTxsPerStsList != null) {
			for(NumberOfTransactionsPerStatus3 l_NbOfTxsPerSts : m_nbOfTxsPerStsList) {
				l_NbOfTxsPerSts.print(out);
			}
		}	
		
		if (m_txInfAndStsList != null) {
			for(PaymentTransaction68 l_TxInfAndSts : m_txInfAndStsList) {
				l_TxInfAndSts.print(out);
			}
		}	
		
	}
}
