package test02_삼각형1;

public class Array01_2차원배열_삼각형 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        
//         1  2  3  4  
//            5  6  7  
//               8  9  
//                  10 
        //1. 행 우선운회
        //숫자가 1~10까지 순차적으로 증가
        //행렬에 번호 매기기
        int count =0;
        
        for(int r=0;r<4;r++) {
        	for(int c=r;c<4;c++) {
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
