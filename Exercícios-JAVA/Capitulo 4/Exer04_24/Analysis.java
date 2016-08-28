import java.util.Scanner;

public class Analysis
{
	public void processExamResults()
	{

		Scanner input = new Scanner( System.in );


		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		int result;


		while ( studentCounter <= 10 )
		{
			result = 0;

			System.out.print( "Enter result (1 = pass, 2 = fail): " );

			while ((result != 1) && (result!=2))
			{
				result = input.nextInt();
				if ((result != 1) && (result!=2))
					System.out.println("Invalid input");
			}

			if ( result == 1 )
				passes = passes + 1;
			else
				failures = failures + 1;


			studentCounter = studentCounter + 1;
		}


		System.out.printf( "Passed: %d\nFailed: %d\n", passes, failures );


		if ( passes > 8 )
			System.out.println( "Raise Tuition" );
	}
} 
