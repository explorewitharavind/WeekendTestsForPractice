public class RemovingEvenNumbersInArray {
    public void DemoArray()
    {
        int[] myArray = {2,3,4,5,6,7,8};
        RemovingEvenNumbers(myArray);
    }
    public void RemovingEvenNumbers(int[] arr)
    {
        int l = arr.length;
        for(int i =0;i<l;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.print(arr[i]+ " ");
            }
        }
    }
    public static void main(String[] args) {
        RemovingEvenNumbersInArray ob = new RemovingEvenNumbersInArray();
        ob.DemoArray();
    }
}
