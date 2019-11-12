package tp5;

import java.util.Scanner;

public class Tp5Exo1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer un nombre pour définir le tableau principal: ");
		int tailleTab = sc.nextInt();
		int i=0 , j=0;
		int val = 0;
		for (i=0 ; i<tailleTab; i++)
		{
			val = 0;
			System.out.println("Donner la taille de tableau "+(i+1));
			int tailleTab1 = sc.nextInt();
			for (j=0 ; j <tailleTab1; j++)
			{
				int tab[][] = new int[tailleTab][tailleTab1];
				System.out.println("Entrer valeur "+(j+1)+" de tableau "+(i+1));
				int valeur = sc.nextInt();	
				tab[i][j] = valeur;	
				if (tab[i][j] > val) 
				{
					val = tab[i][j];
				}				
			}
			System.out.println("Le plus grand élément de tableau "+(i+1)+" est "+val);		
		}
		sc.close();

				
	}

}
