package ExercicioVetor;
import java.util.Scanner;
public class exercicio12 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		final int TAM=10;
		int a[],b[], i, num, palin=0;
		a = new int [TAM];
		b = new int [TAM];
		
		System.out.println("Qual é o tamanho do seu numero? Limite = 10 numeros");
		num = in.nextInt();
		
		for (i=0;i<num;i++) {
			System.out.println("Coloque o seu "+(i+1)+"º numero");
			a[i] = in.nextInt();
		}
		
		for (i=0;i<num;i++) {
			 b[(num-1)-i] = a[i];
		}
		
		for (i=0;i<num;i++) {
			if(a[i] == b[i]) {
				palin++;
			}else {}
		}
		
		if(palin == num) {
			System.out.println("Seu numero e um palindromo");
		}else {
			System.out.println("Seu numero nao e um palindromo");
		}
	}
}
