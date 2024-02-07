
public class APS기본_Stack2_피보나치 {
	
	static long[] memorization = new long[100];
	
	public static void main(String[] args) {
		long result =fibo(20);
		System.out.println(result);
	}
	public static long fibo(int n) {
		if(n<2) return n;
		if(memorization[n]!=0) return memorization[n];
		memorization[n]=fibo(n-1)+fibo(n-2);
		return memorization[n];
	}
}
