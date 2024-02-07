package prob_2839;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int num_3 = number/3;
		int num_5 = number/5;
		int some = 2000;
		
		for(int i=num_5;i>=0;i--) {
			for(int j=0;j<=num_3;j++) {
				if(i*5+j*3==number) {
					if(i+j<=some) {
						some=i+j;
					}
				}
			}
		}
		if(some==2000) {
			some=-1;
		}
		System.out.println(some);
		
	}
}
