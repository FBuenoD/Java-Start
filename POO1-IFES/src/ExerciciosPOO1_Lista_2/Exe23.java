package ExerciciosPOO1_Lista_2;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n;
		float i;
		float soma;

		System.out.printf("Entre com um numero inteiro: ");

		n = entrada.nextInt();

		soma = 0;

		for (i = 1; i <= n; i++){

			float resultado = 1 / i;

			System.out.printf("\nTermo: %f", resultado);

			soma = soma + resultado;

		}

		System.out.printf("\nA soma dos termos sera: %f\n", soma);
		
		entrada.close();

	}

}
