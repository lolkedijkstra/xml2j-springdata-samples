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

import com.xml2j.util.StringList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * PostalAddress6 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class PostalAddress6 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for PostalAddress6.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public PostalAddress6(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type PostalAddress6.
	 */
	static class Allocator implements TypeAllocator<PostalAddress6> {
		/**
		 * method for getting a new instance of type PostalAddress6.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public PostalAddress6 newInstance(String elementName, ComplexDataType parent) {
			return new PostalAddress6(elementName, parent);
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
	
  	
  
	/** element item for AdrTp element. 
	 *  @serial
	 */	
	private String m_adrTp = null;
	
	/** element item for Dept element. 
	 *  @serial
	 */	
	private String m_dept = null;
	
	/** element item for SubDept element. 
	 *  @serial
	 */	
	private String m_subDept = null;
	
	/** element item for StrtNm element. 
	 *  @serial
	 */	
	private String m_strtNm = null;
	
	/** element item for BldgNb element. 
	 *  @serial
	 */	
	private String m_bldgNb = null;
	
	/** element item for PstCd element. 
	 *  @serial
	 */	
	private String m_pstCd = null;
	
	/** element item for TwnNm element. 
	 *  @serial
	 */	
	private String m_twnNm = null;
	
	/** element item for CtrySubDvsn element. 
	 *  @serial
	 */	
	private String m_ctrySubDvsn = null;
	
	/** element item for Ctry element. 
	 *  @serial
	 */	
	private String m_ctry = null;
	
	/** list of AdrLine element. 
	 *  @serial
	 */	
	private StringList m_adrLineList = new StringList("AdrLine");
	
	/**
	 * Get the embedded AdrTp element.
	 * @return the item.
	 */
	public String getAdrTp() {
		return m_adrTp;
	}
		
	/**
	 * This method sets (overwrites) the element AdrTp.
	 * @param data the item that needs to be added.
	 */
	void setAdrTp(String data) {
		m_adrTp = data;
	}
		
	/**
	 * Get the embedded Dept element.
	 * @return the item.
	 */
	public String getDept() {
		return m_dept;
	}
		
	/**
	 * This method sets (overwrites) the element Dept.
	 * @param data the item that needs to be added.
	 */
	void setDept(String data) {
		m_dept = data;
	}
		
	/**
	 * Get the embedded SubDept element.
	 * @return the item.
	 */
	public String getSubDept() {
		return m_subDept;
	}
		
	/**
	 * This method sets (overwrites) the element SubDept.
	 * @param data the item that needs to be added.
	 */
	void setSubDept(String data) {
		m_subDept = data;
	}
		
	/**
	 * Get the embedded StrtNm element.
	 * @return the item.
	 */
	public String getStrtNm() {
		return m_strtNm;
	}
		
	/**
	 * This method sets (overwrites) the element StrtNm.
	 * @param data the item that needs to be added.
	 */
	void setStrtNm(String data) {
		m_strtNm = data;
	}
		
	/**
	 * Get the embedded BldgNb element.
	 * @return the item.
	 */
	public String getBldgNb() {
		return m_bldgNb;
	}
		
	/**
	 * This method sets (overwrites) the element BldgNb.
	 * @param data the item that needs to be added.
	 */
	void setBldgNb(String data) {
		m_bldgNb = data;
	}
		
	/**
	 * Get the embedded PstCd element.
	 * @return the item.
	 */
	public String getPstCd() {
		return m_pstCd;
	}
		
	/**
	 * This method sets (overwrites) the element PstCd.
	 * @param data the item that needs to be added.
	 */
	void setPstCd(String data) {
		m_pstCd = data;
	}
		
	/**
	 * Get the embedded TwnNm element.
	 * @return the item.
	 */
	public String getTwnNm() {
		return m_twnNm;
	}
		
	/**
	 * This method sets (overwrites) the element TwnNm.
	 * @param data the item that needs to be added.
	 */
	void setTwnNm(String data) {
		m_twnNm = data;
	}
		
	/**
	 * Get the embedded CtrySubDvsn element.
	 * @return the item.
	 */
	public String getCtrySubDvsn() {
		return m_ctrySubDvsn;
	}
		
	/**
	 * This method sets (overwrites) the element CtrySubDvsn.
	 * @param data the item that needs to be added.
	 */
	void setCtrySubDvsn(String data) {
		m_ctrySubDvsn = data;
	}
		
	/**
	 * Get the embedded Ctry element.
	 * @return the item.
	 */
	public String getCtry() {
		return m_ctry;
	}
		
	/**
	 * This method sets (overwrites) the element Ctry.
	 * @param data the item that needs to be added.
	 */
	void setCtry(String data) {
		m_ctry = data;
	}
			
	/**
	 * Get the embedded list of AdrLine elements.
	 * @return list of items.
	 */
	public StringList getAdrLines() {
		return m_adrLineList;
	}
		
	/**
	 * This method adds data to the list of AdrLine.
	 * @param data the item that needs to be added.
	 */
	void setAdrLine(String data) {
		m_adrLineList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	PostalAddress6 t = (PostalAddress6)that;
	 
		if (!Compare.equals(m_adrTp, t.m_adrTp))
			return false;
		
		if (!Compare.equals(m_dept, t.m_dept))
			return false;
		
		if (!Compare.equals(m_subDept, t.m_subDept))
			return false;
		
		if (!Compare.equals(m_strtNm, t.m_strtNm))
			return false;
		
		if (!Compare.equals(m_bldgNb, t.m_bldgNb))
			return false;
		
		if (!Compare.equals(m_pstCd, t.m_pstCd))
			return false;
		
		if (!Compare.equals(m_twnNm, t.m_twnNm))
			return false;
		
		if (!Compare.equals(m_ctrySubDvsn, t.m_ctrySubDvsn))
			return false;
		
		if (!Compare.equals(m_ctry, t.m_ctry))
			return false;
		
		if (!Compare.equals(m_adrLineList, t.m_adrLineList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from PostalAddress6.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_adrTp != null) {
			out.print("\n<AdrTp>");
			out.print(m_adrTp);
			out.print("</AdrTp>\n");
		}
		
		if (m_dept != null) {
			out.print("\n<Dept>");
			out.print(m_dept);
			out.print("</Dept>\n");
		}
		
		if (m_subDept != null) {
			out.print("\n<SubDept>");
			out.print(m_subDept);
			out.print("</SubDept>\n");
		}
		
		if (m_strtNm != null) {
			out.print("\n<StrtNm>");
			out.print(m_strtNm);
			out.print("</StrtNm>\n");
		}
		
		if (m_bldgNb != null) {
			out.print("\n<BldgNb>");
			out.print(m_bldgNb);
			out.print("</BldgNb>\n");
		}
		
		if (m_pstCd != null) {
			out.print("\n<PstCd>");
			out.print(m_pstCd);
			out.print("</PstCd>\n");
		}
		
		if (m_twnNm != null) {
			out.print("\n<TwnNm>");
			out.print(m_twnNm);
			out.print("</TwnNm>\n");
		}
		
		if (m_ctrySubDvsn != null) {
			out.print("\n<CtrySubDvsn>");
			out.print(m_ctrySubDvsn);
			out.print("</CtrySubDvsn>\n");
		}
		
		if (m_ctry != null) {
			out.print("\n<Ctry>");
			out.print(m_ctry);
			out.print("</Ctry>\n");
		}
		
		if (m_adrLineList != null) {
			m_adrLineList.print(out);
		}	
		
	}
}
