package ladder;

import java.util.Scanner;

public class Ladder2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] field = new int[100][100];
		int number=0;
		int[] dc= {-1,1};
		int check =1;
		int[][] starting_point = new int[100][2];
		int walk=0;
		
		for(int r=0;r<100;r++) {
			for(int c=0;c<100;c++) {
				field[r][c]=sc.nextInt();
			}
		} // 숫자 넣기
		
		for(int r=0;r<100;r++) {
			if(field[0][r]==1) {
				starting_point[r][0]=1;
			}
		}
		int r=0;
		for(int c=0;c<100;c++) {
			r=0;
			walk=0;
			if(field[r][c]==1) {
				while(r!=99) {
					check=1;
					for(int d=0;d<2;d++) {
						int nc = +dc[d];
						if(nc>=0&&nc<100) {
							if(field[r][nc]==1) {
								c=nc;
								check=0;
								walk++;
								while(true) {
									nc= c+dc[d];
									if(nc<0||nc>=100||field[r][nc]==0){
										break;
									}else {
										c=nc;
										walk++;
									}
								}
							}
							if(check==0) {
								break;
							}
						}
					}
					r++;
				}
				starting_point[c][1]=walk;
			}
		}
		
		for(int k=0;k<100;k++) {
			if(starting_point[k][0]==1) {
				System.out.println(starting_point[k][1]);
			}
		}
	}
}
