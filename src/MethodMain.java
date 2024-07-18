
public class MethodMain {

	public static void printStar(int star) {
		for (int i = star; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
//	public static void add(int num1, int num2) {
//		int result;
//		result = num1 + num2;
//		System.out.println(result);
//	}
//
//	public static void sayHello() {
//		System.out.println("say Hello");
//	}
//
//	public static void sayHello2() {
//		for (int i = 0; i < 5; i++) {
//			System.out.println("say Hello");
//		}
//	}
//
//	public static void printHello() {
//		// System.out.println("Hello world");
//		sayHello2();
//	}

	public static void main(String[] args) {
//		add(5, 7);
//		add(10, 78);
//		add(-2, 7);
		System.out.println("=========");
		printStar(4);
	}
}
