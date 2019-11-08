package fundamental;

public class SumProductOfInput {
    public static void main (String[] args)
    {
        int sum;
        int product;

        sum=Integer.parseInt(args[0]);
        product=sum;

        for (int i=1; i<args.length; i++)
        {
            sum+=Integer.parseInt(args[i]);
            product*=Integer.parseInt(args[i]);
        }

        System.out.println("The sum is "+sum+" ");
        System.out.println("The product is "+product+" ");
    }
}
