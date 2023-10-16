package Exercicios;
import java.util.Scanner;
public class exercicio1 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double num=1, idade, faixa1=0, faixa2=0, faixa3=0, faixa4=0, faixa5=0, porcentagem;
		do { 
			System.out.println("Qual a sua idade?");
			idade = in.nextInt();
			if(idade<=15) {
				faixa1++;
			}else if(idade<=30) {
				faixa2++;
			}else if(idade<=45) {
				faixa3++;
			}else if(idade<=60) {
				faixa4++;
			}else {
				faixa5++;
			}
			num++;
		}while(num<=15);
		System.out.println("A quantidade e porcentagem de cada faixa ficou:");
		System.out.println("Faixa 1:");
		System.out.println("Número = "+faixa1+" pessoas");
		porcentagem = (faixa1/15)*100;
		System.out.println("Porcentagem = "+porcentagem+"%");
		System.out.println("Faixa 2:");
		System.out.println("Número = "+faixa2+" pessoas");
		porcentagem = (faixa2/15)*100;
		System.out.println("Porcentagem = "+porcentagem+"%");
		System.out.println("Faixa 3:");
		System.out.println("Número = "+faixa3+" pessoas");
		porcentagem = (faixa3/15)*100;
		System.out.println("Porcentagem = "+porcentagem+"%");
		System.out.println("Faixa 4:");
		System.out.println("Número = "+faixa4+" pessoas");
		porcentagem = (faixa4/15)*100;
		System.out.println("Porcentagem = "+porcentagem+"%");
		System.out.println("Faixa 5:");
		System.out.println("Número = "+faixa5+" pessoas");
		porcentagem = (faixa5/15)*100;
		System.out.println("Porcentagem = "+porcentagem+"%");
		in.close();
	}
}
