package class05;

public class Person {
    String name;
    int age;
    String hobby;
    
    void study(int time) {
    	System.out.println(time+"시간 만큼 공부합니다.(int)");
    }
    void study(long time) {
       	System.out.println(time+"시간 만큼 공부합니다.(long)");
    }
    
    //메서드 오버 로딩이란?
    //메서드명은 일치
    //파라미터의 개수, 순서, 타입
    // 똑같은 이름으로 메서드를 여러개 만들 수 있다.
    
    //int
    //long
    //String. int
    
    void study(String subject, int time) {
    	System.out.println(subject+"를 "+time+"시간 공부합니다.");
    }
    void study(int time, String subject) {
    	System.out.println(subject+"를 "+time+"시간 공부합니다.");
    }
    void study(int time1, int time2) {
    	System.out.println(time1+", "+time2);
    }
    
    
    //파라미터 이름만 다른 것은? X
//    void study(int time2, String subject2) {
//    	System.out.println(subject+"를 "+time+"시간 공부합니다.");
//    }
    
}
