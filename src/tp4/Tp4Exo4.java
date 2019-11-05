package tp4;

import javax.swing.JOptionPane;

public class Tp4Exo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = JOptionPane.showInputDialog(null, "Entrer un nombre: ");
		int nb = Integer.parseInt(text);
		int n = 0;
		for (int i = 1; i < nb; i++) {
			int resultat = nb % i;
			if (resultat == 0) {
				n++;
			}
		}
		if (n <= 2) {
			JOptionPane.showMessageDialog(null, nb + " est un nombre premier");
		}
		else {
			JOptionPane.showMessageDialog(null, nb + " N'est pas un nombre premier");
		}
	}

}
