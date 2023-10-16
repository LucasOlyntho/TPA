package listaexercicio3;
import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade;
		System.out.println("Coloque sua idade");
		idade = in.nextInt();
		switch(idade) {
		case 6:
			System.out.println("Voce esta no grupo dente de leite ");
		break;
		case 7:
			System.out.println("Voce esta no grupo junior ");
		break;
		case 8:
			System.out.println("Voce esta no grupo junior max ");
		break;
		case 9:
			System.out.println("Voce esta no grupo junior master ");
		break;
		case 10:
			System.out.println("Voce esta no grupo master ");
		break;
		default:
			System.out.println("Grupo nao existente ou idade invalida");
		}
		in.close();
		}

	}

