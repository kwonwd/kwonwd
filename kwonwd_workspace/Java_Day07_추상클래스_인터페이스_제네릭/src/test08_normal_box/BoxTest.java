package test08_normal_box;

class Box {
    private Object obj; // 모든 클래스의 조상, 모든 값이 들어갈 수 있음.
    
    public Object getObj() {
        return obj;
    }
    
    public void setObj(Object obj) {
        this.obj = obj;
    }
}

public class BoxTest {
    public static void main(String[] args) {
        Box box = new Box();
        box.setObj("Hi");
        box.setObj(11);
        box.setObj(22.1);
        // 타입별로 설계도를 만들든지
        // Object로 설계도를 만든다.
        // => 값은 넣을 때는 편하지만 뺄때는 번거롭다.
        
        // 항상 Object를 반환 하므로 => 형변환을 해줘야 한다.
        Object obj = box.getObj();
//        double d = (double) obj; // 형변환 과정에서 에러 발생 과정
        
        
        // Doubledms double자료형의 Wrapper 클래스
        if(obj instanceof Double) {
        	System.out.println("실수입니다.");
        }else if( obj instanceof String) {
        	System.out.println("문자열입니다. ");
        }
        
    }
}