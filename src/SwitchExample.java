
public class SwitchExample {

	public static void main(String[] args) {
		int num = 2;
		int month = 5;
		int count = 1;
		int sum = 0;
		int gugudan = 3;

		// switch 문
		switch (num) {
		case 1:
			System.out.println("1 입니다.");
			System.out.println("1 입니다.");
			break;
		case 2:
			System.out.println("2 입니다.");
			System.out.println("2 입니다.");
			break;
		default:
			System.out.println("디폴트 입니다.");
			System.out.println("디폴트 입니다.");
		}

		switch (month) {
		case 3, 4, 5:
			System.out.println("봄입니다.");
			break;
		case 6, 7, 8:
			System.out.println("여름입니다.");
			break;
		case 9, 10, 11:
			System.out.println("가을입니다.");
			break;
		case 12, 1, 2:
			System.out.println("겨울입니다.");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}

		// while 문
		while (count <= 1000) {
			System.out.println(count + "번" + ":Hello world");
			count++;
		}

		// do while 문
		count = 1;
		do {
			System.out.println(count + "번" + ":Hello world");
			count++;
		} while (count <= 100);

		// for 문
		for (int i = 0; i < 100; i++) {
			System.out.println(i + "번" + ":Hello world");
		}

		// 1부터 100까지의 합
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);

		// 3단 구구단 출력
		for (int i = 1; i < 10; i++) {
			System.out.println(gugudan + " x " + i + " = " + gugudan * i);
		}

		// 출력이 홀수
		for (int i = 0; i < 100; i++) {
			System.out.println(i += 1);
		}

		System.out.println("--------------");

		// 100 98 96 ... 2
		for (int i = 100; i > 0; i -= 2) {
			System.out.println(i);
		}

		System.out.println("--------------");

		// 1부터 100까지의 수 중에서 3의 배수가 아닌 수들의 합은?
		sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}

		System.out.println(sum);

		System.out.println("--------------");

		// 1에서 100까지의 3의 배수를 더하는 while 문을 사용하시오
		int i = 1;
		sum = 0;

		while (i <= 100) {
			if (i % 3 == 0) {
				sum += i;
				System.out.println(sum);
			}
			i++;
		}

		System.out.println("--------------");

		// break와 continue
		// 1부터 1000까지의 숫자 중 11의 배수이자 7의 배수인 첫 번째 수는?
		for (int b = 1; b <= 1000; b++) {
			if ((b % 7 == 0) && (b % 11 == 0))
				System.out.println(b);
			break;
		}

		System.out.println("--------------");

		// 구구단
		for (int g = 1; g < 10; g++) {
			for (int r = 1; r < 10; r++) {
				System.out.println(g + "x" + r + "=" + (g * r));
			}
		}

		System.out.println("--------------");
		
		// 절대값
		int num1 = 10;

		if (num1 < 0) {
			System.out.println("절대값:" + (-num1));
		}
		else
			System.out.println("절대값:" + num1);
	}
}