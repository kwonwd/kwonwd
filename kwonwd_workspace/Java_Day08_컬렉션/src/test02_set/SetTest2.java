package test02_set;

import java.util.HashSet;
import java.util.Set;

public class SetTest2 {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<Person>();
        // Set 에서 중복을 판단하는 방법
        // 1. HashCode(); 가 일치
        // 2. equals() 오버라이드
        
        Person p1 = new Person("사람1", "111111");
        Person p2 = new Person("사람1", "111111");
        
        set.add(p1);
        set.add(p2);
        
        System.out.println(p1.hashCode()); // Object로부터 물려받은 계산 로직을 쓰는 것이아니라
        System.out.println(p2.hashCode());
        
        
        System.out.println("사람1".hashCode()); // String에서 오버라이드한 계산로직을 쓰겠다
        System.out.println("사람1".hashCode());

        
        // 사람이 한 사람만? 아니면 두 사람?
        System.out.println(set);
    }
}
