/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package biblio;

import javax.ejb.EJB;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author roos
 */
public class Main2 extends JFrame {

  @EJB
  private static BiblioBeanRemote bb;

    
  public static void main(String[] args) throws Exception {
    JFrame j = new JFrame("Biblio");

    // Fixer la taille de la fenÍtre.
    j.setSize(400, 300);

    // CrÈer la liste des lignes affichÈes.
    JTextArea lignes = new JTextArea(40, 20);
    lignes.setEditable(false);

    // Obtenir le panel contenu par la fenÍtre.
    java.awt.Container contentPane = j.getContentPane();

    // Fixer la mise en forme du panel.
    contentPane.setLayout(new java.awt.BorderLayout());

    // Ajouter un panel scrollable pour afficher les lignes.
    contentPane.add(
      java.awt.BorderLayout.CENTER,
      new javax.swing.JScrollPane(lignes)
    );
	
	j.show();
	
       bb.ajouter("Balzac", "Eugenie Grandet");
       bb.ajouter("Hugo", "Les Miserables");
       java.util.List<String> lt = bb.liste();
       for(String t:lt) lignes.append(t + '\n');
   }

}
