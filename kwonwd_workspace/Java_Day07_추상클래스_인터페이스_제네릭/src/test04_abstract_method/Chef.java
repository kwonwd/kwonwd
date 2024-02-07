package test04_abstract_method;

// 추상 메서드를 하나라도 가지고 있으면
// 클래스는 추상 클래스 이다.
// 클래스에도 abstract 키워드를 붙여준다.

public abstract class Chef {
    String name;
    int age;
    String speciality;
    
    public void eat() {
        System.out.println("음식을 먹는다.");
    }
    
    // 부모클래스의 메서드를 삭제하는 것이 아니라
    // 추상 메서드로 만든다.
    // 구현부를 삭제한다 => 세미콜론으로 대체
    // 'abstract' 키워드를 붙인다.
    public abstract void cook() ; 
    
    // 특징
    // 1. 다형성 활용 가능
    // 2. 자식 클래스에서 반드시 오버라이드 해줘야 한다.(구현의 강제)
}
