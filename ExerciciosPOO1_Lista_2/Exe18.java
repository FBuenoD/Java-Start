package ExerciciosPOO1_Lista_2;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n;
		float i;
		float fat = 1;

		System.out.printf("Entre com um numero inteiro: ");

		n = entrada.nextInt();

		for (i = 1; i <= n; i++) {

			float resultado = i;

			System.out.printf("\nTermo: %.0f", resultado);

			fat = fat * resultado;

		}

		System.out.printf("\nO Fatorial dos termos sera: %.0f\n", fat);

		entrada.close();

	}

}
