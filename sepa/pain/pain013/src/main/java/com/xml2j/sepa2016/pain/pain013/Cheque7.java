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

import com.xml2j.util.StringList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * Cheque7 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class Cheque7 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for Cheque7.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public Cheque7(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type Cheque7.
	 */
	static class Allocator implements TypeAllocator<Cheque7> {
		/**
		 * method for getting a new instance of type Cheque7.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public Cheque7 newInstance(String elementName, ComplexDataType parent) {
			return new Cheque7(elementName, parent);
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
	
  	
  
	/** element item for ChqTp element. 
	 *  @serial
	 */	
	private String m_chqTp = null;
	
	/** element item for ChqNb element. 
	 *  @serial
	 */	
	private String m_chqNb = null;
	
	/** element item for ChqFr element. 
	 *  @serial
	 */	
	private NameAndAddress10 m_chqFr = null;
	
	/** element item for DlvryMtd element. 
	 *  @serial
	 */	
	private ChequeDeliveryMethod1Choice m_dlvryMtd = null;
	
	/** element item for DlvrTo element. 
	 *  @serial
	 */	
	private NameAndAddress10 m_dlvrTo = null;
	
	/** element item for InstrPrty element. 
	 *  @serial
	 */	
	private String m_instrPrty = null;
	
	/** element item for ChqMtrtyDt element. 
	 *  @serial
	 */	
	private String m_chqMtrtyDt = null;
	
	/** element item for FrmsCd element. 
	 *  @serial
	 */	
	private String m_frmsCd = null;
	
	/** list of MemoFld element. 
	 *  @serial
	 */	
	private StringList m_memoFldList = new StringList("MemoFld");
	
	/** element item for RgnlClrZone element. 
	 *  @serial
	 */	
	private String m_rgnlClrZone = null;
	
	/** element item for PrtLctn element. 
	 *  @serial
	 */	
	private String m_prtLctn = null;
	
	/** list of Sgntr element. 
	 *  @serial
	 */	
	private StringList m_sgntrList = new StringList("Sgntr");
	
	/**
	 * Get the embedded ChqTp element.
	 * @return the item.
	 */
	public String getChqTp() {
		return m_chqTp;
	}
		
	/**
	 * This method sets (overwrites) the element ChqTp.
	 * @param data the item that needs to be added.
	 */
	void setChqTp(String data) {
		m_chqTp = data;
	}
		
	/**
	 * Get the embedded ChqNb element.
	 * @return the item.
	 */
	public String getChqNb() {
		return m_chqNb;
	}
		
	/**
	 * This method sets (overwrites) the element ChqNb.
	 * @param data the item that needs to be added.
	 */
	void setChqNb(String data) {
		m_chqNb = data;
	}
		
	/**
	 * Get the embedded ChqFr element.
	 * @return the item.
	 */
	public NameAndAddress10 getChqFr() {
		return m_chqFr;
	}
		
	/**
	 * This method sets (overwrites) the element ChqFr.
	 * @param data the item that needs to be added.
	 */
	void setChqFr(NameAndAddress10 data) {
		m_chqFr = data;
	}
		
	/**
	 * Get the embedded DlvryMtd element.
	 * @return the item.
	 */
	public ChequeDeliveryMethod1Choice getDlvryMtd() {
		return m_dlvryMtd;
	}
		
	/**
	 * This method sets (overwrites) the element DlvryMtd.
	 * @param data the item that needs to be added.
	 */
	void setDlvryMtd(ChequeDeliveryMethod1Choice data) {
		m_dlvryMtd = data;
	}
		
	/**
	 * Get the embedded DlvrTo element.
	 * @return the item.
	 */
	public NameAndAddress10 getDlvrTo() {
		return m_dlvrTo;
	}
		
	/**
	 * This method sets (overwrites) the element DlvrTo.
	 * @param data the item that needs to be added.
	 */
	void setDlvrTo(NameAndAddress10 data) {
		m_dlvrTo = data;
	}
		
	/**
	 * Get the embedded InstrPrty element.
	 * @return the item.
	 */
	public String getInstrPrty() {
		return m_instrPrty;
	}
		
	/**
	 * This method sets (overwrites) the element InstrPrty.
	 * @param data the item that needs to be added.
	 */
	void setInstrPrty(String data) {
		m_instrPrty = data;
	}
		
	/**
	 * Get the embedded ChqMtrtyDt element.
	 * @return the item.
	 */
	public String getChqMtrtyDt() {
		return m_chqMtrtyDt;
	}
		
	/**
	 * This method sets (overwrites) the element ChqMtrtyDt.
	 * @param data the item that needs to be added.
	 */
	void setChqMtrtyDt(String data) {
		m_chqMtrtyDt = data;
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
	 * Get the embedded list of MemoFld elements.
	 * @return list of items.
	 */
	public StringList getMemoFlds() {
		return m_memoFldList;
	}
		
	/**
	 * This method adds data to the list of MemoFld.
	 * @param data the item that needs to be added.
	 */
	void setMemoFld(String data) {
		m_memoFldList.add(data);
	}
		
	/**
	 * Get the embedded RgnlClrZone element.
	 * @return the item.
	 */
	public String getRgnlClrZone() {
		return m_rgnlClrZone;
	}
		
	/**
	 * This method sets (overwrites) the element RgnlClrZone.
	 * @param data the item that needs to be added.
	 */
	void setRgnlClrZone(String data) {
		m_rgnlClrZone = data;
	}
		
	/**
	 * Get the embedded PrtLctn element.
	 * @return the item.
	 */
	public String getPrtLctn() {
		return m_prtLctn;
	}
		
	/**
	 * This method sets (overwrites) the element PrtLctn.
	 * @param data the item that needs to be added.
	 */
	void setPrtLctn(String data) {
		m_prtLctn = data;
	}
			
	/**
	 * Get the embedded list of Sgntr elements.
	 * @return list of items.
	 */
	public StringList getSgntrs() {
		return m_sgntrList;
	}
		
	/**
	 * This method adds data to the list of Sgntr.
	 * @param data the item that needs to be added.
	 */
	void setSgntr(String data) {
		m_sgntrList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	Cheque7 t = (Cheque7)that;
	 
		if (!Compare.equals(m_chqTp, t.m_chqTp))
			return false;
		
		if (!Compare.equals(m_chqNb, t.m_chqNb))
			return false;
		
		if (!Compare.equals(m_chqFr, t.m_chqFr))
			return false;
		
		if (!Compare.equals(m_dlvryMtd, t.m_dlvryMtd))
			return false;
		
		if (!Compare.equals(m_dlvrTo, t.m_dlvrTo))
			return false;
		
		if (!Compare.equals(m_instrPrty, t.m_instrPrty))
			return false;
		
		if (!Compare.equals(m_chqMtrtyDt, t.m_chqMtrtyDt))
			return false;
		
		if (!Compare.equals(m_frmsCd, t.m_frmsCd))
			return false;
		
		if (!Compare.equals(m_memoFldList, t.m_memoFldList))
			return false;
		
		if (!Compare.equals(m_rgnlClrZone, t.m_rgnlClrZone))
			return false;
		
		if (!Compare.equals(m_prtLctn, t.m_prtLctn))
			return false;
		
		if (!Compare.equals(m_sgntrList, t.m_sgntrList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from Cheque7.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_chqTp != null) {
			out.print("\n<ChqTp>");
			out.print(m_chqTp);
			out.print("</ChqTp>\n");
		}
		
		if (m_chqNb != null) {
			out.print("\n<ChqNb>");
			out.print(m_chqNb);
			out.print("</ChqNb>\n");
		}
		
		if (m_chqFr != null) {
			m_chqFr.print(out);
		}	
		
		if (m_dlvryMtd != null) {
			m_dlvryMtd.print(out);
		}	
		
		if (m_dlvrTo != null) {
			m_dlvrTo.print(out);
		}	
		
		if (m_instrPrty != null) {
			out.print("\n<InstrPrty>");
			out.print(m_instrPrty);
			out.print("</InstrPrty>\n");
		}
		
		if (m_chqMtrtyDt != null) {
			out.print("\n<ChqMtrtyDt>");
			out.print(m_chqMtrtyDt);
			out.print("</ChqMtrtyDt>\n");
		}
		
		if (m_frmsCd != null) {
			out.print("\n<FrmsCd>");
			out.print(m_frmsCd);
			out.print("</FrmsCd>\n");
		}
		
		if (m_memoFldList != null) {
			m_memoFldList.print(out);
		}	
		
		if (m_rgnlClrZone != null) {
			out.print("\n<RgnlClrZone>");
			out.print(m_rgnlClrZone);
			out.print("</RgnlClrZone>\n");
		}
		
		if (m_prtLctn != null) {
			out.print("\n<PrtLctn>");
			out.print(m_prtLctn);
			out.print("</PrtLctn>\n");
		}
		
		if (m_sgntrList != null) {
			m_sgntrList.print(out);
		}	
		
	}
}
