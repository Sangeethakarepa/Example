
public class MoverLoading {
	int a, b, c, s;

	void add() {
		a = 10;
		b = 10;
		c = 10;
		s = a + b + c;
		System.out.println("Sum of without passing arguments:" + a + "+" + b + "+" + c + "=" + s);
	}

	void add(int x) {
		a = x;
		b = 10;
		c = 20;
		s = a + b + c;
		System.out.println("Sum of passing one argument:" + a + "+" + b + "+" + c + "=" + s);
	}

	void add(int x, int y) {
		a = x;
		b = y;
		c = 10;
		s = a + b + c;
		System.out.println("Sum of passing two arguments:" + a + "+" + b + "+" + c + "=" + s);
	}

	void add(int x, int y, int z) {
		a = x;
		b = y;
		c = z;
		s = a + b + c;
		System.out.println("Sum of passing three arguments:" + a + "+" + b + "+" + c + "=" + s);
	}

	public static void main(String[] args) {
		MoverLoading ob = new MoverLoading();
		ob.add();
		ob.add(25);
		ob.add(10, 10);
		ob.add(1, 2, 3);
	}
}
