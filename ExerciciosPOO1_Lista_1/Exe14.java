package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		float maior, menor, qtdP = 0, qtdN = 0, atual;

		System.out.println("Digite o Numero 1: ");
		atual = entrada.nextFloat();
		maior = atual;
		menor = atual;

		if (atual < 0) {
			qtdN++;
		} else {
			qtdP++;
		}

		for (int i = 2; i < 5; i++) {
			System.out.println("Digite o Numero " + i + ":");
			atual = entrada.nextFloat();
			if (atual < menor) {
				menor = atual;
			}

			if (atual > maior) {
				maior = atual;
			}

			if (atual < 0) {
				qtdN++;
			} else {
				qtdP++;
			}
		}

		System.out.println("O Menor Numero eh: " + menor);
		System.out.println("O Maior Numero eh: " + maior);
		System.out.println("O QTD Positivos Numero eh: " + qtdP);
		System.out.println("O QTD Negativos Numero eh: " + qtdN);

		entrada.close();

	}

}
