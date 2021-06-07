package ex15;
import java.util.Scanner;
import java.util.Arrays;
public class Start {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first complex number:  ");
		double a,b,c,d;
		a = input.nextDouble();
		b = input.nextDouble();
		System.out.print("Enter the second complex number:  ");
		c = input.nextDouble();
		d = input.nextDouble();
//		a=3.5;
//		b=0.5;
//		c=-3.5;
//		d=1;
		Complex x = new Complex(a, b);
		Complex y = new Complex(c, d);
//		System.out.println(x.toString());
//		System.out.println(y.toString());
		comprint(x,'+',y,x.add(y));
		comprint(x,'-',y,x.substract(y));
		comprint(x,'*',y,x.multiply(y));
		comprint(x,'/',y,x.divide(y));
		comprintabs(x,x.abs());
		comprintcompare(x,x.compareTo(y),y);
		input.close();
		Complex abc[]= {new Complex(a, b),new Complex(a, c),new Complex(a, d),new Complex(a, a)};
		System.out.println("生成一个复数序列：");
		comprintarr(abc);
		Arrays.sort(abc);
		System.out.println("对复数序列排序后：");
		comprintarr(abc);
	}
	public static void comprint(Complex a,char e,Complex b,Complex c){
		System.out.print("("+a.toString()+")");
		System.out.print(" "+ e +" ");
		System.out.print("("+b.toString()+")"+" = ");
		System.out.println(c.toString());
	}
	public static void comprintabs(Complex a,double c){
		System.out.print("|(");
		System.out.print(a.toString());
		System.out.print(")| = ");
		System.out.println(c);
	}
	public static void comprintarr(Complex arr[]) {
		for(int i = 0;i < arr.length;i++)
		System.out.println(arr[i].toString());
	}
	public static void comprintcompare(Complex a,int e,Complex b){
		if(e == 1){
			System.out.print("("+a.toString()+")");
		    System.out.print(" > ");
		    System.out.println("("+b.toString()+")");
		}
		else if(e == 0){
			System.out.print("("+a.toString()+")");
		    System.out.print(" = ");
		    System.out.println("("+b.toString()+")");
		}
			
		else{
			System.out.print("("+a.toString()+")");
		    System.out.print(" < ");
		    System.out.println("("+b.toString()+")");
		}
	}
}
