package tp6;

import java.util.Scanner;

public class Tp6Exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer une chaine de cacactère: ");
		String maChaine = sc.nextLine();
		String autreChaine ="";
		
		for (int i=(maChaine.length()-1); i>=0; i--)
		{
			autreChaine += maChaine.charAt(i);
		}
		System.out.print(autreChaine);
		sc.close();
	}

}
