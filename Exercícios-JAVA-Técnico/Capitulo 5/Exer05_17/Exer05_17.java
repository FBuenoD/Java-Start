import java.util.Scanner;

public class Exer05_17
{
	public static void main(String[] args)
	{
		double p1=0,p2=0,p3=0,p4=0,p5=0;
		int produto = 1, quantidade = 0;
		Scanner input = new Scanner(System.in);

		while (produto != 0)
		{
			System.out.println("Produto 1 - $ 2,98\n" +
							   "Produto 2 - $ 4,50\n" +
							   "Produto 3 - $ 9,98\n" +
							   "Produto 4 - $ 4,49\n" +
							   "Produto 5 - $ 6,87");
			System.out.print("Número do produto (0 p/ sair): ");
			produto = input.nextInt();

			if(produto != 0)
			{
				System.out.print("Quantidade : ");
				quantidade = input.nextInt();

				switch(produto)
				{
				case 1:
					p1 += quantidade*2.98;
					break;
				case 2:
					p2 += quantidade*4.5;
					break;
				case 3:
					p3 += quantidade*9.98;
					break;
				case 4:
					p4 += quantidade*4.49;
					break;
				case 5:
					p5 += quantidade*6.87;
					break;
				default:
					System.out.println("WARNING Produto inválido.");
					break;
				}
			}
		}
		System.out.printf("Produto 1 - %s\nProduto 2 - %s\nProduto 3 - %s\nProduto 4 - %s\n"+
				"Produto 5 - %s",p1,p2,p3,p4,p5);
	}
}
