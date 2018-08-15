package ExerciciosPOO1_Lista_2;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int opc = 0;
		float a, b;

		while (opc != 5) {
			menu();
			System.out.println("Digite uma opção: ");
			opc = entrada.nextInt();

			switch (opc) {
			case 1:
				System.out.println("Digite o Primeiro numero: ");
				a = entrada.nextFloat();
				System.out.println("Digite o Segundo numero: ");
				b = entrada.nextFloat();
				entrada.nextLine();
				System.out.printf("A Adição de : %.0f + %.0f eh: %.0f\n", a, b, (a + b));
				entrada.nextLine();
				break;
			case 2:
				System.out.println("Digite o Primeiro numero: ");
				a = entrada.nextFloat();
				System.out.println("Digite o Segundo numero: ");
				b = entrada.nextFloat();
				entrada.nextLine();
				System.out.printf("A Subtração de : %.0f - %.0f eh: %.0f\n", a, b, (a - b));
				entrada.nextLine();
				break;
			case 3:
				System.out.println("Digite o Primeiro numero: ");
				a = entrada.nextFloat();
				System.out.println("Digite o Segundo numero: ");
				b = entrada.nextFloat();
				entrada.nextLine();
				System.out.printf("A Multiplicação de : %.0f * %.0f eh: %.0f\n", a, b, (a * b));
				entrada.nextLine();
				break;
			case 4:
				System.out.println("Digite o Primeiro numero: ");
				a = entrada.nextFloat();
				System.out.println("Digite o Segundo numero: ");
				b = entrada.nextFloat();
				entrada.nextLine();
				System.out.printf("A Divisão de : %.0f / %.0f eh: %.0f\n", a, b, (a / b));
				entrada.nextLine();
				break;
			case 5:
				System.out.println("Saindo!!!");
				break;

			default:
				System.out.println("Opção Invalida!!!");
				entrada.nextLine();
				entrada.nextLine();
				break;
			}

		}

		entrada.close();

	}

	public static void menu() {
		System.out.printf("############## Menu ##############\n");
		System.out.printf("########### 1 - Adição ###########\n");
		System.out.printf("########### 2 - Subtração ########\n");
		System.out.printf("########### 3 - Multiplicação ####\n");
		System.out.printf("########### 4 - Divisão ##########\n");
		System.out.printf("########### 5 - Sair   ###########\n");
		System.out.printf("##################################\n");
	}

}
