/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package biblio;

import javax.ejb.Remote;
import java.util.List;
/**
 *
 * @author roos
 */
@Remote
public interface BiblioBeanRemote {
    public List<String> liste(HelloITF h);
    public void ajouter(String author, String title);
    public Book getLivre(String title);
	public BiblioStateRemote connect();
}
