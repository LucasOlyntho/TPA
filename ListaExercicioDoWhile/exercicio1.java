import java.util.Scanner;
public class exercicio1 {
 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int p=0;
		do{
			System.out.println(""+p);
			p = p+2;
		}while(p<501);
		in.close();
}
}
