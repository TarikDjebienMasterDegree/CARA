package com.webservices;
import java.util.List;
import com.webservices.dto.Book;
import com.webservices.dto.Library;

/**
 * Classe de web service des usagers
 * @author DJEBIEN Tarik
 * @author RAKOTOBE Sitraka Eric
 * WebService de gestion d'une bibliotheque
 * L'usager peut :
 */
public class UserWebService {
	
	/**
	 * Emprunter 1 livre (au maximum 3) pour une duree de 15 jours
	 * On ne peut pas emprunter un livre reserve par soi-même.
	 * @param isbn : l'isbn du livre a emprunter
	 * @param borrower : l'emprunteur du livre
	 * @return le livre emprunte
	 */
	public Book borrowBook(Long isbn , String borrower){
		return Library.getInstance().borrowBook(isbn, borrower);
	}
	
	/**
	 * Restituer un livre avant ou a l'expiration de ce delai de 15 jours. 
	 * Cela lui permet d'emprunter un nouveau livre
	 * @param isbn : l'isbn du livre a restituer
	 * @return le livre restitue
	 */
	public Book giveBackBook (Long isbn) {
		return Library.getInstance().giveBackBook(isbn);
	}
	
	/**
	 * Reserver un livre qui est emprunte. 
	 * On ne va pas reserver un livre non emprunte puisqu'il sufﬁt de l'emprunter. 
	 * On ne peut pas non plus emprunter un livre reserve par soi-même.
	 * @param isbn : l'isbn du livre a reserver :
	 * @param booker : l'usager qui veut reserver le livre
	 * @return le livre apres reservation
	 */
	public Book bookBorrowedBook (Long isbn , String booker) {
		return Library.getInstance().bookBorrowedBook(isbn,booker);
	}
	
	/**
	 * Consulter la liste des livres selon differents criteres 
	 * (auteur, titre, editeur, emprunteur)
	 * @param author auteur
	 * @param title titre
	 * @param editor editeur
	 * @param borrower emprunteur
	 * @return la liste des livres repondant aux criteres
	 */	
	public List<Book> getBooks(String author, String title, String editor, String borrower){
		return Library.getInstance().getBooksCriteria(author,title,editor,borrower);
	}
	
	/**
	 * Consulter les donnees associees a un livre 
	 * a partir de son titre ou de son ISBN (identiﬁant d'un livre)
	 * @param isbn : l'isbn du livre a chercher
	 * @return le livre ayant comme isbn celui en parametre
	 */	
	public String getBookDescription(Long isbn){
		return Library.getInstance().getBookDescription(isbn);
	}
}
