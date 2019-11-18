
public class Tp5Exo6 {

	public static void main(String[] args) {
		int nb = 2%10;
		System.out.println(nb);
	}
	
	
	
	public static int convertBinary(int num){
	     int binary[] = new int[32];
	     int index = 0;
	     int nb = 0;
	     String chaine = "";
	     while(num > 0){
	       binary[index++] = num%2;
	       num = num/2;
	     }
	     for(int i = index-1;i >= 0;i--){
	       chaine += (binary[i]);
	     }
	     nb = Integer.parseInt(chaine);
	     return nb;
	  }
	
	
	public static String convertBaseSeize(int num) {
		String maChaine =" ";
		
		return maChaine;
	}
}
