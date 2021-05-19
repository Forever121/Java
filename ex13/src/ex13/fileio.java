package ex13;
import java.io.FileNotFoundException;
import java.util.Scanner;
class inputException extends Exception {
	public inputException() {
	}

	public inputException(String mes) {
		super(mes);
	}
}
public class fileio {
	public static void main(String [] args) throws FileNotFoundException, inputException{
		java.io.File file = new java.io.File("D:/code/an_interesting_story.txt");
//		System.out.println(file.exists());
//		System.out.println(file.length()+"bytes");
//		System.out.println(file.canRead());
//		System.out.println(file.canWrite());
//		System.out.println(file.isDirectory());
//		System.out.println(file.isFile());
//		System.out.println(file.isAbsolute());
//		System.out.println(file.isHidden());
//		System.out.println(file.getAbsolutePath());
//		System.out.println(new java.util.Date(file.lastModified()));
		System.out.println("File "+ file.getName() + " has\n" + getchar(file)
		+ " characts\n" + getword(file) + " words\n" +getline(file) + " lines");
		
		boolean flag = true;
		do {
			try {
				char search = inputLetter();
				System.out.println(sum(file, search));
				flag = false;
			} catch (inputException ex) {
				System.out.println(ex);
				char searchNew = inputLetter();
				System.out.println(sum(file, searchNew));
			}
		} while (flag);
	}
	public static int getline(java.io.File f) throws FileNotFoundException {
		Scanner input = new Scanner(f);
		int n = 0;
		while(input.hasNext()) {
			input.nextLine();
			n++; 
		}
		input.close();
		return n;
		
	}
	public static int getword(java.io.File f) throws FileNotFoundException {
		Scanner input = new Scanner(f);
		int n = 0;
		while(input.hasNext()) {
			input.next();
			n++;
		}
		input.close();
		return n;
		
	}
	public static int getchar(java.io.File f) throws FileNotFoundException {
		Scanner input = new Scanner(f);
		int n = 0;
		while(input.hasNext()) {
			String s = input.nextLine();
			n = n+s.length();
		}
		input.close();
		return n;
		
	}
	public static int sum(java.io.File f , char ch) throws FileNotFoundException {
		int n=0;
		Scanner input = new Scanner(f);
		while (input.hasNextLine()) {
			String s = input.nextLine();
			for (int i = 0; i < s.length(); i++) {
				char x = s.charAt(i);
				if (x == ch)
					n++;
			}
		}
		input.close();
		return n;
	}
	public static char inputLetter() throws inputException {
		System.out.println("请输入要查询的字符(区分大小写)：");
		Scanner input2 = new Scanner (System.in);
		char c = input2.next().charAt(0);
		if (c >= 'A' && c <= 'z') {
			return c;
		} else {

			throw new inputException("非法字符！请重新输入：");
		}

	}

}
