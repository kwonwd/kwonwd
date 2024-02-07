package problem_10158;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int size_x=sc.nextInt();
		int size_y=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int time = sc.nextInt();
		int x_time= time%(2*size_x);
		int y_time= time%(2*size_y);
		
		if(x_time<=size_x-x) {
			x=x+x_time;
		} else if(x_time>size_x-x&&x_time<=2*size_x-x) {
			x=2*size_x-x_time-x;
		} else if(x_time>2*size_x-x) {
			x=x_time-2*size_x+x;
		}
		if(y_time<=size_y-y) {
			y=y+y_time;
		} else if(y_time>size_y-y&&y_time<=2*size_y-y) {
			y=2*size_y-y_time-y;
		} else if(y_time>2*size_y-y) {
			y=y_time-2*size_y+y;
		}
		
		
		System.out.println(x+ " "+ y);
	}
}
