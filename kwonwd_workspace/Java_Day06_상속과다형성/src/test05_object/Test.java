package test05_object;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("Yang",45);
//        // p.
        Student st = new Student("Yang",45,"Computer");
        // 생성자를 하나라도 정의를 하면 > 기본생성자를 안 만들어 준다.
        // st.
        st.eat();
        
        System.out.println(p.toString());
        System.out.println(st.toString());// Object.toString()은 참조값을 알려줌
        
        Student st2 = new Student("Yang",45,"Computer");
        
        System.out.println(st==st2);
        System.out.println(st.equals(st2));
    
    
    }
}
