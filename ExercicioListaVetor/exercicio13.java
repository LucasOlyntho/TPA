package ExercicioVetor;
import java.util.Scanner;
public class exercicio13 {
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int a[],b[], i;
		final int  TAM=10;
		a = new int [TAM];
		b = new int [TAM];
		
		for (i=0;i<TAM;i++) {
			System.out.println("Coloque o seu "+(i+1)+"º valor");
			a[i] = in.nextInt();
		}
		for(i=0;i<TAM;i++) {
		if(a[i]%2==0) {
			b[i] += 1;
		}else {}
		}
		
		System.out.print("Vetor A [");
		for(i=0;i<TAM;i++){
		System.out.print(a[i]+" ");
		}
		System.out.println("]");
		
		System.out.print("Vetor B [");
		for(i=0;i<TAM;i++){
		System.out.print(b[i]+" ");
		}
		System.out.println("]");
}
}