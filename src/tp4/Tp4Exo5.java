package tp4;

import javax.swing.JOptionPane;

public class Tp4Exo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int code_access = 2604;
		int nb_essai = 0;
		boolean essai = true;
		while (essai) {
			String text = JOptionPane.showInputDialog(null, "Veuillez entrer le code d'access: ");
			int code = Integer.parseInt(text);
			if (code == code_access) {
				JOptionPane.showMessageDialog(null, "Merci vous etes connecté", "Information", JOptionPane.INFORMATION_MESSAGE);
				essai = false;
			}
			else {
				JOptionPane.showMessageDialog(null, "Merci de réessayer\n" + "Il vous reste " + (4 - nb_essai) + " Essai", "Code Erreur", JOptionPane.WARNING_MESSAGE );
				nb_essai++;
				if (nb_essai == 5) {
					JOptionPane.showMessageDialog(null, "Vous ne pouvez plus vous connecter", "Bloquer", JOptionPane.ERROR_MESSAGE);
				essai = false;	
				}
			}
			
		}
	}

}
