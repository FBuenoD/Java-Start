package ExerciciosPOO1_Lista_2;

// By: Fernando Bueno Dansi 20161SI038

public class Exe08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soma = 0, i = 0, j = 0;
		while (i <= 50) {
			if ((j % 2) == 0) {
				soma = soma + j;
				i++;
			}
			j++;
		}

		System.out.println("A soma dos 50 primeiros numeros pares eh: "+soma);

	}

}
