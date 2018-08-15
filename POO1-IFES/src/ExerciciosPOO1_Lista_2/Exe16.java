package ExerciciosPOO1_Lista_2;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num = 1;

		while (num > 0) {
			System.out.println("Digite um numero:");
			num = entrada.nextInt();

			if (num > 0) {
				System.out.printf("Raiz de %d eh %.0f\n", num, (Math.sqrt(num)));
			}
		}

		entrada.close();

	}

}
