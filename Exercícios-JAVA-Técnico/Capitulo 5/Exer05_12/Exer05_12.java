public class Exer05_12 {
    public static void main ( String args[] )
    {
        int total = 1;

        for (int i = 3; i < 10; i+=2)
        {
            total *= i;
        }

        System.out.printf("Total = %d\n",total);

    }
}
