/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package biblio;
import javax.naming.Context;

/**
 *
 * @author roos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       Context ctx = new javax.naming.InitialContext();
       BiblioBeanRemote bb = (BiblioBeanRemote) ctx.lookup(BiblioBeanRemote.class.getName());
	   HelloITF h = new HelloImpl();
       bb.ajouter("Balzac", "Eugenie Grandet");
       bb.ajouter("Hugo", "Les Miserables");
       java.util.List<String> lt = bb.liste(h);
       for(String t:lt) System.out.println(t);
   }

}
