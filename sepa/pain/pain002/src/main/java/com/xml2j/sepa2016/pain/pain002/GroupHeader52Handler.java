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
 * GroupHeader52 handler class.
 *
 * @see GroupHeader52
 */
public class GroupHeader52Handler extends XMLFragmentHandler<GroupHeader52> {
	/**
	 * Proxy for GroupHeader52Handler.
	 */
	static class Proxy extends HandlerProxy<GroupHeader52> {
		/**
		 * Allocator for GroupHeader52Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<GroupHeader52> {			
			public XMLFragmentHandler<GroupHeader52> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new GroupHeader52Handler(
					task
					, reader
					, handler
					, elementName
					, GroupHeader52.getAllocator()
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
	
	/** Data setter class for CdtrAgt element. */
	private class CdtrAgtSetter implements DataSetter {
		/** data target. */
		private GroupHeader52Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public CdtrAgtSetter(GroupHeader52Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setCdtrAgt((BranchAndFinancialInstitutionIdentification5) data);	
		}
	}	
	/** Data setter class for DbtrAgt element. */
	private class DbtrAgtSetter implements DataSetter {
		/** data target. */
		private GroupHeader52Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public DbtrAgtSetter(GroupHeader52Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setDbtrAgt((BranchAndFinancialInstitutionIdentification5) data);	
		}
	}	
	/** Data setter class for FwdgAgt element. */
	private class FwdgAgtSetter implements DataSetter {
		/** data target. */
		private GroupHeader52Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public FwdgAgtSetter(GroupHeader52Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setFwdgAgt((BranchAndFinancialInstitutionIdentification5) data);	
		}
	}	
	/** Data setter class for InitgPty element. */
	private class InitgPtySetter implements DataSetter {
		/** data target. */
		private GroupHeader52Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public InitgPtySetter(GroupHeader52Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setInitgPty((PartyIdentification43) data);	
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
	public GroupHeader52Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, GroupHeader52.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new BranchAndFinancialInstitutionIdentification5Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of BranchAndFinancialInstitutionIdentification5Handler
				, "CdtrAgt" // XML element name
				, doLink("CdtrAgt") // linking to parent
					? new CdtrAgtSetter(this) // ON
					: null // OFF
				, doProcess("CdtrAgt")) // processing active or not
				);
  
		registerHandler(
			new BranchAndFinancialInstitutionIdentification5Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of BranchAndFinancialInstitutionIdentification5Handler
				, "DbtrAgt" // XML element name
				, doLink("DbtrAgt") // linking to parent
					? new DbtrAgtSetter(this) // ON
					: null // OFF
				, doProcess("DbtrAgt")) // processing active or not
				);
  
		registerHandler(
			new BranchAndFinancialInstitutionIdentification5Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of BranchAndFinancialInstitutionIdentification5Handler
				, "FwdgAgt" // XML element name
				, doLink("FwdgAgt") // linking to parent
					? new FwdgAgtSetter(this) // ON
					: null // OFF
				, doProcess("FwdgAgt")) // processing active or not
				);
  
		registerHandler(
			new PartyIdentification43Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of PartyIdentification43Handler
				, "InitgPty" // XML element name
				, doLink("InitgPty") // linking to parent
					? new InitgPtySetter(this) // ON
					: null // OFF
				, doProcess("InitgPty")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public GroupHeader52 getData() {
		return (GroupHeader52)super.getData();
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
		if (localName.equals("CreDtTm")) {
			getData().setCreDtTm(getValue());
			getContents().reset();
		} else if (localName.equals("MsgId")) {
			getData().setMsgId(getValue());
			getContents().reset();
		} else if (localName.equals(getXMLElementName())) {
			handleElement();
		}
		
	}	
}
