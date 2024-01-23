package problem_2810;

import java.util.Scanner;

public class Problem_2810 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size;
		size=sc.nextInt();
		String seat_in;
		seat_in =sc.next();
		char[] seat = new char[size];
		int f=0;
		int count=1;
		
		for(char c:seat_in.toCharArray()) {
			seat[f]=c;
			f++;
		}
		
		for(int i=0;i<size;i++) {
			if(seat[i]==S) {
				count++;
			}else {
				
			}
		}
	}
}
