package test10_generic_restriction;


class Box<T extends Number>{ //제한된 제네릭 클래스 : Number의 자손만 올 수 있음.
    private T t;
    
    
    // 계산 로직을 작성할 수 있음
    public T getT() {
        return t;
    }
    
    public void setT(T t) {
        this.t = t;
    }
}

public class BoxTest {
    public static void main(String[] args) {

        
        Box<Integer> intBox = new Box<>();
        intBox.setT(111);
        
//        Box<String> strBox = new Box<>();
//        strBox.setT("Hello");
        
//        Box<Double> dblBox = new Box<>();
//        dblBox.setT(42.21);
        
        
    }
}
