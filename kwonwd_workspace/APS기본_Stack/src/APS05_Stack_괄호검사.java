import java.util.Stack;

public class APS05_Stack_괄호검사 {
	public static void main(String[] args) {
		
		// 소괄호만 () 있는 경우만 생각한다.
		String text = "()()((()))";
		
		boolean flag = true;
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<text.length();i++) {
			char c =text.charAt(i);
			if(c=='(') {
				stack.add(c);
			}else if(c==')') {
				if(stack.isEmpty()) {
					System.out.println("닫는 괄호가 많습니다.");
					flag=false;
					break;
				}
				stack.pop();
			}
		}
		
		// 다 끝난 후 스택이 비어있는지 확인
		if(!(stack.isEmpty())){
			System.out.println("여는 괄호가 많습니다.");
		}else if(flag){
			System.out.println("짝이 맞습니다.");
		}
	}
}
