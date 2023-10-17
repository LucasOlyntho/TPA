package Exercicios;
import java.util.Scanner;
public class exercicio2 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int num, verific=1, primo=0;
	System.out.println("Qual é o seu número?");
	num = in.nextInt();
	while(verific <= num){
		if(num%verific==0){
			primo = primo+1;
		}else {}
		verific++;
	}
	if(primo<3 && primo>1) {
	System.out.println("seu número "+num+" é primo");
	}else {
		System.out.println("seu número "+num+" não é primo");
	}
	in.close();
	}

}
