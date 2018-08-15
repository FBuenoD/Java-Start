package ExerciciosPOO1_Lista_2;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n;
		float i;
		float log = 0;

		System.out.printf("Entre com um numero inteiro: ");

		n = entrada.nextInt();

		for (i = 1; i <= n; i++) {

			float resultado = (float) Math.log(i);

			System.out.printf("\nTermo: %.0f", resultado);

			log = log + resultado;

		}

		System.out.printf("\nAproximação para a base do logarítmo natural: %.0f\n", log);

		entrada.close();

	}

}
