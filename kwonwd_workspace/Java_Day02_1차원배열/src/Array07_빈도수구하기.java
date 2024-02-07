import java.util.Arrays;

public class Array07_빈도수구하기 {
	public static void main(String[] args) {
		int[] arr = {1,3,5,7,3,4,3,2,1,3,2,9,6,8};
		
		//카운팅 배열의 선언
		//수의 범위 중요
		//제일 큰수 N
		//N+1의 크기로 만든다.
		int[]count = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			count[arr[i]]++;
		}
		
		System.out.println(Arrays.toString(count));
	}
}
