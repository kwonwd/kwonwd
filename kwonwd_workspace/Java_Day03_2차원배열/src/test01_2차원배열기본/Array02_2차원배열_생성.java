package test01_2차원배열기본;

import java.util.Arrays;

public class Array02_2차원배열_생성 {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][4]; // 자료형의 기본값으로 초기화
        int[][] arr2 = new int[][] { // 우리가 지정한 값으로 초기화
        	{1,2,3,4},
        	{5,6,7,8},
        	{9,10,11,12}
        };
        
        int[][] arr3 = {
        		{1,2,3,4},
        		{5,6,7},
        		{8}
        };
        System.out.println(Arrays.toString(arr3));//?
    }
}
