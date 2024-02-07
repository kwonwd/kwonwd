package prob_2999;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int size=input.length();
		char[] cArr=input.toCharArray();
		int R_Value=0;
		int C_Value=0;
		int count=0;
		
		for(int i=1;i<=size;i++) {
			for(int j=i;j<=size;j++) {
				if(i*j==size) {
					R_Value=i;
					C_Value=j;
				}
			}
		}
		char[][] result=new char[R_Value][C_Value];
		
		for(int j=0; j<C_Value;j++) {
			for(int i=0;i<R_Value;i++) {
				result[i][j]=cArr[count];
				count++;
			}
		}
		
		for(int i=0;i<R_Value;i++) {
			for(int j=0; j<C_Value;j++) {
				System.out.print(result[i][j]);
			}
		}
		
	}
}
