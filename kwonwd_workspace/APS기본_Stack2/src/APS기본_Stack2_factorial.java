
public class APS기본_Stack2_factorial {
	public static void main(String[] args) {
		int result =factorial(10);
		System.out.println(result);
	}
	
	public static int factorial(int n) {
		if(n>0) {
		return n*factorial(n-1);
		}
		return 1;
	}
}
