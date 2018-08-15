package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		char sexo;
		double result, altura;

		System.out.println("Saber peso ideal");
		System.out.println("Digite sua altura");
		altura = entrada.nextFloat();
		System.out.println("Digite seu genero");
		System.out.printf("Digite com letra minusculas");
		System.out.println("M: Para masculino");
		System.out.println("F: Para feminino");
		sexo = entrada.next().charAt(0);

		switch (sexo) {
		case 'f':
			result = (62.1 * altura) - 44.7;
			System.out.printf("Seu peso ideal %.2f\n", result);
			break;
		case 'm':
			result = (72.7 * altura) - 58;
			System.out.printf("Seu peso ideal %.2f\n", result);
			break;
		default:
			System.out.println("vc digitou errado");
			break;
		}

		entrada.close();

	}

}
