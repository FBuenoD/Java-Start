package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int horasExtras, horasFaltas, fatorH;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o Numero de Horas Extras: ");
		horasExtras = entrada.nextInt();

		System.out.println("Informe o Numero de Horas em Falta: ");
		horasFaltas = entrada.nextInt();

		fatorH = horasExtras - (2 / 3 * (horasFaltas));

		if (fatorH > 2400) {
			System.out.println("Gratificação: R$500,00");
		} else if (fatorH > 1800 && fatorH <= 2400) {
			System.out.println("Gratificação: R$400,00");
		} else if (fatorH > 1200 && fatorH <= 1800) {
			System.out.println("Gratificação: R$300,00");
		} else if (fatorH >= 600 && fatorH <= 1200) {
			System.out.println("Gratificação: R$200,00");
		} else {
			System.out.println("Gratificação: R$100,00");
		}

		entrada.close();

	}

}
