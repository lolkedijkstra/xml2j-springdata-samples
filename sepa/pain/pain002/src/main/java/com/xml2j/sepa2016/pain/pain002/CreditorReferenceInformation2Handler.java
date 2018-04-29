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

/* SAX 2.0 dependencies */
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/* Framework dependencies */
import com.xml2j.xml.core.DataSetter;
import com.xml2j.xml.core.ComplexDataType;
import com.xml2j.xml.core.XMLFragmentHandler;
import com.xml2j.xml.parser.ParserTask;


/**
 * CreditorReferenceInformation2 handler class.
 *
 * @see CreditorReferenceInformation2
 */
public class CreditorReferenceInformation2Handler extends XMLFragmentHandler<CreditorReferenceInformation2> {
	/**
	 * Proxy for CreditorReferenceInformation2Handler.
	 */
	static class Proxy extends HandlerProxy<CreditorReferenceInformation2> {
		/**
		 * Allocator for CreditorReferenceInformation2Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<CreditorReferenceInformation2> {			
			public XMLFragmentHandler<CreditorReferenceInformation2> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new CreditorReferenceInformation2Handler(
					task
					, reader
					, handler
					, elementName
					, CreditorReferenceInformation2.getAllocator()
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
	
	/** Data setter class for Tp element. */
	private class TpSetter implements DataSetter {
		/** data target. */
		private CreditorReferenceInformation2Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public TpSetter(CreditorReferenceInformation2Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setTp((CreditorReferenceType2) data);	
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
	public CreditorReferenceInformation2Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, CreditorReferenceInformation2.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new CreditorReferenceType2Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of CreditorReferenceType2Handler
				, "Tp" // XML element name
				, doLink("Tp") // linking to parent
					? new TpSetter(this) // ON
					: null // OFF
				, doProcess("Tp")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public CreditorReferenceInformation2 getData() {
		return (CreditorReferenceInformation2)super.getData();
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
		if (localName.equals("Ref")) {
			getData().setRef(getValue());
			getContents().reset();
		} else if (localName.equals(getXMLElementName())) {
			handleElement();
		}
		
	}	
}
