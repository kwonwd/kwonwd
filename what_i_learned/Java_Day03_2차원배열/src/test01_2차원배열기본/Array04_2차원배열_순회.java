package test01_2차원배열기본;

public class Array04_2차원배열_순회 {
    public static void main(String[] args) {
        
    	
    	int[][]arr = {
    			{1,2,3,4},
    			{5,6,7,8},
    			{9,10,11,12}
    	};
    	
    	//행 우선 순회
    	for(int i=0;i<3;i++) {
    		for(int j=0;j<4;j++) {
    			System.out.print(arr[i][j]+" ");
    		}
    		System.out.println();
    	
    	}
    	System.out.println("-----");
    	//열 우선 순회
    	for(int i=0;i<4;i++) {
    		for(int j=0;j<3;j++) {
    			System.out.print(arr[j][i]+" ");
    		}
    		System.out.println();
    	}
    	System.out.println("-----");
    	//지그재그 순회
    	// 행 우선 순회
    	for(int i=0;i<3;i++) {
    		for(int j=0;j<4;j++) {
    			if(i%2==0) {
    				System.out.print(arr[i][j]+" ");
    			}
    			else {
    				System.out.print(arr[i][3-j]+" ");	
    			}
    		}
    		System.out.println();
    	
    	}
    }	
}
