import java.util.Scanner;
public class exercicio3 {
 public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	 double mul;	
	 for(int i=1;i<=100;i++) {
		 System.out.println(""+i);
		 mul = i%10;
	 if(mul==0) {
		 System.out.println("O numero acima e multiplo de 10");
	 }
	 
	 }		 
	in.close();
}
}
