package class04;

public class Person {
	//멤버 변수 :객체가 가지고 있는 변수(데이터)
    String name;
    int age;
    String hobby;
    
    
    // 메서드 => 클래스 안에 정의된 함수
    // 멤버 메서드 : 객체가 가지고 있는 메서드
    void info() {
    	//멤버변수에 바로 접근할 수 있다.
    	System.out.println("이름은 "+name+"이고, 나이는 "+age+"세 취미는 "+hobby+"입니다.");
    }
    
    static void hello() {
    	System.out.println("Hello static!");
    }
}
