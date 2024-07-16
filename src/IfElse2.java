
public class IfElse2 {

	public static void main(String[] args) {
		int num1 = 90;
		int num2 = 70;
		int num3 = 100;
		
		int max;
		
		// 첫 번째 방법
		if((num1 >= num2) && (num1 >= num3)) {
			max = num1;
		}
		else if((num2 >= num1) && (num2 >= num3)) {
			max = num2;
		}
		else{
			max = num3;
		}
		
		System.out.println(max);
		
		// 두 번째 방법
		max = num1;
		
		if(max <= num2) {
			max = num2;
		}
		
		if(max <= num3) {
			max = num3;
		}
		
		System.out.println(max);
		
		// 세 번째 방법
		if(num1 >= num2) {
			if(num1 >= num3) {
				max = num1;
			}
		}
		else if(num2 >= num1) {
			if(num2 >= num3) {
				max = num2;
			}
		}
		else {
			max = num3;
		}
		
		System.out.println(max);
		
		// 중간 값 구하기
		if((num2 <= num1 && num1 <= num3) || (num3 <= num1 && num1 <= num2)) {
			max = num1;
		}
		else if((num1 <= num2 && num2 <= num3) || (num3 <= num2 && num2 <= num1)) {
			max = num2;
		}
		else {
			max = num3;
		}
		
		System.out.println(max);
		
		// 조건 연산자
		int result = true ? 1 : 0;
		System.out.println(result);
		
		result = false ? 1 : 0;
		System.out.println(result);
		
		result = (1 > 10) ? 1 : 0;
		System.out.println(result);
		
		result = (1 < 10) ? 1 : 0;
		System.out.println(result);
		
		boolean bool = (1 > 10) ? true : false;
		System.out.println(bool);
		
		bool = (1 < 10) ? true : false;
		System.out.println(bool);
	}
}
