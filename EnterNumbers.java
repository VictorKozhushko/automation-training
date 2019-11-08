import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class EnterNumbers {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter 5 integers:");

        for(int i=0; i<5; i++)
            array.add(input.nextInt());

        for (Integer num: array
             ) {
            System.out.println(num+"\t"+num.toString().length());
        }

        array.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int dif = o1.toString().length()-o2.toString().length();
                if (dif!=0)
                    return dif;
                return o1-o2;

            }
        });

        System.out.println(array);

    }
}
