import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);//padronizar para ponto flutuante
		Scanner sc = new Scanner(System.in);//configuração de entrada de dados
		int NUMBER,horas;
		double valor,SALARY;
		
		NUMBER = sc.nextInt();
		horas = sc.nextInt();
		valor = sc.nextDouble();
		SALARY = horas*valor;
		
		System.out.println("NUMBER = "+NUMBER);
		System.out.printf("SALARY = U$ %.2f%n",SALARY);
		sc.close();
	}

}
