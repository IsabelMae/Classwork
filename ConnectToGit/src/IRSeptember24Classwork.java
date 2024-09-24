
public class IRSeptember24Classwork {

	public static void main(String[] args) {
		
		int num2 = addNumbers(1, 2);
		System.out.println(num2);
		int num3 = addNumbers(1, 2, 3);
		System.out.println(num3);
		int num4 = addNumbers(1, 2, 3, 4);
		System.out.println(num4);

	}
	
	public static int addNumbers(int a, int b) {
		int total = a + b;
		return total;
	}
	
	public static int addNumbers(int a, int b, int c) {
		int total = a + b + c;
		return total;
	}
	
	public static int addNumbers(int a, int b, int c, int d) {
		int total = a + b + c + d;
		return total;
	}

}
