import java.util.Scanner;

public class Exercicio0305 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num,in=0,out=0;
		for(int i=0;i<N;i++) {
			num=sc.nextInt();
			if(num>=10 && num<=20) {
				in++;
			}
			else {
				out++;
			}
		}
		System.out.println(in+" in");
		System.out.println(out+" out");
		sc.close();
	}

}
