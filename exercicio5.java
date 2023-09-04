import java.util.Scanner;
public class exercicio5 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i=1, pessoa, maior=0, menor=0;
		while(i<=10) {
			System.out.println("Qual a idade da pessoa "+i+"?");
			pessoa = in.nextInt();
			if(pessoa>=18) {
				maior = maior+1;
			}else {
				menor = menor+1;
			}
		i++;
		}
		System.out.println(maior+" pessoas sao maiores de idade e "+menor+" sao menores de idade");
		in.close();
}
}