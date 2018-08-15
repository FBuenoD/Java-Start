package ExerciciosPOO1_Lista_2;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int x = 0;
		int div = 0;

		System.out.println("Digite um numero maior que 1:");
		x = entrada.nextInt();

		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				div++;
			}
		}

		if (div == 2)
			System.out.printf("O número %d é primo!", x);
		else
			System.out.printf("O número %d não é primo!", x);

		entrada.close();
	}

}
