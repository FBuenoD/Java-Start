public class Exer04_37b {
	public static void main(String[] args)
	{
		Fatorial fat = new Fatorial();
		double euler = 0;

		for (int i = 0; i < 20; i++) {
			euler += 1.0/fat.calcula(i);
		}
		System.out.println("Euler =  "+euler+"\nMath.E = "+Math.E);
	}
}
