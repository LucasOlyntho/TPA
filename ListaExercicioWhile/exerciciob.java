package ListaexercicioWhile;
import java.util.*;
public class exerciciob {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long num, fator;
		System.out.println("Coloque o número que você quer o fatorial");
		num = in.nextLong();
		fator = num-1;
		while(fator>1) {
			num *= fator;
			fator -= 1;
		}
		System.out.println("O fatorial do seu numero e "+num);
		in.close();
	}

}
