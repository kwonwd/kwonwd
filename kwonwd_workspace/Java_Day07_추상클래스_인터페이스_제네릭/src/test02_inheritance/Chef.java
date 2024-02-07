package test02_inheritance;

// 추상메서드가 없어도 abstract는 붙일 수 있고
// 객체 생성은 안 된다는 뜻
public abstract class Chef {
    String name;
    int age;
    String speciality;
    
    public void eat() {
        System.out.println("음식을 먹는다.");
    }
    
    public void cook() {
        System.out.println("전공에 맞는 조리한다.");
    }
}
