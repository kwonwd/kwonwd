package test05_object;

public class Student extends Person{
//    String name;
//    int age;
    String major;
    
    
    
    public Student(String name, int age, String major) {
    	super(name,age);
    	this.major =major;
    	System.out.println("Student의 생성자입니다.");
    }
//    public void eat() {
//        System.out.println("음식을 먹는다.");
//    }
//    
    public void study() {
        System.out.println("공부를 한다.");
        super.eat();// 명시적으로 부모의 메서드를 호출하는데 사용가능
        //super.name //부모의 멤버 변수
    }
    
    
    // 부모의 eat()을 그대로 사용하기 싫다.
    // => 자식클래스에서 재정의,(오버라이딩) 가능
    @Override // 선택사항이지만 쓰는 게 좋다.
    public void eat() {
    	System.out.println("지식을 먹는다.");
    }
    
    public void eat(String food) {
    	
    }// 이건 오버 라이딩
	
    @Override
	public String toString() {
		return "Student [major=" + major + ", name=" + name + ", age=" + age + "]";
	}
    
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		// 이름(String)만 같으면 같은 객체
		return name.equals(((Student)obj).name);
	}
    
    
    
}
