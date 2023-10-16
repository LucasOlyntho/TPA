package Exercicios;
import java.util.Scanner;
public class exercicio4 {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int num=14, media=0, div=1;
	 while(num<=72) {
		 media = num + media;
		 num++;
		 div++;
	 }
	 	media = media/div;
	 	System.out.println(" A média dos números entre 13 e 73 é "+media);
	 	in.close();
	}

}
