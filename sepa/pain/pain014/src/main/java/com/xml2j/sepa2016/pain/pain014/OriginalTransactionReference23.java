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
 * OriginalTransactionReference23 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class OriginalTransactionReference23 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for OriginalTransactionReference23.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public OriginalTransactionReference23(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type OriginalTransactionReference23.
	 */
	static class Allocator implements TypeAllocator<OriginalTransactionReference23> {
		/**
		 * method for getting a new instance of type OriginalTransactionReference23.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public OriginalTransactionReference23 newInstance(String elementName, ComplexDataType parent) {
			return new OriginalTransactionReference23(elementName, parent);
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
	private AmountType4Choice m_amt = null;
	
	/** element item for ReqdExctnDt element. 
	 *  @serial
	 */	
	private String m_reqdExctnDt = null;
	
	/** element item for PmtTpInf element. 
	 *  @serial
	 */	
	private PaymentTypeInformation19 m_pmtTpInf = null;
	
	/** element item for PmtMtd element. 
	 *  @serial
	 */	
	private String m_pmtMtd = null;
	
	/** element item for RmtInf element. 
	 *  @serial
	 */	
	private RemittanceInformation11 m_rmtInf = null;
	
	/** element item for UltmtDbtr element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_ultmtDbtr = null;
	
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
	
	/** element item for CdtrAgt element. 
	 *  @serial
	 */	
	private BranchAndFinancialInstitutionIdentification5 m_cdtrAgt = null;
	
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
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	OriginalTransactionReference23 t = (OriginalTransactionReference23)that;
	 
		if (!Compare.equals(m_amt, t.m_amt))
			return false;
		
		if (!Compare.equals(m_reqdExctnDt, t.m_reqdExctnDt))
			return false;
		
		if (!Compare.equals(m_pmtTpInf, t.m_pmtTpInf))
			return false;
		
		if (!Compare.equals(m_pmtMtd, t.m_pmtMtd))
			return false;
		
		if (!Compare.equals(m_rmtInf, t.m_rmtInf))
			return false;
		
		if (!Compare.equals(m_ultmtDbtr, t.m_ultmtDbtr))
			return false;
		
		if (!Compare.equals(m_dbtr, t.m_dbtr))
			return false;
		
		if (!Compare.equals(m_dbtrAcct, t.m_dbtrAcct))
			return false;
		
		if (!Compare.equals(m_dbtrAgt, t.m_dbtrAgt))
			return false;
		
		if (!Compare.equals(m_cdtrAgt, t.m_cdtrAgt))
			return false;
		
		if (!Compare.equals(m_cdtr, t.m_cdtr))
			return false;
		
		if (!Compare.equals(m_cdtrAcct, t.m_cdtrAcct))
			return false;
		
		if (!Compare.equals(m_ultmtCdtr, t.m_ultmtCdtr))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from OriginalTransactionReference23.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_amt != null) {
			m_amt.print(out);
		}	
		
		if (m_reqdExctnDt != null) {
			out.print("\n<ReqdExctnDt>");
			out.print(m_reqdExctnDt);
			out.print("</ReqdExctnDt>\n");
		}
		
		if (m_pmtTpInf != null) {
			m_pmtTpInf.print(out);
		}	
		
		if (m_pmtMtd != null) {
			out.print("\n<PmtMtd>");
			out.print(m_pmtMtd);
			out.print("</PmtMtd>\n");
		}
		
		if (m_rmtInf != null) {
			m_rmtInf.print(out);
		}	
		
		if (m_ultmtDbtr != null) {
			m_ultmtDbtr.print(out);
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
		
		if (m_cdtrAgt != null) {
			m_cdtrAgt.print(out);
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
		
	}
}
