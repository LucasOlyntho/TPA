package listaexercicio3;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sala, mb, b, r, i, porc;
		String nota;
		System.out.println("Quantos alunos tiraram mb.");
		mb = in.nextInt();
		System.out.println("Quantos alunos tiraram b.");
		b = in.nextInt();
		System.out.println("Quantos alunos tiraram r.");
		r = in.nextInt();
		System.out.println("Quantos alunos tiraram i.");
		i = in.nextInt();
		sala = mb+b+r+i; 
		System.out.println("A sala possui "+sala+" alunos. De qual nota voce quer saber a porcentagem de alunos comparado ao total?");
		nota = in.next();
		switch(nota) {
		case "mb":
		case "Mb":
		case "MB":
		case "mB":
		porc = (mb*100)/sala;
		System.out.println("A porcentagem de alunos mb comparado com a sala é "+porc+"%");
		break;
		case "B":
		case "b":
		porc =  (b*100)/sala;
		System.out.println("A porcentagem de alunos b comparado com a sala é "+porc+"%");
		break;
		case "r":
		case "R":
		porc =  (r*100)/sala;
		System.out.println("A porcentagem de alunos r comparado com a sala é "+porc+"%");
		break;
		case "i":
		case "I":
		porc =  (i*100)/sala;
		System.out.println("A porcentagem de alunos i comparado com a sala é "+porc+"%");
		break;
		default:
			System.out.println("Nota inválida");
		}
		in.close();
	}
}
