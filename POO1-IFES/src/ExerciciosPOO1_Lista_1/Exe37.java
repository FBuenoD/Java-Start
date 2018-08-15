package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int idade;

		System.out.println("Digite sua idade:");
		idade = entrada.nextInt();

		if (idade < 18) {
			System.out.println("Você e Menor de Idade!!");
		} else {
			System.out.println("Você e Maior de Idade!!");
		}

		entrada.close();

	}

}
