package test06_final;

//final 클래스 : 더이상 상속 금지
public class Person {
    String name;
    int age;
    
    public Person(String name,int age) {
    	//모든 생성자의 첫줄에는 super();가 생략되어 있다. 
    	//super(): 부모 생성자 호출 는 첫줄에 와야함
    	//this() : 자신의 다른 생성자 호출.를 사용한다면 this()는 첫줄에 와야함 
    	// => 둘 중에 하나만 쓸 수 있다.
    	super(); // Object(); // 최종적으로 Object() 기본생성자를 호출하게 되어 있다.
    	this.name=name;
    	this.age=age;
    	System.out.println("Person의 생성자입니다.");
    }
    
    // final 변수는 상수가 됨
    // fianl int a =10;
    // a=20;
    
    
    // final 메서드 : 오버라이드 금지
    public void eat() {
        System.out.println("음식을 먹는다.");
    }
}
