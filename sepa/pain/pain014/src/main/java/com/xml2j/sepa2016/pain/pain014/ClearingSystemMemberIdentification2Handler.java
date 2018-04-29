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

/* SAX 2.0 dependencies */
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/* Framework dependencies */
import com.xml2j.xml.core.DataSetter;
import com.xml2j.xml.core.ComplexDataType;
import com.xml2j.xml.core.XMLFragmentHandler;
import com.xml2j.xml.parser.ParserTask;


/**
 * ClearingSystemMemberIdentification2 handler class.
 *
 * @see ClearingSystemMemberIdentification2
 */
public class ClearingSystemMemberIdentification2Handler extends XMLFragmentHandler<ClearingSystemMemberIdentification2> {
	/**
	 * Proxy for ClearingSystemMemberIdentification2Handler.
	 */
	static class Proxy extends HandlerProxy<ClearingSystemMemberIdentification2> {
		/**
		 * Allocator for ClearingSystemMemberIdentification2Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<ClearingSystemMemberIdentification2> {			
			public XMLFragmentHandler<ClearingSystemMemberIdentification2> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new ClearingSystemMemberIdentification2Handler(
					task
					, reader
					, handler
					, elementName
					, ClearingSystemMemberIdentification2.getAllocator()
					, setter
					, doProcess);
			}
		}
		
		/**
		 * Constructor for Proxy.
		 *
		 * @param task the XML parser task
		 * @param reader the XML reader
		 * @param parentH the parent XML handler class
		 * @param elementName the name of the XML Element (tag).
		 * @param pSetter the setter for the parent data
		 * @param doProcess indicates whether processing is active for this handler instance
		 */
		public Proxy(ParserTask task, XMLReader reader, XMLFragmentHandler<?> parentH, String elementName,
				DataSetter pSetter, boolean doProcess) {
			super(task, reader, parentH, elementName, pSetter, new Allocator(), doProcess);
		}
	}
	
	/** Data setter class for ClrSysId element. */
	private class ClrSysIdSetter implements DataSetter {
		/** data target. */
		private ClearingSystemMemberIdentification2Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public ClrSysIdSetter(ClearingSystemMemberIdentification2Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setClrSysId((ClearingSystemIdentification2Choice) data);	
		}
	}


	/**
	 * Constructor for handler class.
	 *
	 * @param reader the XML reader
	 * @param parentH the parent XML handler class
	 * @param elementName the name of the XML Element (tag)
	 * @param allocator the allocator for the data type
	 * @param pSetter the setter for the parent data
	 * @param doProcess indicates whether processing is active for this handler instance
	 */
	public ClearingSystemMemberIdentification2Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, ClearingSystemMemberIdentification2.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new ClearingSystemIdentification2ChoiceHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of ClearingSystemIdentification2ChoiceHandler
				, "ClrSysId" // XML element name
				, doLink("ClrSysId") // linking to parent
					? new ClrSysIdSetter(this) // ON
					: null // OFF
				, doProcess("ClrSysId")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public ClearingSystemMemberIdentification2 getData() {
		return (ClearingSystemMemberIdentification2)super.getData();
	}




	/**
	 * This method is called by the XML parser on an end of element event.
	 *
	 * If the localName == 'the name of the element that this handler handles' control is
	 * passed back to the parent handler (future events go there) and the data of
	 * the children of this handler is attached to the data associated to this handler.	
	 * 
	 * The data that is collected is connected to the parent data only if a parentDataSetter
	 * if found (getParentDataSetter()).
	 *
	 * If processing is enabled for a handler, the processor is called.
	 */
	@Override
	public void endElement(String uri, String localName, String name)
		throws SAXException {
		
		// collect data from children..
		if (localName.equals("MmbId")) {
			getData().setMmbId(getValue());
			getContents().reset();
		} else if (localName.equals(getXMLElementName())) {
			handleElement();
		}
		
	}	
}
