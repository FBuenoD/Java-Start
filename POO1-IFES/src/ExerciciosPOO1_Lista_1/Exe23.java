package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		float valor;
		float qtd_nota100;
		float qtd_nota50;
		float qtd_nota10;
		float qtd_nota5;
		float qtd_nota1;

		System.out.println("Informe um valor");
		valor = entrada.nextFloat();

		qtd_nota100 = valor / 100;
		valor = valor - (qtd_nota100 * 100);

		qtd_nota50 = valor / 50;
		valor = valor - (qtd_nota50 * 50);

		qtd_nota10 = valor / 10;
		valor = valor - (qtd_nota10 * 10);

		qtd_nota5 = valor / 5;
		valor = valor - (qtd_nota5 * 5);

		qtd_nota1 = valor;

		System.out.println("Notas de 100: " + qtd_nota100);
		System.out.println("Notas de 50: " + qtd_nota50);
		System.out.println("Notas de 10: " + qtd_nota10);
		System.out.println("Notas de 5: " + qtd_nota5);
		System.out.println("Notas de 1: " + qtd_nota1);

		entrada.close();

	}

}
