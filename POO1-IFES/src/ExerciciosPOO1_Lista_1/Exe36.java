package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		String senha = "1234";
		String senhaDigi;

		System.out.println("Digite a Senha para Ter Acesso:");
		senhaDigi = entrada.nextLine();

		if (senhaDigi.equals(senha)) {
			System.out.println("Acesso Permitido!!");
		} else {
			System.out.println("Acesso Negado!!");
		}

		entrada.close();

	}

}
