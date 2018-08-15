package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		float salario;

		System.out.println("Digite seu Salario: ");
		salario = entrada.nextFloat();

		if (salario <= 350) {
			salario = (float) ((salario - (salario * 0.07)) + 100);
			System.out.println("Seu novo salario eh R$" + salario);
		} else if (salario <= 600) {
			salario = (float) ((salario - (salario * 0.07)) + 75);
			System.out.println("Seu novo salario eh R$" + salario);
		} else if (salario <= 900) {
			salario = (float) ((salario - (salario * 0.07)) + 50);
			System.out.println("Seu novo salario eh R$" + salario);
		} else {
			salario = (float) ((salario - (salario * 0.07)) + 35);
			System.out.println("Seu novo salario eh R$" + salario);
		}

		entrada.close();

	}

}
