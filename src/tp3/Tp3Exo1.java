package tp3;

import java.util.Scanner;

public class Tp3Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lecture_clavier= new Scanner(System.in);
        boolean valeur1;
        byte valeur2;
        short valeur3;
        int valeur4;
        long valeur5;
        float valeur6;
        double valeur7;
        char valeur8;

		/*
		 * System.out.print("Saisir true ou false : ");
		 * valeur1=lecture_clavier.nextBoolean();
		 * System.out.println("bolean = "+valeur1);
		 * 
		 * System.out.print("Saisir un entier entre -128 et 127 : ");
		 * valeur2=lecture_clavier.nextByte(); System.out.println("byte = "+valeur2);
		 * 
		 * System.out.print("Saisir un entier entre -32768 et 32767 : ");
		 * valeur3=lecture_clavier.nextShort(); System.out.println("short = "+valeur3);
		 * 
		 * System.out.print("Saisir un entier entre -2147483 648 et 2147483 647 : ");
		 * valeur4=lecture_clavier.nextInt(); System.out.println("int = "+valeur4);
		 * 
		 * System.out.print("Saisir un entier : "); valeur5=lecture_clavier.nextLong();
		 * System.out.println("long = "+valeur5);
		 * 
		 * System.out.print("Saisir un decimal entre +/-1.4e-45 et +/-3.4e38 : ");
		 * valeur6=lecture_clavier.nextFloat(); System.out.println("float = "+valeur6);
		 * 
		 * System.out.print("Saisir un decimal : ");
		 * valeur7=lecture_clavier.nextDouble();
		 * System.out.println("double = "+valeur7);
		 */

        System.out.print("Saisir une chaine de caracateres : ");
        valeur8=lecture_clavier.next().charAt(10);
        System.out.println("char = "+valeur8);
	}

}
