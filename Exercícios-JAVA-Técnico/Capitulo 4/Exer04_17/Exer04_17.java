import java.util.Scanner;

public class Exer04_17
{
	public static void main(String[] args)
	{
		int km,litros,kmTotal,litrosTotal;
		Scanner input = new Scanner(System.in);
		Func f = new Func();
		km = 0;
		litros = 0;
		kmTotal = 0;
		litrosTotal = 0;

		do
		{
			System.out.print("Digite a quilometragem (-1 para sair): ");
			km = input.nextInt();
			if(km>=0){
				System.out.print("Digite os litros consumidos: ");
				litros = input.nextInt();
				System.out.println("Consumo: ");f.calcula(km, litros);
				kmTotal += km;
				litrosTotal += litros;
			}
		}while(km>=0);

		System.out.printf("Total de KM: %d\nTotal de Litros: %d\n", kmTotal, litrosTotal);
		System.out.println("FIM!");
	}
}
