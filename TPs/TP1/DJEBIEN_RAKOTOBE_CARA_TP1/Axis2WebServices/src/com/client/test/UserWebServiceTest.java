package com.client.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.rmi.RemoteException;
import org.junit.Before;
import org.junit.Test;
import com.webservices.LibrarianWebServiceStub;
import com.webservices.LibrarianWebServiceStub.AddBook;
import com.webservices.LibrarianWebServiceStub.AddBookResponse;
import com.webservices.LibrarianWebServiceStub.AddUser;
import com.webservices.LibrarianWebServiceStub.AddUserResponse;
import com.webservices.LibrarianWebServiceStub.DeleteBook;
import com.webservices.LibrarianWebServiceStub.DeleteUser;
import com.webservices.LibrarianWebServiceStub.GetBookDescription;
import com.webservices.LibrarianWebServiceStub.GetBookDescriptionResponse;
import com.webservices.LibrarianWebServiceStub.GetBooks;
import com.webservices.LibrarianWebServiceStub.GetBooksResponse;
import com.webservices.UserWebServiceStub;
import com.webservices.UserWebServiceStub.BookBorrowedBook;
import com.webservices.UserWebServiceStub.BookBorrowedBookResponse;
import com.webservices.UserWebServiceStub.BorrowBook;
import com.webservices.UserWebServiceStub.BorrowBookResponse;
import com.webservices.UserWebServiceStub.GiveBackBook;
import com.webservices.UserWebServiceStub.GiveBackBookResponse;
import com.webservices.dto.Book;

public class UserWebServiceTest {
	
	public LibrarianWebServiceStub librarianWebServiceStub;
	public UserWebServiceStub userWebServiceStub;

	
	@Before
	public void init() throws RemoteException {
		librarianWebServiceStub = new LibrarianWebServiceStub();
		userWebServiceStub = new UserWebServiceStub();
	}

	@Test
	public void borrowBookTest() throws RemoteException {
		String borrower = "Roos" ;
		
		AddUser addUser = new AddUser();
		addUser.setName(borrower);
		AddUserResponse addUserResponse = librarianWebServiceStub.addUser(addUser);
		com.webservices.LibrarianWebServiceStub.User addedUser = addUserResponse.get_return();		
		AddBook addBook = new AddBook();
		addBook.setTitle("bookToBorrow");
		AddBookResponse addBookResponse = librarianWebServiceStub.addBook(addBook);
		com.webservices.LibrarianWebServiceStub.Book addedBook = addBookResponse.get_return();
		
		BorrowBook borrowBook = new BorrowBook();
		borrowBook.setIsbn(addedBook.getIsbn());
		borrowBook.setBorrower(borrower);
		BorrowBookResponse borrowBookResponse = userWebServiceStub.borrowBook(borrowBook) ; 
		com.webservices.UserWebServiceStub.Book bookResponse = borrowBookResponse.get_return();
		
		boolean borrowerNameValid = (borrower.equalsIgnoreCase(bookResponse.getBorrower())) ; 
		boolean startDateNotNull = (bookResponse.getStartDate() != null) ; 
		boolean endDateNotNull = (bookResponse.getEndDate() != null) ;
		boolean expected = startDateNotNull && endDateNotNull && borrowerNameValid ;
		
		DeleteUser deleteUser = new DeleteUser();
		deleteUser.setId(addedUser.getId());
		librarianWebServiceStub.deleteUser(deleteUser);
		DeleteBook deleteBook = new DeleteBook();
		deleteBook.setIsbn(addedBook.getIsbn());
		librarianWebServiceStub.deleteBook(deleteBook);
		
		assertTrue(expected);
	}
	
	
	@Test
	public void giveBackBookTest() throws RemoteException {
		String borrower = "Roos" ;
		
		AddUser addUser = new AddUser();
		addUser.setName(borrower);
		AddUserResponse addUserResponse = librarianWebServiceStub.addUser(addUser);
		com.webservices.LibrarianWebServiceStub.User addedUser = addUserResponse.get_return();	
		AddBook addBook = new AddBook();
		addBook.setBorrower(borrower) ; 
		AddBookResponse addBookResponse = librarianWebServiceStub.addBook(addBook);
		com.webservices.LibrarianWebServiceStub.Book addedBook = addBookResponse.get_return();
		
		GiveBackBook giveBackBook = new GiveBackBook();
		giveBackBook.setIsbn(addedBook.getIsbn());
		GiveBackBookResponse giveBackBookResponse = userWebServiceStub.giveBackBook(giveBackBook);
		com.webservices.UserWebServiceStub.Book bookResponse = giveBackBookResponse.get_return();	
		
		boolean startDateNull = (bookResponse.getStartDate() == null) ; 
		boolean endDateNull = (bookResponse.getEndDate() == null) ;
		boolean borrowerNull = (bookResponse.getBorrower() == null );
		boolean expected = startDateNull && endDateNull && borrowerNull ;
		
		DeleteUser deleteUser = new DeleteUser();
		deleteUser.setId(addedUser.getId());
		librarianWebServiceStub.deleteUser(deleteUser);
		DeleteBook deleteBook = new DeleteBook();
		deleteBook.setIsbn(addedBook.getIsbn());
		librarianWebServiceStub.deleteBook(deleteBook);
		
		assertTrue(expected);
	}
	
