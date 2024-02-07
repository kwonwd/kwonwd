package class06;

public class PersonTest {
    public static void main(String[] args) {
//        Person p = new Person(); // 기본 생성자를 호출
//        // 생성자를 하나라도 작성하면 기본 생성자가 자동으로 만들어지지 않는다.
//        p.age = 45; // 멤버 변수의 초기화를 여기에서.. => 생성자
//        p.name= "Yang";
//        p.hobby="Youtube";
    	
    	
    	Person p = new Person("Hong",25,"Golf");
        p.info();
        
        
        Person p2 = new Person("Kim",40);
        p2.info();
        

    }
}
