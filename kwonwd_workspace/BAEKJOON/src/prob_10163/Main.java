package prob_10163;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int[][] white = new int[1001][1001];
		int[][] colored = new int [num][4];
		int[] count = new int[num];
		for(int i=0;i<num;i++) {
			colored[i][0]= sc.nextInt();
			colored[i][1]= sc.nextInt();
			colored[i][2]= sc.nextInt();
			colored[i][3]= sc.nextInt();
		}
		
		for(int i=0;i<num;i++) {
			int a=colored[i][0];
			int b=colored[i][1];
			int c=colored[i][2];
			int d=colored[i][3];
			for(int j=a;j<a+c;j++) {
				for(int k=b;k<b+d;k++) {
					white[j][k]=i+1;
				}
			}
		}
		for(int h=1;h<=num;h++) {
			for(int i=0;i<1001;i++) {
				for(int j=0;j<1001;j++) {
					if(white[i][j]==h) {
						count[h-1]++;
					}
				}
			}
		}
		
		for(int i=0;i<num;i++) {
			System.out.println(count[i]);
		}
	}
}
