package ExerciciosPOO1_Lista_2;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int idade, qtd90 = 0;
		float media = 0, peso = 0;

		for (int i = 0; i < 7; i++) {
			System.out.println("Digite a Idade da " + (i + 1) + "º Pessoa:");
			idade = entrada.nextInt();
			System.out.println("Digite o Peso da " + (i + 1) + "º Pessoa:");
			peso = entrada.nextFloat();

			if (idade > 90) {
				qtd90++;
			}
			
			media = media+idade;
		}
		
		media = media/7;

		System.out.printf("Quantidade de Pessoas com mais de 90 eh %.0f",qtd90);
		System.out.printf("A media de idades eh %.0f",media);

		entrada.close();

	}

}
