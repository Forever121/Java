package list;
import java.util.*;
public class list {
	public static void main(String[] args) {
		node first = buildlist();
		printlist(first);
     	first = deleteList(first);
		printlist(first);
		
	}
	public static void printlist(node first){
		node listnode = first;
		if(listnode!=null)
			System.out.println("The list is:");
		else
			System.out.print("The list is null!");
		while(listnode!=null) {
			System.out.print(listnode.getvar());
			if(listnode.next!=null)
				System.out.print("->");
			listnode = listnode.next;
		}
		System.out.print("\n");
	}
	public static node buildlist() {
		System.out.println("Please enter the length of the list:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if(n>0)
			System.out.println("Please enter the elements of the list:");
		int [] a = new int [n];
		for(int i = 0 ; i<n ; i++) {
			a[i]=input.nextInt();
			}
		node first = null , last = null , listnode = null;
		if( a.length>0 ) {
			for(int i = 0;i < a.length;i++) {
				listnode = new node(a[i]);
				if(i==0) {
					last = listnode;
					first = listnode;
				}
				else {
					last.next = listnode;
					last = listnode;
				}
			}
		}
		input.close();
		return first;
	}
	public static node deleteList(node first) {
		first = null;
		return first;
	}
}
class node{
	private int var;
	public node next = null;
	node(int a){
		this.var = a;
	}
	public int getvar() {
		return var;
	}
}
