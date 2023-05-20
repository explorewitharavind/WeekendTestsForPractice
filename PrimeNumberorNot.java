import java.util.*;
public class PrimeNumberorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to Check Prime Number or Not");
        int Number = sc.nextInt();
        int flag=0;
        if(Number == 0 || Number ==1)
        {
            System.out.println("Please enter Number Greater than 1");
        }
        for(int i=2;i<=Number/2;i++)
        {
            if(Number%i==0)
            {
                System.out.println("Not a Prime Number");
                flag =1;
                break;
            }
        }
        if(flag!=1)
        {
            System.out.println("Prime Number");
        }
    }
}
