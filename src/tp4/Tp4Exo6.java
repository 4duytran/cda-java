package tp4;

import javax.swing.JOptionPane;

public class Tp4Exo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = JOptionPane.showInputDialog(null, "Entrer un nombre: ");
		int saisir = Integer.parseInt(text);
		int nb = 0;
		int n = 2;
		int somme = 0;
		String chaine = "";
		
		while (nb < saisir) {
			n++;
			if (Tp4Exo4.estPremier(n)) {				
				nb++;
				chaine += n;
				chaine += " + ";
				somme += n;
			}			
		}
		JOptionPane.showMessageDialog(null, chaine.substring(0, chaine.length() - 2) + " = " + somme);

	}
	

}
