package problem_2563;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] position = new int[num][2];
		int[][] white = new int[100][100];
		int count=0;
		
		for(int i=0;i<num;i++) {
			position[i][0]=sc.nextInt();
			position[i][1]=sc.nextInt();
			
		}
		
		for(int i=0;i<num;i++) {
			white[position[i][0]][position[i][1]]=2;
		}
		
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(white[i][j]==2) {
					for(int i_2=i;i_2<i+10;i_2++) {
						for(int j_2=j;j_2<j+10;j_2++) {
							if(white[i_2][j_2]!=2) {
								white[i_2][j_2]=1;
							}
						}
					}
				}
			}
		}
		
		
//		for(int i=0;i<100;i++) {
//			for(int j=0;j<100;j++) {
//				System.out.printf("%d ",white[j][i]);
//			}
//			System.out.println();
//		}
		for(int i=0; i<100;i++) {
			for(int j=0;j<100;j++) {
				if(white[i][j]!=0) {
					count++;
				}
			}
		}
		System.out.print(count);
		
	}
}
