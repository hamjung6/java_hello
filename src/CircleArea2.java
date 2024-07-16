
public class CircleArea2 {

	public static void main(String[] args) {
		double Width1 = 12.5;
		double Height1 = 13.1;

		double RecatangleArea = Width1 * Height1;
		System.out.println("가로 : " + Width1);
		System.out.println("세로 : " + Height1);
		System.out.println("넓이 : " + RecatangleArea);

		System.out.println("=================");
		
		int Width2 = 10;
		int Height2 = 10;

		double TriangleArea = Width2 * Height2 / 2;
		System.out.println("가로 : " + Width2);
		System.out.println("세로 : " + Height2);
		System.out.println("넓이 : " + TriangleArea);

		System.out.println("=================");
		
		boolean TrueOrFalse = (TriangleArea > 20) ? true : false;
		System.out.println(TrueOrFalse);
		
		System.out.println("=================");
		
		int bangi = 10;
		double nulbi = 314.0;
		
		boolean TrueOrFalse2 = (nulbi < 100) ? true : false;
		System.out.println(TrueOrFalse2);
	}
}