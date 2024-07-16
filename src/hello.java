
public class hello {

	public static void main(String[] args) {
		int num = 5;
		
		if(num >= 5) {
			num = 10;
		}
		else {
			num = 20;
		}
		System.out.println(num);
		
		int result = (num >= 5) ? 10 : 20;
		System.out.println(result);
		
		int Kor = 90;
		int Mat = 100;
		int Eng = 70;
		int max;
		
		max = (Kor <= Eng) ? Eng : Kor;
		max = (max <= Mat) ? Mat : max;
		
		max = (Kor > Eng) ? (Kor > Mat ? Kor : Mat) : (Eng > Mat ? Eng : Mat);
		
		System.out.println(max);
	}
}  
