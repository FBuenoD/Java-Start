package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int dia1 = 0, mes1 = 0, ano1 = 0, dia2 = 0, mes2 = 0, ano2 = 0;

		System.out.println("Digite o dia:");
		dia1 = entrada.nextInt();
		if (dia1 > 31) {
			System.out.println("Nenhum mes tem mais de 31 dias");
		} else {

			System.out.println("Digite o Mes:");
			mes1 = entrada.nextInt();
			if (mes1 > 12) {
				System.out.println("Um ano tem 12 meses");
			} else {

				System.out.println("Digite o Ano:");
				ano1 = entrada.nextInt();

				System.out.println("##############");

				System.out.println("Digite o dia:");
				dia2 = entrada.nextInt();

				if (dia2 > 31) {

					System.out.println("Nenhum mes tem mais de 31 dias");
				} else {

					System.out.println("Digite o Mes:");
					mes2 = entrada.nextInt();

					if (mes2 > 12) {
						System.out.println("Um ano tem 12 meses");
					} else {

						System.out.println("Digite o Ano:");
						ano2 = entrada.nextInt();
					}
				}
			}
		}

		if (ano1 > ano2) {
			System.out.printf("Dia: %d / Mes: %d / Ano: %d\n", dia1, mes1, ano1);
		} else {
			System.out.printf("Dia: %d / Mes: %d / Ano: %d\n", dia2, mes2, ano2);
		}

		entrada.close();

	}

}
