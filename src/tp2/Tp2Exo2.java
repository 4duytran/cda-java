package tp2;

import javax.swing.JOptionPane;

public class Tp2Exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = JOptionPane.showInputDialog(null, "Entrer valeur 1: ");
		int valeur1 = Integer.parseInt(text);
		String text2 = JOptionPane.showInputDialog(null, "Entrer le valeur2: ");
		int valeur2 = Integer.parseInt(text2);
		int valeur = valeur1 + valeur2;
		JOptionPane.showMessageDialog(null, valeur);	
	}

}
