package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		float num1, num2;

		System.out.println("Digite o Primeiro Numero:");
		num1 = entrada.nextFloat();

		System.out.println("Digite o Segundo Numero:");
		num2 = entrada.nextFloat();

		if (num2 != 0) {
			System.out.println("A Divisão do Primeiro pelo Segundo eh = " + num1 / num2);
		} else {
			System.out.println("O Segundo numero e 0 e nao existe divisão por 0!");
		}

		entrada.close();

	}

}
