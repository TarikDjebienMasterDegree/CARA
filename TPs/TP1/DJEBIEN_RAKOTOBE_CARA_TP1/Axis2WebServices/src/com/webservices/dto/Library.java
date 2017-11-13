package com.webservices.dto;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Classe representant la bibliotheque
 * @author DJEBIEN Tarik
 * @author RAKOTOBE Sitraka Eric
 */
public class Library {
	
	/**
	 * Singleton bibliotheque
	 */
	private static Library library = new Library();
	
	public static Library getInstance() {
		return library;
	}
	
	/**
	 * Les livres de notre bibliotheque
	 */
	public static ConcurrentHashMap<Long, Book> books;
	public static ConcurrentHashMap<Long, User> users;
	
	
	/**
	 * Constucteur de la classe qui
	 * se charge d'initialiser les livres
	 * et les utilisateurs
	 */
	public Library(){
		books = new ConcurrentHashMap<Long, Book>();
		users = new ConcurrentHashMap<Long, User>();
	}
	
	/**
	 * Generateur d'ISBN aleatoire
	 * @return un isbn aleatoirement
	 */
	public Long generateIsbn(){
		return new Random().nextLong();
	}
	
	/**
	 * Generateur d'Identifiant utilisateur aleatoire
	 * @return Identifiant utilisateur aleatoire
	 */
	public Long generateId(){
		return new Random().nextLong();
	}
	
	/**
	 * Methode permettant d'avoir un utilisateur
	 * par son nom.
	 * Cette methode retourne le premier utilisateur
	 * de nom en parametre
	 * @param name : le nom de l'utilisateur
	 * @return l'utilisateur dont le nom est en parametre
	 */
	private User getUserByName(String name) {
		User userFoundByName = null;
		for(User user : getAllUsers()){
			if(user.getName() != null && user.getName().equals(name)){
				userFoundByName = user;
				break;
			}
		}
		return userFoundByName;
	}	
	
	/**
	 * Methode testant si un utilisateur peut emprunter un nouveau livre
	 * L'utilisateur peut emprunter un nouveau livre si le nombre de livre
	 * qu'il a deja emprunte n'est pas superieur ou egale a 3 livres
	 * @param u : l'utilisateur qui veut emprunter un nouveau livre
	 * @param bookToBorrow : le livre a emprunter
	 * @return vrai si l'utilisateur peut emprunter un livre, faux sinon
	 */
	private boolean canBorrowerBorrowNewBook(User u , Book bookToBorrow){
		List<Book> books = u.getBooks() ; 
		if (books == null){
			List<Book> newBooks = new ArrayList<Book>();
			u.setBooks(newBooks);
			return true ;
		}
		
		int nbBooksBorrowed = books.size();
		String borrower = bookToBorrow.getBorrower() ; 
		boolean borrowerNotNull = (borrower != null) ; 
		String booker = bookToBorrow.getBooker() ;
		boolean bookerNotNull = (booker != null) ; 
		boolean nbBookMoreThanThree = (nbBooksBorrowed >= 3) ; 
		boolean bookerIsNotBorrower = (borrowerNotNull && bookerNotNull && booker.equalsIgnoreCase(borrower)); 
		
		if (nbBookMoreThanThree || bookerIsNotBorrower){
			return false ; 
		}
		return true ; 
	}	
	
	/**
	 * Test si un livre a bien ete renseigne au niveau de ses champs lors de sa creation
	 * @param book
	 * @return le resultat de la validation
	 */
	private boolean validBook(Book book){
		boolean authorOK = book.getAuthor() != null || book.getAuthor() == "";
		boolean titleOK = book.getTitle() != null || book.getTitle() == "";
		boolean editorOK = book.getEditor() != null || book.getEditor() == "";
		boolean borrowerOK = book.getBorrower() != null || book.getBorrower() == "";
		return authorOK && titleOK && editorOK && borrowerOK;
	}
	
