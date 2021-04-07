package ren.fujian;

import java.util.Scanner;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] array = {1, 3, 3, 3, 3, 6, 6, 8, 8, 8, 10};
		System.out.println("查询首次出现输入1，末次输入2：");
		int i = input.nextInt();
		System.out.println("输入要查询的数：");
		int x = input.nextInt();
		if(i==1)
			f1(array,x);
		else 
			f2(array,x);
		
		

	}
	public static void f1(int [] arr,int x) {
		int l=0;
		int h=arr.length-1;
		while(l<h) {
			int m=(l+h)/2;
			if(arr[m]>=x) {
				h=m;
			}
			else {
				if(arr[m]<x)
					l=m+1;
			}
						
		}
		if(arr[l]!=x)
			System.out.println("要查询的数不在数组中应该插入的位置是：");
		System.out.println(l);
	}
	public static void f2(int [] arr,int x) {
		int l=0;
		int h=arr.length-1;
		while(l<h) {
			int m=(l+h+1)/2;
			if(arr[m]<=x) {
				l=m;


			
			}
			else {
				if(arr[m]>x)
					h=m-1;
			}
					
		}
		if(arr[l]!=x) {
			System.out.println("要查询的数不在数组中应该插入的位置是：");
			l++;
		}
		System.out.println(l);
	}

}