package tp7;

import java.util.Locale;
import java.util.Scanner;

public class Tp7Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println("Entrer un nombre de rayon: ");
		double rayon = sc.nextDouble();
		System.out.println("La Périmettre = "+perimettre(rayon));
		System.out.println("La surface = "+surface(rayon));
		sc.close();

	}
	
	
	public static double perimettre(double rayon) {
		double perimettre= 2*Math.PI*rayon;
		return perimettre;	
	}
	
	public static double surface(double rayon) {
		double surface = Math.PI * Math.pow(rayon, 2);
		return surface;
	}
	
	

}
