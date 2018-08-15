package ExerciciosPOO1_Lista_2;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int opc = 0;

		while (opc != 5) {
			System.out.println("Cadastro de clientes\n" + "1- Incluir\n" + "2- Alterar\n" + "3- Consultar\n"
					+ "4- Excluir\n" + "5- Sair\n" + "Opção?");
			System.out.println("Digite sua opção: ");
			opc = entrada.nextInt();
		}

		entrada.close();

	}

}
