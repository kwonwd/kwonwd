package test06_multiple_implements;

public class Butterfly implements AbleToFly {

    @Override
    public void fly() {
        System.out.println("나비는 날 수 있어요.");
        
    }

    
    
    // default 메서드는 오버라이드 할 필요 없다.
}
