import java.util.LinkedList;
import java.util.Queue;

public class APS기본_Queue_API {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		//삽입
		queue.add(1);
		queue.offer(1);
		//삭제
		queue.remove();
		queue.poll();
		//조회
		queue.element();
		queue.peek();
	}
}
