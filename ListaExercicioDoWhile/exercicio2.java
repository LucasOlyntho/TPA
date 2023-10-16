import java.util.Scanner;
public class exercicio2 {
 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int anoat,anona,id,r;
	do{
	System.out.println("Coloque o ano atual");
	anoat = in.nextInt();
	System.out.println("Coloque o ano de nascimento");
	anona = in.nextInt();
	id = anoat-anona;
	if(id>=18) {
		System.out.println("Voce tem "+id+" anos e e maior de idade");
	}else {
		System.out.println("Voce tem "+id+" anos e e menor de idade");
	}
	System.out.println("Voce deseja continuar?\nSim=1 Nao=2");
	r = in.nextInt();
	}while(r==1);
	in.close();
}
}