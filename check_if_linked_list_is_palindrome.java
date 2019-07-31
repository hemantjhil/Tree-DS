{
import java.util.*;
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}
class Is_LinkedList_Palindrom
{
	 Node head;  
	
	/* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
 
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) 
	{
		if (head == null) 
		{
			head = node;
		} else 
		{
		   Node temp = head;
		   while (temp.next != null)
		   temp = temp.next;
		   temp.next = node;
		}
    }
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		 
		while(t>0)
        {
			int n = sc.nextInt();
			//int k = sc.nextInt();
			Is_LinkedList_Palindrom llist = new Is_LinkedList_Palindrom();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
			
			Palindrome g = new Palindrome();
			if(g.isPalindrome(llist.head) == true)
			System.out.println(1);
		else
			System.out.println(0);
			t--;
		}
		
	}
}

}
/*This is a function problem.You only need to complete the function given below*/
/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
class Palindrome
{
    // Function to check if linked list is palindrome
    boolean isPalindrome(Node head) 
    {
        //Your code here
        int count=1;
        Node n1=head;
        while(n1.next!=null){
            count++;
            n1=n1.next;
        }
        int n=count;
        //System.out.println(n);
        boolean b=true;
        if(n==2){
            if(head.data!=head.next.data){
                b=false;
            }
        }
        else{
        Node n2=head,n3=head;
        for(int i=0;i<n/2;i++){
            
            n3=n2;
            for(int j=i;j<n-i-1;j++){
                n3=n3.next;    
            }
            if(n3.data!=n2.data){
                b=false;
                break;
            }
            n2=n2.next;
        }
        }
        return b;
    }    
}
