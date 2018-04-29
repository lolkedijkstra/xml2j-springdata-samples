package com.xml2j.sepa2016.pain.pain008;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: PAIN008 
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
 * PaymentTypeInformation24 handler class.
 *
 * @see PaymentTypeInformation24
 */
public class PaymentTypeInformation24Handler extends XMLFragmentHandler<PaymentTypeInformation24> {
	/**
	 * Proxy for PaymentTypeInformation24Handler.
	 */
	static class Proxy extends HandlerProxy<PaymentTypeInformation24> {
		/**
		 * Allocator for PaymentTypeInformation24Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<PaymentTypeInformation24> {			
			public XMLFragmentHandler<PaymentTypeInformation24> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new PaymentTypeInformation24Handler(
					task
					, reader
					, handler
					, elementName
					, PaymentTypeInformation24.getAllocator()
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
	
	/** Data setter class for CtgyPurp element. */
	private class CtgyPurpSetter implements DataSetter {
		/** data target. */
		private PaymentTypeInformation24Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public CtgyPurpSetter(PaymentTypeInformation24Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setCtgyPurp((CategoryPurpose1Choice) data);	
		}
	}	
	/** Data setter class for LclInstrm element. */
	private class LclInstrmSetter implements DataSetter {
		/** data target. */
		private PaymentTypeInformation24Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public LclInstrmSetter(PaymentTypeInformation24Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setLclInstrm((LocalInstrument2Choice) data);	
		}
	}	
	/** Data setter class for SvcLvl element. */
	private class SvcLvlSetter implements DataSetter {
		/** data target. */
		private PaymentTypeInformation24Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public SvcLvlSetter(PaymentTypeInformation24Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setSvcLvl((ServiceLevel8Choice) data);	
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
	public PaymentTypeInformation24Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, PaymentTypeInformation24.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new CategoryPurpose1ChoiceHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of CategoryPurpose1ChoiceHandler
				, "CtgyPurp" // XML element name
				, doLink("CtgyPurp") // linking to parent
					? new CtgyPurpSetter(this) // ON
					: null // OFF
				, doProcess("CtgyPurp")) // processing active or not
				);
  
		registerHandler(
			new LocalInstrument2ChoiceHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of LocalInstrument2ChoiceHandler
				, "LclInstrm" // XML element name
				, doLink("LclInstrm") // linking to parent
					? new LclInstrmSetter(this) // ON
					: null // OFF
				, doProcess("LclInstrm")) // processing active or not
				);
  
		registerHandler(
			new ServiceLevel8ChoiceHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of ServiceLevel8ChoiceHandler
				, "SvcLvl" // XML element name
				, doLink("SvcLvl") // linking to parent
					? new SvcLvlSetter(this) // ON
					: null // OFF
				, doProcess("SvcLvl")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public PaymentTypeInformation24 getData() {
		return (PaymentTypeInformation24)super.getData();
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
		if (localName.equals("InstrPrty")) {
			getData().setInstrPrty(getValue());
			getContents().reset();
		} else if (localName.equals("SeqTp")) {
			getData().setSeqTp(getValue());
			getContents().reset();
		} else if (localName.equals(getXMLElementName())) {
			handleElement();
		}
		
	}	
}
