package ListaexercicioWhile;
import java.util.*;
public class exercicioc {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int base, exp, mult;
		System.out.println("Qual e a base?");
		base = in.nextInt();
		System.out.println("Qual e o expoente");
		exp = in.nextInt();
		mult = base;
		while(exp>1) {
			mult = mult*base;
			exp = exp-1;
		}
		System.out.println("O valor da sua potencia e "+mult);
		in.close();
	}
}