	/**
	 * Ajoute un livre dans la bibliotheque
	 * @param author : l'auteur du livre
	 * @param title : le titre du livre
	 * @param editor : l'editeur du livre
	 * @param borrower : l'emprunteur du livre
	 * @return le livre ajoute
	 */
	public Book addBook(String author, String title, String editor, String borrower){
		if(author == null) author = "";
		if(title == null) title = "";
		if(editor == null) editor = "";
		if(borrower == null) borrower = "";
		
		Book newBook = new Book();
		newBook.setAuthor(author);
		newBook.setTitle(title);
		newBook.setEditor(editor);
		newBook.setBorrower(borrower);
		Long isbn = generateIsbn();
		newBook.setIsbn(isbn);
		
		books.put(isbn, newBook);
		Book bookAdded = books.get(isbn);
		return bookAdded;
	}
	
	/**
	 * Supprime un livre dans la bibliotheque
	 * @param isbn : l'isbn du livre a supprimer
	 * @return le resultat de la suppression :
	 * vrai si la bibliotheque contient un livre avec
	 * l'isbn en parametre, faux sinon
	 */
	public boolean removeBook(Long isbn){
		if(books.get(isbn) == null){
			return false;
		}
		books.remove(isbn);
		return true;
	}
	
	/**
	 * Consulter la liste des livres selon differents criteres
	 * @param author : l'auteur du livre
	 * @param title : le titre du livre
	 * @param editor : l'editeur du livre
	 * @param borrower : l'emprunteur du livre
	 * @return la liste des livres selon differents criteres
	 */
	public List<Book> getBooksCriteria(String author, String title, String editor, String borrower) {
		List<Book> result = new ArrayList<Book>();
		for(Long isbn : books.keySet()){
			Book book = books.get(isbn);
			boolean authorEquals = book.getAuthor().equals(author) ; 
			boolean titleEquals = book.getTitle().equals(title) ; 
			boolean editorEquals = book.getEditor().equals(editor) ; 
			boolean borrowerEquals = book.getBorrower().equals(borrower) ; 
			boolean validBook = validBook(book); 
			boolean fieldsEquals = authorEquals||titleEquals||editorEquals||borrowerEquals ; 
			if( validBook && fieldsEquals){
				result.add(book);
			}
		}
		return result;
	}
	
	/**
	 * Emprunter un livre (au maximum 3) pour une duree de 15 jours
	 * On ne peut pas emprunter un livre reserve par soi-même.
	 * @param isbn : l'isbn du livre a emprunter
	 * @param borrower : le nom de l'emprunteur du livre
	 * @return le livre emprunte
	 */
	public Book borrowBook(Long isbn , String borrower){
		Book bookToBorrow = books.get(isbn);
		User userBorrower = getUserByName(borrower);
		
		if ((bookToBorrow == null) || (userBorrower == null)){
			return null;
		}
		
		if (!canBorrowerBorrowNewBook(userBorrower , bookToBorrow)){
			return null ; 
		}
		
		List<Book> allBooksBorrowed = userBorrower.getBooks();
		allBooksBorrowed.add(bookToBorrow);
		bookToBorrow.setBorrower(borrower);
		
		Calendar calendar = Calendar.getInstance() ; 
		Date dateNow = calendar.getTime();
		bookToBorrow.setStartDate(dateNow);
		
		calendar.clear();  
		calendar.setTime(dateNow);  
		calendar.add(Calendar.DATE, 15);   
		Date dateAddedDaysOfBorrowing = calendar.getTime(); 
		bookToBorrow.setEndDate(dateAddedDaysOfBorrowing);
		
		books.put(isbn, bookToBorrow);
		return books.get(isbn) ; 
	}	
	
	/**
	 * Restituer un livre avant ou a l'expiration de ce delai de 15 jours. 
	 * Cela lui permet d'emprunter un nouveau livre
	 * @param isbn : l'isbn du livre a restituer
	 * @return le livre restitue
	 */
	public Book giveBackBook (Long isbn) {
		Book bookToGiveBack = books.get(isbn);
		
		if (bookToGiveBack == null){
			return null ;
		}
		
		String borrower = bookToGiveBack.getBorrower() ; 
		User userBorrower = getUserByName(borrower);
		
		if (userBorrower != null) {
			bookToGiveBack.setBorrower(null);
			bookToGiveBack.setStartDate(null);
			bookToGiveBack.setEndDate(null);
			books.replace(isbn, bookToGiveBack);
			List<Book> booksBorrowed = userBorrower.getBooks() ; 
			Long idUserBorrower = userBorrower.getId() ; 
			if (booksBorrowed == null){
				booksBorrowed = new ArrayList<Book>();
				userBorrower.setBooks(booksBorrowed);
			}
			booksBorrowed.remove(bookToGiveBack);
			userBorrower.setBooks(booksBorrowed);
			users.replace(idUserBorrower, userBorrower);
		}
		return books.get(isbn) ;
	}
		
