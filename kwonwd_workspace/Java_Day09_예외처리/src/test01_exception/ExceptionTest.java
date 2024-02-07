package test01_exception;

public class ExceptionTest {
	public static void main (String[] args){
		
		int[] nums = {10};
		
		// UncheckedException
		// - 컴파일 시간에 확인 x -> 빨간 줄 x
		// - 실행 중에 발생
		// - 예외 처리를 강제하지 않음
		// - 예외 처리: try~catch를 이용해서 처리할 수도 있다.
		System.out.println(nums[2]);
		
		// CheckedException
		// - 컴파일 시간에 확인 -> 빨간 줄
		// - 예외처리를 강제
		// - 예외처리방법 : try~catch를 사용해서 직접 처리, throws 선언해서 예외처리 위임(간접 처리)
		
		
//		Thread.sleep(1000); // 빨간줄 checked => 컴파일 안됨
	}
	
}
