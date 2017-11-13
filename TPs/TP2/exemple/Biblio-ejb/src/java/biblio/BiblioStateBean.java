/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package biblio;

import javax.persistence.*;
import javax.ejb.Stateful;
import java.util.List;
import javax.persistence.Query;
/**
 *
 * @author roos
 */
@Stateful
public class BiblioStateBean implements BiblioStateRemote {
    
  @PersistenceContext(unitName = "Biblio-ejbPU")
  EntityManager persistance;

  public int essai () {
    
    return 1;
  }

 
}
