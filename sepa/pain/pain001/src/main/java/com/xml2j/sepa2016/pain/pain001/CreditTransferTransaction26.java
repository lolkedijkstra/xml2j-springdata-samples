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
 * CreditTransferTransaction26 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class CreditTransferTransaction26 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for CreditTransferTransaction26.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public CreditTransferTransaction26(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type CreditTransferTransaction26.
	 */
	static class Allocator implements TypeAllocator<CreditTransferTransaction26> {
		/**
		 * method for getting a new instance of type CreditTransferTransaction26.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public CreditTransferTransaction26 newInstance(String elementName, ComplexDataType parent) {
			return new CreditTransferTransaction26(elementName, parent);
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
	
  	
  
	/** element item for PmtId element. 
	 *  @serial
	 */	
	private PaymentIdentification1 m_pmtId = null;
	
	/** element item for PmtTpInf element. 
	 *  @serial
	 */	
	private PaymentTypeInformation19 m_pmtTpInf = null;
	
	/** element item for Amt element. 
	 *  @serial
	 */	
	private AmountType4Choice m_amt = null;
	
	/** element item for XchgRateInf element. 
	 *  @serial
	 */	
	private ExchangeRate1 m_xchgRateInf = null;
	
	/** element item for ChrgBr element. 
	 *  @serial
	 */	
	private String m_chrgBr = null;
	
	/** element item for ChqInstr element. 
	 *  @serial
	 */	
	private Cheque7 m_chqInstr = null;
	
	/** element item for UltmtDbtr element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_ultmtDbtr = null;
	
	/** element item for IntrmyAgt1 element. 
	 *  @serial
	 */	
	private BranchAndFinancialInstitutionIdentification5 m_intrmyAgt1 = null;
	
	/** element item for IntrmyAgt1Acct element. 
	 *  @serial
	 */	
	private CashAccount24 m_intrmyAgt1Acct = null;
	
	/** element item for IntrmyAgt2 element. 
	 *  @serial
	 */	
	private BranchAndFinancialInstitutionIdentification5 m_intrmyAgt2 = null;
	
	/** element item for IntrmyAgt2Acct element. 
	 *  @serial
	 */	
	private CashAccount24 m_intrmyAgt2Acct = null;
	
	/** element item for IntrmyAgt3 element. 
	 *  @serial
	 */	
	private BranchAndFinancialInstitutionIdentification5 m_intrmyAgt3 = null;
	
	/** element item for IntrmyAgt3Acct element. 
	 *  @serial
	 */	
	private CashAccount24 m_intrmyAgt3Acct = null;
	
	/** element item for CdtrAgt element. 
	 *  @serial
	 */	
	private BranchAndFinancialInstitutionIdentification5 m_cdtrAgt = null;
	
	/** element item for CdtrAgtAcct element. 
	 *  @serial
	 */	
	private CashAccount24 m_cdtrAgtAcct = null;
	
	/** element item for Cdtr element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_cdtr = null;
	
	/** element item for CdtrAcct element. 
	 *  @serial
	 */	
	private CashAccount24 m_cdtrAcct = null;
	
	/** element item for UltmtCdtr element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_ultmtCdtr = null;
	
	/** list of InstrForCdtrAgt element. 
	 *  @serial
	 */	
	private List<InstructionForCreditorAgent1> m_instrForCdtrAgtList = new ArrayList<InstructionForCreditorAgent1>();
	
	/** element item for InstrForDbtrAgt element. 
	 *  @serial
	 */	
	private String m_instrForDbtrAgt = null;
	
	/** element item for Purp element. 
	 *  @serial
	 */	
	private Purpose2Choice m_purp = null;
	
	/** list of RgltryRptg element. 
	 *  @serial
	 */	
	private List<RegulatoryReporting3> m_rgltryRptgList = new ArrayList<RegulatoryReporting3>();
	
	/** element item for Tax element. 
	 *  @serial
	 */	
	private TaxInformation3 m_tax = null;
	
	/** list of RltdRmtInf element. 
	 *  @serial
	 */	
	private List<RemittanceLocation4> m_rltdRmtInfList = new ArrayList<RemittanceLocation4>();
	
	/** element item for RmtInf element. 
	 *  @serial
	 */	
	private RemittanceInformation11 m_rmtInf = null;
	
	/** list of SplmtryData element. 
	 *  @serial
	 */	
	private List<SupplementaryData1> m_splmtryDataList = new ArrayList<SupplementaryData1>();
	
	/**
	 * Get the embedded PmtId element.
	 * @return the item.
	 */
	public PaymentIdentification1 getPmtId() {
		return m_pmtId;
	}
		
	/**
	 * This method sets (overwrites) the element PmtId.
	 * @param data the item that needs to be added.
	 */
	void setPmtId(PaymentIdentification1 data) {
		m_pmtId = data;
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
	 * Get the embedded Amt element.
	 * @return the item.
	 */
	public AmountType4Choice getAmt() {
		return m_amt;
	}
		
	/**
	 * This method sets (overwrites) the element Amt.
	 * @param data the item that needs to be added.
	 */
	void setAmt(AmountType4Choice data) {
		m_amt = data;
	}
		
	/**
	 * Get the embedded XchgRateInf element.
	 * @return the item.
	 */
	public ExchangeRate1 getXchgRateInf() {
		return m_xchgRateInf;
	}
		
	/**
	 * This method sets (overwrites) the element XchgRateInf.
	 * @param data the item that needs to be added.
	 */
	void setXchgRateInf(ExchangeRate1 data) {
		m_xchgRateInf = data;
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
	 * Get the embedded ChqInstr element.
	 * @return the item.
	 */
	public Cheque7 getChqInstr() {
		return m_chqInstr;
	}
		
	/**
	 * This method sets (overwrites) the element ChqInstr.
	 * @param data the item that needs to be added.
	 */
	void setChqInstr(Cheque7 data) {
		m_chqInstr = data;
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
	 * Get the embedded IntrmyAgt1 element.
	 * @return the item.
	 */
	public BranchAndFinancialInstitutionIdentification5 getIntrmyAgt1() {
		return m_intrmyAgt1;
	}
		
	/**
	 * This method sets (overwrites) the element IntrmyAgt1.
	 * @param data the item that needs to be added.
	 */
	void setIntrmyAgt1(BranchAndFinancialInstitutionIdentification5 data) {
		m_intrmyAgt1 = data;
	}
		
	/**
	 * Get the embedded IntrmyAgt1Acct element.
	 * @return the item.
	 */
	public CashAccount24 getIntrmyAgt1Acct() {
		return m_intrmyAgt1Acct;
	}
		
	/**
	 * This method sets (overwrites) the element IntrmyAgt1Acct.
	 * @param data the item that needs to be added.
	 */
	void setIntrmyAgt1Acct(CashAccount24 data) {
		m_intrmyAgt1Acct = data;
	}
		
	/**
	 * Get the embedded IntrmyAgt2 element.
	 * @return the item.
	 */
	public BranchAndFinancialInstitutionIdentification5 getIntrmyAgt2() {
		return m_intrmyAgt2;
	}
		
	/**
	 * This method sets (overwrites) the element IntrmyAgt2.
	 * @param data the item that needs to be added.
	 */
	void setIntrmyAgt2(BranchAndFinancialInstitutionIdentification5 data) {
		m_intrmyAgt2 = data;
	}
		
	/**
	 * Get the embedded IntrmyAgt2Acct element.
	 * @return the item.
	 */
	public CashAccount24 getIntrmyAgt2Acct() {
		return m_intrmyAgt2Acct;
	}
		
	/**
	 * This method sets (overwrites) the element IntrmyAgt2Acct.
	 * @param data the item that needs to be added.
	 */
	void setIntrmyAgt2Acct(CashAccount24 data) {
		m_intrmyAgt2Acct = data;
	}
		
	/**
	 * Get the embedded IntrmyAgt3 element.
	 * @return the item.
	 */
	public BranchAndFinancialInstitutionIdentification5 getIntrmyAgt3() {
		return m_intrmyAgt3;
	}
		
	/**
	 * This method sets (overwrites) the element IntrmyAgt3.
	 * @param data the item that needs to be added.
	 */
	void setIntrmyAgt3(BranchAndFinancialInstitutionIdentification5 data) {
		m_intrmyAgt3 = data;
	}
		
	/**
	 * Get the embedded IntrmyAgt3Acct element.
	 * @return the item.
	 */
	public CashAccount24 getIntrmyAgt3Acct() {
		return m_intrmyAgt3Acct;
	}
		
	/**
	 * This method sets (overwrites) the element IntrmyAgt3Acct.
	 * @param data the item that needs to be added.
	 */
	void setIntrmyAgt3Acct(CashAccount24 data) {
		m_intrmyAgt3Acct = data;
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
	 * Get the embedded list of InstrForCdtrAgt elements.
	 * @return list of items.
	 */
	public List<InstructionForCreditorAgent1> getInstrForCdtrAgts() {
		return m_instrForCdtrAgtList;
	}
		
	/**
	 * This method adds data to the list of InstrForCdtrAgt.
	 * @param data the item that needs to be added.
	 */
	void setInstrForCdtrAgt(InstructionForCreditorAgent1 data) {
		m_instrForCdtrAgtList.add(data);
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
	 * Get the embedded Purp element.
	 * @return the item.
	 */
	public Purpose2Choice getPurp() {
		return m_purp;
	}
		
	/**
	 * This method sets (overwrites) the element Purp.
	 * @param data the item that needs to be added.
	 */
	void setPurp(Purpose2Choice data) {
		m_purp = data;
	}
		
	/**
	 * Get the embedded list of RgltryRptg elements.
	 * @return list of items.
	 */
	public List<RegulatoryReporting3> getRgltryRptgs() {
		return m_rgltryRptgList;
	}
		
	/**
	 * This method adds data to the list of RgltryRptg.
	 * @param data the item that needs to be added.
	 */
	void setRgltryRptg(RegulatoryReporting3 data) {
		m_rgltryRptgList.add(data);
	}
		
	/**
	 * Get the embedded Tax element.
	 * @return the item.
	 */
	public TaxInformation3 getTax() {
		return m_tax;
	}
		
	/**
	 * This method sets (overwrites) the element Tax.
	 * @param data the item that needs to be added.
	 */
	void setTax(TaxInformation3 data) {
		m_tax = data;
	}
		
	/**
	 * Get the embedded list of RltdRmtInf elements.
	 * @return list of items.
	 */
	public List<RemittanceLocation4> getRltdRmtInfs() {
		return m_rltdRmtInfList;
	}
		
	/**
	 * This method adds data to the list of RltdRmtInf.
	 * @param data the item that needs to be added.
	 */
	void setRltdRmtInf(RemittanceLocation4 data) {
		m_rltdRmtInfList.add(data);
	}
		
	/**
	 * Get the embedded RmtInf element.
	 * @return the item.
	 */
	public RemittanceInformation11 getRmtInf() {
		return m_rmtInf;
	}
		
	/**
	 * This method sets (overwrites) the element RmtInf.
	 * @param data the item that needs to be added.
	 */
	void setRmtInf(RemittanceInformation11 data) {
		m_rmtInf = data;
	}
		
	/**
	 * Get the embedded list of SplmtryData elements.
	 * @return list of items.
	 */
	public List<SupplementaryData1> getSplmtryDatas() {
		return m_splmtryDataList;
	}
		
	/**
	 * This method adds data to the list of SplmtryData.
	 * @param data the item that needs to be added.
	 */
	void setSplmtryData(SupplementaryData1 data) {
		m_splmtryDataList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	CreditTransferTransaction26 t = (CreditTransferTransaction26)that;
	 
		if (!Compare.equals(m_pmtId, t.m_pmtId))
			return false;
		
		if (!Compare.equals(m_pmtTpInf, t.m_pmtTpInf))
			return false;
		
		if (!Compare.equals(m_amt, t.m_amt))
			return false;
		
		if (!Compare.equals(m_xchgRateInf, t.m_xchgRateInf))
			return false;
		
		if (!Compare.equals(m_chrgBr, t.m_chrgBr))
			return false;
		
		if (!Compare.equals(m_chqInstr, t.m_chqInstr))
			return false;
		
		if (!Compare.equals(m_ultmtDbtr, t.m_ultmtDbtr))
			return false;
		
		if (!Compare.equals(m_intrmyAgt1, t.m_intrmyAgt1))
			return false;
		
		if (!Compare.equals(m_intrmyAgt1Acct, t.m_intrmyAgt1Acct))
			return false;
		
		if (!Compare.equals(m_intrmyAgt2, t.m_intrmyAgt2))
			return false;
		
		if (!Compare.equals(m_intrmyAgt2Acct, t.m_intrmyAgt2Acct))
			return false;
		
		if (!Compare.equals(m_intrmyAgt3, t.m_intrmyAgt3))
			return false;
		
		if (!Compare.equals(m_intrmyAgt3Acct, t.m_intrmyAgt3Acct))
			return false;
		
		if (!Compare.equals(m_cdtrAgt, t.m_cdtrAgt))
			return false;
		
		if (!Compare.equals(m_cdtrAgtAcct, t.m_cdtrAgtAcct))
			return false;
		
		if (!Compare.equals(m_cdtr, t.m_cdtr))
			return false;
		
		if (!Compare.equals(m_cdtrAcct, t.m_cdtrAcct))
			return false;
		
		if (!Compare.equals(m_ultmtCdtr, t.m_ultmtCdtr))
			return false;
		
		if (!Compare.equals(m_instrForCdtrAgtList, t.m_instrForCdtrAgtList))
			return false;
		
		if (!Compare.equals(m_instrForDbtrAgt, t.m_instrForDbtrAgt))
			return false;
		
		if (!Compare.equals(m_purp, t.m_purp))
			return false;
		
		if (!Compare.equals(m_rgltryRptgList, t.m_rgltryRptgList))
			return false;
		
		if (!Compare.equals(m_tax, t.m_tax))
			return false;
		
		if (!Compare.equals(m_rltdRmtInfList, t.m_rltdRmtInfList))
			return false;
		
		if (!Compare.equals(m_rmtInf, t.m_rmtInf))
			return false;
		
		if (!Compare.equals(m_splmtryDataList, t.m_splmtryDataList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from CreditTransferTransaction26.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_pmtId != null) {
			m_pmtId.print(out);
		}	
		
		if (m_pmtTpInf != null) {
			m_pmtTpInf.print(out);
		}	
		
		if (m_amt != null) {
			m_amt.print(out);
		}	
		
		if (m_xchgRateInf != null) {
			m_xchgRateInf.print(out);
		}	
		
		if (m_chrgBr != null) {
			out.print("\n<ChrgBr>");
			out.print(m_chrgBr);
			out.print("</ChrgBr>\n");
		}
		
		if (m_chqInstr != null) {
			m_chqInstr.print(out);
		}	
		
		if (m_ultmtDbtr != null) {
			m_ultmtDbtr.print(out);
		}	
		
		if (m_intrmyAgt1 != null) {
			m_intrmyAgt1.print(out);
		}	
		
		if (m_intrmyAgt1Acct != null) {
			m_intrmyAgt1Acct.print(out);
		}	
		
		if (m_intrmyAgt2 != null) {
			m_intrmyAgt2.print(out);
		}	
		
		if (m_intrmyAgt2Acct != null) {
			m_intrmyAgt2Acct.print(out);
		}	
		
		if (m_intrmyAgt3 != null) {
			m_intrmyAgt3.print(out);
		}	
		
		if (m_intrmyAgt3Acct != null) {
			m_intrmyAgt3Acct.print(out);
		}	
		
		if (m_cdtrAgt != null) {
			m_cdtrAgt.print(out);
		}	
		
		if (m_cdtrAgtAcct != null) {
			m_cdtrAgtAcct.print(out);
		}	
		
		if (m_cdtr != null) {
			m_cdtr.print(out);
		}	
		
		if (m_cdtrAcct != null) {
			m_cdtrAcct.print(out);
		}	
		
		if (m_ultmtCdtr != null) {
			m_ultmtCdtr.print(out);
		}	
		
		if (m_instrForCdtrAgtList != null) {
			for(InstructionForCreditorAgent1 l_InstrForCdtrAgt : m_instrForCdtrAgtList) {
				l_InstrForCdtrAgt.print(out);
			}
		}	
		
		if (m_instrForDbtrAgt != null) {
			out.print("\n<InstrForDbtrAgt>");
			out.print(m_instrForDbtrAgt);
			out.print("</InstrForDbtrAgt>\n");
		}
		
		if (m_purp != null) {
			m_purp.print(out);
		}	
		
		if (m_rgltryRptgList != null) {
			for(RegulatoryReporting3 l_RgltryRptg : m_rgltryRptgList) {
				l_RgltryRptg.print(out);
			}
		}	
		
		if (m_tax != null) {
			m_tax.print(out);
		}	
		
		if (m_rltdRmtInfList != null) {
			for(RemittanceLocation4 l_RltdRmtInf : m_rltdRmtInfList) {
				l_RltdRmtInf.print(out);
			}
		}	
		
		if (m_rmtInf != null) {
			m_rmtInf.print(out);
		}	
		
		if (m_splmtryDataList != null) {
			for(SupplementaryData1 l_SplmtryData : m_splmtryDataList) {
				l_SplmtryData.print(out);
			}
		}	
		
	}
}
