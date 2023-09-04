import java.util.Scanner;
public class exercicio4 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i=100, num=1, resul;
		while(i>=1 & num<=99) {
			resul = num+i;
			System.out.println(num+" + "+i+" = "+resul);
			i=i-1;
			num=num+1;
		}
		in.close();
}
}
