package tp5;


import java.util.Arrays;
import java.util.Scanner;

public class Tp5Exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner la taille du tableau: ");
		int taille = sc.nextInt();
		int tab[] = new int[taille];
		
		for (int i=0; i<tab.length; i++) 
			{
				System.out.println("Donner le valeur "+i+" ");
				tab[i] = sc.nextInt();		
			}
		System.out.println(Arrays.toString(tab));
		System.out.println(triTableau(tab));
		sc.close();
	}
	
	
	public static String triTableau (int tab[]) {
		
		int i,j,nb;
		nb = tab.length -1;
		for (i=nb; i>=0; i--) 
		{
			for (j=1; j<=i ; j++)
			{
				if (tab[j] < tab[j-1])
				{
					int valeur = tab[j-1];
					tab[j-1] = tab[j];
					tab[j] = valeur;
				}
			}
		}
		return Arrays.toString(tab);
	}
	

}
