import java.util.Scanner;


public class JavaFund5{

public static void main(String[] args)
{
	Scanner input= new Scanner(System.in);

	String[] Month={"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октярь", "Ноябрь", "Декабрь" };

	System.out.println("Please, enter the number from 1 to 12");

	int number=input.nextInt();
	
	while( ((number<1)) || ((number>12)) ){

	System.out.println("Please, try again: ");
	number =  input.nextInt();
	}
	System.out.println(Month[number-1]);
}
}
