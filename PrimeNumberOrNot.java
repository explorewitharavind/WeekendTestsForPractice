import java.util.Scanner;

public class PrimeNumberOrNot
{
    public static void main(String[] args)
    {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        int flag = 0;
        if(Number==1||Number==0)
        {
            System.out.println("Please enter Number Greater than 1");
        }
        for(int i=2;i<Number/2;i++)
        {
            
            if(Number%i==0)
            {
                System.out.println(Number+" is Not a Prime Number");
                flag = 1;
                break;
            }
        }
        if(flag!=1)
        {
            System.out.println(Number+" is a Prime Number");
        }
    }
}