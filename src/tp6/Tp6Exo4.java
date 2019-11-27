package tp6;

import java.util.Arrays;
import java.util.Scanner;

public class Tp6Exo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer une chaine de caractère: ");
		String maChaine = sc.nextLine().toLowerCase();
		String autreChaine="";
		StringBuilder buffer = new StringBuilder();
		for (int i=0; i<maChaine.length();i++)
		{
			if(maChaine.charAt(i)== ' ')
			{
				buffer.append("");
			}
			else
			{
				buffer.append(maChaine.charAt(i));
			}
		}
		autreChaine = buffer.toString();
		char maTab[]=autreChaine.toCharArray();
		System.out.println(triTableau(maTab));;
		sc.close();
	}
	
	
public static String triTableau (char tab[]) {
		
		int i,j,nb;
		nb = tab.length -1;
		for (i=nb; i>=0; i--) 
		{
			for (j=1; j<=i ; j++)
			{
				if (tab[j] < tab[j-1])
				{
					char valeur = tab[j-1];
					tab[j-1] = tab[j];
					tab[j] = valeur;
				}
			}
		}
		return Arrays.toString(tab);
	}

}
