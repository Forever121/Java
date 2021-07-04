package lknd;

public class ddd {
	public static void main(String []args) {
		int n =6;
		int f1=1,f2=1,f3=1;
		for(int i=0;i<n-2;i++) {
			f1=f2;
			f2=f3;
			f3=f1+f2;
		}
		System.out.print(f3);
	}
}
