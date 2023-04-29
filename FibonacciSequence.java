import java.util.Scanner;

public class FibonacciSequence
{
    public static void main(String[] args) 
    {
        int n1 = 0;
        int n2 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How Many times you want Sequence");
        int a = sc.nextInt();
        System.out.print(n1+" "+n2);
        for(int i=2;i<a;i++)
        {
            int n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            
        }
    }
}
