package ListaMatriz;
import java.util.Random;
public class exerciciob {
	public static void main(String args[]) {
		final int TAM=3;
		int a[][], i, j, col=0, menor, maior, posilinha, posicoluna;
		a = new int [TAM][TAM];
		Random in = new Random();
		
		for(i=0;i<TAM;i++) {
			for(j=0;j<TAM;j++) {
				a[i][j] = in.nextInt()%50;
			}
		}
		
		
		for(i=0;i<TAM;i++) {
			for(j=0;j<TAM;j++) {
				System.out.print(a[i][j]+" ");
				col++;
			}
			if(col>=TAM) {
				System.out.print("\n");
				col=0;
			}else {}
		}
		
		System.out.print("\n");
		
		menor = a[0][0];
		posilinha = 0;
		posicoluna = 0;
		maior = a[0][0];
		
		for(i=0;i<TAM;i++) {
			for(j=0;j<TAM;j++) {
				if(a[i][j]<menor) {
					menor = a[i][j];
					posilinha = i;
					posicoluna = j;
				}else {}
			}
		}
		
		System.out.println(menor+" e o menor numero da matriz e esta na posição "+posilinha+ ","+posicoluna+"\n");
		
		maior = a[0][0];
		posilinha = 0;
		posicoluna = 0;
		
		for(i=0;i<TAM;i++) {
			for(j=0;j<TAM;j++) {
				if(a[i][j]>maior) {
					maior = a[i][j];
					posilinha = i;
					posicoluna = j;
				}
			}
		}
		
		System.out.println(maior+" e o maior numero da matriz e esta na posição "+posilinha+ ","+posicoluna+"\n");
}
}