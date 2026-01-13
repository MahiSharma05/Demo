public class Calculator{
  public static int addition(int a , int b){
	  return a+b;
  }
	public static int div(int a, int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		int result1 = addition(4,6);
        System.out.println(result1);
		int result2 = div(4,2);
        System.out.println(result2);
	}
}
