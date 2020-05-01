import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod1,cod2,quant1,quant2;//cod1 e cod2 não serão usados em nada, apenas porque o problema pede
		double val1,val2,total;
		cod1 = sc.nextInt();
		quant1 = sc.nextInt();
		val1 = sc.nextDouble();
		cod2 = sc.nextInt();
		quant2 = sc.nextInt();
		val2 = sc.nextDouble();
		
		total=quant1*val1+quant2*val2;//calculo do total
		
		System.out.printf("VALOR TOTAL A PAGAR: R$ %.2f%n",total);
		sc.close();
	}

}
