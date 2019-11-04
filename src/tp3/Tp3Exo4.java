package tp3;

import javax.swing.JOptionPane;

public class Tp3Exo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minuite;
		int heure;
		int ressec;
		
		String Saisir = JOptionPane.showInputDialog(null, "Entrer nombre seconde: ");
		int sec = Integer.parseInt(Saisir);
		minuite = (int)(sec / 60);
		ressec = sec % 60;
		if (minuite >= 60) {
			heure = (int)(minuite / 60);
			minuite = minuite % 60;
			JOptionPane.showMessageDialog(null, heure + "H " + minuite + "Min " + ressec + "sec");
			
		}
		else {
			JOptionPane.showMessageDialog(null, minuite + "Min " + ressec + "Sec");
			
	}

}
}
