import java.util.Scanner;

public class ReverseAStringIn {
    public static void main(String[] args) {
        
    
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter a String");
        String Name = sc.nextLine();
        char[] Mychar = Name.toCharArray();
        for(int i=Mychar.length-1;i>=0;i--)
        {
            System.out.print(Mychar[i]);
        }
    }
}
}
