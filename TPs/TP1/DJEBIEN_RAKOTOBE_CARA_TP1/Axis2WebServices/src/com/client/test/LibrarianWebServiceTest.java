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
import com.webservices.LibrarianWebServiceStub.DeleteBookResponse;
import com.webservices.LibrarianWebServiceStub.DeleteUser;
import com.webservices.LibrarianWebServiceStub.DeleteUserResponse;
import com.webservices.LibrarianWebServiceStub.GetBookDescription;
import com.webservices.LibrarianWebServiceStub.GetBookDescriptionResponse;
import com.webservices.LibrarianWebServiceStub.GetBooks;
import com.webservices.LibrarianWebServiceStub.GetBooksResponse;
import com.webservices.LibrarianWebServiceStub.GetUserDescription;
import com.webservices.LibrarianWebServiceStub.GetUserDescriptionResponse;
import com.webservices.LibrarianWebServiceStub.GetUsers;
import com.webservices.LibrarianWebServiceStub.GetUsersResponse;
import com.webservices.LibrarianWebServiceStub.SayHello;
import com.webservices.LibrarianWebServiceStub.SayHelloResponse;
import com.webservices.dto.Book;
import com.webservices.dto.User;

public class LibrarianWebServiceTest {

	public LibrarianWebServiceStub librarianWebServiceStub;

	@Before
	public void init() throws RemoteException {
		librarianWebServiceStub = new LibrarianWebServiceStub();
	}

	@Test
	public void sayHelloTest() throws RemoteException {
		String expected = "Hello Tarik";

		SayHello sayHello = new SayHello();
		sayHello.setName("Tarik");
		SayHelloResponse sayHelloResponse = librarianWebServiceStub.sayHello(sayHello);
		String actual = sayHelloResponse.get_return();

		assertEquals(expected, actual);
	}

	@Test
	public void addBookTest() throws RemoteException {
		String bookTitle = "Test Driven Devlopment book";

		AddBook addBook = new AddBook();
		addBook.setTitle(bookTitle);
		AddBookResponse addBookResponse = librarianWebServiceStub.addBook(addBook);
		com.webservices.LibrarianWebServiceStub.Book addedBook = addBookResponse.get_return();

		DeleteBook deleteBook = new DeleteBook();
		deleteBook.setIsbn(addedBook.getIsbn());
		librarianWebServiceStub.deleteBook(deleteBook);
		
		assertEquals(addedBook.getTitle(),bookTitle);
	}

	@Test
	public void deleteBookTest() throws RemoteException {
		AddBook addBook = new AddBook();
		addBook.setTitle("book to delete");
		AddBookResponse addBookResponse = librarianWebServiceStub.addBook(addBook);
		com.webservices.LibrarianWebServiceStub.Book addedBook = addBookResponse.get_return();

		DeleteBook deleteBook = new DeleteBook();
		deleteBook.setIsbn(addedBook.getIsbn());
		DeleteBookResponse deleteBookResponse = librarianWebServiceStub.deleteBook(deleteBook);
		Boolean deleteSuccess = deleteBookResponse.get_return();

		assertTrue(deleteSuccess);
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

	@Test
	public void addUserTest() throws RemoteException {
		String userName = "Djebien";
		
		AddUser addUser = new AddUser();
		addUser.setName(userName);
		AddUserResponse addUserResponse = librarianWebServiceStub.addUser(addUser);
		com.webservices.LibrarianWebServiceStub.User addedUser = addUserResponse.get_return();

		DeleteUser deleteUser = new DeleteUser();
		deleteUser.setId(addedUser.getId());
		librarianWebServiceStub.deleteUser(deleteUser);
		
		assertEquals(addedUser.getName(),userName);
	}

	@Test
	public void deleteUserTest() throws RemoteException {
		AddUser addUser = new AddUser();
		addUser.setName("user to delete");
		AddUserResponse addUserResponse = librarianWebServiceStub.addUser(addUser);
		com.webservices.LibrarianWebServiceStub.User addedUser = addUserResponse.get_return();

		DeleteUser deleteUser = new DeleteUser();
		deleteUser.setId(addedUser.getId());
		DeleteUserResponse deleteUserResponse = librarianWebServiceStub.deleteUser(deleteUser);
		Boolean deleteSuccess = deleteUserResponse.get_return();

		assertTrue(deleteSuccess);
	}

	@Test
	public void getUsersTest() throws RemoteException {
		String name1 = "Djebien";
		String name2 = "Rakotobe";
		String name3 = "Roos";
		
		AddUser addUser1 = new AddUser();
		addUser1.setName(name1);
		AddUserResponse addUserResponse1 = librarianWebServiceStub.addUser(addUser1);
		com.webservices.LibrarianWebServiceStub.User addedUser1 = addUserResponse1.get_return();
		AddUser addUser2 = new AddUser();
		addUser2.setName(name2);
		AddUserResponse addUserResponse2 = librarianWebServiceStub.addUser(addUser2);
		com.webservices.LibrarianWebServiceStub.User addedUser2 = addUserResponse2.get_return();
		AddUser addUser3 = new AddUser();
		addUser3.setName(name3);
		AddUserResponse addUserResponse3 = librarianWebServiceStub.addUser(addUser3);
		com.webservices.LibrarianWebServiceStub.User addedUser3 = addUserResponse3.get_return();

		GetUsers getUsers = new GetUsers();
		GetUsersResponse getUsersResponse = librarianWebServiceStub.getUsers(getUsers);
		com.webservices.LibrarianWebServiceStub.User[] usersResult = getUsersResponse.get_return();
		boolean expected = usersResult.length == 3;

		DeleteUser deleteUser1 = new DeleteUser();
		deleteUser1.setId(addedUser1.getId());
		librarianWebServiceStub.deleteUser(deleteUser1);
		DeleteUser deleteUser2 = new DeleteUser();
		deleteUser2.setId(addedUser2.getId());
		librarianWebServiceStub.deleteUser(deleteUser2);
		DeleteUser deleteUser3 = new DeleteUser();
		deleteUser3.setId(addedUser3.getId());
		librarianWebServiceStub.deleteUser(deleteUser3);

		assertTrue(expected);

	}

	@Test
	public void getUserDescriptionTest() throws RemoteException {
		String name = "Djebien";
		Integer age = new Integer(24);
		String address = "9 rue Midgar";
		AddUser addUser = new AddUser();
		addUser.setName(name);
		addUser.setAge(age);
		addUser.setAddress(address);
		AddUserResponse addUserResponse = librarianWebServiceStub.addUser(addUser);
		com.webservices.LibrarianWebServiceStub.User addedUser = addUserResponse.get_return();
		User userExpected = new User();
		userExpected.setId(addedUser.getId());
		userExpected.setName(name);
		userExpected.setAge(age);
		userExpected.setAddress(address);

		String expectedDescription = userExpected.toString();
		GetUserDescription getUserDescription = new GetUserDescription();
		getUserDescription.setName(name);
		GetUserDescriptionResponse userDescriptionResponse = librarianWebServiceStub.getUserDescription(getUserDescription);
		String actualDescription = userDescriptionResponse.get_return();

		DeleteUser deleteUser = new DeleteUser();
		deleteUser.setId(addedUser.getId());
		librarianWebServiceStub.deleteUser(deleteUser);

		assertEquals(expectedDescription, actualDescription);
	}

}
