package ListaMatriz;
import java.util.Random;
public class exercicioc {
	public static void main(String args[]) {
		Random in  = new Random();
		int a[][], i, j, soma=0, LINHA=3, COL=4,col=0;
		a = new int [LINHA][COL];
		
		for(i=0;i<LINHA;i++) {
			for(j=0;j<COL;j++) {
				a[i][j] = in.nextInt()%100;
				if(j==LINHA) {
					a[i][j] = soma;
					soma=0;
				}else {
					soma = soma+a[i][j];
				}
			}
		}
		
		for(i=0;i<LINHA;i++) {
			for(j=0;j<COL;j++) {
				if(col==LINHA) {
					System.out.print("soma = "+a[i][j]+" \n");
					col=0;
				}else {
				System.out.print(a[i][j]+" ");
				col++;
				}
			}
		}
		

	}
}
