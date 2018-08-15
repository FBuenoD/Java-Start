package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String cidade;

		System.out.println("Digite sua Cidade Natal:");
		cidade = entrada.nextLine();

		System.out.println("Sua Cidade Natal Eh: " + cidade);

		entrada.close();

	}

}
