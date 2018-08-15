package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int idade, tempo;

		System.out.println("Digire a idade");
		idade = entrada.nextInt();

		System.out.println("Digire tempo de serviço em anos");
		tempo = entrada.nextInt();

		if (idade >= 65 & tempo <= 30 & idade >= 60 & tempo >= 25) {
			System.out.println("Pode se aposentar");
		} else {
			System.out.println("Nao pode se aposentar");
		}

		entrada.close();

	}

}
