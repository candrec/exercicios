import java.util.Scanner;

public class Exercicio0303 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int combustivel=sc.nextInt();
		int alcool = 0, gasolina = 0, diesel = 0;
		while (combustivel != 4) {
			switch (combustivel) {
			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			case 3:
				diesel += 1;
				break;
			default:
				break;
			}
			combustivel=sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+alcool);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Diesel: "+diesel);
		sc.close();
	}

}
