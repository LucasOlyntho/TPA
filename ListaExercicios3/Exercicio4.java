package listaexercicio3;
import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int prod;
		System.out.println("Coloque o codigo do produto");
		prod = in.nextInt();
		switch(prod) {
		case 1:
			System.out.println("Seu produto e o Cachorro Quente e possui o valor de R$8,00");
		break;
		case 2:
			System.out.println("Seu produto e o Cheeseburger e possui o valor de R$12,00");
		break;
		case 3:
			System.out.println("Seu produto e o X-Salada e possui o valor de R$15,00");
		break;
		case 4:
			System.out.println("Seu produto e o Misto Quente e possui o valor de R$11,00");
		break;
		case 5:
			System.out.println("Seu produto e o Pao na Chapa e possui o valor de R$6,00");
		break;
		default:
			System.out.println("codigo invalido");
		}
		in.close();
		}

	}


