package tp6;

public class Tp6Exo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char monChar;
		String hexa;
		for(int i=128; i<256; i++)
		{
			monChar = (char) i;
			hexa = Integer.toHexString(i);
			System.out.print(i+" = "+monChar+" = "+hexa);
			System.out.println();
		}
		
		for(int i=256; i<352; i++)
		{
			monChar = (char) i;
			hexa = Integer.toHexString(i);
			System.out.print(i+" = "+monChar+" = "+hexa);
			System.out.println();
		}

	}

}
