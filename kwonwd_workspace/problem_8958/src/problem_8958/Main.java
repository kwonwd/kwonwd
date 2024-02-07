package problem_8958;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[] count = new int[number];
		for(int i=0;i<number;i++) {
			int check=0;
			String input=sc.next();
			char[] cArr = input.toCharArray();
			for(int j =0; j<input.length();j++) {
				if(cArr[j]=='O') {
					check++;
					count[i]=count[i]+check;
				}else {
					check=0;
				}
			}
		}
		
		for(int i=0;i<number;i++) {
			System.out.println(count[i]);
		}
	}
}
