package ex12;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class BFS {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the first node:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		n--;
		int[][] adjMatrix = new int[][]{
			{0,1,1,0,0,0,0,0},
            {1,0,0,1,1,0,0,0},
            {1,0,0,0,0,1,1,0},
            {0,1,0,0,0,0,0,1},
            {0,1,0,0,0,0,0,1},
            {0,0,1,0,0,0,1,0},
            {0,0,1,0,0,1,0,0},
            {0,0,0,1,1,0,0,0}};
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0;i<adjMatrix.length;i++) {
        	list2.add(0);
        }
        list1.add(n);
        list2.set(n,1);
        for(int i=0 ;i<adjMatrix.length;i++) {
        	for(int j=0;j<adjMatrix.length;j++) {
        		if((adjMatrix[list1.get(i)][j]==1)&&(list2.get(j)==0)) {
        			list1.add(j);
        	        list2.set(j,1);
        		}
        	}
        }
        Iterator<Integer> iterstor1 = list1.iterator();
        while(iterstor1.hasNext()) {
        	System.out.print("V"+(iterstor1.next()+1));
            if(iterstor1.hasNext())
            	System.out.print("->");
            else
            	System.out.println();
        }
	}
}
