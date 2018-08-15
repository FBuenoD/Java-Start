package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int idade;
		System.out.println("Digite sua idade");
		idade = entrada.nextInt();

		if (idade >= 5 & idade <= 10) {
			System.out.println("Infantil");
		} else if (idade >= 11 & idade <= 15) {
			System.out.println("Juvenil");
		} else if (idade >= 16 & idade <= 20) {
			System.out.println("Junior");
		} else if (idade >= 21 & idade <= 25) {
			System.out.println("Profissional");
		} else {
			System.out.println("Nao existe categoria acima dessa idade");
		}

		entrada.close();

	}

}
