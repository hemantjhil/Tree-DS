{
import java.util.*;
class Node
{
	Node next;
	int data;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}
class Delete_Kth_Node
{
	Node head;	
	/*void printlist()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
		System.out.println();
	}*/
	void addToTheLast(Node node)
	{
		if(head == null)
		head = node;
		else
		{
			Node temp = head;
			while(temp.next != null)
			temp = temp.next;
			
			temp.next = node;
		} }	
	public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();		 
		 while(t>0)
         {
			int n = sc.nextInt();
			Delete_Kth_Node list = new Delete_Kth_Node();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node head= new Node(a1);
            list.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				list.addToTheLast(new Node(a));
			}
			int k = sc.nextInt();					  
			//System.out.println(list.head.data+" "+ k);
			list.head = new GfG().delete(list.head,k); 
			Node temp = list.head;
			while(temp!=null)
			{
				System.out.print(temp.data+ " ");
			    temp = temp.next;
			}
			System.out.println();
			t--;
		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
/* Link list Node
class Node
{
	Node next;
	int data;
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
class GfG
{
    /*You are required to complete this method*/
    Node delete(Node head, int k)
    {
	// Your code here
	    Node n1=head;
	    int count=0;
	    while(n1.next!=null){
	        count++;
	        n1=n1.next;
	    }
	    
	    Node n2=head;
	    Node n3=null;
	    int i=1;
	    if(k==1) return null;
	    else if(k==0) return head;
	    else if(head==null) return null;
	    else{
	        int t=count/k;
	    while(n2!=null && n2.next!=null){
	        if(i%(k-1)==0){
	            n2.next=n2.next.next;
	        }
	        i++;
	        n2=n2.next;
	    }
	    return head;
	    }
    }
}
