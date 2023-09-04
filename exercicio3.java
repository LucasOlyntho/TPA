import java.util.Scanner;
public class exercicio3 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i=1, num, result;
		System.out.println("Informe o número que queira saber a tabuada");
		num = in.nextInt();
		System.out.println("Tabuada do "+num);
		while(i<=10) {
			result = num*i;
			System.out.println(""+num+" x "+i+" = "+result);
		i++;
		}
		in.close();
	}
}