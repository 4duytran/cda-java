package tp4;

import javax.swing.JOptionPane;


public class Tp4Exo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = JOptionPane.showInputDialog(null, "Saisir un nombre: ");
		int nb = Integer.parseInt(text);
		int bit = convertBinary(nb);
		JOptionPane.showMessageDialog(null, bit);
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
