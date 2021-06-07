package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS {
public static void main(String args[]) {
	ArrayList<Integer> list =new ArrayList<>();
	int[][] adjMatrix =new int[][] {
		{0,1,1,0,0,0,0,0},
		{1,0,0,1,1,0,0,0},
		{1,0,0,0,0,1,1,0},
		{0,1,0,0,0,0,0,1},
		{0,1,0,0,0,0,0,1},
		{0,0,1,0,0,0,1,0},
		{0,0,1,0,0,1,0,0},
		{0,0,0,1,1,0,0,0}
	};
	System.out.print("ÇëÊäÈë½Úµã±àºÅ:");
	Scanner input =new Scanner(System.in);
	int num =input.nextInt();
	input.close();
	Search(list,adjMatrix,num);
}
public static void Search(ArrayList<Integer> list,int[][] adjMatrix,int num) {
	Boolean[] visit ={false,false,false,false,false,false,false,false};
	ArrayList <Integer> nextlist=new ArrayList<>();
	list.add(num);
	visit[num-1] =true;
	for(int i=0;i<adjMatrix.length;i++) {
		if((adjMatrix[num-1][i]==1)&&(visit[i]==false)) {
			list.add(i+1);
			visit[i] =true;
			nextlist.add(i+1);
			num=i+1;
			i=0;
		}
	}
	while(!allvisit(visit)) {
		int m=nextlist.get(0);
		nextlist.remove(0);
		for(int n=0;n<adjMatrix.length;n++) {
			if((adjMatrix[m-1][n]==1)&&(visit[n]==false)) {
				list.add(n+1);
				visit[n] =true;
				nextlist.add(n+1);
			    m=n+1;
				n=0;
			}
	    }
	}
	for(int j=0;j<list.size();j++) {
		System.out.print("V"+list.get(j)+" ");
	}
}
public static Boolean allvisit(Boolean[] visit) {
	Boolean e =true;
	for(int t=0;t<visit.length;t++) {
		if(visit[t]==false) {
			e=false;
	    }
	}
	return e;
}
}