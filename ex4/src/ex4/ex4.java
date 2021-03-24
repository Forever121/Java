package ex4;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1,x2,x3,y1,y2,y3,a1,a2,a3,a,b,c,angleA,angleB,angleC;
		a1=Math.random()*(2*Math.PI);
		x1=40*Math.cos(a1);
		y1=40*Math.sin(a1);
		a2=Math.random()*(2*Math.PI);
		x2=40*Math.cos(a2);
		y2=40*Math.sin(a2);
		a3=Math.random()*(2*Math.PI);
		x3=40*Math.cos(a3);
		y3=40*Math.sin(a3);
		a=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
		b=Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2));
		c=Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));
		angleA=Math.toDegrees(Math.acos((a*a-b*b-c*c)/(-2*b*c)));
		angleB=Math.toDegrees(Math.acos((b*b-a*a-c*c)/(-2*a*c)));
		angleC=Math.toDegrees(Math.acos((c*c-b*b-a*a)/(-2*b*a)));
		System.out.printf("The first angle in degree is %.2f\n",angleA);
		System.out.printf("The second angle in degree is %.2f\n",angleB);
		System.out.printf("The third angle in degree is %.2f",angleC);
	}

}
