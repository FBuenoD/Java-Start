package ExerciciosPOO1_Lista_2;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String cod;
		float valorAtual, valorTotal = 0, valorPrazo = 0, valorVista = 0;

		for (int i = 0; i < 15; i++) {
			System.out.println("Digite o Codido: P=Prazo V= A Vista:");
			cod = entrada.next();
			System.out.println("Digite o valor da Compra:");
			valorAtual = entrada.nextFloat();
			valorTotal = valorTotal + valorAtual;

			if (cod.equals("P")) {
				valorPrazo = valorPrazo + valorAtual;
			} else if (cod.equals("V")) {
				valorVista = valorVista + valorAtual;
			}
		}

		System.out.printf("Total a Vista: R$%.2f\n", valorVista);
		System.out.printf("Total a Prazo: R$%.2f\n", valorPrazo);
		System.out.printf("Total : R$%.2f\n", valorTotal);

		entrada.close();

	}

}
