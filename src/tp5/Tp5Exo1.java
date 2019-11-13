package tp5;

import java.util.Scanner;

public class Tp5Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int taile;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer la taile du tableau: ");
		taile = sc.nextInt();

		int tab[] = new int[taile];
		for (i=0; i<tab.length; i++)
		{
			System.out.println("Enter un valeur: ");
			int valeur = sc.nextInt();
			tab[i] = valeur;
		}
		int plusGrandValeur = 0;
		for (i=0; i<tab.length; i++)
		{
			if (tab[i] > plusGrandValeur)
			{
				plusGrandValeur=tab[i];
			}
		}
		System.out.println("Le plus grand valeur dans ce tableau est: "+plusGrandValeur);
		sc.close();
	}

}
