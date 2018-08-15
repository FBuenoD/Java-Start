package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int dia, mes, ano, anoB = 0;

		System.out.println("Digite uma data a seguir!");
		System.out.println("Digite o Dia:");
		dia = entrada.nextInt();
		System.out.println("Digite o Mês:");
		mes = entrada.nextInt();
		System.out.println("Digite o Ano:");
		ano = entrada.nextInt();
		ano = 1997;
		int i = (ano % 4);

		if (i == 0) {
			i = (ano % 100);
			if (i == 0) {
				i = (ano % 400);

				if (i == 0) {
					// E Bixesto
					anoB = 1;
				} else {
					// Não e Bixesto
				}

			} else {
				// E Bixesto
				anoB = 1;
			}

		} else {
			// Não e Bixesto
		}

		if (mes >= 1 && mes <= 12) {
			// Mes valido
			if (anoB == 1 && (dia > 28 && mes == 2 && dia <= 29)) {
				System.out.println("Data Valida!");
			} else if (anoB == 0 && (dia < 29 && mes == 2)) {
				System.out.println("Data Valida!");
			} else if (mes != 2 && dia <= 31) {
				System.out.println("Data Valida!");
			} else {
				System.out.println("Data Invalida!");
			}

		} else {
			System.out.println("Data Invalida!");
		}

		entrada.close();

	}

}
