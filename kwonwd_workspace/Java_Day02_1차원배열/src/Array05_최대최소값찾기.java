
public class Array05_최대최소값찾기 {
	public static void main(String[] args) {
		int[] nums = {13,56,1,99,85};
		
		//최대 최솟값을 찾는 방법
		// 1. 최대값을 담을 변수는 max, 최소값을 저장할 변수는 min으로 선언
		// max - 주어진 수의 범위보다 작은수로 초기화
		//min - 주어진 수의 범위보다 큰수로 초기화
		
//		int max=0;
		int max =Integer.MIN_VALUE; // int 형 중에 제일 작은 값
		
//		int min = 100;
		int min =Integer.MAX_VALUE;//int 형중에 제일 큰값
		
		//배열의 가장 첫번째 원소로 초기화하는 방식도 있다
		
		for (int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				max=nums[i];
			}
			if(nums[i]<min) {
				min=nums[i];
			}
		}
		System.out.println("max: "+max);
		System.out.println("min: "+min);
	}
}
