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

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * OriginalGroupInformation25 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class OriginalGroupInformation25 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for OriginalGroupInformation25.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public OriginalGroupInformation25(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type OriginalGroupInformation25.
	 */
	static class Allocator implements TypeAllocator<OriginalGroupInformation25> {
		/**
		 * method for getting a new instance of type OriginalGroupInformation25.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public OriginalGroupInformation25 newInstance(String elementName, ComplexDataType parent) {
			return new OriginalGroupInformation25(elementName, parent);
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
	
	/** element item for OrgnlNbOfTxs element. 
	 *  @serial
	 */	
	private String m_orgnlNbOfTxs = null;
	
	/** element item for OrgnlCtrlSum element. 
	 *  @serial
	 */	
	private String m_orgnlCtrlSum = null;
	
	/** element item for GrpSts element. 
	 *  @serial
	 */	
	private String m_grpSts = null;
	
	/** list of StsRsnInf element. 
	 *  @serial
	 */	
	private List<StatusReasonInformation9> m_stsRsnInfList = new ArrayList<StatusReasonInformation9>();
	
	/** list of NbOfTxsPerSts element. 
	 *  @serial
	 */	
	private List<NumberOfTransactionsPerStatus3> m_nbOfTxsPerStsList = new ArrayList<NumberOfTransactionsPerStatus3>();
	
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
	 * Get the embedded OrgnlNbOfTxs element.
	 * @return the item.
	 */
	public String getOrgnlNbOfTxs() {
		return m_orgnlNbOfTxs;
	}
		
	/**
	 * This method sets (overwrites) the element OrgnlNbOfTxs.
	 * @param data the item that needs to be added.
	 */
	void setOrgnlNbOfTxs(String data) {
		m_orgnlNbOfTxs = data;
	}
		
	/**
	 * Get the embedded OrgnlCtrlSum element.
	 * @return the item.
	 */
	public String getOrgnlCtrlSum() {
		return m_orgnlCtrlSum;
	}
		
	/**
	 * This method sets (overwrites) the element OrgnlCtrlSum.
	 * @param data the item that needs to be added.
	 */
	void setOrgnlCtrlSum(String data) {
		m_orgnlCtrlSum = data;
	}
		
	/**
	 * Get the embedded GrpSts element.
	 * @return the item.
	 */
	public String getGrpSts() {
		return m_grpSts;
	}
		
	/**
	 * This method sets (overwrites) the element GrpSts.
	 * @param data the item that needs to be added.
	 */
	void setGrpSts(String data) {
		m_grpSts = data;
	}
		
	/**
	 * Get the embedded list of StsRsnInf elements.
	 * @return list of items.
	 */
	public List<StatusReasonInformation9> getStsRsnInfs() {
		return m_stsRsnInfList;
	}
		
	/**
	 * This method adds data to the list of StsRsnInf.
	 * @param data the item that needs to be added.
	 */
	void setStsRsnInf(StatusReasonInformation9 data) {
		m_stsRsnInfList.add(data);
	}
		
	/**
	 * Get the embedded list of NbOfTxsPerSts elements.
	 * @return list of items.
	 */
	public List<NumberOfTransactionsPerStatus3> getNbOfTxsPerStss() {
		return m_nbOfTxsPerStsList;
	}
		
	/**
	 * This method adds data to the list of NbOfTxsPerSts.
	 * @param data the item that needs to be added.
	 */
	void setNbOfTxsPerSts(NumberOfTransactionsPerStatus3 data) {
		m_nbOfTxsPerStsList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	OriginalGroupInformation25 t = (OriginalGroupInformation25)that;
	 
		if (!Compare.equals(m_orgnlMsgId, t.m_orgnlMsgId))
			return false;
		
		if (!Compare.equals(m_orgnlMsgNmId, t.m_orgnlMsgNmId))
			return false;
		
		if (!Compare.equals(m_orgnlCreDtTm, t.m_orgnlCreDtTm))
			return false;
		
		if (!Compare.equals(m_orgnlNbOfTxs, t.m_orgnlNbOfTxs))
			return false;
		
		if (!Compare.equals(m_orgnlCtrlSum, t.m_orgnlCtrlSum))
			return false;
		
		if (!Compare.equals(m_grpSts, t.m_grpSts))
			return false;
		
		if (!Compare.equals(m_stsRsnInfList, t.m_stsRsnInfList))
			return false;
		
		if (!Compare.equals(m_nbOfTxsPerStsList, t.m_nbOfTxsPerStsList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from OriginalGroupInformation25.
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
		
		if (m_orgnlNbOfTxs != null) {
			out.print("\n<OrgnlNbOfTxs>");
			out.print(m_orgnlNbOfTxs);
			out.print("</OrgnlNbOfTxs>\n");
		}
		
		if (m_orgnlCtrlSum != null) {
			out.print("\n<OrgnlCtrlSum>");
			out.print(m_orgnlCtrlSum);
			out.print("</OrgnlCtrlSum>\n");
		}
		
		if (m_grpSts != null) {
			out.print("\n<GrpSts>");
			out.print(m_grpSts);
			out.print("</GrpSts>\n");
		}
		
		if (m_stsRsnInfList != null) {
			for(StatusReasonInformation9 l_StsRsnInf : m_stsRsnInfList) {
				l_StsRsnInf.print(out);
			}
		}	
		
		if (m_nbOfTxsPerStsList != null) {
			for(NumberOfTransactionsPerStatus3 l_NbOfTxsPerSts : m_nbOfTxsPerStsList) {
				l_NbOfTxsPerSts.print(out);
			}
		}	
		
	}
}
