package test07_comparable;


// 컬렉션 프레임워크에서 정렬가능하도록 만들려면
// Comparable 인터페이스

public class Person implements Comparable<Person>{
    String name;
    int age;
    
    
    
    
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    
    
    // 양수 > 자리바꿈
    // 음수 > 그대로
    // 0 > 그대로
    
//	@Override
//	public int compareTo(Person o) {
//		// this(자기자신객체) o 객체를 비교해서 > 정수값을 반환.
//		
//		//나이순으로 정렬을 한다면?
//		// 기본적으로 오름차순으로 정렬한다면
//		// 앞 - 뒤 =음수 
//		
//		//만약 나이가 같다면 > 이름순서로 하길 원함
//		//이름 : 문자열 => String의 compareTo를 사용하면 오름차순으로
//		if(this.age==o.age) {
//			return this.name.compareTo(o.name);
//		}
//		
//		return this.age -o.age;
//	}

    public int compareTo(Person o) {
    	
    	if(this.name.equals(o.name)) {
    		return this.age-o.age;
    	}
    	
    	return this.name.compareTo(o.name);
    }

    
}
