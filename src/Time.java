import java.util.Scanner;

public class Time {
	protected int hh;
}

class Time1 extends Time {
	protected int mm;
}

class Time2 extends Time1 {
	private int ss;

	void ExactTime() {
		hh = 0;
		mm = 0;
		ss = 0;
	}

	void getTime() {
		System.out.println("Day Timee:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		ss = sc.nextInt();
	}

	void showTime() {
		while (ss >= 60) {
			mm++;
			ss = ss - 60;
		}
		while (mm >= 60) {
			hh++;
			mm -= 60;
			System.out.println("Time(hh:mm:ss)=" + hh + ":" + mm + ":" + ss);
		}
	}
}
