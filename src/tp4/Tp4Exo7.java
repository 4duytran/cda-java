package tp4;

import javax.swing.JOptionPane;


public class Tp4Exo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = JOptionPane.showInputDialog(null, "Saisir un nombre Decimal: ");
		int n = Integer.parseInt(text);
		int binaire = convertBinary(n);
		String text_2 = JOptionPane.showInputDialog(null, "Saisir un nombre de Bit: ");
		int bit = Integer.parseInt(text_2);
		int mask = 1 << bit;
		if ((n & mask) == 0) {
			JOptionPane.showMessageDialog(null,"Le decimal " + n + " est égale à " + binaire + " en Binaire avec le Bit " + bit + " est égale à 0");
		}
		else if ((n & mask) != 0)  {
			JOptionPane.showMessageDialog(null, "Le decimal " + n + " est égale à " + binaire + " en Binaire avec le Bit " + bit + " est égale à 1");
		}
		
	}
	
	
	public static int convertBinary(int num){
	     int binary[] = new int[32];
	     int index = 0;
	     int nb = 0;
	     String chaine = "";
	     while(num > 0){
	       binary[index++] = num%2;
	       num = num/2;
	     }
	     for(int i = index-1;i >= 0;i--){
	       chaine += (binary[i]);
	     }
	     nb = Integer.parseInt(chaine);
	     return nb;
	  }

}
