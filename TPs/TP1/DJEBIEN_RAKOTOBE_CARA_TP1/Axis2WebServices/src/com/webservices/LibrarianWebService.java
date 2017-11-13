package com.webservices;
import java.util.List;
import com.webservices.dto.Book;
import com.webservices.dto.Library;
import com.webservices.dto.User;

/**
 * WebService de gestion d'une bibliothèque
 * @author DJEBIEN Tarik
 * @author RAKOTOBE Sitraka Eric
 * Le bibliothécaire pourra : 
 */
public class LibrarianWebService {
	
	/**
	 * Methode pour tester facilement les webservices
	 * @param name : le nom de la personne a saluer
	 * @return : "hello" + <name> en parametre
	 */
	public String sayHello(String name){
		return "Hello "+name;
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
		return Library.getInstance().addBook(author, title, editor, borrower);
	}
	
	/**
	 * Supprime un livre dans la bibliotheque
	 * @param isbn : l'isbn du livre a supprimer
	 * @return le resultat de la suppression :
	 * vrai si la bibliotheque contient un livre avec
	 * l'isbn en parametre, faux sinon
	 */
	public Boolean deleteBook(Long isbn){
		return Library.getInstance().removeBook(isbn);
	}
	
	/**
	 * Consulter la liste des livres selon differents criteres
	 * @param author : l'auteur du livre
	 * @param title : le titre du livre
	 * @param editor : l'editeur du livre
	 * @param borrower : l'emprunteur du livre
	 * @return la liste des livres selon differents criteres
	 */
	public List<Book> getBooks(String author, String title, String editor, String borrower){
		return Library.getInstance().getBooksCriteria(author,title,editor,borrower);
	}
	
	/**
	 * Consulter les donnees associees a un livre a partir de son ISBN
	 * @param isbn l'identifiant d'un livre
	 * @return les donnees associees au livre
	 */
	public String getBookDescription(Long isbn){
		return Library.getInstance().getBookDescription(isbn);
	}
	
	
	
	
	
	/**
	 * Ajoute un usager a la bibliotheque
	 * @param name : le nom de l'utilisateur
	 * @param age : l'age de l'utilisateur
	 * @param address : l'addresse de l'utilisateur
	 * @return l'utilisateur ajoute
	 */
	public User addUser(String name, Integer age, String address){
		return Library.getInstance().addUser(name, age, address);
	}
	
	/**
	 * Supprimer un usager
	 * @param id : l'id de l'usager a supprimer
	 * @return : le resultat de la suppression
	 */
	public Boolean deleteUser(Long id){
		return Library.getInstance().removeUser(id);
	}
	
	/**
	 * Consulter la liste des usagers
	 * @return la liste de tous les usagers
	 */
	public List<User> getUsers(){
		return Library.getInstance().getAllUsers();
	}
	
	/**
	 * Consulter les donnees associees a un usager a partir de son nom
	 * @param name : le nom de l'usager
	 * @return : la description de l'usager
	 */
	public String getUserDescription(String name){
		return Library.getInstance().getUserDescription(name);
	}

}
