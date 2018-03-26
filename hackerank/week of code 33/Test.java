package ex1;


public class Test {


	      

		public static void main(String args[])
	    {
	    Node node = new Node();
	    Node head=node;
	    int i=0;
	    while(i<5){
	    	node.data=i+"";
	    	node.next=new Node();
	    	node=node.next;
	    	i++;
	    }
	    Node curr=head;
	    Node perv=null;
	    Node nxt=head.next;
	    while(curr!=null){
	    	nxt=curr.next;
	    	curr.next=perv;
	    	perv=curr;
	    	curr=nxt;
	    	
	    }
	    head=perv;
	    
	    
	    
		while(head.next!=null){
			System.out.println(head.data);
			head=head.next;
		}
	    }
}
