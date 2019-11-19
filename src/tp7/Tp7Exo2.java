package tp7;

import java.util.Scanner;

public class Tp7Exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer valeur 1: ");
		int a = sc.nextInt();
		System.out.println("Entrer valeur 2: ");
		int b = sc.nextInt();
		System.out.println("Entrer valeur 3: ");
		int c = sc.nextInt();
		System.out.println("Le nombre plus grand des 3 est: "+lePlusGrand(a, b, c));

	}
	
	public static int lePlusGrand(int a, int b, int c) {
		int nombrePlusGrand = 0;
		
		if (a>b) 
		{
			nombrePlusGrand=a;
		}
		else
		{
			nombrePlusGrand=b;
		}
		if (c>nombrePlusGrand)
		{
			nombrePlusGrand=c;
		}
		return nombrePlusGrand;
		
	}
	

}
