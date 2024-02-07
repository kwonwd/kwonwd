package problem_3052;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] number = new int[10];
		int[] remain = new int[42];
		int count =0;
		
		for(int i =0; i<10;i++) {
			number[i]=sc.nextInt();
		}
		
		for (int i =0; i<10;i++) {
				remain[number[i]%42]++;
		}
		
		for(int i =0; i<42; i++) {
			if(remain[i]!=0) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
