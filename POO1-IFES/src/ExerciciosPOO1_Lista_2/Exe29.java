package ExerciciosPOO1_Lista_2;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int idade, qtd18 = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite a idade da " + (i + 1) + "º Pessoa:");
			idade = entrada.nextInt();

			if (idade >= 18) {
				qtd18++;
			}
		}

		System.out.println("Pessoas com 18 ou mais : " + qtd18);

		entrada.close();

	}

}
