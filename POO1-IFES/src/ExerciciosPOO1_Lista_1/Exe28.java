package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		float num1, num2, resultado;
		int op;

		System.out.println("OPÇÔES");
		System.out.println("Opção 1 - Somar 2 Numeros");
		System.out.println("Opção 2 - Diferença entre 2 Numeros");
		System.out.println("Opção 3 - Produto 2 Numeros");
		System.out.println("Opção 4 - Divisão 2 Numeros");
		System.out.println("Digite qual opção Desejada!");
		op = entrada.nextInt();

		switch (op) {
		case 1:
			System.out.println("Soma de Dois Numeros Escolhida!");
			System.out.println("Digite o Primeiro Numero: ");
			num1 = entrada.nextFloat();
			System.out.println("Digite o Segundo Numero: ");
			num2 = entrada.nextFloat();
			resultado = num1 + num2;
			System.out.println("O resultado da soma eh: " + resultado);
			break;
		case 2:
			System.out.println("Diferença de Dois Numeros Escolhida!");
			System.out.println("Digite o Primeiro Numero: ");
			num1 = entrada.nextFloat();
			System.out.println("Digite o Segundo Numero: ");
			num2 = entrada.nextFloat();
			resultado = num1 - num2;
			System.out.println("O resultado da diferença eh: " + resultado);
			break;
		case 3:
			System.out.println("Produto de Dois Numeros Escolhida!");
			System.out.println("Digite o Primeiro Numero: ");
			num1 = entrada.nextFloat();
			System.out.println("Digite o Segundo Numero: ");
			num2 = entrada.nextFloat();
			resultado = num1 * num2;
			System.out.println("O resultado do produto eh: " + resultado);
			break;
		case 4:
			System.out.println("Divisão de Dois Numeros Escolhida!");
			System.out.println("Digite o Primeiro Numero: ");
			num1 = entrada.nextFloat();
			System.out.println("Digite o Segundo Numero: ");
			num2 = entrada.nextFloat();
			if (num2 == 0) {
				System.out.println("Não existe divisão por zero!");
			} else {
				resultado = num1 / num2;
				System.out.println("O resultado da divisão eh eh: " + resultado);
			}
			break;

		default:
			break;
		}

		entrada.close();

	}

}
