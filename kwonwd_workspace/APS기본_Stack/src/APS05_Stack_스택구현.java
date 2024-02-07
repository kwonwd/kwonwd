import java.util.Stack;

public class APS05_Stack_스택구현 {
	static int[] stack = new int[5];
	static int top=-1;
	
	
	public static void main(String[] args) {
		Stack<Integer> intStack = new Stack<>();
		
		
		push(1);
		pop();
		pop();
		
	}
	
	// 스택이 비었는지 확인 : isEmpty
	public static boolean isEmpty() {
//		if(top == -1) {
//			return true;
//		}
//		return false;
		return top==-1;
	}
	
	
	// 스택이 찼는지 확인 : isFull
	public static boolean isFull() {
		return top==stack.length-1;
	}
	
	
	
	// 삽입 : push
	public static void push(int data) {
		if(isFull()) {
			System.out.println("더 이상 추가할 수 없습니다.");
			return;
		}
		stack [++top]=data;
	}
	
	
	// 삭제 : pop
	public static int pop() {
		if(isEmpty()) {
			System.out.println("더 이상 뽑을 데이터가 없습니다.");
			return Integer.MAX_VALUE;
		}
		int result =stack[top--];
		return result;
	}
}
