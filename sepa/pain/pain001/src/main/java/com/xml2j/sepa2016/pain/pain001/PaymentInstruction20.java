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

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * PaymentInstruction20 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class PaymentInstruction20 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for PaymentInstruction20.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public PaymentInstruction20(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type PaymentInstruction20.
	 */
	static class Allocator implements TypeAllocator<PaymentInstruction20> {
		/**
		 * method for getting a new instance of type PaymentInstruction20.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public PaymentInstruction20 newInstance(String elementName, ComplexDataType parent) {
			return new PaymentInstruction20(elementName, parent);
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
	private PaymentTypeInformation19 m_pmtTpInf = null;
	
	/** element item for ReqdExctnDt element. 
	 *  @serial
	 */	
	private String m_reqdExctnDt = null;
	
	/** element item for PoolgAdjstmntDt element. 
	 *  @serial
	 */	
	private String m_poolgAdjstmntDt = null;
	
	/** element item for Dbtr element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_dbtr = null;
	
	/** element item for DbtrAcct element. 
	 *  @serial
	 */	
	private CashAccount24 m_dbtrAcct = null;
	
	/** element item for DbtrAgt element. 
	 *  @serial
	 */	
	private BranchAndFinancialInstitutionIdentification5 m_dbtrAgt = null;
	
	/** element item for DbtrAgtAcct element. 
	 *  @serial
	 */	
	private CashAccount24 m_dbtrAgtAcct = null;
	
	/** element item for InstrForDbtrAgt element. 
	 *  @serial
	 */	
	private String m_instrForDbtrAgt = null;
	
	/** element item for UltmtDbtr element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_ultmtDbtr = null;
	
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
	
	/** list of CdtTrfTxInf element. 
	 *  @serial
	 */	
	private List<CreditTransferTransaction26> m_cdtTrfTxInfList = new ArrayList<CreditTransferTransaction26>();
	
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
	public PaymentTypeInformation19 getPmtTpInf() {
		return m_pmtTpInf;
	}
		
	/**
	 * This method sets (overwrites) the element PmtTpInf.
	 * @param data the item that needs to be added.
	 */
	void setPmtTpInf(PaymentTypeInformation19 data) {
		m_pmtTpInf = data;
	}
		
	/**
	 * Get the embedded ReqdExctnDt element.
	 * @return the item.
	 */
	public String getReqdExctnDt() {
		return m_reqdExctnDt;
	}
		
	/**
	 * This method sets (overwrites) the element ReqdExctnDt.
	 * @param data the item that needs to be added.
	 */
	void setReqdExctnDt(String data) {
		m_reqdExctnDt = data;
	}
		
	/**
	 * Get the embedded PoolgAdjstmntDt element.
	 * @return the item.
	 */
	public String getPoolgAdjstmntDt() {
		return m_poolgAdjstmntDt;
	}
		
	/**
	 * This method sets (overwrites) the element PoolgAdjstmntDt.
	 * @param data the item that needs to be added.
	 */
	void setPoolgAdjstmntDt(String data) {
		m_poolgAdjstmntDt = data;
	}
		
	/**
	 * Get the embedded Dbtr element.
	 * @return the item.
	 */
	public PartyIdentification43 getDbtr() {
		return m_dbtr;
	}
		
	/**
	 * This method sets (overwrites) the element Dbtr.
	 * @param data the item that needs to be added.
	 */
	void setDbtr(PartyIdentification43 data) {
		m_dbtr = data;
	}
		
	/**
	 * Get the embedded DbtrAcct element.
	 * @return the item.
	 */
	public CashAccount24 getDbtrAcct() {
		return m_dbtrAcct;
	}
		
	/**
	 * This method sets (overwrites) the element DbtrAcct.
	 * @param data the item that needs to be added.
	 */
	void setDbtrAcct(CashAccount24 data) {
		m_dbtrAcct = data;
	}
		
	/**
	 * Get the embedded DbtrAgt element.
	 * @return the item.
	 */
	public BranchAndFinancialInstitutionIdentification5 getDbtrAgt() {
		return m_dbtrAgt;
	}
		
	/**
	 * This method sets (overwrites) the element DbtrAgt.
	 * @param data the item that needs to be added.
	 */
	void setDbtrAgt(BranchAndFinancialInstitutionIdentification5 data) {
		m_dbtrAgt = data;
	}
		
	/**
	 * Get the embedded DbtrAgtAcct element.
	 * @return the item.
	 */
	public CashAccount24 getDbtrAgtAcct() {
		return m_dbtrAgtAcct;
	}
		
	/**
	 * This method sets (overwrites) the element DbtrAgtAcct.
	 * @param data the item that needs to be added.
	 */
	void setDbtrAgtAcct(CashAccount24 data) {
		m_dbtrAgtAcct = data;
	}
		
	/**
	 * Get the embedded InstrForDbtrAgt element.
	 * @return the item.
	 */
	public String getInstrForDbtrAgt() {
		return m_instrForDbtrAgt;
	}
		
	/**
	 * This method sets (overwrites) the element InstrForDbtrAgt.
	 * @param data the item that needs to be added.
	 */
	void setInstrForDbtrAgt(String data) {
		m_instrForDbtrAgt = data;
	}
		
	/**
	 * Get the embedded UltmtDbtr element.
	 * @return the item.
	 */
	public PartyIdentification43 getUltmtDbtr() {
		return m_ultmtDbtr;
	}
		
	/**
	 * This method sets (overwrites) the element UltmtDbtr.
	 * @param data the item that needs to be added.
	 */
	void setUltmtDbtr(PartyIdentification43 data) {
		m_ultmtDbtr = data;
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
	 * Get the embedded list of CdtTrfTxInf elements.
	 * @return list of items.
	 */
	public List<CreditTransferTransaction26> getCdtTrfTxInfs() {
		return m_cdtTrfTxInfList;
	}
		
	/**
	 * This method adds data to the list of CdtTrfTxInf.
	 * @param data the item that needs to be added.
	 */
	void setCdtTrfTxInf(CreditTransferTransaction26 data) {
		m_cdtTrfTxInfList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	PaymentInstruction20 t = (PaymentInstruction20)that;
	 
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
		
		if (!Compare.equals(m_reqdExctnDt, t.m_reqdExctnDt))
			return false;
		
		if (!Compare.equals(m_poolgAdjstmntDt, t.m_poolgAdjstmntDt))
			return false;
		
		if (!Compare.equals(m_dbtr, t.m_dbtr))
			return false;
		
		if (!Compare.equals(m_dbtrAcct, t.m_dbtrAcct))
			return false;
		
		if (!Compare.equals(m_dbtrAgt, t.m_dbtrAgt))
			return false;
		
		if (!Compare.equals(m_dbtrAgtAcct, t.m_dbtrAgtAcct))
			return false;
		
		if (!Compare.equals(m_instrForDbtrAgt, t.m_instrForDbtrAgt))
			return false;
		
		if (!Compare.equals(m_ultmtDbtr, t.m_ultmtDbtr))
			return false;
		
		if (!Compare.equals(m_chrgBr, t.m_chrgBr))
			return false;
		
		if (!Compare.equals(m_chrgsAcct, t.m_chrgsAcct))
			return false;
		
		if (!Compare.equals(m_chrgsAcctAgt, t.m_chrgsAcctAgt))
			return false;
		
		if (!Compare.equals(m_cdtTrfTxInfList, t.m_cdtTrfTxInfList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from PaymentInstruction20.
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
		
		if (m_reqdExctnDt != null) {
			out.print("\n<ReqdExctnDt>");
			out.print(m_reqdExctnDt);
			out.print("</ReqdExctnDt>\n");
		}
		
		if (m_poolgAdjstmntDt != null) {
			out.print("\n<PoolgAdjstmntDt>");
			out.print(m_poolgAdjstmntDt);
			out.print("</PoolgAdjstmntDt>\n");
		}
		
		if (m_dbtr != null) {
			m_dbtr.print(out);
		}	
		
		if (m_dbtrAcct != null) {
			m_dbtrAcct.print(out);
		}	
		
		if (m_dbtrAgt != null) {
			m_dbtrAgt.print(out);
		}	
		
		if (m_dbtrAgtAcct != null) {
			m_dbtrAgtAcct.print(out);
		}	
		
		if (m_instrForDbtrAgt != null) {
			out.print("\n<InstrForDbtrAgt>");
			out.print(m_instrForDbtrAgt);
			out.print("</InstrForDbtrAgt>\n");
		}
		
		if (m_ultmtDbtr != null) {
			m_ultmtDbtr.print(out);
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
		
		if (m_cdtTrfTxInfList != null) {
			for(CreditTransferTransaction26 l_CdtTrfTxInf : m_cdtTrfTxInfList) {
				l_CdtTrfTxInf.print(out);
			}
		}	
		
	}
}
