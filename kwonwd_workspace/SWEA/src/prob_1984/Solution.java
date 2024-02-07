package prob_1984;

import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int max=Integer.MIN_VALUE;
			int min=Integer.MAX_VALUE;
			int sum=0;
			double average;
			for(int i=0;i<10;i++) {
				int temp;
				temp=sc.nextInt();
				if(max<temp) {
					max=temp;
				}
				if(min>temp) {
					min=temp;
				}
				sum=sum+temp;
			}
			average=((double)sum-max-min)/8;
			System.out.printf("#%d %.0f %n",test_case,average);
		}
	}
}
