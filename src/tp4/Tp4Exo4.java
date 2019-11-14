package tp4;

import javax.swing.JOptionPane;

public class Tp4Exo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = JOptionPane.showInputDialog(null, "Entrer un nombre: ");
		int nb = Integer.parseInt(text);
		boolean verif = true;
		int resultat = 0;
		String chaine = premier(nb);
		for (int i = 2; i <= nb/2; i++) {
			resultat = nb % i;
			if (resultat == 0) {
				verif = false;
				break;
			}			
		}
		if (verif && nb>=2) {
			JOptionPane.showMessageDialog(null, nb + " est un nombre premier" +  "\nLa liste des nombre premier sont\n" + chaine);
		}
		else {
			JOptionPane.showMessageDialog(null, nb + " N'est pas un nombre premier"  + "\nLa liste des nombre premier sont\n" + chaine);
		}
	}
	
	public static String premier(int n) {
		String chaine = "";
		for(int d=2;d<n; d++) {
			if ( estPremier(d) == true ) {
				chaine += d;
				chaine += " \n";
			}
		}
		return chaine;
	}
	
	public static boolean estPremier(int n) {
		boolean flag = true;
		for (int e = 2; e < n; e++) {
			if (n%e ==0) {
				flag = false;			
			}
		}
		return flag;
	}

}
