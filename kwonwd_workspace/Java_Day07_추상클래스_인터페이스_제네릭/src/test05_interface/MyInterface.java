package test05_interface;

// 클래스 : class
// 인터페이스 : interface
// 인터페이스로 객체 생성 가능 X
// 클래스가 이 인터페이스를 구현하도록 하고, 그 클래스로 객체 생성

public interface MyInterface {
	// 인터페이스의 모든 변수는 상수
	public static final int MEMBER1 =10; // 관습적으로 상수는 대문자로 표현
	int MEMBER2 =20; // public static final이 생략되어 있다.
	
	//인터페이스의 모든 메서드는 추상메서드
	public abstract void method1();//약속.
	int method2(); // public abstract가 생략 되어 있음.
	
}
