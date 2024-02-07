package problem_2851;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int[] sum = new int[10];
		int min=50000;
		int answer=0;
		
		for(int i=0;i<10;i++) {
			num[i]=sc.nextInt();
		}
		for(int i=9;i>=0;i--) {
			for(int j=i;j>=0;j--) {
				sum[i]= sum[i]+num[j];
			}
		}
		
		for(int i=0;i<10;i++) {
			if (Math.abs(100-sum[i])<=min) {
				min=Math.abs(100-sum[i]);
				answer=i;
			}
		}
		System.out.println(sum[answer]);
	}
}
