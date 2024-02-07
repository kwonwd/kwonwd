package test04_abstract_method;



// 만약에 추상클래스를 상속받은 자식 클래스라면
// 1. 해당 추상메서드를 반드시 오버라이드 하거나, => 자기 자신이 완전한 클래스가 되거나
// 2. 오버라이드 하지 않고 자기 자신도 추상클래스가 된다. => 이걸로는 객체 생성 불가
public class JFoodChef extends Chef {
    
    // @Override
    public void cook() {
        System.out.println("일식을 조리한다.");
    }
}
