package test03_delete_method;

public class ChefTest {
    public static void main(String[] args) {
        Chef[] chefs = new Chef[2];
        
        chefs[0] = new KFoodChef();
        chefs[1] = new JFoodChef();
        
        // Chef 설계도에서, 쓰이지 않는 cook() 메서드를 삭제 했더니
        //자식 객체가 cook() 메서드를 갖고 있다하더라도 접근 불가.
        
        for(Chef chef :chefs) {
        	chef.eat();
//        	chef.cook(); // 사라짐 // 다형성 활용 불가. 동적 바인딩 불가.
        }
    }
}
