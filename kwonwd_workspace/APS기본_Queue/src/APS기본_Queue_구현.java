
public class APS기본_Queue_구현 {
	// createQueue
	
	static int[] queue = new int[10];
	static int front=-1, rear= -1;
	
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			enQueue(i);
		}
		for(int i=0;i<10;i++) {
			System.out.println(deQueue());
		}
	}
	
	public static void enQueue(int data) {
		if(isFull()) {
			System.out.println("큐가 꽉차있습니다.");
			return;
		}else {
			queue[++rear]=data;
		}
	}
	
	public static int deQueue() {
		if(isEmpty()) {
			System.out.println("큐가 비어있습니다.");
			return -1;
		}else {
			int result =queue[++front];
//			queue[front]=0;
			return result; 
		}
	}
	
	public static boolean isFull() {
		return rear == queue.length-1;
	}
	public static boolean isEmpty() {
		return front==rear;
	}
	
	public static int Qpeek() {
		return queue[front+1];
	}
}
