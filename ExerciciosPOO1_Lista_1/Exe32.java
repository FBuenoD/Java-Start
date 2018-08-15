package ExerciciosPOO1_Lista_1;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		float custoFabrica;

		System.out.println("Digite seu custo de Fabrica: ");
		custoFabrica = entrada.nextFloat();

		if (custoFabrica <= 12000) {
			custoFabrica = (float) (custoFabrica + (custoFabrica * 0.05));
			System.out.println("Seu novo custo Final eh R$" + custoFabrica);
		} else if (custoFabrica <= 25000) {
			custoFabrica = (float) (custoFabrica + (custoFabrica * 0.25));
			System.out.println("Seu novo custo Final eh R$" + custoFabrica);
		} else {
			custoFabrica = (float) (custoFabrica + (custoFabrica * 0.35));
			System.out.println("Seu novo custo Final eh R$" + custoFabrica);
		}

		entrada.close();

	}

}
