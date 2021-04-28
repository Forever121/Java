package ex11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class arraylist {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("To achieve removeDuplicate function,please enter 1:\nTo achieve union function,please enter 2:");
		Scanner input = new Scanner(System.in);
		int z = 3;
		do {
			z = input.nextInt();
			if(z==1) {
				System.out.print("Enter ten integers: ");
				ArrayList<Integer> list = new ArrayList<>();
				for(int i=0;i<10;i++) {
					int in = input.nextInt();
					list.add(in);
				}
				arrayfunc a = new arrayfunc();
				a.removeDuplicate(list);
				}else
					if(z==2) {
						System.out.print("Enter five integers for list1: ");
						ArrayList<Integer> list1 = new ArrayList<>();
						for(int i=0;i<5;i++) {
							int in = input.nextInt();
							list1.add(in);
						}
						System.out.print("Enter five integers for list2: ");
						ArrayList<Integer> list2 = new ArrayList<>();
						for(int i=0;i<5;i++) {
							int in = input.nextInt();
							list2.add(in);
						}
						arrayfunc b = new arrayfunc();
						ArrayList<Integer> sumlist = new ArrayList<>();
						sumlist=b.union(list1,list2);
						System.out.print("The combined list is ");
						b.printarray(sumlist);
					}else 
						System.out.println("Incorrect input, please reenter:");
			}while((z!=1)&&(z!=2));
		}
}
class arrayfunc {
	public static void removeDuplicate(ArrayList<Integer> list) {
		for(int i=0;i<list.size();i++) {
			int k=0;
			for(int j=0;j<list.size();j++) {
				
				if(list.get(i)==list.get(j)) {
					k++;
					if(k>1) {
						list.remove(j);
						j--;
						k--;
					}
				}
			}
		}
		System.out.print("The distinct integers are ");
		printarray(list);
	}
	public static ArrayList<Integer> union(ArrayList<Integer> list1,ArrayList<Integer> list2) {
		ArrayList<Integer> list = new ArrayList<>();
		Iterator<Integer> iterstor1 = list1.iterator();
		Iterator<Integer> iterstor2 = list2.iterator();
		while(iterstor1.hasNext()) {
			int a = iterstor1.next();
			list.add(a);
		}
		while(iterstor2.hasNext()) {
			int b = iterstor2.next();
			list.add(b);
		}
		return list;
	}
	public static void printarray(ArrayList<Integer> list) {
		Iterator<Integer> iterstor = list.iterator();
		while(iterstor.hasNext()) {
			int a = iterstor.next();
			System.out.print(a);
			System.out.print(' ');
		}
		System.out.print('\n');
	}
}