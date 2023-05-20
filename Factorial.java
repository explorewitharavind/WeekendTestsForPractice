import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a Number to get Factorial");
        Scanner sc = new Scanner(System.in);
        int fact = sc.nextInt();
        for(int i=fact-1;i>0;i--)
        {
            fact = fact*i;
        }
        System.out.println("The Factorial is "+fact);
    }
}
