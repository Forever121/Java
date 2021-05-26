package ex14;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class DFS {

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
            {0,0,0,1,1,0,0,0}
            };
         ArrayList<Integer> list1 = new ArrayList<>();
         int[] list2 = {0,0,0,0,0,0,0,0};
         list1.add(n);
         list2[n]=1;
         int k=1;
         while(k<adjMatrix.length) {
        	 int newk=k;
        	 for(int i = list1.size()-1,j=0;j<adjMatrix.length;j++) {
        		 if((adjMatrix[list1.get(i)][j]==1)&&(list2[j]==0)) {
         			list1.add(j);
         	        list2[j]=1;
         	        newk++;
         	        break;
         		}
        	 }
        	 if(k==newk) {
        		 for(int i=0 ;i<adjMatrix.length;i++) {
        	        	for(int j=0;j<adjMatrix.length;j++) {
        	        		if((adjMatrix[list1.get(i)][j]==1)&&(list2[j]==0)) {
        	        			list1.add(j);
        	        	        list2[j]=1;
        	        	        k++;
        	        	        break;
        	        		}
        	        	}
        	        }
        	 }
        	 else
        		 k=newk;
         }
         Iterator<Integer> iterstor1 = list1.iterator();
         while(iterstor1.hasNext()) {
         	System.out.print("V"+(iterstor1.next()+1));
             if(iterstor1.hasNext())
             	System.out.print("->");
             else
             	System.out.println();
         }
         input.close();
	}

}
