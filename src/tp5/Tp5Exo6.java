package tp5;

import java.util.Scanner;

public class Tp5Exo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer un nombre pour convertir: ");
		int nb = sc.nextInt();
		
		System.out.println(convertBaseSeize(nb));
		System.out.println(convertBinary(nb));
	}
	
	
	
	public static String convertBinary(int num){
		String maChaine = "";
		int rest=0;
		while (num >0)
		{
			rest= num%2;
			maChaine = rest + maChaine;
			num = num / 2;
		}
		
	     return maChaine;
	  }
	
	
	public static String convertBaseSeize(int num) {
		String maChaine =" ";
		char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		int rest =0;
		
		while (num > 0) 
		{
			rest = num%16;
			maChaine = hex[rest] + maChaine;
			num = num/16;
		}
		
		return maChaine;
	}
}

