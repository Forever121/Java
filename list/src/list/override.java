package list;

public class override {
	public static void main(String[] args) { 
		Aoto aoto = new Aoto();
		Bus bus  = new Bus();
		aoto.aa();
		bus.aa(1);
	}
}
class Aoto{
	

	protected void aa() {
		System.out.println("������ʻ");
	}
}
class Bus extends Aoto{
	public int aa(int a) {
		System.out.println("��������ʻ");
		return 1;
	}
}