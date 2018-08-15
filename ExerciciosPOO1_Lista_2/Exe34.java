package ExerciciosPOO1_Lista_2;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int idade, qtd50 = 0;
		float peso = 0, altura = 0, mediaAlt = 0, qtdPeso40 = 0;

		for (int i = 0; i < 25; i++) {
			System.out.println("Digite a Idade da " + (i + 1) + "º Pessoa:");
			idade = entrada.nextInt();
			System.out.println("Digite o Peso da " + (i + 1) + "º Pessoa:");
			peso = entrada.nextFloat();
			System.out.println("Digite a Altura da " + (i + 1) + "º Pessoa:");
			altura = entrada.nextFloat();

			if (idade > 50) {
				qtd50++;
			}

			if (altura >= 10 && altura <= 20) {
				mediaAlt = mediaAlt + altura;
			}

			if (peso < 40) {
				qtdPeso40++;
			}

		}

		mediaAlt = mediaAlt / 25;

		System.out.printf("Quantidade de Pessoas com mais de 50 eh %.0f", qtd50);
		System.out.printf("A media de Idade de 10 a 20 anos eh %.0f", mediaAlt);
		System.out.printf("A Porcentagem de pesoas com mais de 40 quilos eh", ((qtdPeso40 * 100) / 25));

		entrada.close();
	}

}
