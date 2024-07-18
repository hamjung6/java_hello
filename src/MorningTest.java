
public class MorningTest {
	public static void main(String[] args) {
		printStar1(5);
	}

	public static void printStar1(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = i; j <= num; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}