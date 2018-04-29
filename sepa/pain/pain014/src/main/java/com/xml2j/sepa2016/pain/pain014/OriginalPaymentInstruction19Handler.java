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
 * OriginalPaymentInstruction19 handler class.
 *
 * @see OriginalPaymentInstruction19
 */
public class OriginalPaymentInstruction19Handler extends XMLFragmentHandler<OriginalPaymentInstruction19> {
	/**
	 * Proxy for OriginalPaymentInstruction19Handler.
	 */
	static class Proxy extends HandlerProxy<OriginalPaymentInstruction19> {
		/**
		 * Allocator for OriginalPaymentInstruction19Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<OriginalPaymentInstruction19> {			
			public XMLFragmentHandler<OriginalPaymentInstruction19> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new OriginalPaymentInstruction19Handler(
					task
					, reader
					, handler
					, elementName
					, OriginalPaymentInstruction19.getAllocator()
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
	
	/** Data setter class for NbOfTxsPerSts element. */
	private class NbOfTxsPerStsSetter implements DataSetter {
		/** data target. */
		private OriginalPaymentInstruction19Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public NbOfTxsPerStsSetter(OriginalPaymentInstruction19Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setNbOfTxsPerSts((NumberOfTransactionsPerStatus3) data);	
		}
	}	
	/** Data setter class for StsRsnInf element. */
	private class StsRsnInfSetter implements DataSetter {
		/** data target. */
		private OriginalPaymentInstruction19Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public StsRsnInfSetter(OriginalPaymentInstruction19Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setStsRsnInf((StatusReasonInformation9) data);	
		}
	}	
	/** Data setter class for TxInfAndSts element. */
	private class TxInfAndStsSetter implements DataSetter {
		/** data target. */
		private OriginalPaymentInstruction19Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public TxInfAndStsSetter(OriginalPaymentInstruction19Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setTxInfAndSts((PaymentTransaction69) data);	
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
	public OriginalPaymentInstruction19Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, OriginalPaymentInstruction19.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new NumberOfTransactionsPerStatus3Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of NumberOfTransactionsPerStatus3Handler
				, "NbOfTxsPerSts" // XML element name
				, doLink("NbOfTxsPerSts") // linking to parent
					? new NbOfTxsPerStsSetter(this) // ON
					: null // OFF
				, doProcess("NbOfTxsPerSts")) // processing active or not
				);
  
		registerHandler(
			new StatusReasonInformation9Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of StatusReasonInformation9Handler
				, "StsRsnInf" // XML element name
				, doLink("StsRsnInf") // linking to parent
					? new StsRsnInfSetter(this) // ON
					: null // OFF
				, doProcess("StsRsnInf")) // processing active or not
				);
  
		registerHandler(
			new PaymentTransaction69Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of PaymentTransaction69Handler
				, "TxInfAndSts" // XML element name
				, doLink("TxInfAndSts") // linking to parent
					? new TxInfAndStsSetter(this) // ON
					: null // OFF
				, doProcess("TxInfAndSts")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public OriginalPaymentInstruction19 getData() {
		return (OriginalPaymentInstruction19)super.getData();
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
		if (localName.equals("OrgnlCtrlSum")) {
			getData().setOrgnlCtrlSum(getValue());
			getContents().reset();
		} else if (localName.equals("OrgnlNbOfTxs")) {
			getData().setOrgnlNbOfTxs(getValue());
			getContents().reset();
		} else if (localName.equals("OrgnlPmtInfId")) {
			getData().setOrgnlPmtInfId(getValue());
			getContents().reset();
		} else if (localName.equals("PmtInfSts")) {
			getData().setPmtInfSts(getValue());
			getContents().reset();
		} else if (localName.equals(getXMLElementName())) {
			handleElement();
		}
		
	}	
}
