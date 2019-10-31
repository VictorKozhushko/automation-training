import java.util.Random;

public class JavaFund3{
public static void main(String[] args)
{
	Random rand = new Random();
	int number;
	
	for (int i=0; i<10; i++)
	{
	number = rand.nextInt(100);
	System.out.print(number+" ");	
	}
}
}
