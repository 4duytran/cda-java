package tp5;

import java.util.Scanner;

public class Tp5Exo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer un mot: ");
		String mot = sc.next();
		int j=0;
		boolean flag = true;
		for (int i=0; i<mot.length();i++ ) 
		{
			++j;			
			if(mot.substring(i, j).equals(mot.substring(mot.length()-j, mot.length()-i))) 
			{
				flag = true;
				
			}
			else
			{
				flag = false;
			}
			
		}
		if (flag)
		{
			System.out.println("Ce mot est un mot Palindrome");
		}
		else
		{
			System.out.println("N'est pas un mot Palindrome");
		}
		
		sc.close();
	}

}
