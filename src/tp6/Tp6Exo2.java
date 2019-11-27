package tp6;

import java.util.Scanner;

public class Tp6Exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer une chaine de caractère: ");
		String maChaine = sc.nextLine().toLowerCase();
		String autreChaine="";
		StringBuilder buffer = new StringBuilder();		
		for (int i=0; i<maChaine.length();i++)
		{
			if(maChaine.charAt(i)== 'e')
			{
				buffer.append("");
			}
			else
			{
				buffer.append(maChaine.charAt(i));
			}
		}
		autreChaine = buffer.toString();
;		System.out.println(autreChaine);
		sc.close();

	}

}