	/**
	 * Reserver un livre qui est emprunte. 
	 * On ne va pas reserver un livre non emprunte puisqu'il sufﬁt de l'emprunter. 
	 * On ne peut pas non plus emprunter un livre reserve par soi-même.
	 * @param isbn : l'isbn du livre a reserver :
	 * @param borrower : l'emprunteur
	 * @return le livre apres reservation
	 */
	public Book bookBorrowedBook (Long isbn , String booker) {
		Book bookToBook = books.get(isbn);
		User userBooker = getUserByName(booker);
		
		if ((bookToBook == null) || (userBooker == null)){
			return null;
		}
		
		String borrower = bookToBook.getBooker() ; 
		boolean bookerIsBorrower = (booker != null && booker.equalsIgnoreCase(borrower)) ; 
		boolean bookBorrowerIsNull = (bookToBook.getBorrower() == null) ;
		boolean startDateBorrowingIsNotNull = (bookToBook.getStartDate() != null) ;
		boolean endDateBorrowingIsNotNull = (bookToBook.getEndDate() != null) ;
		boolean isBookNotBorrowed = (bookBorrowerIsNull) && (startDateBorrowingIsNotNull) && (endDateBorrowingIsNotNull) ; 
		
		if (bookerIsBorrower){
			return null;
		}		
		
		if (isBookNotBorrowed){
			borrowBook(isbn, booker);
		}
		
		bookToBook.setBooker(booker);
		books.replace(isbn, bookToBook);
		return books.get(isbn) ;
	}
	
	/**
	 * Consulter les donnees associees a un livre a partir de son ISBN
	 * @param isbn l'identifiant d'un livre
	 * @return les donnees associees au livre
	 */
	public String getBookDescription(Long isbn) {
		Book book = books.get(isbn);
		if ( book == null) {
			return "unknow book";
		}
		return book.toString();
	}

	/**
	 * Ajoute un usager a la bibliotheque
	 * @param name : le nom de l'utilisateur
	 * @param age : l'age de l'utilisateur
	 * @param address : l'addresse de l'utilisateur
	 * @return l'utilisateur ajoute
	 */
	public User addUser(String name, Integer age, String address) {
		if(name == null) name = "";
		if(age == null) age = 0;
		if(address == null) address = "";
		
		User newUser = new User();
		newUser.setName(name);
		newUser.setAge(age);
		newUser.setAddress(address);
		
		Long id = generateId();
		newUser.setId(id);
		
		users.put(id, newUser);
		
		User userAdded = users.get(id);
		
		return userAdded;
	}

	/**
	 * Supprime un usager de la bibliotheque
	 * @param id : l'id de l'utilisateur a supprimer
	 * @return le resultat de la suppression
	 */
	public Boolean removeUser(Long id) {
		if(users.get(id) == null){
			return false;
		}
		
		users.remove(id);
		return true;
	}

	/**
	 * Recupere tout les usagers de la bibliotheque
	 * @return la liste de tous les usagers
	 */
	public List<User> getAllUsers() {
		List<User> res = new LinkedList<User>();
		for(Long id : users.keySet()){
			res.add(users.get(id));
		}
		return res;
	}

	/**
	 * Recupere la description d'un usager a partir de son nom
	 * @param name : le nom de l'usager 
	 * @return la description d'un usager a partir de son nom
	 */
	public String getUserDescription(String name) {
		User userFoundByName = getUserByName(name);
		if (userFoundByName == null) {
			return "unknow user";
		}
		return userFoundByName.toString();
	}
}
