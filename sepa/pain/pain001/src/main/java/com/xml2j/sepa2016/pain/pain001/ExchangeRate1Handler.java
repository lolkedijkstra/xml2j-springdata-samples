package com.xml2j.sepa2016.pain.pain001;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: PAIN001 
  Generation date: Sun Apr 29 21:09:41 CEST 2018 
  Author: XML2J-GEN

******************************************************************************/

/* SAX 2.0 dependencies */
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/* Framework dependencies */
import com.xml2j.xml.core.DataSetter;
import com.xml2j.xml.core.XMLFragmentHandler;
import com.xml2j.xml.parser.ParserTask;


/**
 * ExchangeRate1 handler class.
 *
 * @see ExchangeRate1
 */
public class ExchangeRate1Handler extends XMLFragmentHandler<ExchangeRate1> {
	/**
	 * Proxy for ExchangeRate1Handler.
	 */
	static class Proxy extends HandlerProxy<ExchangeRate1> {
		/**
		 * Allocator for ExchangeRate1Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<ExchangeRate1> {			
			public XMLFragmentHandler<ExchangeRate1> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new ExchangeRate1Handler(
					task
					, reader
					, handler
					, elementName
					, ExchangeRate1.getAllocator()
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
	public ExchangeRate1Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, ExchangeRate1.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);
	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public ExchangeRate1 getData() {
		return (ExchangeRate1)super.getData();
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
		if (localName.equals("CtrctId")) {
			getData().setCtrctId(getValue());
			getContents().reset();
		} else if (localName.equals("RateTp")) {
			getData().setRateTp(getValue());
			getContents().reset();
		} else if (localName.equals("UnitCcy")) {
			getData().setUnitCcy(getValue());
			getContents().reset();
		} else if (localName.equals("XchgRate")) {
			getData().setXchgRate(getValue());
			getContents().reset();
		} else if (localName.equals(getXMLElementName())) {
			handleElement();
		}
		
	}	
}
