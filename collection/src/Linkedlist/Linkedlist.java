package Linkedlist;
class node
{
	int item;
	node next;
	public node(int item)
	{
		this.item=item;
		this.next=null;
	}
}
public class Linkedlist {

	public static void main(String[] args) {
		node node=new node(100);
		node node1=new node(200);
		node node2=new node(300);
		node.next=node1;
		node1.next=node2;
       System.out.println(node.item);
       System.out.println(node.next.item);
       System.out.println(node.next.next.item);
	}

}
