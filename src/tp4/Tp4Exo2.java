package tp4;

import javax.swing.JOptionPane;

public class Tp4Exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nb_note = 1;
		int note = 0;
		int resultat = 0;
		String chaine = "";
		while (note >= 0) {
			String text = JOptionPane.showInputDialog(null, chaine + " Entrer une note " + nb_note);
			note = Integer.parseInt(text);
			chaine += "Note " + nb_note + " : " + note + "\n";
			resultat += note;
			nb_note++;
		}
		resultat = resultat / nb_note;
		JOptionPane.showMessageDialog(null, "Le moyen est de ces " + nb_note +" notes est " + resultat);
	}
}
 
