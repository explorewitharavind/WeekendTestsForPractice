import java.util.*;
public class SumofNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the Range of Numbers");
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        int sum=0;
        for(int i=1;i<=Number;i++)
        {
            sum = sum+i;
        }
        System.out.println("Sum of Natural Numbers is "+sum);
    }
}
