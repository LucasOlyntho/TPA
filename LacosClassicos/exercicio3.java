package Exercicios;
import java.util.Scanner;
public class exercicio3 {
	public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	int multi;
	 for(int nu=1;nu<=10;nu++) {
		 System.out.println("Tabuada do "+nu);
	 for(int tabu=1; tabu<=10; tabu++) {
		 multi = nu*tabu;
		 System.out.println(""+nu+" x "+tabu+" = "+multi);
	 }
	 }
	 in.close();
}
}
