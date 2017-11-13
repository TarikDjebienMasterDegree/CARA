
/**
 * LibrarianWebServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.webservices;

/**
 *  LibrarianWebServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class LibrarianWebServiceCallbackHandler{



	protected Object clientData;

	/**
	 * User can pass in any object that needs to be accessed once the NonBlocking
	 * Web service call is finished and appropriate method of this CallBack is called.
	 * @param clientData Object mechanism by which the user can pass in user data
	 * that will be avilable at the time this callback is called.
	 */
	public LibrarianWebServiceCallbackHandler(Object clientData){
		this.clientData = clientData;
	}

	/**
	 * Please use this constructor if you don't want to set any clientData
	 */
	public LibrarianWebServiceCallbackHandler(){
		this.clientData = null;
	}

	/**
	 * Get the client data
	 */

	public Object getClientData() {
		return clientData;
	}


	/**
	 * auto generated Axis2 call back method for addUser method
	 * override this method for handling normal response from addUser operation
	 */
	public void receiveResultaddUser(
			com.webservices.LibrarianWebServiceStub.AddUserResponse result
			) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from addUser operation
	 */
	public void receiveErroraddUser(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for addBook method
	 * override this method for handling normal response from addBook operation
	 */
	public void receiveResultaddBook(
			com.webservices.LibrarianWebServiceStub.AddBookResponse result
			) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from addBook operation
	 */
	public void receiveErroraddBook(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for getBookDescription method
	 * override this method for handling normal response from getBookDescription operation
	 */
	public void receiveResultgetBookDescription(
			com.webservices.LibrarianWebServiceStub.GetBookDescriptionResponse result
			) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from getBookDescription operation
	 */
	public void receiveErrorgetBookDescription(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for sayHello method
	 * override this method for handling normal response from sayHello operation
	 */
	public void receiveResultsayHello(
			com.webservices.LibrarianWebServiceStub.SayHelloResponse result
			) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from sayHello operation
	 */
	public void receiveErrorsayHello(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for getUserDescription method
	 * override this method for handling normal response from getUserDescription operation
	 */
	public void receiveResultgetUserDescription(
			com.webservices.LibrarianWebServiceStub.GetUserDescriptionResponse result
			) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from getUserDescription operation
	 */
	public void receiveErrorgetUserDescription(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for getUsers method
	 * override this method for handling normal response from getUsers operation
	 */
	public void receiveResultgetUsers(
			com.webservices.LibrarianWebServiceStub.GetUsersResponse result
			) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from getUsers operation
	 */
	public void receiveErrorgetUsers(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for getBooks method
	 * override this method for handling normal response from getBooks operation
	 */
	public void receiveResultgetBooks(
			com.webservices.LibrarianWebServiceStub.GetBooksResponse result
			) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from getBooks operation
	 */
	public void receiveErrorgetBooks(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for deleteBook method
	 * override this method for handling normal response from deleteBook operation
	 */
	public void receiveResultdeleteBook(
			com.webservices.LibrarianWebServiceStub.DeleteBookResponse result
			) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from deleteBook operation
	 */
	public void receiveErrordeleteBook(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for deleteUser method
	 * override this method for handling normal response from deleteUser operation
	 */
	public void receiveResultdeleteUser(
			com.webservices.LibrarianWebServiceStub.DeleteUserResponse result
			) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from deleteUser operation
	 */
	public void receiveErrordeleteUser(java.lang.Exception e) {
	}



}
