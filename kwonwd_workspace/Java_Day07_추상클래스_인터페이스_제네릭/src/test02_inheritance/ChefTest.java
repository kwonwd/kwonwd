package test02_inheritance;

public class ChefTest {
    public static void main(String[] args) {
        //다형성
    	// 부모클래스 타입으로 자식객체를 참조할수있다.
    	
    	Chef[] chefs = new Chef[2];
        
        chefs[0] = new KFoodChef();
        chefs[1] = new JFoodChef();
        
        for(Chef chef:chefs) {
        	chef.eat(); // 부모 클래스 타입으로 참조.
        	chef.cook(); // 자식 객체의 행위가 실행됨.
        	
        }

    }
}
