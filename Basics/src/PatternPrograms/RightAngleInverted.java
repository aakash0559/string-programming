package PatternPrograms;

public class RightAngleInverted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		for (int i = a; i >= 1; i--) {
			for (int j = 1; j <= a - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
