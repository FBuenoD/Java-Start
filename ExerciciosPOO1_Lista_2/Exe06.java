package ExerciciosPOO1_Lista_2;

// By: Fernando Bueno Dansi 20161SI038

public class Exe06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;

		System.out.println("While:");

		while (i >= 2) {
			if ((i % 2) == 0)
				System.out.println(i);

			i--;
		}
		i = 10;

		System.out.println("Do While:");

		do {
			if ((i % 2) == 0)
				System.out.println(i);

			i--;
		} while (i >= 2);

		System.out.println("For:");

		for (int j = 10; j >= 2; j--) {
			if ((j % 2) == 0)
				System.out.println(j);
		}

	}

}
