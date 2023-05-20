import java.util.*;
public class PalindromeorNot {
    public static void main(String[] args) {
    System.out.println("Enter a Number to check Palindrome or Not");
    Scanner sc = new Scanner(System.in);
    String Palin = sc.nextLine();
    char[] Mychar = Palin.toCharArray();
    int start=0 ;
    int flag=0;
    int end=Mychar.length-1;
    while(Mychar[start]!=Mychar[end])
    {
        System.out.println("Not Palindrome");
        start++;
        end--;
        flag=1;
        break;
    }
    if(flag!=1)
    {
        System.out.println("Palindrome");
    }
    }
}
