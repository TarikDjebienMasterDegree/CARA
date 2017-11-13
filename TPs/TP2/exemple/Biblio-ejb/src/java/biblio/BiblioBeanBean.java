/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package biblio;

import javax.persistence.*;
import javax.ejb.Stateless;
import java.util.List;
import javax.persistence.Query;
/**
 *
 * @author roos
 */
@Stateless
public class BiblioBeanBean implements BiblioBeanRemote {
    
  @PersistenceContext(unitName = "Biblio-ejbPU")
  EntityManager persistance;

  public List<String> liste(HelloITF h) {
    Query q = persistance.createNamedQuery("allbooks");
	try {
	h.say("yes");
	} catch(Exception e) {
	}
    return q.getResultList();
  }

  public void ajouter(String author, String title) {
    Book b = new Book();
    b.setTitle(title);
    b.setAuthor(author);
    persistance.persist(b);
  }

  public Book getLivre(String title) {
    String texteRequete = "SELECT b FROM Book AS b WHERE b.title=:btitle";
    Query requete = persistance.createQuery(texteRequete);
    Book resultat = null;
    try {
      resultat = (Book)requete.getSingleResult();
    } catch (NonUniqueResultException e) {
    } catch (EntityNotFoundException ee) {
    }
    return resultat;
  }
	
	public BiblioStateRemote connect()
	{   @EJB
		BiblioStateBean ej;
		return ej;
	}
}
