package ExerciciosPOO1_Lista_2;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		float divida;
		float par = 1;
		float dividaComJuros, parcelas, jur = 10;

		System.out.println("Digite o Valor da Divida: ");
		divida = entrada.nextFloat();

		for (int i = 0; i < 5; i++) {
			if (i == 0) {
				jur = 0;
				System.out.printf("Qtd parcelas: %.0f Juros: %.0f%% Divida com Juros :R$ %.2f Parcelas :R$ %.2f \n",
						par, jur, divida, divida);
				jur = 10;
				par = par + 2;
			} else {

				dividaComJuros = divida + (divida * (jur / 100));
				parcelas = (dividaComJuros / par);
				System.out.printf("Qtd parcelas: %.0f Juros: %.0f%% Divida com Juros :R$ %.2f Parcelas :R$ %.2f \n",
						par, jur, dividaComJuros, parcelas);
				par = par + 3;
				jur = jur + 5;
			}

		}

		entrada.close();
	}

}
