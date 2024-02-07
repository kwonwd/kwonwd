package test04_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        // Queue
    	// -FIFO
    	// - Queue interface
    	// LinkedList class
    	
    	Queue<Integer> queue = new LinkedList<Integer>();
    	
    	queue.offer(10);
    	
    	// queue에다가 순차적으로 값 집어 넣기
    	for(int i=0; i<5; i++) {
    		queue.offer(i);
    	}
    	
    	// queue에서 값을 제거하기
    	while(!queue.isEmpty()) {
    		System.out.println(queue.poll());
    	}
    }
}
