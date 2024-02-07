package prob_2068;

import java.util.Scanner;
//import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int max =Integer.MIN_VALUE;
			for(int i=0; i<10;i++) {
				int temp;
				temp = sc.nextInt();
				if(max<temp) {
					max=temp;
				}
			}
			
			System.out.printf("#%d %d %n",test_case, max);
		}
	}
}
