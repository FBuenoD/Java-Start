package ExerciciosPOO1_Lista_2;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int qtd1 = 0, qtd2 = 0, qtd3 = 0, qtd4 = 0, qtd5 = 0;
		int idade;

		for (int i = 0; i < 15; i++) {
			System.out.println("Digite a Idade da " + (i + 1) + "º Pessoa:");
			idade = entrada.nextInt();

			if (idade <= 15) {
				qtd1++;
			} else if (idade <= 30) {
				qtd2++;
			} else if (idade <= 45) {
				qtd3++;
			} else if (idade <= 60) {
				qtd4++;
			} else {
				qtd5++;
			}

		}

		System.out.println("00-15:" + qtd1);
		System.out.println("16-30:" + qtd2);
		System.out.println("31-45:" + qtd3);
		System.out.println("46-60:" + qtd4);
		System.out.println("61 >>:" + qtd5);

		System.out.println("Porcetagem ate 15:" + ((qtd1 * 100) / 15) + "%");
		System.out.println("Porcetagem mais 61:" + ((qtd5 * 100) / 15) + "%");

		entrada.close();

	}

}
