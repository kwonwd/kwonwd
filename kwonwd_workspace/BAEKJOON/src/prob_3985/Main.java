package prob_3985;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int length = sc.nextInt();
		int num =sc.nextInt();
		int [][] want = new int[num][2];
		int[] cake = new int[length];
		int max=0;
		int[] real_max= new int[num];
		int temp=0;
		int answer=0;
		
		for(int i=0;i<num;i++) {
			want[i][0]=sc.nextInt();
			want[i][1]=sc.nextInt();
			if (want[i][1]-want[i][0]>temp) {
				temp=want[i][1]-want[i][0];
				max=i+1;
			}
		}
		System.out.println(max);
		
		for(int i=0;i<num;i++) {
			for(int j=want[i][0]-1;j<want[i][1];j++) {
				if(cake[j]==0) {
				cake[j]=i+1;
				}
			}
		}
		
		temp=0;
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<length;j++) {
				if(cake[j]==i+1) {
					real_max[i]++;
				}
			}
		}
		
//		for(int i=0;i<num;i++) {
//			System.out.print(real_max[i]);
//		}
		
		for(int i=0;i<num;i++) {
			if(real_max[i]>temp) {
				temp = real_max[i];
				answer=i+1;
			}
		}
		System.out.println(answer);
		
	}

}
