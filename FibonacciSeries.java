import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of Series");
        int Range = sc.nextInt();
        int n1=1;
        int n2=2;
        System.out.print(n1+" "+n2);
        for(int i=3;i<=Range;i++)
        {

            int n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;

        }
    }
}
