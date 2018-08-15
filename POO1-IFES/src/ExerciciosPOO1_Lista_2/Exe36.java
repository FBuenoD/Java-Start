package ExerciciosPOO1_Lista_2;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int opc = 0;
		float salario, tempo;

		while (opc != 4) {
			menu();
			System.out.println("Digite uma opção: ");
			opc = entrada.nextInt();

			switch (opc) {
			case 1:
				System.out.println("Digite o Salario : ");
				salario = entrada.nextFloat();

				if (salario <= 350) {
					salario = (float) (salario + (salario * 0.15));
				} else if (salario <= 600) {
					salario = (float) (salario + (salario * 0.10));
				} else {
					salario = (float) (salario + (salario * 0.05));
				}

				entrada.nextLine();
				System.out.printf("Seu Novo Salario eh: R$%.2f\n", salario);
				entrada.nextLine();
				break;
			case 2:
				System.out.println("Digite o Salario : ");
				salario = entrada.nextFloat();

				salario = (float) (salario + (salario / 3));

				entrada.nextLine();
				System.out.printf("Seu Novo Salario de Ferias eh: R$%.2f\n", salario);
				entrada.nextLine();
				break;
			case 3:
				System.out.println("Digite o Salario : ");
				salario = entrada.nextFloat();
				System.out.println("Digite o Tempo de Trabalho (Maximo 12 Meses) : ");
				tempo = entrada.nextFloat();

				salario = (salario * tempo) / 12;

				entrada.nextLine();
				System.out.printf("Seu Decimo Terceiro eh: R$%.2f\n", salario);
				entrada.nextLine();
				break;
			case 4:
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
		System.out.printf("########### 1 - Novo Salario #####\n");
		System.out.printf("########### 2 - Férias    ########\n");
		System.out.printf("########### 3 - Décimo Terceiro ##\n");
		System.out.printf("########### 4 - Sair    ##########\n");
		System.out.printf("##################################\n");
	}

}
