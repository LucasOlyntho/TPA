package listaexercicio3;
import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int mes, dia;
		
			System.out.println("Escreva seu mes de nascimento (numero do mes)");
			mes = in.nextInt();
			System.out.println("Escreva seu dia de nascimento (numero do dia)");
			dia = in.nextInt();
			switch(mes) {
			case 1:
				if(dia<21 && dia>=1) {
					System.out.println("Voce tem o signo de Capricornio");
				}else if(dia>=21 && dia<=31) {
					System.out.println("Voce tem o signo de Aquario");
				}else {
					System.out.println("Dia invalido");
				}
			break;
			case 2:
				if(dia<18 && dia>=1) {
					System.out.println("Voce tem o signo de Aquario");
				}else if(dia>=18 && dia<=28) {
					System.out.println("Voce tem o signo de Peixes");
				}else {
					System.out.println("Dia invalido");
				}
			break;
			case 3:
				if(dia<18 && dia>=1) {
					System.out.println("Voce tem o signo de Peixes");
				}else if(dia>=18 && dia<=31) {
					System.out.println("Voce tem o signo de Aries");
				}else {
					System.out.println("Dia invalido");
				}
			break;
			case 4:
				if(dia<20 && dia>=1) {
					System.out.println("Voce tem o signo de Aries");
				}else if(dia>=20 && dia<=30) {
					System.out.println("Voce tem o signo de Touro");
				}else {
					System.out.println("Dia invalido");
				}
			break;
			case 5:
				if(dia<21 && dia>=1) {
					System.out.println("Voce tem o signo de Touro");
				}else if(dia>=21 && dia<=31) {
					System.out.println("Voce tem o signo de Gemeos");
				}else {
					System.out.println("Dia invalido");
				}
			break;
			case 6:
				if(dia<21 && dia>=1) {
					System.out.println("Voce tem o signo de Gemeos");
				}else if(dia>=21 && dia<=30) {
					System.out.println("Voce tem o signo de Cancer");
				}else {
					System.out.println("Dia invalido");
				}
			break;
			case 7:
				if(dia<22 && dia>=1) {
					System.out.println("Voce tem o signo de Cancer");
				}else if(dia>=22 && dia<=31) {
					System.out.println("Voce tem o signo de Leao");
				}else {
					System.out.println("Dia invalido");
				}
			break;
			case 8:
				if(dia<23 && dia>=1) {
					System.out.println("Voce tem o signo de Leao");
				}else if(dia>=23 && dia<=31) {
					System.out.println("Voce tem o signo de Virgem");
				}else {
					System.out.println("Dia invalido");
				}
			break;
			case 9:
				if(dia<23 && dia>=1) {
					System.out.println("Voce tem o signo de Virgem");
				}else if(dia>=23 && dia<=30) {
					System.out.println("Voce tem o signo de Libra");
				}else {
					System.out.println("Dia invalido");
				}
			break;
			case 10:
				if(dia<23 && dia>=1) {
					System.out.println("Voce tem o signo de Libra");
				}else if(dia>=23 && dia<=31) {
					System.out.println("Voce tem o signo de Escorpiao");
				}else {
					System.out.println("Dia invalido");
				}
			break;
			case 11:
				if(dia<22 && dia>=1) {
					System.out.println("Voce tem o signo de Escorpiao");
				}else if(dia>=22 && dia<=30) {
					System.out.println("Voce tem o signo de Sagitario");
				}else {
					System.out.println("Dia invalido");
				}
			break;
			case 12:
				if(dia<22 && dia>=1) {
					System.out.println("Voce tem o signo de Sagitario");
				}else if(dia>=22 && dia<=31) {
					System.out.println("Voce tem o signo de Capricornio");
				}else {
					System.out.println("Dia invalido");
				}
			break;
			default:
				System.out.println("Mes invalido");
			} 
			in.close();
		}

	}

