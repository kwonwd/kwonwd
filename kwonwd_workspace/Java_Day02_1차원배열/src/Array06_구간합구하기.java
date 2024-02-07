import java.util.Arrays;

public class Array06_구간합구하기 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int N=5;
		int M=9;
		
		//반복문을 N~M까지 돌면서 합을 구한다.
		int sum = 0;
		for(int i=N;i<=M;i++) {
			sum = sum +arr[i];
		}
		System.out.println("sum: "+sum);
		
		//A: 0~M까지의 합을 구한 ㅎ
		//B:0~(N-1)까지의 합을 구한 후
		//A-B
		
		int A =0;
		int B = 0;
		for (int i=0;i<=M; i++) {
			A= A+arr[i];
		}
		for (int i=0;i<=N-1;i++) {
			B= B+arr[i];
		}
		System.out.println(A-B);
		
		// prefixsum을 구한후 이미 구해져 있는 합을 이용하자
		
		int[] prefixsum = new int[arr.length];
		prefixsum[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			prefixsum[i] = prefixsum[i-1]+arr[i];
		}
		System.out.println(Arrays.toString(prefixsum));
		
		//N>=1 일때만 가능
//		System.out.println(prefixsum[M]-prefixsum[N-1]);
		int sum2 =0;
		if(N==0) {
			sum2 = prefixsum[M];
		} else {
			sum2 = prefixsum[M] - prefixsum[N-1];
		}
		System.out.println(sum2);
	}
}
