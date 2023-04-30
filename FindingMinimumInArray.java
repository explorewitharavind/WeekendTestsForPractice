public class FindingMinimumInArray {
    public void ArrayDemo()
    {
        int[] myArray = {10,20,30,50,40,5};
        FindingMinimum(myArray);
    }
    public void FindingMinimum(int[] arr)
    {
        int min = 0 ;
        int l = arr.length;
        for(int i=1;i<l;i++)
        {
           if(arr[i]<=arr[min])
           {
            int temp =0;
            temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
            System.out.println(arr[min]);
           break;
           } 
           
        }
        
        
        
    }
    public static void main(String[] args) 
    {
        FindingMinimumInArray ob = new FindingMinimumInArray();
        ob.ArrayDemo();
    }
}
