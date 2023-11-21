package ExercicioVetor;
import java.util.Scanner;
public class exercicio15 {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int a[], i, j, subs;
		a = new int [TAM];
		
		for (i=0;i<TAM;i++) {
			System.out.println("Coloque o seu "+(i+1)+"º valor");
			a[i] = in.nextInt();
		}
		
		for (i=0;i<TAM;i++) {
		for (j=0;j<TAM;j++) {
			if(a[i]>a[j]) {
				subs = a[i];
				a[i] = a[j];
				a[j] = subs;
			}else {}
		}
		}
		
		System.out.print("Decrescente = ");
		for (i=0;i<TAM;i++) {
		System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for (i=0;i<TAM;i++) {
			for (j=0;j<TAM;j++) {
				if(a[i]<a[j]) {
					subs = a[i];
					a[i] = a[j];
					a[j] = subs;
				}else {}
			}
			}
		
		System.out.print("Crescente = ");
		for (i=0;i<TAM;i++) {
		System.out.print(a[i]+" ");
		}
		System.out.println();
}
}