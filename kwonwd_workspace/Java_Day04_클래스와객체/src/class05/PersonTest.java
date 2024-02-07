package class05;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.age = 45;
        p.name= "Yang";
        p.hobby="Youtube";
        
        
        p.study(10); //int형 형변환 없이 호출
        //묵시적 형변화
        //만약에 전달한 인자가 묵시적 형변환이 가능할 경우
        //묵시적 형변환이 가능한 메서드가 호출된다.
        p.study((byte)1);
        p.study((short)10);
        p.study((char)10);
        
        //메서드 오버로딩(똑같은 이름의 메서드를 여러개 선언할 수 있다).
        p.study(100L); //100L => long형
        p.study(1,1);
        p.study("1",1);
        p.study(1,"1");
    }
}
