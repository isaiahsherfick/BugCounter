import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class AddBugs
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc2;
		File file = new File("bugCount.bc");
		try
		{
			FileWriter fw = new FileWriter(file);
			sc2 = new Scanner(file);
			int currentBugs = sc2.nextInt();
			System.out.printf("\nHow many bugs just came in?\n");
			int userIn = sc.nextInt();
			fw.write(currentBugs + userIn);
			System.out.printf("Kiwi now has %d bugs\n",currentBugs + userIn);
			fw.close();
			sc2.close();
			sc.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
			sc.close();
			return;
		}
	}

}
