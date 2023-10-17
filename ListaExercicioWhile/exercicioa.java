package ListaexercicioWhile;
import java.util.*;
public class exercicioa {
	public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	double J = 134, P = 145, ano = 1; 
	while(P > J) {
		J = J + 2.5;
		P = P + 2;
		ano++;
	}
	System.out.println("Joao ira ficar maior que Pedro depois de "+ano+" anos");
	in.close();
	}
}
