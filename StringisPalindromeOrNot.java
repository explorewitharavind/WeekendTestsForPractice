import java.util.Scanner;

public class StringisPalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to Check Palindrome or Not");
        String Name = sc.nextLine();
        char[] myChar = Name.toCharArray();
        int start = 0;
        int end = myChar.length-1;
        int flag = 0;
        while(myChar[start]!=myChar[end])
        {
            System.out.println(Name+" is Not a Palindrome ");
            start++;
            end--;
            flag = 1;
            break;
        }
        if(flag !=1)
        {
            System.out.println(Name+" is Palindrome");
        }
}
}
