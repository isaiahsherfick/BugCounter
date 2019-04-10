import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class CheckBugs
{
	public static void main(String[] args)
	{
		File file = new File("bugCount.bc");
		try
		{
			Scanner sc = new Scanner(file);
			int bugs = sc.nextInt();
			System.out.printf("\nKiwi has %d bugs left.",bugs);
            if (bugs < 100)
            {
                System.out.printf(" Order more!\n");
            }
            else
            {
                System.out.printf("\n");
            }
            sc.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}

	}
}
