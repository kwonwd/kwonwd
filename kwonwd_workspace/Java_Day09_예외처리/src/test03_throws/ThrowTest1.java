package test03_throws;

// CheckedException
// - 컴파일시 예외 처리를 강제
// - 둘중 하나는 반드시 해야한다.
// - 빨간 줄 => throws를 해서 위임할 수 있다.
//			=> 직접 처리(try~catch)를 하지 않는다면 throws를 써야한다.
public class ThrowTest1 {
	
	public static void main(String[] args) throws ClassNotFoundException{
		method1(); // 결국 예외 처리하지 않는다
	}
	
	public static void method1() throws ClassNotFoundException{
		// 호출한 곳에서 다시 처리하거나 위임
		method2();
	}
	
	public static void method2() throws ClassNotFoundException {
		Class.forName("SSAFY"); //"SSAFY" 라는 이름의 클래스를 로드
		
		//1. 직접처리
		//2. 간접처리
	}
}
