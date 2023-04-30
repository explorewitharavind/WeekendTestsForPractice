public class RemovingOddNumbersInArray {
    public void DemoArray()
    {
        int[] myArray = {1,2,3,4,5,6};
        RemovingOddNumbers(myArray);
    }
    public void RemovingOddNumbers(int[] arr)
    {
        int l = arr.length;
        for(int i =0;i<l;i++)
        {   
            if(arr[i]%2==0)
            {
                System.out.print(arr[i]+" ");
            }
            
        } 
    }
    
        public static void main(String[] args) 
        {
            RemovingOddNumbersInArray ob = new RemovingOddNumbersInArray();
            ob.DemoArray();
        }
}
