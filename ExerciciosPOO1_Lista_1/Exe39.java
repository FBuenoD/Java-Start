package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		float peso;
		int idade;

		System.out.println("Digite o Peso: ");
		peso = entrada.nextFloat();
		System.out.println("Digite a Idade: ");
		idade = entrada.nextInt();

		if (peso <= 60) {

			if (idade <= 20) {
				System.out.println("Grupo de Risco = 9");
			} else if (idade <= 50) {
				System.out.println("Grupo de Risco = 6");
			} else {
				System.out.println("Grupo de Risco = 3");
			}

		} else if (peso <= 90) {

			if (idade <= 20) {
				System.out.println("Grupo de Risco = 8");
			} else if (idade <= 50) {
				System.out.println("Grupo de Risco = 5");
			} else {
				System.out.println("Grupo de Risco = 2");
			}

		} else {

			if (idade <= 20) {
				System.out.println("Grupo de Risco = 7");
			} else if (idade <= 50) {
				System.out.println("Grupo de Risco = 4");
			} else {
				System.out.println("Grupo de Risco = 1");
			}

		}

		entrada.close();

	}

}
