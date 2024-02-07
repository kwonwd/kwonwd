package prob_1206;

import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T=10;
//		T=sc.nextInt();
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int size = sc.nextInt();
			int count=0;
			int[][] building=new int[size][256];
			for(int i =0;i<size;i++) {
				int temp=sc.nextInt();
				for(int j=0;j<=temp;j++) {
					building[i][j]=1;
				}
			}
			
			for(int i =2;i<size-2;i++) {
				for(int j=0;j<256;j++) {
					if(building[i][j]==1&&building[i-1][j]==0&&building[i-2][j]==0&&building[i+1][j]==0&&building[i+2][j]==0) {
						count++;
					}
				}
			}
			System.out.printf("#%d %d %n",test_case,count);
//			for(int i=0;i<size;i++) {
//				for(int j=0;j<256;j++) {
//					System.out.print(building[i][j]);
//				}
//				System.out.println();
//			}
		}
	}
}