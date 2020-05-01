import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod = sc.nextInt();
		int quant = sc.nextInt();
		double valor;
		double total;
		
		if(cod==1) {
			valor=4.00;
		}
		else if(cod==2) {
			valor=4.50;
		}
		else if(cod==3) {
			valor=5.00;
		}
		else if(cod==4) {
			valor=2.00;
		}
		else {
			valor=1.50;
		}
		total=valor*quant;
		System.out.printf("Total: R$ %.2f%n",total);
		sc.close();
	}

}
