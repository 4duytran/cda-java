package tp6;

import java.util.Scanner;

public class Tp6Exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer une chaine de caractère: ");
		String maChaine = sc.nextLine().toLowerCase();
		String autreChaine="";
		
		for (int i=0; i<maChaine.length();i++)
		{
			if(maChaine.charAt(i)== 'e')
			{
				autreChaine += "";
			}
			else
			{
				autreChaine += maChaine.charAt(i);
			}
		}
		System.out.println(autreChaine);
		sc.close();

	}

}
