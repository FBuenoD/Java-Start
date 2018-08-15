package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		float peso1, peso2, peso3;

		System.out.println("Digite Seu Peso: ");
		peso1 = entrada.nextFloat();

		System.out.println("Digite o Peso da primeira pessoa: ");
		peso2 = entrada.nextFloat();

		System.out.println("Digite o Peso da segunda pessoa: ");
		peso3 = entrada.nextFloat();

		System.out.println("Seu Peso" + peso1);
		System.out.println("Segunda Pessoa" + peso2);
		System.out.println("Terceira Pessoa" + peso3);

		entrada.close();

	}

}
