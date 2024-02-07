package prob_2798;

import java.util.Scanner;

public class Problem_2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=0;
		size=sc.nextInt();
		int goal =0;
		goal =sc.nextInt();
		int[] list = new int[size];
		int max=0;
		int card_sum=0;
		
		for(int i=0; i<size; i++) {
			list[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			card_sum=0;
			for(int j=i+1;j<size;j++) {
				for(int k=j+1;k<size;k++) {
					card_sum=list[i]+list[j]+list[k];
					if(card_sum<=goal) {
						if(card_sum>=max) {
							max=card_sum;
						}
					}
				}
			}
		}
		System.out.print(max);
	}
}
