public class Calculator{
  public static int addition2(int a , int b){
	  return a+b;
  }
    
    public static int addition(int a , int b){
        return a+b;
    }
	
	public static int add(int a, int b) {
		return a+b;
	}
    /*public static void main(String[] args){
        int result = add(5,6);
        System.out.println(result);
    }*/
	
    /*public static void main(String[] args){
		int result = add(4,7);
	public static int add(int a, int b) {
		return a+b;
	}*/
	
	public static void main(String[] args) {
		int result = add(5, 4);
		System.out.println(result);
		int result2 = addition(5,6);
        System.out.println(result2);
		int result3 = addition2(4,6);
        System.out.println(result3);
	}
}
