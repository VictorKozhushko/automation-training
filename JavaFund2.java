// Задание JavaFund2 вывод командной строки в обратном порядке

public class JavaFund2{
public static void main (String[] args){

for(int i=args.length; i>0; i--){
	System.out.print(args[i-1]+" ");
}
	System.out.println();
}
}
