package Practice;
		
public class Linked_List1 {
	Node head;
	
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
			System.out.print("LOOP");
		}

	}
	
	//Insert node at frontṇ
		void push(int data)
	{
		Node new_node=new Node(data);
		new_node.next=null;
		head=new_node;
		
	}
		//Insert node after the given node
	void insertafter(Node prevNode,int data)
	{
		if(prevNode==null)
		{
			System.out.print("The given linked list is empty");
			return;
		}
		
		Node new_node=new Node(data);
		new_node.data=data;
		new_node.next=prevNode.next;
		prevNode.next=new_node;
		
	}
	
	//Insert at the end
	void Insertend(Node endnode,int data)
	{
		Node new_node=new Node(data);
		new_node.next=null;
		
		Node last=head;
		while(last.next!=null)
		{
			last=last.next;
		}
		
		last.next=new_node;
		return;

	}
	
	//Print LinkedlList
	
	void print()
	{	
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data);
			curr=curr.next;
		}
	}
	
	
	public static void main(String args[])
	{
		Linked_List1 llist=new Linked_List1();
		
		llist.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		llist.head.next=second;
		second.next=third;
		llist.print();
		
	}
	
	
}
