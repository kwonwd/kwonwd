import java.util.Arrays;

public class Array03_배열의순회 {
	public static void main(String[] args) {
		int[] nums = {13,56,1,99,85};
		
		for(int i=0; i<nums.length ;i++) {
			System.out.println(nums[i]);
		}
		
		//for-each
		// for(자료형 변수명 : 배열(반복할수있는것){}
		
//		for(int num :nums) {
//			num *= 2;
//		}
		
		
		for(int num :nums) {
			System.out.println(num);
		}
		
		//nums = 배열의 객체를 가리키고 있음(배열 객체)
		// 배열 객체에는 length 속성이 있다.
		
		
		System.out.println(Arrays.toString(nums));
	}
}
