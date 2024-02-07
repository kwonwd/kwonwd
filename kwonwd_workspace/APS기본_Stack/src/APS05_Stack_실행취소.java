import java.util.Scanner;
import java.util.Stack;

public class APS05_Stack_실행취소 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<String> crtlZ = new Stack<>();
		Stack<String> crtlY = new Stack<>();
		
		while(true) {
			System.out.println("1 : 새로운 작업");
			System.out.println("2 : 실행 취소(Crtl + Z)");
			System.out.println("3 : 취소의취소(Crtl + Y)");
			System.out.println("0 : 종료");
			
			
			int N= sc.nextInt();
			
			if(N==1) {
				// 1. 현재 진행 작업을 crtlZ 스택에 추가한다.
				// 2. 새로운 작업을 입력받는다.
				// 3. crtlY 스택을 비운다
			} else if(N==2) {
				// crtlZ 스택에 있는 친구를 뽑아서 crtlY스택으로 넣는다.
			} else if(N==3) {
				// crtlY 스택에서 pop crtlZ 스택으로 push
			} else if(N==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
	}
}
