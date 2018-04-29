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

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * PaymentInstruction18 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class PaymentInstruction18 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for PaymentInstruction18.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public PaymentInstruction18(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type PaymentInstruction18.
	 */
	static class Allocator implements TypeAllocator<PaymentInstruction18> {
		/**
		 * method for getting a new instance of type PaymentInstruction18.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public PaymentInstruction18 newInstance(String elementName, ComplexDataType parent) {
			return new PaymentInstruction18(elementName, parent);
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
	
  	
  
	/** element item for PmtInfId element. 
	 *  @serial
	 */	
	private String m_pmtInfId = null;
	
	/** element item for PmtMtd element. 
	 *  @serial
	 */	
	private String m_pmtMtd = null;
	
	/** element item for BtchBookg element. 
	 *  @serial
	 */	
	private String m_btchBookg = null;
	
	/** element item for NbOfTxs element. 
	 *  @serial
	 */	
	private String m_nbOfTxs = null;
	
	/** element item for CtrlSum element. 
	 *  @serial
	 */	
	private String m_ctrlSum = null;
	
	/** element item for PmtTpInf element. 
	 *  @serial
	 */	
	private PaymentTypeInformation24 m_pmtTpInf = null;
	
	/** element item for ReqdColltnDt element. 
	 *  @serial
	 */	
	private String m_reqdColltnDt = null;
	
	/** element item for Cdtr element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_cdtr = null;
	
	/** element item for CdtrAcct element. 
	 *  @serial
	 */	
	private CashAccount24 m_cdtrAcct = null;
	
	/** element item for CdtrAgt element. 
	 *  @serial
	 */	
	private BranchAndFinancialInstitutionIdentification5 m_cdtrAgt = null;
	
	/** element item for CdtrAgtAcct element. 
	 *  @serial
	 */	
	private CashAccount24 m_cdtrAgtAcct = null;
	
	/** element item for UltmtCdtr element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_ultmtCdtr = null;
	
	/** element item for ChrgBr element. 
	 *  @serial
	 */	
	private String m_chrgBr = null;
	
	/** element item for ChrgsAcct element. 
	 *  @serial
	 */	
	private CashAccount24 m_chrgsAcct = null;
	
	/** element item for ChrgsAcctAgt element. 
	 *  @serial
	 */	
	private BranchAndFinancialInstitutionIdentification5 m_chrgsAcctAgt = null;
	
	/** element item for CdtrSchmeId element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_cdtrSchmeId = null;
	
	/** list of DrctDbtTxInf element. 
	 *  @serial
	 */	
	private List<DirectDebitTransactionInformation19> m_drctDbtTxInfList = new ArrayList<DirectDebitTransactionInformation19>();
	
	/**
	 * Get the embedded PmtInfId element.
	 * @return the item.
	 */
	public String getPmtInfId() {
		return m_pmtInfId;
	}
		
	/**
	 * This method sets (overwrites) the element PmtInfId.
	 * @param data the item that needs to be added.
	 */
	void setPmtInfId(String data) {
		m_pmtInfId = data;
	}
		
	/**
	 * Get the embedded PmtMtd element.
	 * @return the item.
	 */
	public String getPmtMtd() {
		return m_pmtMtd;
	}
		
	/**
	 * This method sets (overwrites) the element PmtMtd.
	 * @param data the item that needs to be added.
	 */
	void setPmtMtd(String data) {
		m_pmtMtd = data;
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
	 * Get the embedded NbOfTxs element.
	 * @return the item.
	 */
	public String getNbOfTxs() {
		return m_nbOfTxs;
	}
		
	/**
	 * This method sets (overwrites) the element NbOfTxs.
	 * @param data the item that needs to be added.
	 */
	void setNbOfTxs(String data) {
		m_nbOfTxs = data;
	}
		
	/**
	 * Get the embedded CtrlSum element.
	 * @return the item.
	 */
	public String getCtrlSum() {
		return m_ctrlSum;
	}
		
	/**
	 * This method sets (overwrites) the element CtrlSum.
	 * @param data the item that needs to be added.
	 */
	void setCtrlSum(String data) {
		m_ctrlSum = data;
	}
		
	/**
	 * Get the embedded PmtTpInf element.
	 * @return the item.
	 */
	public PaymentTypeInformation24 getPmtTpInf() {
		return m_pmtTpInf;
	}
		
	/**
	 * This method sets (overwrites) the element PmtTpInf.
	 * @param data the item that needs to be added.
	 */
	void setPmtTpInf(PaymentTypeInformation24 data) {
		m_pmtTpInf = data;
	}
		
	/**
	 * Get the embedded ReqdColltnDt element.
	 * @return the item.
	 */
	public String getReqdColltnDt() {
		return m_reqdColltnDt;
	}
		
	/**
	 * This method sets (overwrites) the element ReqdColltnDt.
	 * @param data the item that needs to be added.
	 */
	void setReqdColltnDt(String data) {
		m_reqdColltnDt = data;
	}
		
	/**
	 * Get the embedded Cdtr element.
	 * @return the item.
	 */
	public PartyIdentification43 getCdtr() {
		return m_cdtr;
	}
		
	/**
	 * This method sets (overwrites) the element Cdtr.
	 * @param data the item that needs to be added.
	 */
	void setCdtr(PartyIdentification43 data) {
		m_cdtr = data;
	}
		
	/**
	 * Get the embedded CdtrAcct element.
	 * @return the item.
	 */
	public CashAccount24 getCdtrAcct() {
		return m_cdtrAcct;
	}
		
	/**
	 * This method sets (overwrites) the element CdtrAcct.
	 * @param data the item that needs to be added.
	 */
	void setCdtrAcct(CashAccount24 data) {
		m_cdtrAcct = data;
	}
		
	/**
	 * Get the embedded CdtrAgt element.
	 * @return the item.
	 */
	public BranchAndFinancialInstitutionIdentification5 getCdtrAgt() {
		return m_cdtrAgt;
	}
		
	/**
	 * This method sets (overwrites) the element CdtrAgt.
	 * @param data the item that needs to be added.
	 */
	void setCdtrAgt(BranchAndFinancialInstitutionIdentification5 data) {
		m_cdtrAgt = data;
	}
		
	/**
	 * Get the embedded CdtrAgtAcct element.
	 * @return the item.
	 */
	public CashAccount24 getCdtrAgtAcct() {
		return m_cdtrAgtAcct;
	}
		
	/**
	 * This method sets (overwrites) the element CdtrAgtAcct.
	 * @param data the item that needs to be added.
	 */
	void setCdtrAgtAcct(CashAccount24 data) {
		m_cdtrAgtAcct = data;
	}
		
	/**
	 * Get the embedded UltmtCdtr element.
	 * @return the item.
	 */
	public PartyIdentification43 getUltmtCdtr() {
		return m_ultmtCdtr;
	}
		
	/**
	 * This method sets (overwrites) the element UltmtCdtr.
	 * @param data the item that needs to be added.
	 */
	void setUltmtCdtr(PartyIdentification43 data) {
		m_ultmtCdtr = data;
	}
		
	/**
	 * Get the embedded ChrgBr element.
	 * @return the item.
	 */
	public String getChrgBr() {
		return m_chrgBr;
	}
		
	/**
	 * This method sets (overwrites) the element ChrgBr.
	 * @param data the item that needs to be added.
	 */
	void setChrgBr(String data) {
		m_chrgBr = data;
	}
		
	/**
	 * Get the embedded ChrgsAcct element.
	 * @return the item.
	 */
	public CashAccount24 getChrgsAcct() {
		return m_chrgsAcct;
	}
		
	/**
	 * This method sets (overwrites) the element ChrgsAcct.
	 * @param data the item that needs to be added.
	 */
	void setChrgsAcct(CashAccount24 data) {
		m_chrgsAcct = data;
	}
		
	/**
	 * Get the embedded ChrgsAcctAgt element.
	 * @return the item.
	 */
	public BranchAndFinancialInstitutionIdentification5 getChrgsAcctAgt() {
		return m_chrgsAcctAgt;
	}
		
	/**
	 * This method sets (overwrites) the element ChrgsAcctAgt.
	 * @param data the item that needs to be added.
	 */
	void setChrgsAcctAgt(BranchAndFinancialInstitutionIdentification5 data) {
		m_chrgsAcctAgt = data;
	}
		
	/**
	 * Get the embedded CdtrSchmeId element.
	 * @return the item.
	 */
	public PartyIdentification43 getCdtrSchmeId() {
		return m_cdtrSchmeId;
	}
		
	/**
	 * This method sets (overwrites) the element CdtrSchmeId.
	 * @param data the item that needs to be added.
	 */
	void setCdtrSchmeId(PartyIdentification43 data) {
		m_cdtrSchmeId = data;
	}
		
	/**
	 * Get the embedded list of DrctDbtTxInf elements.
	 * @return list of items.
	 */
	public List<DirectDebitTransactionInformation19> getDrctDbtTxInfs() {
		return m_drctDbtTxInfList;
	}
		
	/**
	 * This method adds data to the list of DrctDbtTxInf.
	 * @param data the item that needs to be added.
	 */
	void setDrctDbtTxInf(DirectDebitTransactionInformation19 data) {
		m_drctDbtTxInfList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	PaymentInstruction18 t = (PaymentInstruction18)that;
	 
		if (!Compare.equals(m_pmtInfId, t.m_pmtInfId))
			return false;
		
		if (!Compare.equals(m_pmtMtd, t.m_pmtMtd))
			return false;
		
		if (!Compare.equals(m_btchBookg, t.m_btchBookg))
			return false;
		
		if (!Compare.equals(m_nbOfTxs, t.m_nbOfTxs))
			return false;
		
		if (!Compare.equals(m_ctrlSum, t.m_ctrlSum))
			return false;
		
		if (!Compare.equals(m_pmtTpInf, t.m_pmtTpInf))
			return false;
		
		if (!Compare.equals(m_reqdColltnDt, t.m_reqdColltnDt))
			return false;
		
		if (!Compare.equals(m_cdtr, t.m_cdtr))
			return false;
		
		if (!Compare.equals(m_cdtrAcct, t.m_cdtrAcct))
			return false;
		
		if (!Compare.equals(m_cdtrAgt, t.m_cdtrAgt))
			return false;
		
		if (!Compare.equals(m_cdtrAgtAcct, t.m_cdtrAgtAcct))
			return false;
		
		if (!Compare.equals(m_ultmtCdtr, t.m_ultmtCdtr))
			return false;
		
		if (!Compare.equals(m_chrgBr, t.m_chrgBr))
			return false;
		
		if (!Compare.equals(m_chrgsAcct, t.m_chrgsAcct))
			return false;
		
		if (!Compare.equals(m_chrgsAcctAgt, t.m_chrgsAcctAgt))
			return false;
		
		if (!Compare.equals(m_cdtrSchmeId, t.m_cdtrSchmeId))
			return false;
		
		if (!Compare.equals(m_drctDbtTxInfList, t.m_drctDbtTxInfList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from PaymentInstruction18.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_pmtInfId != null) {
			out.print("\n<PmtInfId>");
			out.print(m_pmtInfId);
			out.print("</PmtInfId>\n");
		}
		
		if (m_pmtMtd != null) {
			out.print("\n<PmtMtd>");
			out.print(m_pmtMtd);
			out.print("</PmtMtd>\n");
		}
		
		if (m_btchBookg != null) {
			out.print("\n<BtchBookg>");
			out.print(m_btchBookg);
			out.print("</BtchBookg>\n");
		}
		
		if (m_nbOfTxs != null) {
			out.print("\n<NbOfTxs>");
			out.print(m_nbOfTxs);
			out.print("</NbOfTxs>\n");
		}
		
		if (m_ctrlSum != null) {
			out.print("\n<CtrlSum>");
			out.print(m_ctrlSum);
			out.print("</CtrlSum>\n");
		}
		
		if (m_pmtTpInf != null) {
			m_pmtTpInf.print(out);
		}	
		
		if (m_reqdColltnDt != null) {
			out.print("\n<ReqdColltnDt>");
			out.print(m_reqdColltnDt);
			out.print("</ReqdColltnDt>\n");
		}
		
		if (m_cdtr != null) {
			m_cdtr.print(out);
		}	
		
		if (m_cdtrAcct != null) {
			m_cdtrAcct.print(out);
		}	
		
		if (m_cdtrAgt != null) {
			m_cdtrAgt.print(out);
		}	
		
		if (m_cdtrAgtAcct != null) {
			m_cdtrAgtAcct.print(out);
		}	
		
		if (m_ultmtCdtr != null) {
			m_ultmtCdtr.print(out);
		}	
		
		if (m_chrgBr != null) {
			out.print("\n<ChrgBr>");
			out.print(m_chrgBr);
			out.print("</ChrgBr>\n");
		}
		
		if (m_chrgsAcct != null) {
			m_chrgsAcct.print(out);
		}	
		
		if (m_chrgsAcctAgt != null) {
			m_chrgsAcctAgt.print(out);
		}	
		
		if (m_cdtrSchmeId != null) {
			m_cdtrSchmeId.print(out);
		}	
		
		if (m_drctDbtTxInfList != null) {
			for(DirectDebitTransactionInformation19 l_DrctDbtTxInf : m_drctDbtTxInfList) {
				l_DrctDbtTxInf.print(out);
			}
		}	
		
	}
}
