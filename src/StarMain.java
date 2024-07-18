
public class StarMain {

	public static void main(String[] args) {
		for(int i = 1; i < 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/////////////
		for (int i = 5; i >= 1; i--) {  // i는 줄의 개수, 5에서 시작하여 1까지 감소
            for (int j = 1; j <= i; j++) {  // j는 각 줄에서 별의 개수, i만큼 반복
                System.out.print("*");  // 별을 출력
            }
            System.out.println();  // 각 줄이 끝나면 줄 바꿈
        }
		
		/////////////////
		int num = 5;

		for (int i = 1; i <= num; i++) {
		    for (int j = 1; j <= num - i; j++) {
		        System.out.print(" ");
		  }

		   for (int k = 1; k <= i; k++) {
		       System.out.print("*");
		   }

		   System.out.println();
		}
	}
}