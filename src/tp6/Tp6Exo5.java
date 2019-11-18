package tp6;

public class Tp6Exo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char monChar;
		String hexa;
		for(int i=32; i<128; i++)
		{
			monChar = (char) i;
			hexa = Integer.toHexString(i);
			System.out.print(i+" = "+monChar+" = "+hexa);
			System.out.println();
		}

	}

}
