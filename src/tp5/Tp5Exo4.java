package tp5;


import java.util.Locale;
import java.util.Scanner;

public class Tp5Exo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.println("Entrer nombre de note: ");
		int nb = sc.nextInt();
		float tabNote[] = new float[nb];
		int compteur = 0;
		float somme = 0;
		float lesNote=0;
		int i=0;
		while (compteur < nb) {
			System.out.println("Enter nombre de note "+(compteur+1)+" : ");
			float note = sc.nextFloat();
			note = (float) (Math.floor(note*100)/100);
			tabNote[compteur] = note;
			lesNote += note;
			compteur++;
		}
		
		somme = (lesNote / nb);
		somme = (float) (Math.floor(somme*100)/100);
		System.out.println(somme);	
		
		for (float note: tabNote) 
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
