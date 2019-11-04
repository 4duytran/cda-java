package tp4;

import javax.swing.JOptionPane;

public class Tp4Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String note = JOptionPane.showInputDialog(null, "Combien de note?: ");
		int nb_note = Integer.parseInt(note);
		String chaine = "";
		float resultat = 0;
		for (int i = 1; i <= nb_note; i++) {
			String text = JOptionPane.showInputDialog(null,"Total de note: " + nb_note + "\n" + chaine + " Entrer une note " + i);
			int note_1 = Integer.parseInt(text);
			chaine += "Note " + i + " : " + note_1 + "\n";
			resultat += note_1;
		}
		resultat = resultat / nb_note;
		JOptionPane.showMessageDialog(null, "Le moyen est de ces " + nb_note +" notes est " + resultat);			
	}
}