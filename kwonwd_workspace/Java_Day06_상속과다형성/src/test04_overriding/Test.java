package test04_overriding;

public class Test {
    public static void main(String[] args) {
//        Person p = new Person("Yang",45);
//        // p.
        Student st = new Student("Yang",45,"Computer");
        // 생성자를 하나라도 정의를 하면 > 기본생성자를 안 만들어 준다.
        // st.
        st.eat();
    }
}
