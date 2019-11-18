package tp6;

import java.util.Scanner;

public class Tp6Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer une chaine de caractère: ");
		String maChaine = sc.nextLine().toLowerCase();
		int compteur =0;
		for (int i=0; i<maChaine.length();i++)
		{
			if(maChaine.charAt(i)== 'e')
			{
				compteur++;
			}
		}
		System.out.println("Il y a "+compteur+" lettre e dans la chaine");
		sc.close();
	}

}
