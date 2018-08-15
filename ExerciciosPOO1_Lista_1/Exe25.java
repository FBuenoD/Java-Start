package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int ano;
		System.out.println("Digite o ano");
		ano = entrada.nextInt();

		if (ano % 400 == 0) {
			System.out.println(ano + " é bissexto.");

		} else if ((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println(ano + " é bissexto.");
		} else {
			System.out.println(ano + " não é bissexto");
		}

		entrada.close();

	}

}
