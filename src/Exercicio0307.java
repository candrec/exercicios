import java.util.Locale;
import java.util.Scanner;

public class Exercicio0307 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0;i<N;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(b!=0) {
				double div = (double)a/b;
				System.out.printf("%.1f%n",div);
			}
			else {
				System.out.println("divisão impossível");
			}
		}
		sc.close();
	}

}
