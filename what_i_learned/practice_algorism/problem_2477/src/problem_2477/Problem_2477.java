package problem_2477;

import java.util.Scanner;

public class Problem_2477 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number=0;
		int[][] move = new int[6][2];
		int check=0;
		int num1=0;
		int num2=0;
		int num3=0;
		int num4=0; // 체커
		int land=0;
		int bin=0;
		int max_row=0;
		int max_col=0;
		
		number=sc.nextInt();
		for(int i=0;i<6;i++) {
			move[i][0]=sc.nextInt();
			move[i][1]=sc.nextInt();//0에는 방향 1에는 길이
			if(move[i][0]==1) {
				num1++;
			}else if(move[i][0]==2){
				num2++;
			}else if(move[i][0]==3){
				num3++;
			}else if(move[i][0]==4){
				num4++;
			}
		}
		
		for (int i=0;i<6;i++) {
			if(move[i][0]==1||move[i][0]==2) {
				if(move[i][1]>max_row) {
					max_row=move[i][1];
				}
			} else {
				if(move[i][1]>max_col) {
					max_col=move[i][1];
				}
			}
		}
		land = max_row*max_col-bin;
		//나중에 풀자
		
		
	}
}
