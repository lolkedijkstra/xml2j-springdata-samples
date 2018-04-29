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

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * ContactDetails2 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class ContactDetails2 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for ContactDetails2.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public ContactDetails2(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type ContactDetails2.
	 */
	static class Allocator implements TypeAllocator<ContactDetails2> {
		/**
		 * method for getting a new instance of type ContactDetails2.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public ContactDetails2 newInstance(String elementName, ComplexDataType parent) {
			return new ContactDetails2(elementName, parent);
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
	
  	
  
	/** element item for NmPrfx element. 
	 *  @serial
	 */	
	private String m_nmPrfx = null;
	
	/** element item for Nm element. 
	 *  @serial
	 */	
	private String m_nm = null;
	
	/** element item for PhneNb element. 
	 *  @serial
	 */	
	private String m_phneNb = null;
	
	/** element item for MobNb element. 
	 *  @serial
	 */	
	private String m_mobNb = null;
	
	/** element item for FaxNb element. 
	 *  @serial
	 */	
	private String m_faxNb = null;
	
	/** element item for EmailAdr element. 
	 *  @serial
	 */	
	private String m_emailAdr = null;
	
	/** element item for Othr element. 
	 *  @serial
	 */	
	private String m_othr = null;
	
	/**
	 * Get the embedded NmPrfx element.
	 * @return the item.
	 */
	public String getNmPrfx() {
		return m_nmPrfx;
	}
		
	/**
	 * This method sets (overwrites) the element NmPrfx.
	 * @param data the item that needs to be added.
	 */
	void setNmPrfx(String data) {
		m_nmPrfx = data;
	}
		
	/**
	 * Get the embedded Nm element.
	 * @return the item.
	 */
	public String getNm() {
		return m_nm;
	}
		
	/**
	 * This method sets (overwrites) the element Nm.
	 * @param data the item that needs to be added.
	 */
	void setNm(String data) {
		m_nm = data;
	}
		
	/**
	 * Get the embedded PhneNb element.
	 * @return the item.
	 */
	public String getPhneNb() {
		return m_phneNb;
	}
		
	/**
	 * This method sets (overwrites) the element PhneNb.
	 * @param data the item that needs to be added.
	 */
	void setPhneNb(String data) {
		m_phneNb = data;
	}
		
	/**
	 * Get the embedded MobNb element.
	 * @return the item.
	 */
	public String getMobNb() {
		return m_mobNb;
	}
		
	/**
	 * This method sets (overwrites) the element MobNb.
	 * @param data the item that needs to be added.
	 */
	void setMobNb(String data) {
		m_mobNb = data;
	}
		
	/**
	 * Get the embedded FaxNb element.
	 * @return the item.
	 */
	public String getFaxNb() {
		return m_faxNb;
	}
		
	/**
	 * This method sets (overwrites) the element FaxNb.
	 * @param data the item that needs to be added.
	 */
	void setFaxNb(String data) {
		m_faxNb = data;
	}
		
	/**
	 * Get the embedded EmailAdr element.
	 * @return the item.
	 */
	public String getEmailAdr() {
		return m_emailAdr;
	}
		
	/**
	 * This method sets (overwrites) the element EmailAdr.
	 * @param data the item that needs to be added.
	 */
	void setEmailAdr(String data) {
		m_emailAdr = data;
	}
		
	/**
	 * Get the embedded Othr element.
	 * @return the item.
	 */
	public String getOthr() {
		return m_othr;
	}
		
	/**
	 * This method sets (overwrites) the element Othr.
	 * @param data the item that needs to be added.
	 */
	void setOthr(String data) {
		m_othr = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	ContactDetails2 t = (ContactDetails2)that;
	 
		if (!Compare.equals(m_nmPrfx, t.m_nmPrfx))
			return false;
		
		if (!Compare.equals(m_nm, t.m_nm))
			return false;
		
		if (!Compare.equals(m_phneNb, t.m_phneNb))
			return false;
		
		if (!Compare.equals(m_mobNb, t.m_mobNb))
			return false;
		
		if (!Compare.equals(m_faxNb, t.m_faxNb))
			return false;
		
		if (!Compare.equals(m_emailAdr, t.m_emailAdr))
			return false;
		
		if (!Compare.equals(m_othr, t.m_othr))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from ContactDetails2.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_nmPrfx != null) {
			out.print("\n<NmPrfx>");
			out.print(m_nmPrfx);
			out.print("</NmPrfx>\n");
		}
		
		if (m_nm != null) {
			out.print("\n<Nm>");
			out.print(m_nm);
			out.print("</Nm>\n");
		}
		
		if (m_phneNb != null) {
			out.print("\n<PhneNb>");
			out.print(m_phneNb);
			out.print("</PhneNb>\n");
		}
		
		if (m_mobNb != null) {
			out.print("\n<MobNb>");
			out.print(m_mobNb);
			out.print("</MobNb>\n");
		}
		
		if (m_faxNb != null) {
			out.print("\n<FaxNb>");
			out.print(m_faxNb);
			out.print("</FaxNb>\n");
		}
		
		if (m_emailAdr != null) {
			out.print("\n<EmailAdr>");
			out.print(m_emailAdr);
			out.print("</EmailAdr>\n");
		}
		
		if (m_othr != null) {
			out.print("\n<Othr>");
			out.print(m_othr);
			out.print("</Othr>\n");
		}
		
	}
}
