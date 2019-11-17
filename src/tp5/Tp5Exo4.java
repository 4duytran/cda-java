package tp5;


import java.util.Locale;
import java.util.Scanner;

public class Tp5Exo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.println("Entrer nombre de note: ");
		int nb = sc.nextInt();
		double tabNote[] = new double[nb];
		int compteur = 0;
		double somme = 0;
		double lesNote=0;
		int i=0;
		while (compteur < nb) {
			System.out.println("Enter nombre de note "+(compteur+1)+" : ");
			float note = sc.nextFloat();
			tabNote[compteur] = note;
			lesNote += note;
			compteur++;
		}
		
		somme = (lesNote / nb);
		String s = String.format("%.2f", somme);
		String []c = s.split(",");
		s = String.join(".", c);
		somme = Double.parseDouble(s);
		System.out.println(somme);	
		
		for (double note: tabNote) 
		{
			if (note>somme) 
			{
				i++;
			}
		}
		System.out.println("Nombre de note supérieur a la moyenne: "+i);
		sc.close();
	}

}
