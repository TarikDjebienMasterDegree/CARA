
/**
 * UserWebServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.webservices;



/*
 *  UserWebServiceStub java implementation
 */


public class UserWebServiceStub extends org.apache.axis2.client.Stub
{
	protected org.apache.axis2.description.AxisOperation[] _operations;

	//hashmaps to keep the fault mapping
	private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
	private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
	private java.util.HashMap faultMessageMap = new java.util.HashMap();

	private static int counter = 0;

	private static synchronized java.lang.String getUniqueSuffix(){
		// reset the counter if it is greater than 99999
		if (counter > 99999){
			counter = 0;
		}
		counter = counter + 1; 
		return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
	}


	private void populateAxisService() throws org.apache.axis2.AxisFault {

		//creating the Service with a unique name
		_service = new org.apache.axis2.description.AxisService("UserWebService" + getUniqueSuffix());
		addAnonymousOperations();

		//creating the operations
		org.apache.axis2.description.AxisOperation __operation;

		_operations = new org.apache.axis2.description.AxisOperation[5];

		__operation = new org.apache.axis2.description.OutInAxisOperation();


		__operation.setName(new javax.xml.namespace.QName("http://webservices.com", "giveBackBook"));
		_service.addOperation(__operation);




		_operations[0]=__operation;


		__operation = new org.apache.axis2.description.OutInAxisOperation();


		__operation.setName(new javax.xml.namespace.QName("http://webservices.com", "getBookDescription"));
		_service.addOperation(__operation);




		_operations[1]=__operation;


		__operation = new org.apache.axis2.description.OutInAxisOperation();


		__operation.setName(new javax.xml.namespace.QName("http://webservices.com", "getBooks"));
		_service.addOperation(__operation);




		_operations[2]=__operation;


		__operation = new org.apache.axis2.description.OutInAxisOperation();


		__operation.setName(new javax.xml.namespace.QName("http://webservices.com", "bookBorrowedBook"));
		_service.addOperation(__operation);




		_operations[3]=__operation;


		__operation = new org.apache.axis2.description.OutInAxisOperation();


		__operation.setName(new javax.xml.namespace.QName("http://webservices.com", "borrowBook"));
		_service.addOperation(__operation);




		_operations[4]=__operation;


	}

	//populates the faults
	private void populateFaults(){



	}

	/**
	 *Constructor that takes in a configContext
	 */

