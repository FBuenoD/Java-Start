import java.util.Scanner;

public class Exer04_37c
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Fatorial fat = new Fatorial();
		double euler = 1;
		int x;

		System.out.print("Definir x para e^x : ");
		x = input.nextInt();

		for (int i = 1; i <= 33; i++)
		{
			euler += Math.pow(x, i)/fat.calcula(i);
		}

		System.out.println("Euler    = " + euler + "\nMath.pow = " + Math.pow(Math.E, x) );
	}
}
