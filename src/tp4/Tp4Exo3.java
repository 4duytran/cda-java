package tp4;

import java.util.Scanner;

public class Tp4Exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Saisir = new Scanner(System.in);
		System.out.println("Entrer un nombre: ");
		int nb = Saisir.nextInt();
		String chaine = "";
		for (int i = 0; i < nb; i++) {
			chaine += "*";
			System.out.println(chaine);
		}
		Saisir.close();
	}

}
