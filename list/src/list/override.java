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
		System.out.println("汽车行驶");
	}
}
class Bus extends Aoto{
	public int aa(int a) {
		System.out.println("公交车行驶");
		return 1;
	}
}