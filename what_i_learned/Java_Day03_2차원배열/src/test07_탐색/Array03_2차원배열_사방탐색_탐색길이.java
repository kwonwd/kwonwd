package test07_탐색;

public class Array03_2차원배열_사방탐색_탐색길이 {
    public static void main(String[] args) {
        
        // 다음 배열에서 1이 들어있는 칸의 상하좌우 방향으로 
        // 길이가 2인 막대를 이어 붙인다. (막대는 2를 채워넣어 표현한다.)
        
        int[][] arr = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };
        
        int N = 7;
        
        int[] dr = {-1,1,0,0};
        int[] dc = {0,0,-1,1};
        
        for(int r=0;r<N;r++) {
        	for(int c=0;c<N;c++) {
        		if(arr[r][c]==1) {
        			System.out.println("r: "+r+", c: "+c);
        			//(r,c)를 기준으로 해서, 상하좌우의 인접 좌표를 만든다.
        			
        			for(int d=0; d<4;d++) {
        				//새로운 좌표
        				//길이도 고려
        				for (int l=1; l<=2;l++) {
        				int nr = r+l*dr[d];
        				int nc = c+l*dc[d];
        				if(nr>=0 && nr<N && nc>=0 && nc<N) {
        					arr[nr][nc] =2;
        				}
        				
        				//문제점 - 경계 범위를 고려하지 않았다.
        				//행렬의 범위를 벗어나는 좌표가 만들어질 수도 있다.
        				// 새로운 좌표가 행렬의 index 범위 안에 있다면..
        				
        				}
        			}
        		}
        	}
        }
        
        
        
        for(int r=0;r<N;r++) {
        	for(int c=0;c<N;c++) {
        		System.out.printf("%2d", arr[r][c]);
        	}
        	System.out.println();
        }
        

        
        
        
    }
}
