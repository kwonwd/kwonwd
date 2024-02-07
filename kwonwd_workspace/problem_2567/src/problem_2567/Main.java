package problem_2567;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] position = new int[num][2];
		int[][] white = new int[100][100];
		int count=0;
		int count_1=0;
		int[] dr = {-1,-1,0,1,1,1,0,-1};
		int[] dc = {0,1,1,1,0,-1,-1,-1};
		
		
		
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
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(white[i][j]==2) {
					white[i][j]=3;
				}
			}
		}	
		
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(white[i][j]!=0) {
					for(int d=0; d<8;d++) {
        				int nr = i+dr[d];
        				int nc = j+dc[d];
        				
        				if(nr>=0 && nr<100 && nc>=0 && nc<100) {
        					if(white[nr][nc] ==0) {
        						count++;
        					}
        				}
        			}
					if(count>0) {
    					white[i][j]=3;
    				}else {
    					white[i][j]=1;
    				}
				}
				count=0;
			}
		}
		
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(white[i][j]==3) {
					count_1++;
				}
			}
		}
		

		for(int i=99;i>=0;i--) {
			for(int j=0;j<100;j++) {
				System.out.printf("%d ",white[j][i]);
			}
			System.out.println();
		}

		System.out.print(count_1);
	}
}