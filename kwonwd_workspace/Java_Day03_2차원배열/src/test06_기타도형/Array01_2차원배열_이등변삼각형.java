package test06_기타도형;

public class Array01_2차원배열_이등변삼각형 {
    public static void main(String[] args) {
        
        
        // 1 2 3 4 5
        //   5 6 7
        //     8
        
    	int [][] arr = new int[3][5];
    	
    	int left = 0;
    	int right = 4;
    	
    	int count=0;
    	for(int r=0; r<3;r++) {
    		for(int c=left; c<=right;c++) {
    			arr[r][c] =++count;
    		}
    		left++;right--;
    	}
        for(int r=0; r<arr.length;r++) {
        	for(int c=0; c<arr[r].length; c++) {
        		if(arr[r][c]==0) {
        			System.out.print("  ");
        		} else {
        			System.out.printf("%2d", arr[r][c]);
        		}
        	}
        	System.out.println();
        }
    	
        
    }
}
