package ExerciciosPOO1_Lista_2;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int menor = 0, maior = 0, media = 0, qtdP = 0, qtdN = 0;
		int num;
		int i = 0;

		while (i < 10) {
			System.out.println("Digite o " + (i + 1) + "º Numero");
			num = entrada.nextInt();

			if (i == 0) {
				menor = num;
			}

			if (num < menor) {
				menor = num;
			}

			if (num > maior) {
				maior = num;
			}

			if (num < 0) {
				qtdN++;
			}

			if (num > 0) {
				qtdP++;
			}

			media = num + media;

			i++;
		}

		System.out.println("O Menor Numero eh " + menor);
		System.out.println("O Maior Numero eh " + maior);
		System.out.println("A Média eh " + (media / 10));
		System.out.println("A QTD de Numeros Positivos eh " + qtdP);
		System.out.println("A QTD de Numeros Negativos eh " + qtdN);

		entrada.close();

	}

}
