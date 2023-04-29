import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to find Factoeial");
        int Number = sc.nextInt();
        int sum =1;
        for(int i=Number;0<i;i--)
        {
            sum = sum*i ;
        }
        System.out.println("Factorial of"+Number+" is "+ sum);
    }
}
