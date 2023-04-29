public class ArrayContainsOddNumber {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5};
        for(int i =0;i<myArray.length;i++)
        {
            if(myArray[i]%2!=0)
            {
                System.out.println("OddNumbers are "+myArray[i]);
            }
        }
    }
}