	@Test
	public void bookBorrowedBookTest() throws RemoteException {
		String booker = "Roos" ;
		
		AddUser addUser = new AddUser();
		addUser.setName(booker);
		AddUserResponse addUserResponse = librarianWebServiceStub.addUser(addUser);
		com.webservices.LibrarianWebServiceStub.User addedUser = addUserResponse.get_return();	
		AddBook addBook = new AddBook();
		AddBookResponse addBookResponse = librarianWebServiceStub.addBook(addBook);
		com.webservices.LibrarianWebServiceStub.Book addedBook = addBookResponse.get_return();
		
		BookBorrowedBook bookBorrowedBook = new BookBorrowedBook();
		bookBorrowedBook.setIsbn(addedBook.getIsbn());
		bookBorrowedBook.setBooker(booker);
		BookBorrowedBookResponse bookBorrowedBookResponse = userWebServiceStub.bookBorrowedBook(bookBorrowedBook);
		com.webservices.UserWebServiceStub.Book bookResponse = bookBorrowedBookResponse.get_return();
		
		boolean expected = booker.equalsIgnoreCase(bookResponse.getBooker());
		
		DeleteUser deleteUser = new DeleteUser();
		deleteUser.setId(addedUser.getId());
		librarianWebServiceStub.deleteUser(deleteUser);
		DeleteBook deleteBook = new DeleteBook();
		deleteBook.setIsbn(addedBook.getIsbn());
		librarianWebServiceStub.deleteBook(deleteBook);
		
		assertTrue(expected);
	}
	
	
	
	@Test
	public void getBooksTest() throws RemoteException {
		String criteriaTitle = "criteria title";

		AddBook addBook1 = new AddBook();
		addBook1.setTitle(criteriaTitle);
		AddBookResponse addBookResponse1 = librarianWebServiceStub.addBook(addBook1);
		com.webservices.LibrarianWebServiceStub.Book addedBook1 = addBookResponse1.get_return();
		AddBook addBook2 = new AddBook();
		addBook2.setTitle("book excluded");
		AddBookResponse addBookResponse2 = librarianWebServiceStub.addBook(addBook2);
		com.webservices.LibrarianWebServiceStub.Book addedBook2 = addBookResponse2.get_return();
		AddBook addBook3 = new AddBook();
		addBook3.setTitle("another book excluded");
		AddBookResponse addBookResponse3 = librarianWebServiceStub.addBook(addBook3);
		com.webservices.LibrarianWebServiceStub.Book addedBook3 = addBookResponse3.get_return();

		GetBooks getBooks = new GetBooks();
		getBooks.setTitle(criteriaTitle);
		GetBooksResponse getBooksResponse = librarianWebServiceStub.getBooks(getBooks);
		com.webservices.LibrarianWebServiceStub.Book[] booksResult = getBooksResponse.get_return();
		boolean expected = booksResult.length != 0 && booksResult[0].getTitle().equals(criteriaTitle);

		DeleteBook deleteBook1 = new DeleteBook();
		deleteBook1.setIsbn(addedBook1.getIsbn());
		librarianWebServiceStub.deleteBook(deleteBook1);
		DeleteBook deleteBook2 = new DeleteBook();
		deleteBook2.setIsbn(addedBook2.getIsbn());
		librarianWebServiceStub.deleteBook(deleteBook2);
		DeleteBook deleteBook3 = new DeleteBook();
		deleteBook3.setIsbn(addedBook3.getIsbn());
		librarianWebServiceStub.deleteBook(deleteBook3);

		assertTrue(expected);
	}
	
	

	@Test
	public void getBookDescriptionTest() throws RemoteException {
		String author = "Djebien";
		String title = "Create Web Service in Java Using Apache Axis2 and Eclipse";
		String editor = "CARA";
		String borrower = "Roos";
		AddBook addBook = new AddBook();
		addBook.setAuthor(author);
		addBook.setTitle(title);
		addBook.setEditor(editor);
		addBook.setBorrower(borrower);
		AddBookResponse addBookResponse = librarianWebServiceStub.addBook(addBook);
		com.webservices.LibrarianWebServiceStub.Book addedBook = addBookResponse.get_return();
		Book bookExpected = new Book();
		bookExpected.setIsbn(addedBook.getIsbn());
		bookExpected.setAuthor(author);
		bookExpected.setTitle(title);
		bookExpected.setEditor(editor);
		bookExpected.setBorrower(borrower);
		
		String expectedDescription = bookExpected.toString();
		GetBookDescription getBookDescription = new GetBookDescription();
		getBookDescription.setIsbn(addedBook.getIsbn());
		GetBookDescriptionResponse bookDescriptionResponse = librarianWebServiceStub.getBookDescription(getBookDescription);
		String actualDescription = bookDescriptionResponse.get_return();

		DeleteBook deleteBook = new DeleteBook();
		deleteBook.setIsbn(addedBook.getIsbn());
		librarianWebServiceStub.deleteBook(deleteBook);

		assertEquals(expectedDescription, actualDescription);
	}
}
