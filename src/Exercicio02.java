import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // porque minha máquina está em português e vou usar ponto flutuante
		Scanner sc = new Scanner(System.in); // pegar a entrada do usuário

		double PI = 3.14159; // variavel Pi
		double raio = sc.nextDouble(); // raio quem dá é o usuário
		double area = PI*Math.pow(raio, 2.0); // calculo da área = pi*raio²
		System.out.printf("A = %.4f%n",area); // retorno do calculo para o usuário

		sc.close(); //desaloca memória
	}

}
