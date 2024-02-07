package test07_탐색;

public class Array02_2차원배열_사방탐색_경계조건 {
    public static void main(String[] args) {
        
        // 다음 배열에서 1이 들어있는 칸의 상하좌우에 인접한 칸에
        // 2를 채워 넣으시오.
        
        int[][] arr = {
                {0, 0, 0, 1, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 1},
                {1, 0, 0, 1, 0},
                {0, 0, 1, 0, 0}
        };
        
        int N = 5;
        
        int[] dr = {-1,1,0,0};
        int[] dc = {0,0,-1,1};
        
        for(int r=0;r<N;r++) {
        	for(int c=0;c<N;c++) {
        		if(arr[r][c]==1) {
        			System.out.println("r: "+r+", c: "+c);
        			//(r,c)를 기준으로 해서, 상하좌우의 인접 좌표를 만든다.
        			
        			for(int d=0; d<4;d++) {
        				//새로운 좌표
        				int nr = r+dr[d];
        				int nc = c+dc[d];
        				
        				//문제점 - 경계 범위를 고려하지 않았다.
        				//행렬의 범위를 벗어나는 좌표가 만들어질 수도 있다.
        				// 새로운 좌표가 행렬의 index 범위 안에 있다면..
        				if(nr>=0 && nr<N && nc>=0 && nc<N) {
        					arr[nr][nc] =2;
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
