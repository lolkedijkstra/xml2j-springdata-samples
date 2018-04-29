package com.xml2j.sepa2016.pain.pain013;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: PAIN013 
  Generation date: Sun Apr 29 21:09:43 CEST 2018 
  Author: XML2J-GEN

******************************************************************************/

import com.xml2j.util.Printer;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * TaxRecord1 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class TaxRecord1 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for TaxRecord1.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public TaxRecord1(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type TaxRecord1.
	 */
	static class Allocator implements TypeAllocator<TaxRecord1> {
		/**
		 * method for getting a new instance of type TaxRecord1.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public TaxRecord1 newInstance(String elementName, ComplexDataType parent) {
			return new TaxRecord1(elementName, parent);
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
	
  	
  
	/** element item for Tp element. 
	 *  @serial
	 */	
	private String m_tp = null;
	
	/** element item for Ctgy element. 
	 *  @serial
	 */	
	private String m_ctgy = null;
	
	/** element item for CtgyDtls element. 
	 *  @serial
	 */	
	private String m_ctgyDtls = null;
	
	/** element item for DbtrSts element. 
	 *  @serial
	 */	
	private String m_dbtrSts = null;
	
	/** element item for CertId element. 
	 *  @serial
	 */	
	private String m_certId = null;
	
	/** element item for FrmsCd element. 
	 *  @serial
	 */	
	private String m_frmsCd = null;
	
	/** element item for Prd element. 
	 *  @serial
	 */	
	private TaxPeriod1 m_prd = null;
	
	/** element item for TaxAmt element. 
	 *  @serial
	 */	
	private TaxAmount1 m_taxAmt = null;
	
	/** element item for AddtlInf element. 
	 *  @serial
	 */	
	private String m_addtlInf = null;
	
	/**
	 * Get the embedded Tp element.
	 * @return the item.
	 */
	public String getTp() {
		return m_tp;
	}
		
	/**
	 * This method sets (overwrites) the element Tp.
	 * @param data the item that needs to be added.
	 */
	void setTp(String data) {
		m_tp = data;
	}
		
	/**
	 * Get the embedded Ctgy element.
	 * @return the item.
	 */
	public String getCtgy() {
		return m_ctgy;
	}
		
	/**
	 * This method sets (overwrites) the element Ctgy.
	 * @param data the item that needs to be added.
	 */
	void setCtgy(String data) {
		m_ctgy = data;
	}
		
	/**
	 * Get the embedded CtgyDtls element.
	 * @return the item.
	 */
	public String getCtgyDtls() {
		return m_ctgyDtls;
	}
		
	/**
	 * This method sets (overwrites) the element CtgyDtls.
	 * @param data the item that needs to be added.
	 */
	void setCtgyDtls(String data) {
		m_ctgyDtls = data;
	}
		
	/**
	 * Get the embedded DbtrSts element.
	 * @return the item.
	 */
	public String getDbtrSts() {
		return m_dbtrSts;
	}
		
	/**
	 * This method sets (overwrites) the element DbtrSts.
	 * @param data the item that needs to be added.
	 */
	void setDbtrSts(String data) {
		m_dbtrSts = data;
	}
		
	/**
	 * Get the embedded CertId element.
	 * @return the item.
	 */
	public String getCertId() {
		return m_certId;
	}
		
	/**
	 * This method sets (overwrites) the element CertId.
	 * @param data the item that needs to be added.
	 */
	void setCertId(String data) {
		m_certId = data;
	}
		
	/**
	 * Get the embedded FrmsCd element.
	 * @return the item.
	 */
	public String getFrmsCd() {
		return m_frmsCd;
	}
		
	/**
	 * This method sets (overwrites) the element FrmsCd.
	 * @param data the item that needs to be added.
	 */
	void setFrmsCd(String data) {
		m_frmsCd = data;
	}
		
	/**
	 * Get the embedded Prd element.
	 * @return the item.
	 */
	public TaxPeriod1 getPrd() {
		return m_prd;
	}
		
	/**
	 * This method sets (overwrites) the element Prd.
	 * @param data the item that needs to be added.
	 */
	void setPrd(TaxPeriod1 data) {
		m_prd = data;
	}
		
	/**
	 * Get the embedded TaxAmt element.
	 * @return the item.
	 */
	public TaxAmount1 getTaxAmt() {
		return m_taxAmt;
	}
		
	/**
	 * This method sets (overwrites) the element TaxAmt.
	 * @param data the item that needs to be added.
	 */
	void setTaxAmt(TaxAmount1 data) {
		m_taxAmt = data;
	}
		
	/**
	 * Get the embedded AddtlInf element.
	 * @return the item.
	 */
	public String getAddtlInf() {
		return m_addtlInf;
	}
		
	/**
	 * This method sets (overwrites) the element AddtlInf.
	 * @param data the item that needs to be added.
	 */
	void setAddtlInf(String data) {
		m_addtlInf = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	TaxRecord1 t = (TaxRecord1)that;
	 
		if (!Compare.equals(m_tp, t.m_tp))
			return false;
		
		if (!Compare.equals(m_ctgy, t.m_ctgy))
			return false;
		
		if (!Compare.equals(m_ctgyDtls, t.m_ctgyDtls))
			return false;
		
		if (!Compare.equals(m_dbtrSts, t.m_dbtrSts))
			return false;
		
		if (!Compare.equals(m_certId, t.m_certId))
			return false;
		
		if (!Compare.equals(m_frmsCd, t.m_frmsCd))
			return false;
		
		if (!Compare.equals(m_prd, t.m_prd))
			return false;
		
		if (!Compare.equals(m_taxAmt, t.m_taxAmt))
			return false;
		
		if (!Compare.equals(m_addtlInf, t.m_addtlInf))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from TaxRecord1.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_tp != null) {
			out.print("\n<Tp>");
			out.print(m_tp);
			out.print("</Tp>\n");
		}
		
		if (m_ctgy != null) {
			out.print("\n<Ctgy>");
			out.print(m_ctgy);
			out.print("</Ctgy>\n");
		}
		
		if (m_ctgyDtls != null) {
			out.print("\n<CtgyDtls>");
			out.print(m_ctgyDtls);
			out.print("</CtgyDtls>\n");
		}
		
		if (m_dbtrSts != null) {
			out.print("\n<DbtrSts>");
			out.print(m_dbtrSts);
			out.print("</DbtrSts>\n");
		}
		
		if (m_certId != null) {
			out.print("\n<CertId>");
			out.print(m_certId);
			out.print("</CertId>\n");
		}
		
		if (m_frmsCd != null) {
			out.print("\n<FrmsCd>");
			out.print(m_frmsCd);
			out.print("</FrmsCd>\n");
		}
		
		if (m_prd != null) {
			m_prd.print(out);
		}	
		
		if (m_taxAmt != null) {
			m_taxAmt.print(out);
		}	
		
		if (m_addtlInf != null) {
			out.print("\n<AddtlInf>");
			out.print(m_addtlInf);
			out.print("</AddtlInf>\n");
		}
		
	}
}
