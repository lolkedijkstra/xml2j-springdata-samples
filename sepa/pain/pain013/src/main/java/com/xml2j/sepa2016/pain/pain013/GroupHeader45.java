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
 * GroupHeader45 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class GroupHeader45 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for GroupHeader45.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public GroupHeader45(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type GroupHeader45.
	 */
	static class Allocator implements TypeAllocator<GroupHeader45> {
		/**
		 * method for getting a new instance of type GroupHeader45.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public GroupHeader45 newInstance(String elementName, ComplexDataType parent) {
			return new GroupHeader45(elementName, parent);
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
	
	/** element item for NbOfTxs element. 
	 *  @serial
	 */	
	private String m_nbOfTxs = null;
	
	/** element item for CtrlSum element. 
	 *  @serial
	 */	
	private String m_ctrlSum = null;
	
	/** element item for InitgPty element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_initgPty = null;
	
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
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	GroupHeader45 t = (GroupHeader45)that;
	 
		if (!Compare.equals(m_msgId, t.m_msgId))
			return false;
		
		if (!Compare.equals(m_creDtTm, t.m_creDtTm))
			return false;
		
		if (!Compare.equals(m_nbOfTxs, t.m_nbOfTxs))
			return false;
		
		if (!Compare.equals(m_ctrlSum, t.m_ctrlSum))
			return false;
		
		if (!Compare.equals(m_initgPty, t.m_initgPty))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from GroupHeader45.
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
		
		if (m_initgPty != null) {
			m_initgPty.print(out);
		}	
		
	}
}
