package tp2;

import java.util.Scanner;

public class Tp2Exo1 {

	public static void main(String[] args) {
		Scanner Saisir = new Scanner(System.in);
		int valeur1;
		int valeur2;
		int valeur;
		System.out.print("Entre nombre 1: ");
		valeur1 = Saisir.nextInt();
		System.out.println("Entre nombre 2: ");
		valeur2 = Saisir.nextInt();
		valeur = valeur1 + valeur2;
		System.out.println("Total les 2 valeurs sont: "+ valeur);
		Saisir.close();
	}

}