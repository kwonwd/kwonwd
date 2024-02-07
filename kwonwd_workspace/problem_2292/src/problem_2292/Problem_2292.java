package problem_2292;

import java.util.Scanner;
public class Problem_2292 {
	public static void main(String[] args) {
		// 하기전에 생각 n번째 껍질은 총 6*(n-1)개의 숫자를 가짐
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int square =1;
		double number = Math.pow(6, square-1);
		double stack=number;
		
		while(stack<num) {	
			square++;
			number = 6*(square-1);
			stack= stack+number;
		}
		System.out.println(square);
	}
}
