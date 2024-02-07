package test03_throws;

// UncheckedException
// 빨간 줄 없음
// => 예외 처리를 강제 하지 않는다.
// => throws도 강제하지 않는다.
// => 하고 싶을면 try~catch로 해라

// 내부적으로는 예외를 넘기고 있다.
// 결국에 처리가 되지 않았을 때 비정상적 종료.
public class ThrowTest3 {
	
	public static void main(String[] args){
		method1(); // 결국 예외 처리하지 않는다
	}
	
	public static void method1() {
		try {
			method2();			
		} catch(ArithmeticException e) {
			System.out.println("method1에서 처리가 될까요?");
		}
	}
	
	public static void method2() {
		int i = 1/0;
	}
}
