package tp5;

import java.util.Scanner;

public class Tp5Exo2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultat=0;
		int ligne1,col1,ligne2,col2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Le nombre de ligne pour le tableau 1: ");
		ligne1=sc.nextInt();
		System.out.println("Le nombre de colonne pour le tableau 1: ");
		col1=sc.nextInt();
		int tab1[][]=new int[ligne1][col1];
		
		for (int i=0; i<tab1.length;i++) 
		{
			for (int j=0; j<tab1[i].length; j++) {
				System.out.println("Entrer éléments pour le tableau1: "+i+" "+j);
				tab1[i][j] = sc.nextInt();
			}
		}
		
		ligne2=col1;
		System.out.println("Le nombre de colonne pour le tableau 2: ");
		col2=sc.nextInt();
		
		int tab2[][]=new int[ligne2][col2];
		
		for (int i=0; i<tab2.length;i++) 
		{
			for (int j=0; j<tab2[i].length; j++) {
				System.out.println("Entrer éléments pour le tableau 2: "+i+" "+j);
				tab2[i][j] = sc.nextInt();				
			}			
		}
		
		System.out.println("La matrice 1 \r");
		tabAffichage(tab1);
		System.out.println("La matrice 2 \r");
		tabAffichage(tab2);
		int tabMultiple [][] = new int[ligne1][col2];
		
		
		
		for (int c = 0; c < ligne1; c++)
        {
           for (int d = 0; d < col2; d++)
           {  
              for (int k = 0; k < ligne2; k++)
              {
                 resultat += tab1[c][k]*tab2[k][d];
              }
              
              tabMultiple[c][d] = resultat;
              resultat= 0;
              
           }
        }
		
		System.out.println("La Multiplication de 2 matrice \r");
		tabAffichage(tabMultiple);
	
		sc.close();
	}
	
	
	
	static void tabAffichage(int tab[][]) {
		int i,j;
		for (i=0; i<tab.length; i++)
		{
			for (j=0; j<tab[i].length;j++)
			{
				System.out.print(tab[i][j]+" ");
			}
			System.out.println();
		}
	}

}
