
public class BreakContinue {

	public static void main(String[] args) {
		int num = 0;
		int count = 0;
		
		while((num++) < 100) {
			if(((num % 5) != 0) || ((num % 7) != 0))
				continue;
			count++;
			System.out.println(num);
		}
		System.out.println("count: " + count);
		
		System.out.println("===============");
		
		// 짝수만 출력 2, 4, 6 ...
		for(int i = 1; i <= 9; i++) {
			if(i % 2 == 0)
				continue;
			
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			
			System.out.println();
		}
		
		//홀수만 출력
		for(int i = 1; i <= 9; i++) {
			
		}
	}
}