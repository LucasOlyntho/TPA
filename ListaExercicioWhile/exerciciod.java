package ListaexercicioWhile;
import java.util.*;
public class exerciciod {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ant = 0, atu = 2, pro = 1, posi;
		System.out.println("Qual e a posicao do valor que queira saber da serie de Fibonacci?");
		posi = in.nextInt();
		while(atu<posi) {
			ant = pro - ant;
			pro = pro + ant;
			atu++;
		}
		System.out.println("O numero da  "+posi+"º posicao em Fibonacci e "+pro);
		in.close();
	}
}
