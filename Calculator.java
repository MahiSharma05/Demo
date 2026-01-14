public class Calculator{

  public static int addition(int a , int b){
	  return a+b;
  }
	public static int division(int a, int b) {
		return a/b;
    }
	public static int multiply(int a, int b) {
		return a*b;
	}
	public static int subtract(int a, int b) {
		return a-b;
	}
	public static void main(String[] args) {
		int result1 = addition(4,6);
        System.out.println(result1);
		
		int result2 = division(4,2);
        System.out.println(result2);

		int result3 = multiply(5, 4);
		System.out.println(result3);
		
		int result4 = subtract(10, 5);
		System.out.println(result4);
	}
}
