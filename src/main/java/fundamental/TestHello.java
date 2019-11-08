package fundamental;

import java.util.Scanner;

public class TestHello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        do {
            System.out.println("Please, enter your name or 'quit':");
            name=input.nextLine();
            if (name.equals("quit")) break;
            System.out.println("Hello "+name+"!");
        } while(!name.equals("quit"));
        System.out.println("Bye!");
    }
}
