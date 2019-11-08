package fundamental;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        Random rnd = new Random(47);

        for (int i=0; i<10; i++)
            list.add(rnd.nextInt(100)-50);
        System.out.print(list);
        System.out.println();

        list.sort(new Comparator<Integer>() {
                      public int compare(Integer o1, Integer o2) {
                return (o2-o1);
            }
        });

        System.out.print(list);
    }
}
