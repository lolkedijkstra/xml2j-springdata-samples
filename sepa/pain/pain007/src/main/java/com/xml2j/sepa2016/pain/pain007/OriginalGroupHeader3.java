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

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * OriginalGroupHeader3 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class OriginalGroupHeader3 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for OriginalGroupHeader3.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public OriginalGroupHeader3(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type OriginalGroupHeader3.
	 */
	static class Allocator implements TypeAllocator<OriginalGroupHeader3> {
		/**
		 * method for getting a new instance of type OriginalGroupHeader3.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public OriginalGroupHeader3 newInstance(String elementName, ComplexDataType parent) {
			return new OriginalGroupHeader3(elementName, parent);
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
	
  	
  
	/** element item for OrgnlMsgId element. 
	 *  @serial
	 */	
	private String m_orgnlMsgId = null;
	
	/** element item for OrgnlMsgNmId element. 
	 *  @serial
	 */	
	private String m_orgnlMsgNmId = null;
	
	/** element item for OrgnlCreDtTm element. 
	 *  @serial
	 */	
	private String m_orgnlCreDtTm = null;
	
	/** list of RvslRsnInf element. 
	 *  @serial
	 */	
	private List<PaymentReversalReason7> m_rvslRsnInfList = new ArrayList<PaymentReversalReason7>();
	
	/**
	 * Get the embedded OrgnlMsgId element.
	 * @return the item.
	 */
	public String getOrgnlMsgId() {
		return m_orgnlMsgId;
	}
		
	/**
	 * This method sets (overwrites) the element OrgnlMsgId.
	 * @param data the item that needs to be added.
	 */
	void setOrgnlMsgId(String data) {
		m_orgnlMsgId = data;
	}
		
	/**
	 * Get the embedded OrgnlMsgNmId element.
	 * @return the item.
	 */
	public String getOrgnlMsgNmId() {
		return m_orgnlMsgNmId;
	}
		
	/**
	 * This method sets (overwrites) the element OrgnlMsgNmId.
	 * @param data the item that needs to be added.
	 */
	void setOrgnlMsgNmId(String data) {
		m_orgnlMsgNmId = data;
	}
		
	/**
	 * Get the embedded OrgnlCreDtTm element.
	 * @return the item.
	 */
	public String getOrgnlCreDtTm() {
		return m_orgnlCreDtTm;
	}
		
	/**
	 * This method sets (overwrites) the element OrgnlCreDtTm.
	 * @param data the item that needs to be added.
	 */
	void setOrgnlCreDtTm(String data) {
		m_orgnlCreDtTm = data;
	}
		
	/**
	 * Get the embedded list of RvslRsnInf elements.
	 * @return list of items.
	 */
	public List<PaymentReversalReason7> getRvslRsnInfs() {
		return m_rvslRsnInfList;
	}
		
	/**
	 * This method adds data to the list of RvslRsnInf.
	 * @param data the item that needs to be added.
	 */
	void setRvslRsnInf(PaymentReversalReason7 data) {
		m_rvslRsnInfList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	OriginalGroupHeader3 t = (OriginalGroupHeader3)that;
	 
		if (!Compare.equals(m_orgnlMsgId, t.m_orgnlMsgId))
			return false;
		
		if (!Compare.equals(m_orgnlMsgNmId, t.m_orgnlMsgNmId))
			return false;
		
		if (!Compare.equals(m_orgnlCreDtTm, t.m_orgnlCreDtTm))
			return false;
		
		if (!Compare.equals(m_rvslRsnInfList, t.m_rvslRsnInfList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from OriginalGroupHeader3.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_orgnlMsgId != null) {
			out.print("\n<OrgnlMsgId>");
			out.print(m_orgnlMsgId);
			out.print("</OrgnlMsgId>\n");
		}
		
		if (m_orgnlMsgNmId != null) {
			out.print("\n<OrgnlMsgNmId>");
			out.print(m_orgnlMsgNmId);
			out.print("</OrgnlMsgNmId>\n");
		}
		
		if (m_orgnlCreDtTm != null) {
			out.print("\n<OrgnlCreDtTm>");
			out.print(m_orgnlCreDtTm);
			out.print("</OrgnlCreDtTm>\n");
		}
		
		if (m_rvslRsnInfList != null) {
			for(PaymentReversalReason7 l_RvslRsnInf : m_rvslRsnInfList) {
				l_RvslRsnInf.print(out);
			}
		}	
		
	}
}
