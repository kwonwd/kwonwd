package prob_8320;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		double sqrt_number = Math.sqrt(number);
		int count=0;
		
		for(int i=1;i<=sqrt_number;i++) {
			for(int j=i;j<=number;j++) {
				if(i*j<=number)
					count++;
			}
		}
		System.out.println(count);
	}
}
