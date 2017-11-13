
/**
 * UserWebServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.webservices;

/**
 *  UserWebServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class UserWebServiceCallbackHandler{



	protected Object clientData;

	/**
	 * User can pass in any object that needs to be accessed once the NonBlocking
	 * Web service call is finished and appropriate method of this CallBack is called.
	 * @param clientData Object mechanism by which the user can pass in user data
	 * that will be avilable at the time this callback is called.
	 */
	public UserWebServiceCallbackHandler(Object clientData){
		this.clientData = clientData;
	}

	/**
	 * Please use this constructor if you don't want to set any clientData
	 */
	public UserWebServiceCallbackHandler(){
		this.clientData = null;
	}

	/**
	 * Get the client data
	 */

	public Object getClientData() {
		return clientData;
	}


	/**
	 * auto generated Axis2 call back method for giveBackBook method
	 * override this method for handling normal response from giveBackBook operation
	 */
	public void receiveResultgiveBackBook(
			com.webservices.UserWebServiceStub.GiveBackBookResponse result
			) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from giveBackBook operation
	 */
	public void receiveErrorgiveBackBook(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for getBookDescription method
	 * override this method for handling normal response from getBookDescription operation
	 */
	public void receiveResultgetBookDescription(
			com.webservices.UserWebServiceStub.GetBookDescriptionResponse result
			) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from getBookDescription operation
	 */
	public void receiveErrorgetBookDescription(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for getBooks method
	 * override this method for handling normal response from getBooks operation
	 */
	public void receiveResultgetBooks(
			com.webservices.UserWebServiceStub.GetBooksResponse result
			) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from getBooks operation
	 */
	public void receiveErrorgetBooks(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for bookBorrowedBook method
	 * override this method for handling normal response from bookBorrowedBook operation
	 */
	public void receiveResultbookBorrowedBook(
			com.webservices.UserWebServiceStub.BookBorrowedBookResponse result
			) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from bookBorrowedBook operation
	 */
	public void receiveErrorbookBorrowedBook(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for borrowBook method
	 * override this method for handling normal response from borrowBook operation
	 */
	public void receiveResultborrowBook(
			com.webservices.UserWebServiceStub.BorrowBookResponse result
			) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from borrowBook operation
	 */
	public void receiveErrorborrowBook(java.lang.Exception e) {
	}



}
