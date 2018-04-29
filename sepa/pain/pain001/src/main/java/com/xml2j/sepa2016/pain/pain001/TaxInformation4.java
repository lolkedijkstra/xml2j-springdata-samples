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
 * TaxInformation4 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class TaxInformation4 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for TaxInformation4.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public TaxInformation4(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type TaxInformation4.
	 */
	static class Allocator implements TypeAllocator<TaxInformation4> {
		/**
		 * method for getting a new instance of type TaxInformation4.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public TaxInformation4 newInstance(String elementName, ComplexDataType parent) {
			return new TaxInformation4(elementName, parent);
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
	
  	
  
	/** element item for Cdtr element. 
	 *  @serial
	 */	
	private TaxParty1 m_cdtr = null;
	
	/** element item for Dbtr element. 
	 *  @serial
	 */	
	private TaxParty2 m_dbtr = null;
	
	/** element item for UltmtDbtr element. 
	 *  @serial
	 */	
	private TaxParty2 m_ultmtDbtr = null;
	
	/** element item for AdmstnZone element. 
	 *  @serial
	 */	
	private String m_admstnZone = null;
	
	/** element item for RefNb element. 
	 *  @serial
	 */	
	private String m_refNb = null;
	
	/** element item for Mtd element. 
	 *  @serial
	 */	
	private String m_mtd = null;
	
	/** element item for TtlTaxblBaseAmt element. 
	 *  @serial
	 */	
	private ActiveOrHistoricCurrencyAndAmount m_ttlTaxblBaseAmt = null;
	
	/** element item for TtlTaxAmt element. 
	 *  @serial
	 */	
	private ActiveOrHistoricCurrencyAndAmount m_ttlTaxAmt = null;
	
	/** element item for Dt element. 
	 *  @serial
	 */	
	private String m_dt = null;
	
	/** element item for SeqNb element. 
	 *  @serial
	 */	
	private String m_seqNb = null;
	
	/** list of Rcrd element. 
	 *  @serial
	 */	
	private List<TaxRecord1> m_rcrdList = new ArrayList<TaxRecord1>();
	
	/**
	 * Get the embedded Cdtr element.
	 * @return the item.
	 */
	public TaxParty1 getCdtr() {
		return m_cdtr;
	}
		
	/**
	 * This method sets (overwrites) the element Cdtr.
	 * @param data the item that needs to be added.
	 */
	void setCdtr(TaxParty1 data) {
		m_cdtr = data;
	}
		
	/**
	 * Get the embedded Dbtr element.
	 * @return the item.
	 */
	public TaxParty2 getDbtr() {
		return m_dbtr;
	}
		
	/**
	 * This method sets (overwrites) the element Dbtr.
	 * @param data the item that needs to be added.
	 */
	void setDbtr(TaxParty2 data) {
		m_dbtr = data;
	}
		
	/**
	 * Get the embedded UltmtDbtr element.
	 * @return the item.
	 */
	public TaxParty2 getUltmtDbtr() {
		return m_ultmtDbtr;
	}
		
	/**
	 * This method sets (overwrites) the element UltmtDbtr.
	 * @param data the item that needs to be added.
	 */
	void setUltmtDbtr(TaxParty2 data) {
		m_ultmtDbtr = data;
	}
		
	/**
	 * Get the embedded AdmstnZone element.
	 * @return the item.
	 */
	public String getAdmstnZone() {
		return m_admstnZone;
	}
		
	/**
	 * This method sets (overwrites) the element AdmstnZone.
	 * @param data the item that needs to be added.
	 */
	void setAdmstnZone(String data) {
		m_admstnZone = data;
	}
		
	/**
	 * Get the embedded RefNb element.
	 * @return the item.
	 */
	public String getRefNb() {
		return m_refNb;
	}
		
	/**
	 * This method sets (overwrites) the element RefNb.
	 * @param data the item that needs to be added.
	 */
	void setRefNb(String data) {
		m_refNb = data;
	}
		
	/**
	 * Get the embedded Mtd element.
	 * @return the item.
	 */
	public String getMtd() {
		return m_mtd;
	}
		
	/**
	 * This method sets (overwrites) the element Mtd.
	 * @param data the item that needs to be added.
	 */
	void setMtd(String data) {
		m_mtd = data;
	}
		
	/**
	 * Get the embedded TtlTaxblBaseAmt element.
	 * @return the item.
	 */
	public ActiveOrHistoricCurrencyAndAmount getTtlTaxblBaseAmt() {
		return m_ttlTaxblBaseAmt;
	}
		
	/**
	 * This method sets (overwrites) the element TtlTaxblBaseAmt.
	 * @param data the item that needs to be added.
	 */
	void setTtlTaxblBaseAmt(ActiveOrHistoricCurrencyAndAmount data) {
		m_ttlTaxblBaseAmt = data;
	}
		
	/**
	 * Get the embedded TtlTaxAmt element.
	 * @return the item.
	 */
	public ActiveOrHistoricCurrencyAndAmount getTtlTaxAmt() {
		return m_ttlTaxAmt;
	}
		
	/**
	 * This method sets (overwrites) the element TtlTaxAmt.
	 * @param data the item that needs to be added.
	 */
	void setTtlTaxAmt(ActiveOrHistoricCurrencyAndAmount data) {
		m_ttlTaxAmt = data;
	}
		
	/**
	 * Get the embedded Dt element.
	 * @return the item.
	 */
	public String getDt() {
		return m_dt;
	}
		
	/**
	 * This method sets (overwrites) the element Dt.
	 * @param data the item that needs to be added.
	 */
	void setDt(String data) {
		m_dt = data;
	}
		
	/**
	 * Get the embedded SeqNb element.
	 * @return the item.
	 */
	public String getSeqNb() {
		return m_seqNb;
	}
		
	/**
	 * This method sets (overwrites) the element SeqNb.
	 * @param data the item that needs to be added.
	 */
	void setSeqNb(String data) {
		m_seqNb = data;
	}
		
	/**
	 * Get the embedded list of Rcrd elements.
	 * @return list of items.
	 */
	public List<TaxRecord1> getRcrds() {
		return m_rcrdList;
	}
		
	/**
	 * This method adds data to the list of Rcrd.
	 * @param data the item that needs to be added.
	 */
	void setRcrd(TaxRecord1 data) {
		m_rcrdList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	TaxInformation4 t = (TaxInformation4)that;
	 
		if (!Compare.equals(m_cdtr, t.m_cdtr))
			return false;
		
		if (!Compare.equals(m_dbtr, t.m_dbtr))
			return false;
		
		if (!Compare.equals(m_ultmtDbtr, t.m_ultmtDbtr))
			return false;
		
		if (!Compare.equals(m_admstnZone, t.m_admstnZone))
			return false;
		
		if (!Compare.equals(m_refNb, t.m_refNb))
			return false;
		
		if (!Compare.equals(m_mtd, t.m_mtd))
			return false;
		
		if (!Compare.equals(m_ttlTaxblBaseAmt, t.m_ttlTaxblBaseAmt))
			return false;
		
		if (!Compare.equals(m_ttlTaxAmt, t.m_ttlTaxAmt))
			return false;
		
		if (!Compare.equals(m_dt, t.m_dt))
			return false;
		
		if (!Compare.equals(m_seqNb, t.m_seqNb))
			return false;
		
		if (!Compare.equals(m_rcrdList, t.m_rcrdList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from TaxInformation4.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_cdtr != null) {
			m_cdtr.print(out);
		}	
		
		if (m_dbtr != null) {
			m_dbtr.print(out);
		}	
		
		if (m_ultmtDbtr != null) {
			m_ultmtDbtr.print(out);
		}	
		
		if (m_admstnZone != null) {
			out.print("\n<AdmstnZone>");
			out.print(m_admstnZone);
			out.print("</AdmstnZone>\n");
		}
		
		if (m_refNb != null) {
			out.print("\n<RefNb>");
			out.print(m_refNb);
			out.print("</RefNb>\n");
		}
		
		if (m_mtd != null) {
			out.print("\n<Mtd>");
			out.print(m_mtd);
			out.print("</Mtd>\n");
		}
		
		if (m_ttlTaxblBaseAmt != null) {
			m_ttlTaxblBaseAmt.print(out);
		}	
		
		if (m_ttlTaxAmt != null) {
			m_ttlTaxAmt.print(out);
		}	
		
		if (m_dt != null) {
			out.print("\n<Dt>");
			out.print(m_dt);
			out.print("</Dt>\n");
		}
		
		if (m_seqNb != null) {
			out.print("\n<SeqNb>");
			out.print(m_seqNb);
			out.print("</SeqNb>\n");
		}
		
		if (m_rcrdList != null) {
			for(TaxRecord1 l_Rcrd : m_rcrdList) {
				l_Rcrd.print(out);
			}
		}	
		
	}
}
