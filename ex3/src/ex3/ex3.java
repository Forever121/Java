package ex3;

import java.util.Scanner;

public class ex3 {
	public static int Fibonacci(int n) {
		if(n<=2) {
			return 1;
		}
		else {
			int i;
			int a1,a2,a3;
			a1=1;
			a2=1;
			a3=2;
			for(i=0;i<n-2;i++) {
				
				a3=a1+a2;
				a1=a2;
				a2=a3;
				
			}
			return a3;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入N的值：");
		Scanner input = new Scanner(System.in);
	 	int n=input.nextInt();
	 	System.out.println("对应的Fibonacci数值为"+Fibonacci(n));
	 	

	}

}