	public UserWebServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
			java.lang.String targetEndpoint)
					throws org.apache.axis2.AxisFault {
		this(configurationContext,targetEndpoint,false);
	}


	/**
	 * Constructor that takes in a configContext  and useseperate listner
	 */
	public UserWebServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
			java.lang.String targetEndpoint, boolean useSeparateListener)
					throws org.apache.axis2.AxisFault {
		//To populate AxisService
		populateAxisService();
		populateFaults();

		_serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);


		_serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
				targetEndpoint));
		_serviceClient.getOptions().setUseSeparateListener(useSeparateListener);


	}

	/**
	 * Default Constructor
	 */
	public UserWebServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {

		this(configurationContext,"http://localhost:8080/Axis2WebServices/services/UserWebService.UserWebServiceHttpEndpoint/" );

	}

	/**
	 * Default Constructor
	 */
	public UserWebServiceStub() throws org.apache.axis2.AxisFault {

		this("http://localhost:8080/Axis2WebServices/services/UserWebService.UserWebServiceHttpEndpoint/" );

	}

	/**
	 * Constructor taking the target endpoint
	 */
	public UserWebServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
		this(null,targetEndpoint);
	}




	/**
	 * Auto generated method signature
	 * 
	 * @see com.webservices.UserWebService#giveBackBook
	 * @param giveBackBook0

	 */



	public  com.webservices.UserWebServiceStub.GiveBackBookResponse giveBackBook(

			com.webservices.UserWebServiceStub.GiveBackBook giveBackBook0)


					throws java.rmi.RemoteException

					{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try{
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
			_operationClient.getOptions().setAction("\"\"");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



			addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");

			addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_LOCATION,"giveBackBook");

			addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.ENABLE_REST,true);

			addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.HTTP_METHOD,"POST");

			addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.CONTENT_TYPE,"application/xml");

			addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.MESSAGE_TYPE,"application/xml");


			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();



			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;


			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
					giveBackBook0,
					optimizeContent(new javax.xml.namespace.QName("http://webservices.com",
							"giveBackBook")), new javax.xml.namespace.QName("http://webservices.com",
									"giveBackBook"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);


			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
					org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement() ,
					com.webservices.UserWebServiceStub.GiveBackBookResponse.class,
					getEnvelopeNamespaces(_returnEnv));


			return (com.webservices.UserWebServiceStub.GiveBackBookResponse)object;

		}catch(org.apache.axis2.AxisFault f){

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt!=null){
				if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"giveBackBook"))){
					//make the fault by reflection
					try{
						java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"giveBackBook"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						//message class
						java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"giveBackBook"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[]{messageClass});
						m.invoke(ex,new java.lang.Object[]{messageObject});


						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					}catch(java.lang.ClassCastException e){
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}  catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}   catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				}else{
					throw f;
				}
			}else{
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
					}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see com.webservices.UserWebService#startgiveBackBook
	 * @param giveBackBook0

	 */
	public  void startgiveBackBook(

			com.webservices.UserWebServiceStub.GiveBackBook giveBackBook0,

			final com.webservices.UserWebServiceCallbackHandler callback)

					throws java.rmi.RemoteException{

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
		_operationClient.getOptions().setAction("\"\"");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



		addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");

		addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_LOCATION,"giveBackBook");

		addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.ENABLE_REST,true);

		addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.HTTP_METHOD,"POST");

		addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.CONTENT_TYPE,"application/xml");

		addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.MESSAGE_TYPE,"application/xml");



		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env=null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


		//Style is Doc.


		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
				giveBackBook0,
				optimizeContent(new javax.xml.namespace.QName("http://webservices.com",
						"giveBackBook")), new javax.xml.namespace.QName("http://webservices.com",
								"giveBackBook"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);



		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							com.webservices.UserWebServiceStub.GiveBackBookResponse.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultgiveBackBook(
							(com.webservices.UserWebServiceStub.GiveBackBookResponse)object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorgiveBackBook(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt!=null){
						if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"giveBackBook"))){
							//make the fault by reflection
							try{
								java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"giveBackBook"));
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
								java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
								//message class
								java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"giveBackBook"));
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[]{messageClass});
								m.invoke(ex,new java.lang.Object[]{messageObject});


								callback.receiveErrorgiveBackBook(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch(java.lang.ClassCastException e){
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgiveBackBook(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgiveBackBook(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgiveBackBook(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgiveBackBook(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgiveBackBook(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgiveBackBook(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgiveBackBook(f);
							}
						} else {
							callback.receiveErrorgiveBackBook(f);
						}
					} else {
						callback.receiveErrorgiveBackBook(f);
					}
				} else {
					callback.receiveErrorgiveBackBook(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorgiveBackBook(axisFault);
				}
			}
		});


		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if ( _operations[0].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[0].setMessageReceiver(
					_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see com.webservices.UserWebService#getBookDescription
	 * @param getBookDescription2

	 */



	public  com.webservices.UserWebServiceStub.GetBookDescriptionResponse getBookDescription(

			com.webservices.UserWebServiceStub.GetBookDescription getBookDescription2)


					throws java.rmi.RemoteException

					{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try{
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
			_operationClient.getOptions().setAction("\"\"");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



			addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");

			addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_LOCATION,"getBookDescription");

			addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.ENABLE_REST,true);

			addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.HTTP_METHOD,"POST");

			addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.CONTENT_TYPE,"application/xml");

			addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.MESSAGE_TYPE,"application/xml");


			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();



			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;


			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
					getBookDescription2,
					optimizeContent(new javax.xml.namespace.QName("http://webservices.com",
							"getBookDescription")), new javax.xml.namespace.QName("http://webservices.com",
									"getBookDescription"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);


			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
					org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement() ,
					com.webservices.UserWebServiceStub.GetBookDescriptionResponse.class,
					getEnvelopeNamespaces(_returnEnv));


			return (com.webservices.UserWebServiceStub.GetBookDescriptionResponse)object;

		}catch(org.apache.axis2.AxisFault f){

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt!=null){
				if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getBookDescription"))){
					//make the fault by reflection
					try{
						java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getBookDescription"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						//message class
						java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getBookDescription"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[]{messageClass});
						m.invoke(ex,new java.lang.Object[]{messageObject});


						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					}catch(java.lang.ClassCastException e){
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}  catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}   catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				}else{
					throw f;
				}
			}else{
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
					}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see com.webservices.UserWebService#startgetBookDescription
	 * @param getBookDescription2

	 */
	public  void startgetBookDescription(

			com.webservices.UserWebServiceStub.GetBookDescription getBookDescription2,

			final com.webservices.UserWebServiceCallbackHandler callback)

					throws java.rmi.RemoteException{

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
		_operationClient.getOptions().setAction("\"\"");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



		addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");

		addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_LOCATION,"getBookDescription");

		addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.ENABLE_REST,true);

		addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.HTTP_METHOD,"POST");

		addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.CONTENT_TYPE,"application/xml");

		addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.MESSAGE_TYPE,"application/xml");



		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env=null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


		//Style is Doc.


		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
				getBookDescription2,
				optimizeContent(new javax.xml.namespace.QName("http://webservices.com",
						"getBookDescription")), new javax.xml.namespace.QName("http://webservices.com",
								"getBookDescription"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);



		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							com.webservices.UserWebServiceStub.GetBookDescriptionResponse.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultgetBookDescription(
							(com.webservices.UserWebServiceStub.GetBookDescriptionResponse)object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorgetBookDescription(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt!=null){
						if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getBookDescription"))){
							//make the fault by reflection
							try{
								java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getBookDescription"));
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
								java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
								//message class
								java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getBookDescription"));
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[]{messageClass});
								m.invoke(ex,new java.lang.Object[]{messageObject});


								callback.receiveErrorgetBookDescription(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch(java.lang.ClassCastException e){
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetBookDescription(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetBookDescription(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetBookDescription(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetBookDescription(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetBookDescription(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetBookDescription(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetBookDescription(f);
							}
						} else {
							callback.receiveErrorgetBookDescription(f);
						}
					} else {
						callback.receiveErrorgetBookDescription(f);
					}
				} else {
					callback.receiveErrorgetBookDescription(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorgetBookDescription(axisFault);
				}
			}
		});


		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if ( _operations[1].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[1].setMessageReceiver(
					_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see com.webservices.UserWebService#getBooks
	 * @param getBooks4

	 */



	public  com.webservices.UserWebServiceStub.GetBooksResponse getBooks(

			com.webservices.UserWebServiceStub.GetBooks getBooks4)


					throws java.rmi.RemoteException

					{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try{
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
			_operationClient.getOptions().setAction("\"\"");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



			addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");

			addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_LOCATION,"getBooks");

			addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.ENABLE_REST,true);

			addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.HTTP_METHOD,"POST");

			addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.CONTENT_TYPE,"application/xml");

			addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.MESSAGE_TYPE,"application/xml");


			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();



			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;


			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
					getBooks4,
					optimizeContent(new javax.xml.namespace.QName("http://webservices.com",
							"getBooks")), new javax.xml.namespace.QName("http://webservices.com",
									"getBooks"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);


			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
					org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement() ,
					com.webservices.UserWebServiceStub.GetBooksResponse.class,
					getEnvelopeNamespaces(_returnEnv));


			return (com.webservices.UserWebServiceStub.GetBooksResponse)object;

		}catch(org.apache.axis2.AxisFault f){

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt!=null){
				if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getBooks"))){
					//make the fault by reflection
					try{
						java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getBooks"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						//message class
						java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getBooks"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[]{messageClass});
						m.invoke(ex,new java.lang.Object[]{messageObject});


						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					}catch(java.lang.ClassCastException e){
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}  catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}   catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				}else{
					throw f;
				}
			}else{
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
					}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see com.webservices.UserWebService#startgetBooks
	 * @param getBooks4

	 */
	public  void startgetBooks(

			com.webservices.UserWebServiceStub.GetBooks getBooks4,

			final com.webservices.UserWebServiceCallbackHandler callback)

					throws java.rmi.RemoteException{

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
		_operationClient.getOptions().setAction("\"\"");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



		addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");

		addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_LOCATION,"getBooks");

		addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.ENABLE_REST,true);

		addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.HTTP_METHOD,"POST");

		addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.CONTENT_TYPE,"application/xml");

		addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.MESSAGE_TYPE,"application/xml");



		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env=null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


		//Style is Doc.


		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
				getBooks4,
				optimizeContent(new javax.xml.namespace.QName("http://webservices.com",
						"getBooks")), new javax.xml.namespace.QName("http://webservices.com",
								"getBooks"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);



		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							com.webservices.UserWebServiceStub.GetBooksResponse.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultgetBooks(
							(com.webservices.UserWebServiceStub.GetBooksResponse)object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorgetBooks(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt!=null){
						if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getBooks"))){
							//make the fault by reflection
							try{
								java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getBooks"));
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
								java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
								//message class
								java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getBooks"));
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[]{messageClass});
								m.invoke(ex,new java.lang.Object[]{messageObject});


								callback.receiveErrorgetBooks(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch(java.lang.ClassCastException e){
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetBooks(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetBooks(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetBooks(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetBooks(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetBooks(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetBooks(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetBooks(f);
							}
						} else {
							callback.receiveErrorgetBooks(f);
						}
					} else {
						callback.receiveErrorgetBooks(f);
					}
				} else {
					callback.receiveErrorgetBooks(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorgetBooks(axisFault);
				}
			}
		});


		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if ( _operations[2].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[2].setMessageReceiver(
					_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see com.webservices.UserWebService#bookBorrowedBook
	 * @param bookBorrowedBook6

	 */



	public  com.webservices.UserWebServiceStub.BookBorrowedBookResponse bookBorrowedBook(

			com.webservices.UserWebServiceStub.BookBorrowedBook bookBorrowedBook6)


					throws java.rmi.RemoteException

					{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try{
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
			_operationClient.getOptions().setAction("\"\"");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



			addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");

			addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_LOCATION,"bookBorrowedBook");

			addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.ENABLE_REST,true);

			addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.HTTP_METHOD,"POST");

			addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.CONTENT_TYPE,"application/xml");

			addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.MESSAGE_TYPE,"application/xml");


			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();



			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;


			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
					bookBorrowedBook6,
					optimizeContent(new javax.xml.namespace.QName("http://webservices.com",
							"bookBorrowedBook")), new javax.xml.namespace.QName("http://webservices.com",
									"bookBorrowedBook"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);


			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
					org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement() ,
					com.webservices.UserWebServiceStub.BookBorrowedBookResponse.class,
					getEnvelopeNamespaces(_returnEnv));


			return (com.webservices.UserWebServiceStub.BookBorrowedBookResponse)object;

		}catch(org.apache.axis2.AxisFault f){

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt!=null){
				if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"bookBorrowedBook"))){
					//make the fault by reflection
					try{
						java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"bookBorrowedBook"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						//message class
						java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"bookBorrowedBook"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[]{messageClass});
						m.invoke(ex,new java.lang.Object[]{messageObject});


						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					}catch(java.lang.ClassCastException e){
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}  catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}   catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				}else{
					throw f;
				}
			}else{
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
					}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see com.webservices.UserWebService#startbookBorrowedBook
	 * @param bookBorrowedBook6

	 */
	public  void startbookBorrowedBook(

			com.webservices.UserWebServiceStub.BookBorrowedBook bookBorrowedBook6,

			final com.webservices.UserWebServiceCallbackHandler callback)

					throws java.rmi.RemoteException{

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
		_operationClient.getOptions().setAction("\"\"");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



		addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");

		addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_LOCATION,"bookBorrowedBook");

		addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.ENABLE_REST,true);

		addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.HTTP_METHOD,"POST");

		addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.CONTENT_TYPE,"application/xml");

		addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.MESSAGE_TYPE,"application/xml");



		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env=null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


		//Style is Doc.


		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
				bookBorrowedBook6,
				optimizeContent(new javax.xml.namespace.QName("http://webservices.com",
						"bookBorrowedBook")), new javax.xml.namespace.QName("http://webservices.com",
								"bookBorrowedBook"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);



		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							com.webservices.UserWebServiceStub.BookBorrowedBookResponse.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultbookBorrowedBook(
							(com.webservices.UserWebServiceStub.BookBorrowedBookResponse)object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorbookBorrowedBook(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt!=null){
						if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"bookBorrowedBook"))){
							//make the fault by reflection
							try{
								java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"bookBorrowedBook"));
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
								java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
								//message class
								java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"bookBorrowedBook"));
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[]{messageClass});
								m.invoke(ex,new java.lang.Object[]{messageObject});


								callback.receiveErrorbookBorrowedBook(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch(java.lang.ClassCastException e){
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorbookBorrowedBook(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorbookBorrowedBook(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorbookBorrowedBook(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorbookBorrowedBook(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorbookBorrowedBook(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorbookBorrowedBook(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorbookBorrowedBook(f);
							}
						} else {
							callback.receiveErrorbookBorrowedBook(f);
						}
					} else {
						callback.receiveErrorbookBorrowedBook(f);
					}
				} else {
					callback.receiveErrorbookBorrowedBook(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorbookBorrowedBook(axisFault);
				}
			}
		});


		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if ( _operations[3].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[3].setMessageReceiver(
					_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see com.webservices.UserWebService#borrowBook
	 * @param borrowBook8

	 */



	public  com.webservices.UserWebServiceStub.BorrowBookResponse borrowBook(

			com.webservices.UserWebServiceStub.BorrowBook borrowBook8)


					throws java.rmi.RemoteException

					{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try{
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
			_operationClient.getOptions().setAction("\"\"");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



			addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");

			addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_LOCATION,"borrowBook");

			addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.ENABLE_REST,true);

			addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.HTTP_METHOD,"POST");

			addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.CONTENT_TYPE,"application/xml");

			addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.MESSAGE_TYPE,"application/xml");


			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();



			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;


			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
					borrowBook8,
					optimizeContent(new javax.xml.namespace.QName("http://webservices.com",
							"borrowBook")), new javax.xml.namespace.QName("http://webservices.com",
									"borrowBook"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);


			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
					org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement() ,
					com.webservices.UserWebServiceStub.BorrowBookResponse.class,
					getEnvelopeNamespaces(_returnEnv));


			return (com.webservices.UserWebServiceStub.BorrowBookResponse)object;

		}catch(org.apache.axis2.AxisFault f){

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt!=null){
				if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrowBook"))){
					//make the fault by reflection
					try{
						java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrowBook"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
						//message class
						java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrowBook"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[]{messageClass});
						m.invoke(ex,new java.lang.Object[]{messageObject});


						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					}catch(java.lang.ClassCastException e){
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}  catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}   catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				}else{
					throw f;
				}
			}else{
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
					}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see com.webservices.UserWebService#startborrowBook
	 * @param borrowBook8

	 */
	public  void startborrowBook(

			com.webservices.UserWebServiceStub.BorrowBook borrowBook8,

			final com.webservices.UserWebServiceCallbackHandler callback)

					throws java.rmi.RemoteException{

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
		_operationClient.getOptions().setAction("\"\"");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



		addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");

		addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_LOCATION,"borrowBook");

		addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.ENABLE_REST,true);

		addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.HTTP_METHOD,"POST");

		addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.CONTENT_TYPE,"application/xml");

		addPropertyToOperationClient(_operationClient,org.apache.axis2.Constants.Configuration.MESSAGE_TYPE,"application/xml");



		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env=null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


		//Style is Doc.


		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
				borrowBook8,
				optimizeContent(new javax.xml.namespace.QName("http://webservices.com",
						"borrowBook")), new javax.xml.namespace.QName("http://webservices.com",
								"borrowBook"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);



		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
							com.webservices.UserWebServiceStub.BorrowBookResponse.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultborrowBook(
							(com.webservices.UserWebServiceStub.BorrowBookResponse)object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorborrowBook(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt!=null){
						if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrowBook"))){
							//make the fault by reflection
							try{
								java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrowBook"));
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
								java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
								//message class
								java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrowBook"));
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[]{messageClass});
								m.invoke(ex,new java.lang.Object[]{messageObject});


								callback.receiveErrorborrowBook(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch(java.lang.ClassCastException e){
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorborrowBook(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorborrowBook(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorborrowBook(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorborrowBook(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorborrowBook(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorborrowBook(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorborrowBook(f);
							}
						} else {
							callback.receiveErrorborrowBook(f);
						}
					} else {
						callback.receiveErrorborrowBook(f);
					}
				} else {
					callback.receiveErrorborrowBook(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorborrowBook(axisFault);
				}
			}
		});


		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if ( _operations[4].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[4].setMessageReceiver(
					_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);

	}



	/**
	 *  A utility method that copies the namepaces from the SOAPEnvelope
	 */
	private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
		java.util.Map returnMap = new java.util.HashMap();
		java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
		while (namespaceIterator.hasNext()) {
			org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
			returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
		}
		return returnMap;
	}



	private javax.xml.namespace.QName[] opNameArray = null;
	private boolean optimizeContent(javax.xml.namespace.QName opName) {


		if (opNameArray == null) {
			return false;
		}
		for (int i = 0; i < opNameArray.length; i++) {
			if (opName.equals(opNameArray[i])) {
				return true;   
			}
		}
		return false;
	}
	//http://localhost:8080/Axis2WebServices/services/UserWebService.UserWebServiceHttpEndpoint/
	public static class BorrowBookResponse
	implements org.apache.axis2.databinding.ADBBean{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://webservices.com",
				"borrowBookResponse",
				"ns2");



		/**
		 * field for _return
		 */


		protected Book local_return ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean local_returnTracker = false ;

		public boolean is_returnSpecified(){
			return local_returnTracker;
		}



		/**
		 * Auto generated getter method
		 * @return Book
		 */
		public  Book get_return(){
			return local_return;
		}



		/**
		 * Auto generated setter method
		 * @param param _return
		 */
		public void set_return(Book param){
			local_returnTracker = true;

			this.local_return=param;


		}




		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
			return factory.createOMElement(dataSource,MY_QNAME);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.com");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":borrowBookResponse",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"borrowBookResponse",
							xmlWriter);
				}


			}
			if (local_returnTracker){
				if (local_return==null){

					writeStartElement(null, "http://webservices.com", "return", xmlWriter);

					// write the nil attribute
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
					xmlWriter.writeEndElement();
				}else{
					local_return.serialize(new javax.xml.namespace.QName("http://webservices.com","return"),
							xmlWriter);
				}
			}
			xmlWriter.writeEndElement();


		}

		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://webservices.com")){
				return "ns2";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace,attName,attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName,attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					java.lang.String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (local_returnTracker){
				elementList.add(new javax.xml.namespace.QName("http://webservices.com",
						"return"));


				elementList.add(local_return==null?null:
					local_return);
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static BorrowBookResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				BorrowBookResponse object =
						new BorrowBookResponse();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"borrowBookResponse".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (BorrowBookResponse)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.com","return").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)){
							object.set_return(null);
							reader.next();

							reader.next();

						}else{

							object.set_return(Book.Factory.parse(reader));

							reader.next();
						}
					}  // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class BookBorrowedBookResponse
	implements org.apache.axis2.databinding.ADBBean{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://webservices.com",
				"bookBorrowedBookResponse",
				"ns2");



		/**
		 * field for _return
		 */


		protected Book local_return ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean local_returnTracker = false ;

		public boolean is_returnSpecified(){
			return local_returnTracker;
		}



		/**
		 * Auto generated getter method
		 * @return Book
		 */
		public  Book get_return(){
			return local_return;
		}



		/**
		 * Auto generated setter method
		 * @param param _return
		 */
		public void set_return(Book param){
			local_returnTracker = true;

			this.local_return=param;


		}




		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
			return factory.createOMElement(dataSource,MY_QNAME);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.com");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":bookBorrowedBookResponse",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"bookBorrowedBookResponse",
							xmlWriter);
				}


			}
			if (local_returnTracker){
				if (local_return==null){

					writeStartElement(null, "http://webservices.com", "return", xmlWriter);

					// write the nil attribute
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
					xmlWriter.writeEndElement();
				}else{
					local_return.serialize(new javax.xml.namespace.QName("http://webservices.com","return"),
							xmlWriter);
				}
			}
			xmlWriter.writeEndElement();


		}

		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://webservices.com")){
				return "ns2";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace,attName,attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName,attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					java.lang.String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (local_returnTracker){
				elementList.add(new javax.xml.namespace.QName("http://webservices.com",
						"return"));


				elementList.add(local_return==null?null:
					local_return);
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static BookBorrowedBookResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				BookBorrowedBookResponse object =
						new BookBorrowedBookResponse();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"bookBorrowedBookResponse".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (BookBorrowedBookResponse)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.com","return").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)){
							object.set_return(null);
							reader.next();

							reader.next();

						}else{

							object.set_return(Book.Factory.parse(reader));

							reader.next();
						}
					}  // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class BookBorrowedBook
	implements org.apache.axis2.databinding.ADBBean{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://webservices.com",
				"bookBorrowedBook",
				"ns2");



		/**
		 * field for Isbn
		 */


		protected long localIsbn ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localIsbnTracker = false ;

		public boolean isIsbnSpecified(){
			return localIsbnTracker;
		}



		/**
		 * Auto generated getter method
		 * @return long
		 */
		public  long getIsbn(){
			return localIsbn;
		}



		/**
		 * Auto generated setter method
		 * @param param Isbn
		 */
		public void setIsbn(long param){

			// setting primitive attribute tracker to true
			localIsbnTracker =
					param != java.lang.Long.MIN_VALUE;

			this.localIsbn=param;


		}


		/**
		 * field for Booker
		 */


		protected java.lang.String localBooker ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localBookerTracker = false ;

		public boolean isBookerSpecified(){
			return localBookerTracker;
		}



		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getBooker(){
			return localBooker;
		}



		/**
		 * Auto generated setter method
		 * @param param Booker
		 */
		public void setBooker(java.lang.String param){
			localBookerTracker = true;

			this.localBooker=param;


		}




		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
			return factory.createOMElement(dataSource,MY_QNAME);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.com");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":bookBorrowedBook",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"bookBorrowedBook",
							xmlWriter);
				}


			}
			if (localIsbnTracker){
				namespace = "http://webservices.com";
				writeStartElement(null, namespace, "isbn", xmlWriter);

				if (localIsbn==java.lang.Long.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("isbn cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsbn));
				}

				xmlWriter.writeEndElement();
			} if (localBookerTracker){
				namespace = "http://webservices.com";
				writeStartElement(null, namespace, "booker", xmlWriter);


				if (localBooker==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localBooker);

				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();


		}

		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://webservices.com")){
				return "ns2";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace,attName,attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName,attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					java.lang.String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localIsbnTracker){
				elementList.add(new javax.xml.namespace.QName("http://webservices.com",
						"isbn"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsbn));
			} if (localBookerTracker){
				elementList.add(new javax.xml.namespace.QName("http://webservices.com",
						"booker"));

				elementList.add(localBooker==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBooker));
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static BookBorrowedBook parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				BookBorrowedBook object =
						new BookBorrowedBook();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"bookBorrowedBook".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (BookBorrowedBook)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.com","isbn").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)){
							throw new org.apache.axis2.databinding.ADBException("The element: "+"isbn" +"  cannot be null");
						}


						java.lang.String content = reader.getElementText();

						object.setIsbn(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setIsbn(java.lang.Long.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.com","booker").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){


							java.lang.String content = reader.getElementText();

							object.setBooker(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class GiveBackBook
	implements org.apache.axis2.databinding.ADBBean{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://webservices.com",
				"giveBackBook",
				"ns2");



		/**
		 * field for Isbn
		 */


		protected long localIsbn ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localIsbnTracker = false ;

		public boolean isIsbnSpecified(){
			return localIsbnTracker;
		}



		/**
		 * Auto generated getter method
		 * @return long
		 */
		public  long getIsbn(){
			return localIsbn;
		}



		/**
		 * Auto generated setter method
		 * @param param Isbn
		 */
		public void setIsbn(long param){

			// setting primitive attribute tracker to true
			localIsbnTracker =
					param != java.lang.Long.MIN_VALUE;

			this.localIsbn=param;


		}




		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
			return factory.createOMElement(dataSource,MY_QNAME);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.com");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":giveBackBook",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"giveBackBook",
							xmlWriter);
				}


			}
			if (localIsbnTracker){
				namespace = "http://webservices.com";
				writeStartElement(null, namespace, "isbn", xmlWriter);

				if (localIsbn==java.lang.Long.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("isbn cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsbn));
				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();


		}

		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://webservices.com")){
				return "ns2";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace,attName,attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName,attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					java.lang.String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localIsbnTracker){
				elementList.add(new javax.xml.namespace.QName("http://webservices.com",
						"isbn"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsbn));
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GiveBackBook parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				GiveBackBook object =
						new GiveBackBook();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"giveBackBook".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (GiveBackBook)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.com","isbn").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)){
							throw new org.apache.axis2.databinding.ADBException("The element: "+"isbn" +"  cannot be null");
						}


						java.lang.String content = reader.getElementText();

						object.setIsbn(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setIsbn(java.lang.Long.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class GetBookDescriptionResponse
	implements org.apache.axis2.databinding.ADBBean{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://webservices.com",
				"getBookDescriptionResponse",
				"ns2");



		/**
		 * field for _return
		 */


		protected java.lang.String local_return ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean local_returnTracker = false ;

		public boolean is_returnSpecified(){
			return local_returnTracker;
		}



		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String get_return(){
			return local_return;
		}



		/**
		 * Auto generated setter method
		 * @param param _return
		 */
		public void set_return(java.lang.String param){
			local_returnTracker = true;

			this.local_return=param;


		}




		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
			return factory.createOMElement(dataSource,MY_QNAME);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.com");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":getBookDescriptionResponse",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"getBookDescriptionResponse",
							xmlWriter);
				}


			}
			if (local_returnTracker){
				namespace = "http://webservices.com";
				writeStartElement(null, namespace, "return", xmlWriter);


				if (local_return==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(local_return);

				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();


		}

		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://webservices.com")){
				return "ns2";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace,attName,attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName,attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					java.lang.String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (local_returnTracker){
				elementList.add(new javax.xml.namespace.QName("http://webservices.com",
						"return"));

				elementList.add(local_return==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(local_return));
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GetBookDescriptionResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				GetBookDescriptionResponse object =
						new GetBookDescriptionResponse();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"getBookDescriptionResponse".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (GetBookDescriptionResponse)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.com","return").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){


							java.lang.String content = reader.getElementText();

							object.set_return(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class ExtensionMapper{

		public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
				java.lang.String typeName,
				javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{


			if (
					"http://dto.webservices.com/xsd".equals(namespaceURI) &&
					"Book".equals(typeName)){

				return  Book.Factory.parse(reader);


			}


			throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
		}

	}

	public static class GetBookDescription
	implements org.apache.axis2.databinding.ADBBean{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://webservices.com",
				"getBookDescription",
				"ns2");



		/**
		 * field for Isbn
		 */


		protected long localIsbn ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localIsbnTracker = false ;

		public boolean isIsbnSpecified(){
			return localIsbnTracker;
		}



		/**
		 * Auto generated getter method
		 * @return long
		 */
		public  long getIsbn(){
			return localIsbn;
		}



		/**
		 * Auto generated setter method
		 * @param param Isbn
		 */
		public void setIsbn(long param){

			// setting primitive attribute tracker to true
			localIsbnTracker =
					param != java.lang.Long.MIN_VALUE;

			this.localIsbn=param;


		}




		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
			return factory.createOMElement(dataSource,MY_QNAME);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.com");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":getBookDescription",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"getBookDescription",
							xmlWriter);
				}


			}
			if (localIsbnTracker){
				namespace = "http://webservices.com";
				writeStartElement(null, namespace, "isbn", xmlWriter);

				if (localIsbn==java.lang.Long.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("isbn cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsbn));
				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();


		}

		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://webservices.com")){
				return "ns2";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace,attName,attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName,attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					java.lang.String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localIsbnTracker){
				elementList.add(new javax.xml.namespace.QName("http://webservices.com",
						"isbn"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsbn));
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GetBookDescription parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				GetBookDescription object =
						new GetBookDescription();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"getBookDescription".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (GetBookDescription)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.com","isbn").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)){
							throw new org.apache.axis2.databinding.ADBException("The element: "+"isbn" +"  cannot be null");
						}


						java.lang.String content = reader.getElementText();

						object.setIsbn(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setIsbn(java.lang.Long.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class BorrowBook
	implements org.apache.axis2.databinding.ADBBean{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://webservices.com",
				"borrowBook",
				"ns2");



		/**
		 * field for Isbn
		 */


		protected long localIsbn ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localIsbnTracker = false ;

		public boolean isIsbnSpecified(){
			return localIsbnTracker;
		}



		/**
		 * Auto generated getter method
		 * @return long
		 */
		public  long getIsbn(){
			return localIsbn;
		}



		/**
		 * Auto generated setter method
		 * @param param Isbn
		 */
		public void setIsbn(long param){

			// setting primitive attribute tracker to true
			localIsbnTracker =
					param != java.lang.Long.MIN_VALUE;

			this.localIsbn=param;


		}


		/**
		 * field for Borrower
		 */


		protected java.lang.String localBorrower ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localBorrowerTracker = false ;

		public boolean isBorrowerSpecified(){
			return localBorrowerTracker;
		}



		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getBorrower(){
			return localBorrower;
		}



		/**
		 * Auto generated setter method
		 * @param param Borrower
		 */
		public void setBorrower(java.lang.String param){
			localBorrowerTracker = true;

			this.localBorrower=param;


		}




		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
			return factory.createOMElement(dataSource,MY_QNAME);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.com");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":borrowBook",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"borrowBook",
							xmlWriter);
				}


			}
			if (localIsbnTracker){
				namespace = "http://webservices.com";
				writeStartElement(null, namespace, "isbn", xmlWriter);

				if (localIsbn==java.lang.Long.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("isbn cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsbn));
				}

				xmlWriter.writeEndElement();
			} if (localBorrowerTracker){
				namespace = "http://webservices.com";
				writeStartElement(null, namespace, "borrower", xmlWriter);


				if (localBorrower==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localBorrower);

				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();


		}

		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://webservices.com")){
				return "ns2";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace,attName,attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName,attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					java.lang.String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localIsbnTracker){
				elementList.add(new javax.xml.namespace.QName("http://webservices.com",
						"isbn"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsbn));
			} if (localBorrowerTracker){
				elementList.add(new javax.xml.namespace.QName("http://webservices.com",
						"borrower"));

				elementList.add(localBorrower==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBorrower));
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static BorrowBook parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				BorrowBook object =
						new BorrowBook();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"borrowBook".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (BorrowBook)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.com","isbn").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)){
							throw new org.apache.axis2.databinding.ADBException("The element: "+"isbn" +"  cannot be null");
						}


						java.lang.String content = reader.getElementText();

						object.setIsbn(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setIsbn(java.lang.Long.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.com","borrower").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){


							java.lang.String content = reader.getElementText();

							object.setBorrower(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class Book
	implements org.apache.axis2.databinding.ADBBean{
		/* This type was generated from the piece of schema that had
                name = Book
                Namespace URI = http://dto.webservices.com/xsd
                Namespace Prefix = ns1
		 */


		/**
		 * field for Author
		 */


		protected java.lang.String localAuthor ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localAuthorTracker = false ;

		public boolean isAuthorSpecified(){
			return localAuthorTracker;
		}



		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getAuthor(){
			return localAuthor;
		}



		/**
		 * Auto generated setter method
		 * @param param Author
		 */
		public void setAuthor(java.lang.String param){
			localAuthorTracker = true;

			this.localAuthor=param;


		}


		/**
		 * field for Booker
		 */


		protected java.lang.String localBooker ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localBookerTracker = false ;

		public boolean isBookerSpecified(){
			return localBookerTracker;
		}



		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getBooker(){
			return localBooker;
		}



		/**
		 * Auto generated setter method
		 * @param param Booker
		 */
		public void setBooker(java.lang.String param){
			localBookerTracker = true;

			this.localBooker=param;


		}


		/**
		 * field for Borrower
		 */


		protected java.lang.String localBorrower ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localBorrowerTracker = false ;

		public boolean isBorrowerSpecified(){
			return localBorrowerTracker;
		}



		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getBorrower(){
			return localBorrower;
		}



		/**
		 * Auto generated setter method
		 * @param param Borrower
		 */
		public void setBorrower(java.lang.String param){
			localBorrowerTracker = true;

			this.localBorrower=param;


		}


		/**
		 * field for Editor
		 */


		protected java.lang.String localEditor ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localEditorTracker = false ;

		public boolean isEditorSpecified(){
			return localEditorTracker;
		}



		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getEditor(){
			return localEditor;
		}



		/**
		 * Auto generated setter method
		 * @param param Editor
		 */
		public void setEditor(java.lang.String param){
			localEditorTracker = true;

			this.localEditor=param;


		}


		/**
		 * field for EndDate
		 */


		protected java.util.Date localEndDate ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localEndDateTracker = false ;

		public boolean isEndDateSpecified(){
			return localEndDateTracker;
		}



		/**
		 * Auto generated getter method
		 * @return java.util.Date
		 */
		public  java.util.Date getEndDate(){
			return localEndDate;
		}



		/**
		 * Auto generated setter method
		 * @param param EndDate
		 */
		public void setEndDate(java.util.Date param){
			localEndDateTracker = true;

			this.localEndDate=param;


		}


		/**
		 * field for Isbn
		 */


		protected long localIsbn ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localIsbnTracker = false ;

		public boolean isIsbnSpecified(){
			return localIsbnTracker;
		}



		/**
		 * Auto generated getter method
		 * @return long
		 */
		public  long getIsbn(){
			return localIsbn;
		}



		/**
		 * Auto generated setter method
		 * @param param Isbn
		 */
		public void setIsbn(long param){
			localIsbnTracker = true;

			this.localIsbn=param;


		}


		/**
		 * field for StartDate
		 */


		protected java.util.Date localStartDate ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localStartDateTracker = false ;

		public boolean isStartDateSpecified(){
			return localStartDateTracker;
		}



		/**
		 * Auto generated getter method
		 * @return java.util.Date
		 */
		public  java.util.Date getStartDate(){
			return localStartDate;
		}



		/**
		 * Auto generated setter method
		 * @param param StartDate
		 */
		public void setStartDate(java.util.Date param){
			localStartDateTracker = true;

			this.localStartDate=param;


		}


		/**
		 * field for Title
		 */


		protected java.lang.String localTitle ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localTitleTracker = false ;

		public boolean isTitleSpecified(){
			return localTitleTracker;
		}



		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getTitle(){
			return localTitle;
		}



		/**
		 * Auto generated setter method
		 * @param param Title
		 */
		public void setTitle(java.lang.String param){
			localTitleTracker = true;

			this.localTitle=param;


		}




		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
			return factory.createOMElement(dataSource,parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://dto.webservices.com/xsd");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":Book",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"Book",
							xmlWriter);
				}


			}
			if (localAuthorTracker){
				namespace = "http://dto.webservices.com/xsd";
				writeStartElement(null, namespace, "author", xmlWriter);


				if (localAuthor==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localAuthor);

				}

				xmlWriter.writeEndElement();
			} if (localBookerTracker){
				namespace = "http://dto.webservices.com/xsd";
				writeStartElement(null, namespace, "booker", xmlWriter);


				if (localBooker==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localBooker);

				}

				xmlWriter.writeEndElement();
			} if (localBorrowerTracker){
				namespace = "http://dto.webservices.com/xsd";
				writeStartElement(null, namespace, "borrower", xmlWriter);


				if (localBorrower==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localBorrower);

				}

				xmlWriter.writeEndElement();
			} if (localEditorTracker){
				namespace = "http://dto.webservices.com/xsd";
				writeStartElement(null, namespace, "editor", xmlWriter);


				if (localEditor==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localEditor);

				}

				xmlWriter.writeEndElement();
			} if (localEndDateTracker){
				namespace = "http://dto.webservices.com/xsd";
				writeStartElement(null, namespace, "endDate", xmlWriter);


				if (localEndDate==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndDate));

				}

				xmlWriter.writeEndElement();
			} if (localIsbnTracker){
				namespace = "http://dto.webservices.com/xsd";
				writeStartElement(null, namespace, "isbn", xmlWriter);

				if (localIsbn==java.lang.Long.MIN_VALUE) {

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsbn));
				}

				xmlWriter.writeEndElement();
			} if (localStartDateTracker){
				namespace = "http://dto.webservices.com/xsd";
				writeStartElement(null, namespace, "startDate", xmlWriter);


				if (localStartDate==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartDate));

				}

				xmlWriter.writeEndElement();
			} if (localTitleTracker){
				namespace = "http://dto.webservices.com/xsd";
				writeStartElement(null, namespace, "title", xmlWriter);


				if (localTitle==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localTitle);

				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();


		}

		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://dto.webservices.com/xsd")){
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace,attName,attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName,attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					java.lang.String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localAuthorTracker){
				elementList.add(new javax.xml.namespace.QName("http://dto.webservices.com/xsd",
						"author"));

				elementList.add(localAuthor==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuthor));
			} if (localBookerTracker){
				elementList.add(new javax.xml.namespace.QName("http://dto.webservices.com/xsd",
						"booker"));

				elementList.add(localBooker==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBooker));
			} if (localBorrowerTracker){
				elementList.add(new javax.xml.namespace.QName("http://dto.webservices.com/xsd",
						"borrower"));

				elementList.add(localBorrower==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBorrower));
			} if (localEditorTracker){
				elementList.add(new javax.xml.namespace.QName("http://dto.webservices.com/xsd",
						"editor"));

				elementList.add(localEditor==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEditor));
			} if (localEndDateTracker){
				elementList.add(new javax.xml.namespace.QName("http://dto.webservices.com/xsd",
						"endDate"));

				elementList.add(localEndDate==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndDate));
			} if (localIsbnTracker){
				elementList.add(new javax.xml.namespace.QName("http://dto.webservices.com/xsd",
						"isbn"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsbn));
			} if (localStartDateTracker){
				elementList.add(new javax.xml.namespace.QName("http://dto.webservices.com/xsd",
						"startDate"));

				elementList.add(localStartDate==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartDate));
			} if (localTitleTracker){
				elementList.add(new javax.xml.namespace.QName("http://dto.webservices.com/xsd",
						"title"));

				elementList.add(localTitle==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTitle));
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static Book parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				Book object =
						new Book();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"Book".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (Book)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.webservices.com/xsd","author").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){


							java.lang.String content = reader.getElementText();

							object.setAuthor(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.webservices.com/xsd","booker").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){


							java.lang.String content = reader.getElementText();

							object.setBooker(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.webservices.com/xsd","borrower").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){


							java.lang.String content = reader.getElementText();

							object.setBorrower(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.webservices.com/xsd","editor").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){


							java.lang.String content = reader.getElementText();

							object.setEditor(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.webservices.com/xsd","endDate").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){


							java.lang.String content = reader.getElementText();

							object.setEndDate(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.webservices.com/xsd","isbn").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){


							java.lang.String content = reader.getElementText();

							object.setIsbn(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

						} else {


							object.setIsbn(java.lang.Long.MIN_VALUE);

							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

						object.setIsbn(java.lang.Long.MIN_VALUE);

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.webservices.com/xsd","startDate").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){


							java.lang.String content = reader.getElementText();

							object.setStartDate(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.webservices.com/xsd","title").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){


							java.lang.String content = reader.getElementText();

							object.setTitle(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class GetBooks
	implements org.apache.axis2.databinding.ADBBean{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://webservices.com",
				"getBooks",
				"ns2");



		/**
		 * field for Author
		 */


		protected java.lang.String localAuthor ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localAuthorTracker = false ;

		public boolean isAuthorSpecified(){
			return localAuthorTracker;
		}



		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getAuthor(){
			return localAuthor;
		}



		/**
		 * Auto generated setter method
		 * @param param Author
		 */
		public void setAuthor(java.lang.String param){
			localAuthorTracker = true;

			this.localAuthor=param;


		}


		/**
		 * field for Title
		 */


		protected java.lang.String localTitle ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localTitleTracker = false ;

		public boolean isTitleSpecified(){
			return localTitleTracker;
		}



		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getTitle(){
			return localTitle;
		}



		/**
		 * Auto generated setter method
		 * @param param Title
		 */
		public void setTitle(java.lang.String param){
			localTitleTracker = true;

			this.localTitle=param;


		}


		/**
		 * field for Editor
		 */


		protected java.lang.String localEditor ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localEditorTracker = false ;

		public boolean isEditorSpecified(){
			return localEditorTracker;
		}



		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getEditor(){
			return localEditor;
		}



		/**
		 * Auto generated setter method
		 * @param param Editor
		 */
		public void setEditor(java.lang.String param){
			localEditorTracker = true;

			this.localEditor=param;


		}


		/**
		 * field for Borrower
		 */


		protected java.lang.String localBorrower ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean localBorrowerTracker = false ;

		public boolean isBorrowerSpecified(){
			return localBorrowerTracker;
		}



		/**
		 * Auto generated getter method
		 * @return java.lang.String
		 */
		public  java.lang.String getBorrower(){
			return localBorrower;
		}



		/**
		 * Auto generated setter method
		 * @param param Borrower
		 */
		public void setBorrower(java.lang.String param){
			localBorrowerTracker = true;

			this.localBorrower=param;


		}




		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
			return factory.createOMElement(dataSource,MY_QNAME);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.com");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":getBooks",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"getBooks",
							xmlWriter);
				}


			}
			if (localAuthorTracker){
				namespace = "http://webservices.com";
				writeStartElement(null, namespace, "author", xmlWriter);


				if (localAuthor==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localAuthor);

				}

				xmlWriter.writeEndElement();
			} if (localTitleTracker){
				namespace = "http://webservices.com";
				writeStartElement(null, namespace, "title", xmlWriter);


				if (localTitle==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localTitle);

				}

				xmlWriter.writeEndElement();
			} if (localEditorTracker){
				namespace = "http://webservices.com";
				writeStartElement(null, namespace, "editor", xmlWriter);


				if (localEditor==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localEditor);

				}

				xmlWriter.writeEndElement();
			} if (localBorrowerTracker){
				namespace = "http://webservices.com";
				writeStartElement(null, namespace, "borrower", xmlWriter);


				if (localBorrower==null){
					// write the nil attribute

					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);

				}else{


					xmlWriter.writeCharacters(localBorrower);

				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();


		}

		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://webservices.com")){
				return "ns2";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace,attName,attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName,attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					java.lang.String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localAuthorTracker){
				elementList.add(new javax.xml.namespace.QName("http://webservices.com",
						"author"));

				elementList.add(localAuthor==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuthor));
			} if (localTitleTracker){
				elementList.add(new javax.xml.namespace.QName("http://webservices.com",
						"title"));

				elementList.add(localTitle==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTitle));
			} if (localEditorTracker){
				elementList.add(new javax.xml.namespace.QName("http://webservices.com",
						"editor"));

				elementList.add(localEditor==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEditor));
			} if (localBorrowerTracker){
				elementList.add(new javax.xml.namespace.QName("http://webservices.com",
						"borrower"));

				elementList.add(localBorrower==null?null:
					org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBorrower));
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GetBooks parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				GetBooks object =
						new GetBooks();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"getBooks".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (GetBooks)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.com","author").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){


							java.lang.String content = reader.getElementText();

							object.setAuthor(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.com","title").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){


							java.lang.String content = reader.getElementText();

							object.setTitle(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.com","editor").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){


							java.lang.String content = reader.getElementText();

							object.setEditor(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.com","borrower").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){


							java.lang.String content = reader.getElementText();

							object.setBorrower(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						} else {


							reader.getElementText(); // throw away text nodes if any.
						}

						reader.next();

					}  // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class GiveBackBookResponse
	implements org.apache.axis2.databinding.ADBBean{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://webservices.com",
				"giveBackBookResponse",
				"ns2");



		/**
		 * field for _return
		 */


		protected Book local_return ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean local_returnTracker = false ;

		public boolean is_returnSpecified(){
			return local_returnTracker;
		}



		/**
		 * Auto generated getter method
		 * @return Book
		 */
		public  Book get_return(){
			return local_return;
		}



		/**
		 * Auto generated setter method
		 * @param param _return
		 */
		public void set_return(Book param){
			local_returnTracker = true;

			this.local_return=param;


		}




		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
			return factory.createOMElement(dataSource,MY_QNAME);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.com");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":giveBackBookResponse",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"giveBackBookResponse",
							xmlWriter);
				}


			}
			if (local_returnTracker){
				if (local_return==null){

					writeStartElement(null, "http://webservices.com", "return", xmlWriter);

					// write the nil attribute
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
					xmlWriter.writeEndElement();
				}else{
					local_return.serialize(new javax.xml.namespace.QName("http://webservices.com","return"),
							xmlWriter);
				}
			}
			xmlWriter.writeEndElement();


		}

		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://webservices.com")){
				return "ns2";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace,attName,attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName,attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					java.lang.String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (local_returnTracker){
				elementList.add(new javax.xml.namespace.QName("http://webservices.com",
						"return"));


				elementList.add(local_return==null?null:
					local_return);
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GiveBackBookResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				GiveBackBookResponse object =
						new GiveBackBookResponse();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"giveBackBookResponse".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (GiveBackBookResponse)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.com","return").equals(reader.getName())){

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)){
							object.set_return(null);
							reader.next();

							reader.next();

						}else{

							object.set_return(Book.Factory.parse(reader));

							reader.next();
						}
					}  // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	public static class GetBooksResponse
	implements org.apache.axis2.databinding.ADBBean{

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://webservices.com",
				"getBooksResponse",
				"ns2");



		/**
		 * field for _return
		 * This was an Array!
		 */


		protected Book[] local_return ;

		/*  This tracker boolean wil be used to detect whether the user called the set method
		 *   for this attribute. It will be used to determine whether to include this field
		 *   in the serialized XML
		 */
		protected boolean local_returnTracker = false ;

		public boolean is_returnSpecified(){
			return local_returnTracker;
		}



		/**
		 * Auto generated getter method
		 * @return Book[]
		 */
		public  Book[] get_return(){
			return local_return;
		}






		/**
		 * validate the array for _return
		 */
		protected void validate_return(Book[] param){

		}


		/**
		 * Auto generated setter method
		 * @param param _return
		 */
		public void set_return(Book[] param){

			validate_return(param);

			local_returnTracker = true;

			this.local_return=param;
		}



		/**
		 * Auto generated add method for the array for convenience
		 * @param param Book
		 */
		public void add_return(Book param){
			if (local_return == null){
				local_return = new Book[]{};
			}


			//update the setting tracker
			local_returnTracker = true;


			java.util.List list =
					org.apache.axis2.databinding.utils.ConverterUtil.toList(local_return);
			list.add(param);
			this.local_return =
					(Book[])list.toArray(
							new Book[list.size()]);

		}




		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement (
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



			org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
			return factory.createOMElement(dataSource,MY_QNAME);

		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
			serialize(parentQName,xmlWriter,false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName,
				javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




			java.lang.String prefix = null;
			java.lang.String namespace = null;


			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType){


				java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://webservices.com");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							namespacePrefix+":getBooksResponse",
							xmlWriter);
				} else {
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
							"getBooksResponse",
							xmlWriter);
				}


			}
			if (local_returnTracker){
				if (local_return!=null){
					for (int i = 0;i < local_return.length;i++){
						if (local_return[i] != null){
							local_return[i].serialize(new javax.xml.namespace.QName("http://webservices.com","return"),
									xmlWriter);
						} else {

							writeStartElement(null, "http://webservices.com", "return", xmlWriter);

							// write the nil attribute
							writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
							xmlWriter.writeEndElement();

						}

					}
				} else {

					writeStartElement(null, "http://webservices.com", "return", xmlWriter);

					// write the nil attribute
					writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
					xmlWriter.writeEndElement();

				}
			}
			xmlWriter.writeEndElement();


		}

		private static java.lang.String generatePrefix(java.lang.String namespace) {
			if(namespace.equals("http://webservices.com")){
				return "ns2";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace,attName,attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,java.lang.String attName,
				java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName,attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace,attName,attValue);
			}
		}


		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}
		/**
		 *  method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix,namespaceURI);
				}

				if (prefix.trim().length() > 0){
					xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix,namespaceURI);
						}

						if (prefix.trim().length() > 0){
							stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}


		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					java.lang.String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}



		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (local_returnTracker){
				if (local_return!=null) {
					for (int i = 0;i < local_return.length;i++){

						if (local_return[i] != null){
							elementList.add(new javax.xml.namespace.QName("http://webservices.com",
									"return"));
							elementList.add(local_return[i]);
						} else {

							elementList.add(new javax.xml.namespace.QName("http://webservices.com",
									"return"));
							elementList.add(null);

						}

					}
				} else {

					elementList.add(new javax.xml.namespace.QName("http://webservices.com",
							"return"));
					elementList.add(local_return);

				}

			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



		}



		/**
		 *  Factory class that keeps the parse method
		 */
		public static class Factory{




			/**
			 * static method to create the object
			 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
			 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
			 * Postcondition: If this object is an element, the reader is positioned at its end element
			 *                If this object is a complex type, the reader is positioned at the end element of its outer element
			 */
			public static GetBooksResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
				GetBooksResponse object =
						new GetBooksResponse();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix ="";
				java.lang.String namespaceuri ="";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();


					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
						java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
								"type");
						if (fullTypeName!=null){
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1){
								nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix==null?"":nsPrefix;

							java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

							if (!"getBooksResponse".equals(type)){
								//find namespace for the prefix
								java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (GetBooksResponse)ExtensionMapper.getTypeObject(
										nsUri,type,reader);
							}


						}


					}




					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();




					reader.next();

					java.util.ArrayList list1 = new java.util.ArrayList();


					while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("http://webservices.com","return").equals(reader.getName())){



						// Process the array and step past its final element's end.

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)){
							list1.add(null);
							reader.next();
						} else {
							list1.add(Book.Factory.parse(reader));
						}
						//loop until we find a start element that is not part of this array
						boolean loopDone1 = false;
						while(!loopDone1){
							// We should be at the end element, but make sure
							while (!reader.isEndElement())
								reader.next();
							// Step out of this element
							reader.next();
							// Step to next element event.
							while (!reader.isStartElement() && !reader.isEndElement())
								reader.next();
							if (reader.isEndElement()){
								//two continuous end elements means we are exiting the xml structure
								loopDone1 = true;
							} else {
								if (new javax.xml.namespace.QName("http://webservices.com","return").equals(reader.getName())){

									nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
									if ("true".equals(nillableValue) || "1".equals(nillableValue)){
										list1.add(null);
										reader.next();
									} else {
										list1.add(Book.Factory.parse(reader));
									}
								}else{
									loopDone1 = true;
								}
							}
						}
						// call the converter utility  to convert and set the array

						object.set_return((Book[])
								org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
										Book.class,
										list1));

					}  // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());




				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}//end of factory class



	}


	private  org.apache.axiom.om.OMElement  toOM(com.webservices.UserWebServiceStub.GiveBackBook param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(com.webservices.UserWebServiceStub.GiveBackBook.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(com.webservices.UserWebServiceStub.GiveBackBookResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(com.webservices.UserWebServiceStub.GiveBackBookResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(com.webservices.UserWebServiceStub.GetBookDescription param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(com.webservices.UserWebServiceStub.GetBookDescription.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(com.webservices.UserWebServiceStub.GetBookDescriptionResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(com.webservices.UserWebServiceStub.GetBookDescriptionResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(com.webservices.UserWebServiceStub.GetBooks param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(com.webservices.UserWebServiceStub.GetBooks.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(com.webservices.UserWebServiceStub.GetBooksResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(com.webservices.UserWebServiceStub.GetBooksResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(com.webservices.UserWebServiceStub.BookBorrowedBook param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(com.webservices.UserWebServiceStub.BookBorrowedBook.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(com.webservices.UserWebServiceStub.BookBorrowedBookResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(com.webservices.UserWebServiceStub.BookBorrowedBookResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(com.webservices.UserWebServiceStub.BorrowBook param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(com.webservices.UserWebServiceStub.BorrowBook.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(com.webservices.UserWebServiceStub.BorrowBookResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(com.webservices.UserWebServiceStub.BorrowBookResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}


	private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.webservices.UserWebServiceStub.GiveBackBook param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault{


		try{

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(com.webservices.UserWebServiceStub.GiveBackBook.MY_QNAME,factory));
			return emptyEnvelope;
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}


	/* methods to provide back word compatibility */



	private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.webservices.UserWebServiceStub.GetBookDescription param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault{


		try{

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(com.webservices.UserWebServiceStub.GetBookDescription.MY_QNAME,factory));
			return emptyEnvelope;
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}


	/* methods to provide back word compatibility */



	private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.webservices.UserWebServiceStub.GetBooks param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault{


		try{

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(com.webservices.UserWebServiceStub.GetBooks.MY_QNAME,factory));
			return emptyEnvelope;
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}


	/* methods to provide back word compatibility */



	private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.webservices.UserWebServiceStub.BookBorrowedBook param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault{


		try{

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(com.webservices.UserWebServiceStub.BookBorrowedBook.MY_QNAME,factory));
			return emptyEnvelope;
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}


	/* methods to provide back word compatibility */



	private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.webservices.UserWebServiceStub.BorrowBook param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault{


		try{

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(com.webservices.UserWebServiceStub.BorrowBook.MY_QNAME,factory));
			return emptyEnvelope;
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}


	/* methods to provide back word compatibility */




	/**
	 *  get the default envelope
	 */
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
		return factory.getDefaultEnvelope();
	}


	private  java.lang.Object fromOM(
			org.apache.axiom.om.OMElement param,
			java.lang.Class type,
			java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

		try {

			if (com.webservices.UserWebServiceStub.GiveBackBook.class.equals(type)){

				return com.webservices.UserWebServiceStub.GiveBackBook.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.webservices.UserWebServiceStub.GiveBackBookResponse.class.equals(type)){

				return com.webservices.UserWebServiceStub.GiveBackBookResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.webservices.UserWebServiceStub.GetBookDescription.class.equals(type)){

				return com.webservices.UserWebServiceStub.GetBookDescription.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.webservices.UserWebServiceStub.GetBookDescriptionResponse.class.equals(type)){

				return com.webservices.UserWebServiceStub.GetBookDescriptionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.webservices.UserWebServiceStub.GetBooks.class.equals(type)){

				return com.webservices.UserWebServiceStub.GetBooks.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.webservices.UserWebServiceStub.GetBooksResponse.class.equals(type)){

				return com.webservices.UserWebServiceStub.GetBooksResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.webservices.UserWebServiceStub.BookBorrowedBook.class.equals(type)){

				return com.webservices.UserWebServiceStub.BookBorrowedBook.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.webservices.UserWebServiceStub.BookBorrowedBookResponse.class.equals(type)){

				return com.webservices.UserWebServiceStub.BookBorrowedBookResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.webservices.UserWebServiceStub.BorrowBook.class.equals(type)){

				return com.webservices.UserWebServiceStub.BorrowBook.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (com.webservices.UserWebServiceStub.BorrowBookResponse.class.equals(type)){

				return com.webservices.UserWebServiceStub.BorrowBookResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
		return null;
	}




}
