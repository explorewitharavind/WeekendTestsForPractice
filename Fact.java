import java.util.Scanner;
public class Fact {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a Number");
        int Number = sc.nextInt();
        for(int i=Number-1;i>=1;i--)
        {
            Number = Number*i;
        }
        System.out.println(Number);
        
    }
}
