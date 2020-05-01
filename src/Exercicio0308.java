import java.util.Scanner;

public class Exercicio0308 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int fatorial=1;
		
		if(N==0) {
			fatorial=1;
		}
		else {
			for(int i=N;i>0;i--) {
				fatorial=fatorial*i;
			}
		}
		System.out.println(fatorial);
		sc.close();
	}

}
