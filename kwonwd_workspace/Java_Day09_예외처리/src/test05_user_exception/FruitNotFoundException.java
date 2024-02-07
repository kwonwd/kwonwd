package test05_user_exception;

// Exception을 상속 받으면 : CheckedException
// RuntimeException을 상속 받으면 : Unchecked Exception

public class FruitNotFoundException extends Exception{

	//생성자
	public FruitNotFoundException(String name) {
		super(name + "에 해당하는 과일은 없습니다.");
		//문자열을 넣어서 => 에러메시지
	}
}
