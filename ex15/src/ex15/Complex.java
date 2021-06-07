package ex15;
public class Complex implements Comparable<Complex>{
	private double a,b;
	Complex(double a,double b){
		this.a=a;
		this.b=b;
	}
	Complex(double a){
		this.a=a;
		this.b=0;
	}
	Complex(){
		this.a=0;
		this.b=0;
	}
	public double getRealPart(){
		return a;
	}
	public double getImaginaryPart(){
		return b;
	}
	public String toString(){
		if (b>0)
			return Double.toString(a)+" + "+Double.toString(b)+'i';
		else if(b<0)
			return Double.toString(a)+" - "+Double.toString(b*(-1))+'i';
		else
			return Double.toString(a);
	}
	public Complex add(Complex c){
		Complex d = new Complex(this.a+c.a,this.b+c.b);
		return d;
	}
	public Complex substract(Complex c){
		Complex d = new Complex(this.a-c.a,this.b-c.b);
		return d;
	}
	public Complex multiply(Complex c){
		Complex d = new Complex(this.a*c.a-this.b*c.b,this.a*c.b+this.b*c.a);
		return d;
	}
	public Complex divide(Complex c){
		double e,f,g;
		e=(c.a*c.a+c.b*c.b);
		f=(this.a*c.a+this.b*c.b)/e;
	    g=(this.b*c.a-this.a*c.b)/e;
		Complex d = new Complex(f,g);
		return d;
	}
	public double abs(){
		double d;
		d = Math.sqrt(this.a*this.a+this.b*this.b);
		return d;
	}
	public int compareTo(Complex o){
		if(this.b > o.b)
			return 1;
		else if(this.b == o.b)
			return 0;
		else
			return -1;
	}
}

