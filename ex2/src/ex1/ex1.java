package ex1;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������Ҫת���Ľ���(36����)��");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println("������Ҫת����ʮ��������");
		int b = input.nextInt();
		String c="";
		int d=0;
		while(b!=0) {
			d=b%a;
			b=b/a;
			if((d>=0)&&(d<10)) c=(char)('0'+d)+c;
			if((d>=10)&&(d<36)) c=(char)('A'+d-10)+c;
		}
		System.out.println(c);
	}

}