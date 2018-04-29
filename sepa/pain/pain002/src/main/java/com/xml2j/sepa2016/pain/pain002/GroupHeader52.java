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

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * GroupHeader52 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class GroupHeader52 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for GroupHeader52.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public GroupHeader52(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type GroupHeader52.
	 */
	static class Allocator implements TypeAllocator<GroupHeader52> {
		/**
		 * method for getting a new instance of type GroupHeader52.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public GroupHeader52 newInstance(String elementName, ComplexDataType parent) {
			return new GroupHeader52(elementName, parent);
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
	
  	
  
	/** element item for MsgId element. 
	 *  @serial
	 */	
	private String m_msgId = null;
	
	/** element item for CreDtTm element. 
	 *  @serial
	 */	
	private String m_creDtTm = null;
	
	/** element item for InitgPty element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_initgPty = null;
	
	/** element item for FwdgAgt element. 
	 *  @serial
	 */	
	private BranchAndFinancialInstitutionIdentification5 m_fwdgAgt = null;
	
	/** element item for DbtrAgt element. 
	 *  @serial
	 */	
	private BranchAndFinancialInstitutionIdentification5 m_dbtrAgt = null;
	
	/** element item for CdtrAgt element. 
	 *  @serial
	 */	
	private BranchAndFinancialInstitutionIdentification5 m_cdtrAgt = null;
	
	/**
	 * Get the embedded MsgId element.
	 * @return the item.
	 */
	public String getMsgId() {
		return m_msgId;
	}
		
	/**
	 * This method sets (overwrites) the element MsgId.
	 * @param data the item that needs to be added.
	 */
	void setMsgId(String data) {
		m_msgId = data;
	}
		
	/**
	 * Get the embedded CreDtTm element.
	 * @return the item.
	 */
	public String getCreDtTm() {
		return m_creDtTm;
	}
		
	/**
	 * This method sets (overwrites) the element CreDtTm.
	 * @param data the item that needs to be added.
	 */
	void setCreDtTm(String data) {
		m_creDtTm = data;
	}
		
	/**
	 * Get the embedded InitgPty element.
	 * @return the item.
	 */
	public PartyIdentification43 getInitgPty() {
		return m_initgPty;
	}
		
	/**
	 * This method sets (overwrites) the element InitgPty.
	 * @param data the item that needs to be added.
	 */
	void setInitgPty(PartyIdentification43 data) {
		m_initgPty = data;
	}
		
	/**
	 * Get the embedded FwdgAgt element.
	 * @return the item.
	 */
	public BranchAndFinancialInstitutionIdentification5 getFwdgAgt() {
		return m_fwdgAgt;
	}
		
	/**
	 * This method sets (overwrites) the element FwdgAgt.
	 * @param data the item that needs to be added.
	 */
	void setFwdgAgt(BranchAndFinancialInstitutionIdentification5 data) {
		m_fwdgAgt = data;
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
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	GroupHeader52 t = (GroupHeader52)that;
	 
		if (!Compare.equals(m_msgId, t.m_msgId))
			return false;
		
		if (!Compare.equals(m_creDtTm, t.m_creDtTm))
			return false;
		
		if (!Compare.equals(m_initgPty, t.m_initgPty))
			return false;
		
		if (!Compare.equals(m_fwdgAgt, t.m_fwdgAgt))
			return false;
		
		if (!Compare.equals(m_dbtrAgt, t.m_dbtrAgt))
			return false;
		
		if (!Compare.equals(m_cdtrAgt, t.m_cdtrAgt))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from GroupHeader52.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_msgId != null) {
			out.print("\n<MsgId>");
			out.print(m_msgId);
			out.print("</MsgId>\n");
		}
		
		if (m_creDtTm != null) {
			out.print("\n<CreDtTm>");
			out.print(m_creDtTm);
			out.print("</CreDtTm>\n");
		}
		
		if (m_initgPty != null) {
			m_initgPty.print(out);
		}	
		
		if (m_fwdgAgt != null) {
			m_fwdgAgt.print(out);
		}	
		
		if (m_dbtrAgt != null) {
			m_dbtrAgt.print(out);
		}	
		
		if (m_cdtrAgt != null) {
			m_cdtrAgt.print(out);
		}	
		
	}
}
