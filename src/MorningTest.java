
public class MorningTest {

	public static void main(String[] args) {
		int Kor = 90;
		int Mat = 77;
		int Eng = 90;
		
		int total = Kor + Mat + Eng;
		double evg = (double)total / 3.0;
		
//		System.out.println("국어 : " + Kor);
//		System.out.println("수학 : " + Mat);
//		System.out.println("영어 : " + Eng);
//		System.out.println(evg + " 성적 우 입니다");
		
		if(Kor > Mat && Kor > Mat) {
			System.out.println(Kor + "점이 최댓값");
		}
		else if (Mat > Kor && Mat > Eng) {
			System.out.println(Mat + "점이 최댓값");
		}
		else {
			System.out.println(Eng + "점이 최댓값");
		}
    }
}
