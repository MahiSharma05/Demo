public class Calculator{

	public static int multiply(int a, int b) {
		return a*b;
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int divide(int a, int b) {
		return a/b;
	}
	public static void main(String[] args) {
		int result = multiply(5, 4);
		System.out.println(result);
		
		int result1 = add(10, 5);
		System.out.println(result1);
		
		int result2 = divide(10, 5);
		System.out.println(result2);
	}
}
