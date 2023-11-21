package ExercicioVetor;
import java.util.Scanner;
public class exercicio14 {
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int a[],b[],c[], i;
		final int  TAM=10;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		System.out.println("Vetor A");
		for (i=0;i<TAM;i++) {
			System.out.println("Coloque o seu "+(i+1)+"º valor");
			a[i] = in.nextInt();
		}
		
		System.out.println("Vetor B");
		for (i=0;i<TAM;i++) {
			System.out.println("Coloque o seu "+(i+1)+"º valor");
			b[i] = in.nextInt();
		}
		
		for(i=0;i<TAM;i++) {
			if(a[i]>b[i]) {
				c[i] += 1;
			}else if(a[i]==b[i]) {
				c[i] += 0;
			}else {
				c[i] += -1;
			}
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
		
		System.out.print("Vetor C [");
		for(i=0;i<TAM;i++){
		System.out.print(c[i]+" ");
		}
		System.out.println("]");
}
}