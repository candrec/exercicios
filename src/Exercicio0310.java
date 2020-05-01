import java.util.Scanner;

public class Exercicio0310 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			int quadrado=i*i;
			int cubo=quadrado*i;
			System.out.println(i+" "+quadrado+" "+cubo);
		}
		
		sc.close();
	}

}
