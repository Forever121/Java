package ex13;
import java.io.*;
public class filewrite {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file2 = new File("D:\\code\\new.txt");
		System.out.println(file2.exists());
	    java.io.PrintWriter output = new java.io.PrintWriter(file2);
	    output.print("is am are");
	    output.close();
	    
	}

}
