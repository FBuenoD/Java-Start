import java.util.Scanner;

public class Exer04_18 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		Dados d = new Dados();

		System.out.println("Número da conta: ");
		d.setNConta(input.nextInt());

		System.out.println("Saldo no início do mês: ");
		d.setSaldoInicial(input.nextInt());

		System.out.println("Total de todos os itens cobrados no mês: ");
		d.setTotalComprado(input.nextInt());

		System.out.println("Total de créditos no mês: ");
		d.setTotalCredito(input.nextInt());

		System.out.println("Limite de crédito autorizado: ");
		d.setLimiteCredito(input.nextInt());

		d.setSaldoInicial(d.getSaldoInicial()+d.getTotalComprado()-d.getTotalCredito());
		if(d.getTotalCredito()>d.getLimiteCredito())
			System.out.println("Limite de crédito excedido.");
	}
}
