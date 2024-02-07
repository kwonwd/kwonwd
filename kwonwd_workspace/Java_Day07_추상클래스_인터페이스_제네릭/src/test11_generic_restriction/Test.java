package test11_generic_restriction;

class Box<T> { // 모든 타입에 대해 적용가능한 박스
    T t;
    void setT(T t) {
        this.t = t;
    }
    
    T getT() {
        return t;
    }
}

class FlyBox<T extends AbleToFly> { // AbleToFly라는 인터페이스를 구현한 타입만 올 수 있는 Box
    T t;
    void setT(T t) {
        this.t = t;
    }
    
    T getT() {
        return t;
    }
}

class BirdBox<T extends Bird> { // Bird의 자손 클래스 타입만 올 수 있는 Box
    T t;
    void setT(T t) {
        this.t = t;
    }
    
    T getT() {
        return t;
    }
}

// Bird의 자손이면서... AbleToFly와 AbleToSwim을 모두 구현한 클래스만 올 수가 있음
class FlyingAndSwimmingBirdBox<T extends Bird & AbleToFly & AbleToSwim> {
    T t;
    void setT(T t) {
        this.t = t;
    }
    
    T getT() {
        return t;
    }
}


public class Test {
    public static void main(String[] args) {
        FlyBox<Butterfly> f1 = new FlyBox<>(); // Butterfly만 들어갈 수 있는 Box
        f1.setT(new Butterfly());
        FlyBox<Duck> f3 = new FlyBox<>();
        f3.setT(new Duck());
        
        FlyBox<AbleToFly> f2 = new FlyBox<>();
        f2.setT(new Butterfly());
        f2.setT(new Duck());
        f2.setT(new Swan());
        
        BirdBox<Bird> b1 = new BirdBox<>();
//        b1.setT(new Butterfly());
        b1.setT(new Duck());
        
        FlyingAndSwimmingBirdBox<Duck> b2 = new FlyingAndSwimmingBirdBox<>();
        FlyingAndSwimmingBirdBox<Swan> b3 = new FlyingAndSwimmingBirdBox<>();
        
        b2.setT(new Duck());
        
        
    }
}
