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

/* SAX 2.0 dependencies */
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/* Framework dependencies */
import com.xml2j.xml.core.DataSetter;
import com.xml2j.xml.core.ComplexDataType;
import com.xml2j.xml.core.XMLFragmentHandler;
import com.xml2j.xml.parser.ParserTask;


/**
 * CreditorPaymentActivationRequestV05Document handler class.
 *
 * @see CreditorPaymentActivationRequestV05Document
 */
public class CreditorPaymentActivationRequestV05DocumentHandler extends XMLFragmentHandler<CreditorPaymentActivationRequestV05Document> {
	/**
	 * Proxy for CreditorPaymentActivationRequestV05DocumentHandler.
	 */
	static class Proxy extends HandlerProxy<CreditorPaymentActivationRequestV05Document> {
		/**
		 * Allocator for CreditorPaymentActivationRequestV05DocumentHandler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<CreditorPaymentActivationRequestV05Document> {			
			public XMLFragmentHandler<CreditorPaymentActivationRequestV05Document> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new CreditorPaymentActivationRequestV05DocumentHandler(
					task
					, reader
					, handler
					, elementName
					, CreditorPaymentActivationRequestV05Document.getAllocator()
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
	
	/** Data setter class for CdtrPmtActvtnReq element. */
	private class CdtrPmtActvtnReqSetter implements DataSetter {
		/** data target. */
		private CreditorPaymentActivationRequestV05DocumentHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public CdtrPmtActvtnReqSetter(CreditorPaymentActivationRequestV05DocumentHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setCdtrPmtActvtnReq((CreditorPaymentActivationRequestV05) data);	
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
	public CreditorPaymentActivationRequestV05DocumentHandler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, CreditorPaymentActivationRequestV05Document.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new CreditorPaymentActivationRequestV05Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of CreditorPaymentActivationRequestV05Handler
				, "CdtrPmtActvtnReq" // XML element name
				, doLink("CdtrPmtActvtnReq") // linking to parent
					? new CdtrPmtActvtnReqSetter(this) // ON
					: null // OFF
				, doProcess("CdtrPmtActvtnReq")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public CreditorPaymentActivationRequestV05Document getData() {
		return (CreditorPaymentActivationRequestV05Document)super.getData();
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
		if (localName.equals(getXMLElementName())) {
			handleElement();
		}
		
	}	
}
