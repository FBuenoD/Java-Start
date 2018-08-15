package ExerciciosPOO1_Lista_2;

// By: Fernando Bueno Dansi 20161SI038

public class Exe24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num_1 = 92, Num_2 = 2, Opt = 0;
		while (Num_1 <= 1478) {
			while (Num_2 < Num_1) {
				if (Num_1 % Num_2 == 0) {
					Opt = 1;
				}
				Num_2 = Num_2 + 1;
			}
			Num_2 = 2;
			if (Opt == 0) {
				System.out.printf("%d, ", Num_1);
			}
			Opt = 0;
			Num_1++;
		}

	}

}
