public class SingleLinkedList
{
    private ListNode Head;
    private static class ListNode 
    {
        private int data;
        private ListNode next;
        public   ListNode(int data)
        {
            this.data= data;
            this.next = null;
        }
    }
    public void Display()
    {
        ListNode current = Head;
        while(current!=null)
        {
            System.out.print(current.data+"----->");
            current = current.next;
        }
        System.out.print("NULL");
    }
    public static void main(String[] args) 
    {
        SingleLinkedList ob  = new SingleLinkedList();
        ob.Head = new ListNode(10);
        ListNode first = new ListNode(100);
        ob.Head.next = first;
        ob.Display();

    }
}