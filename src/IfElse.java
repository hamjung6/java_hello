
public class IfElse {

	public static void main(String[] args) {
		// if 문
		int n1 = 5;
		int n2 = 7;
		
		// 24 짝수 출력
		int num1 = 24;
		int num2 = 101;
		int num3 = 6;
		
		//성적표
		int Kor = 60;
		int Mat = 60;
		int Eng = 60;
		double avg;
		
		int total = Kor + Mat + Eng;
		avg = (double)total / 3.0;
		
		System.out.println("국어" + Kor);
		System.out.println("수학" + Mat);
		System.out.println("영어" + Eng);
		
//		// if 문
//		if(n1 < n2) {
//			System.out.println("n1 > n2 is true");
//		}
//		
//		// if ~ else 문
//		if(n1 == n2) {
//			System.out.println("n1 == n2 is true");
//		}
//		else {
//			System.out.println("n1 == n2 is false");
//		}
//		
//		// 24 짝수 출력
//		if(num1 % 2 == 0) {
//			System.out.println("짝수입니다");
//		}
//		else {
//			System.out.println("홀수입니다");
//		}
//		
//		//값 1 이상 100 이하의 수이면 true로 출력
//		if((1 <= num2) && (num2 <= 100)) {
//			System.out.println(num2 + " true 입니다.");
//		}
//		else {
//			System.out.println(num2 + " false 입니다.");
//		}
//		
//		//2의 배수이자 3의 배수이면 true 출력
//		if((num3 % 2 == 0) && (num3 % 3 == 0)) {
//			System.out.println("true");
//		}
//		else {
//			System.out.println("false");
//		}
		
		//성적표
		if(avg >= 90) {
			System.out.println(avg + "이상 수입니다.");
		}
		else if(avg >= 80) {
			System.out.println(avg + "이상 우입니다.");
		}
		else if(avg >= 70) {
			System.out.println(avg + "이상 미입니다.");
		}
		else if(avg >= 60) {
			System.out.println(avg + "이상 양입니다.");
		}
		else {
			System.out.println(avg + "점 미만 가입니다.");
		}
	}
}
