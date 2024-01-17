package test06_기타도형;

public class Array03_2차원배열_모래시계 {
    public static void main(String[] args) {
        
//         1  2  3  4  5
//            6  7  8   
//               9      
//           10 11 12   
//        13 14 15 16 17
    	int [][] arr = new int[5][5];
    	int left = 0;
    	int right =4;
    	
    	int count=0;
    	for(int r=0;r<5;r++) {
    		for(int c=left; c<=right;c++) {
    			arr[r][c] = ++count;
    		}
    		if(r<2) {
    			left++;right--;
    		}else {
    			left--;right++;
    		}
    	}
       
        for(int r=0; r<arr.length;r++) {
        	for(int c=0; c<arr[r].length; c++) {
        		if(arr[r][c]==0) {
        			System.out.print("   ");
        		} else {
        			System.out.printf("%3d", arr[r][c]);
        		}
        	}
        	System.out.println();
        }
    }
}
