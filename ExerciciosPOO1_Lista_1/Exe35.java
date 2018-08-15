package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		float valor, opInves;

		System.out.println("Digite o Valor a Ser Investido: ");
		valor = entrada.nextFloat();
		System.out.println("Digite o Tipo de Redimento Escolhido - 1=Poupança 2=Fundos: ");
		opInves = entrada.nextFloat();

		if (opInves == 1) {
			valor = (float) (valor + (valor * 0.03));
			System.out.println("Seu valor reajustado pelo rendimento eh R$" + valor);
		} else if (opInves == 2) {
			valor = (float) (valor + (valor * 0.04));
			System.out.println("Seu valor reajustado pelo rendimento eh R$" + valor);
		}

		entrada.close();

	}

}
