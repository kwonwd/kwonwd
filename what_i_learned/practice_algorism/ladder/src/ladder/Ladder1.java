package ladder;

import java.util.Scanner;

public class Ladder1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] field = new int[100][100];
		int start_x=0;
		int height=99;
		int[] dr= {0,0};
		int[] dc= {-1,1};
		int check =1;
		
		for(int r=0;r<100;r++) {
			for(int c=0;c<100;c++) {
				field[r][c]=sc.nextInt();
			}
		} // 숫자 넣기
		
		for(int c=0;c<100;c++) {
			if(field[99][c]==2) {
				start_x=c;
			}
		} // 시작점 정하기

		while(height>0) {
			check=1;
			for(int d=0;d<2;d++) {
				int nc = start_x+dc[d];
				if(nc>=0&&nc<100) {
					if(field[height][nc]==1) {
						start_x=nc;
						check=0;
						while(true) {
							nc= start_x+dc[d];
							if(nc<0||nc>=100||field[height][nc]==0){
								break;
							}else {
								start_x=nc;
							}
						}
					}
					if(check==0) {
						break;
					}
				}
			}
			height--;
		}
		
		System.out.println(start_x);
	}
}
