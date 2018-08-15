package ExerciciosPOO1_Lista_2;

// By: Fernando Bueno Dansi 20161SI038

public class Exe28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float pr = 5, luc = 600, lucmax = 0, gasto = 200;
		int qt = 120;
		System.out.printf("INGRESSO\tQUANTIDADE\tTOTAL VENDIDO\t LUCRO");
		while (pr >= 1) {
			luc = pr * qt;
			lucmax = luc - gasto;
			System.out.printf("\nR$%.2f", pr);
			System.out.printf("\t\t %d", qt);
			System.out.printf("\t\t R$%.2f", luc);
			System.out.printf("\t R$%.2f", lucmax);
			qt = qt + 26;
			pr = (float) (pr - 0.5);
		}
	}

}
