package ExerciciosPOO1_Lista_2;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int periodo;
		String sexo;
		float qtdC = 0, qtdM = 0, qtdF = 0, qtd24 = 0;

		System.out.println("Digite a quantidade de criançãs nascidas no periodo:");
		qtdC = entrada.nextInt();

		for (int i = 0; i < qtdC; i++) {

			System.out.println("Digite o Sexo da " + (i + 1) + "º Criança (M ou F):");
			sexo = entrada.next();
			System.out.println("Digite o Tempo de vida da " + (i + 1) + "º Criança em Meses completos:");
			periodo = entrada.nextInt();

			if (periodo > 0) {
				if (periodo == 24) {
					qtd24++;
				}

				if (sexo.equals("M")) {
					qtdM++;
				} else if (sexo.equals("F")) {
					qtdF++;
				}
			}

		}
		// 2/8*100
		System.out.println("O Percentual de crianças do sexo Masculino mortas no periodo são: " + ((qtdM / qtdC) * 100+"%"));
		System.out.println("O Percentual de crianças do sexo Feminino mortas no periodo são: " + ((qtdF / qtdC) * 100)+"%");
		System.out.println("O Percentual de crianças que viveram ate 24 meses eh: " + ((qtd24 / qtdC) * 100)+"%");

		entrada.close();
	}

}
