
public class This {
	int x, y;

	This(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void disp() {
		System.out.println("The sum is:" + (x + y));
	}

	public static void main(String[] args) {
		This ob = new This(5, 5);
		ob.disp();

	}

}
