import java.util.Scanner;

public class Exer04_35
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int l1, l2, l3;
		Compara c = new Compara();
		boolean bool;

		System.out.println("Entre com o primeiro lado");
		l1 = input.nextInt();
		System.out.println("Entre com o segundo lado");
		l2 = input.nextInt();
		System.out.println("Entre com o terceiro lado");
		l3 = input.nextInt();

		bool = c.Comp(l1, l2, l3);
		bool = c.Comp(l1, l3, l2);
		bool = c.Comp(l2, l1, l3);
		bool = c.Comp(l2, l3, l1);
		bool = c.Comp(l3, l1, l2);
		bool = c.Comp(l3, l2, l1);

		System.out.println(bool ? "É triângulo" : "Não é triângulo");
	}
}
