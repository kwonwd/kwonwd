package ladder;

import java.util.Scanner;

public class Ladder2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] field = new int[100][100];
		int[] dc= {-1,1};
		int check =1;
		int min=10000;
		int starting_point=0;
		
		for(int r=0;r<100;r++) {
			for(int c=0;c<100;c++) {
				field[r][c]=sc.nextInt();
			}
		} // 숫자 넣기
		
		for(int c=0;c<100;c++) {
			if(field[0][c]==1) {
				int r=0;
				int x=c;
				int walk=0;
				while(r<99) {
					check=1;
					for(int d=0;d<2;d++) {
						int nx = x+dc[d];
						if(nx>=0&&nx<100) {
							if(field[r][nx]==1) {
								x=nx;
								walk++;
								check=0;
								while(true) {
									nx= x+dc[d];
									if(nx<0||nx>=100||field[r][nx]==0){
										break;
									}else {
										x=nx;
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
					walk++;
				}
				if(walk<min) {
					min=walk;
					starting_point=c;
				}
			}
		}
		System.out.println(starting_point);
		
	}
}
