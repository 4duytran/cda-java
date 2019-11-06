package tp4;

import javax.swing.JOptionPane;

public class Tp4Exo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = JOptionPane.showInputDialog(null, "Entrer un nombre: ");
		int saisir = Integer.parseInt(text);
		int nb = 0;
		int n = 1;
		int somme = 0;
		String chaine = "";
		while (nb < saisir) {
			n++;
			if (nombrePremier(n)) {
				nb++;
				chaine += n;
				chaine += " + ";
				somme += n;
			}			
		}
		JOptionPane.showMessageDialog(null, chaine.substring(0, chaine.length() - 2) + " = " + somme);

	}
	
	public static boolean nombrePremier(int nb) {
		boolean flag = true;
		for (int i = 2; i < nb; i++) {
			if (nb%i==0) {
				flag = false;
			}
		}
		return flag;
	}

}
