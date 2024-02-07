package ladder;

import java.util.Scanner;

public class Ladder1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size =100;
		int[][] ladder = new int[size][size];
		int start =0;
		int checker=0;
		int side_switch=0;
		int dr[]= {1,0,0};
		int dc[]= {0,-1,1}; // 상좌우

		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				ladder[i][j]=sc.nextInt();
			}
		}
		
		
		for(int i=0;i<100;i++) {
			if(ladder[99][i]==2) {
				start=i;
			}
		}
		int col=start;
		int row=99;
		while (row!=0) {
			int left=0;
			int right=0;
			for(int d=0; d<3;d++) {
				//새로운 좌표
				int nr = row+dr[d];
				int nc = col+dc[d];
				if(nr>=0 && nr<100 && nc>=0 && nc<100) {
					if(ladder[nr][nc]==1) {
						checker++;
						if(d==1) {
							left++;
						}else if(d==2) {
							right++;
						}
					}
				}
			}
			if(checker==1&&left==0&&right==0) {
				row--;
			}else if(checker==2&&left==1&&right==0){
				--col;
				while(ladder[row-1][col-1]!=1) {
					col--;
					
				}
			}else if(checker==2&&left==0&&right==1){
				++col;
				while(ladder[row-1][col+1]!=1) {
					col++;
					
				}
			}
			checker=0;
		}
		System.out.println(col+1);
	}
}
