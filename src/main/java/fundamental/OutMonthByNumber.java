package fundamental;

import java.util.Scanner;

public class OutMonthByNumber {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);

        String[] month={"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октярь", "Ноябрь", "Декабрь" };

        System.out.println("Please, enter the number from 1 to 12");

        int number=input.nextInt();

        while( (number<1) || (number>12) ){

            System.out.println("Please, try again: ");
            number =  input.nextInt();
        }
        System.out.println(month[number-1]);
    }
}
