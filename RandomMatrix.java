import java.util.Random;
import java.util.Scanner;

public class RandomMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random(47);
        int dim;
        System.out.println("Введите размерность матрицы:");
        dim = input.nextInt();

        Integer a[][] = new Integer[dim][dim];

        for(int i=0; i<dim;i++)
            for(int j=0; j<dim; j++)
                a[i][j]=random.nextInt(100)-50;

            for(int i=0; i<dim; i++)
            {
                for(int j=0; j<dim;j++)
                    System.out.print(a[i][j]+"\t");
                System.out.println();
            }

            System.out.println("Enter number of column for sorting < "+dim);
            int num = input.nextInt();

            Integer column[] = new Integer[dim];
            //int min= a[0][num];
            int temp;
            boolean isSorted=false;
            while (!isSorted){
                isSorted=true;
                for(int i=0; i<dim-1; i++) {
                    if (a[i][num] > a[i + 1][num]) {
                        isSorted = false;
                        for(int j=0;j<dim; j++){
                            temp = a[i][j];
                            a[i][j] = a[i + 1][j];
                            a[i + 1][j] = temp;
                        }

                    }
                }

            }

        for(int i=0; i<dim; i++)
        {
            for(int j=0; j<dim;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }

    }
}
