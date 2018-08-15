package ExerciciosPOO1_Lista_2;

// By: Fernando Bueno Dansi 20161SI038

public class Exe09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float cel=0, far=122;

		while (cel <= 65) {
			cel = (far-32)*5/9;
			System.out.printf("Celsius = %.2f° | Fahrenheit = %.2f°\n",cel,far);
			far++;
		}

	}

}
