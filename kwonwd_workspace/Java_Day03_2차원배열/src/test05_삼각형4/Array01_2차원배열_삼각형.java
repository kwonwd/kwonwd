package test05_삼각형4;

public class Array01_2차원배열_삼각형 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        
//        4           
//        3  7        
//        2  6  9     
//        1  5  8  10 
        
        int count =0;
        
        for(int c=0;c<4;c++) {
        	for(int r=c;r<4;r++) {
        		arr[r][c] = ++count;
        	}
        }
        
        //행렬 출력하기
        for(int r=0;r<4;r++) {
        	for(int c=0;c<4;c++) {
        		if(arr[r][c]==0) {
        			System.out.print("   ");
        		}else {
        			System.out.printf("%3d",arr[r][c]);
        		}
        	}
        	System.out.println();
        }
        

    }
}
