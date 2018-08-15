package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		float n1, n2, media;

		System.out.println("Digite a Primeira nota: ");
		n1 = entrada.nextFloat();
		System.out.println("Digite a Segunda nota: ");
		n2 = entrada.nextFloat();

		media = (n1 = n2) / 2;

		if (media <= 4) {
			System.out.println("Reprovado!");
		} else if (media <= 7) {
			System.out.println("Exame!");
		} else if (media <= 10) {
			System.out.println("Aprovado!");
		}

		entrada.close();

	}

}
