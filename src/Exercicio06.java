import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double PI = 3.14159;
		double tri,cir,tra,qua,ret;
		tri = (A*C)/2.0;
		cir = PI*Math.pow(C, 2.0);
		tra = ((A+B)*C)/2.0;
		qua = Math.pow(B, 2);
		ret = A*B;
		System.out.printf("TRIANGULO: %.3f%n",tri);
		System.out.printf("CIRCULO: %.3f%n",cir);
		System.out.printf("TRAPEZIO: %.3f%n",tra);
		System.out.printf("QUADRADO: %.3f%n",qua);
		System.out.printf("RETANGULO: %.3f%n",ret);
		sc.close();
	}

}
