package prob_2527;

import java.util.Scanner;

public class Problem_2527 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] square =new int [4][8];
		
		for(int i=0; i<4;i++) {
			for(int j=0;j<8;j++) {
				square[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<4;i++) {
			int x_1 = square[i][0];
			int y_1 = square[i][1];
			int x_2 = square[i][2];
			int y_2 = square[i][3];
			int x_3 = square[i][4];
			int y_3 = square[i][5];
			int x_4 = square[i][6];
			int y_4 = square[i][7];
			
			if(x_1<=x_3||y_1<=y_3) { //두번째가 여튼 우측 상단에 존재
				if(x_2>x_3&&y_2>y_3) {
					System.out.print("a");
				} else if((x_2==x_3&&y_2>y_3)||(x_2>x_3&&y_2==y_3)) {
					System.out.print("b");
				}else if(x_2==x_3&&y_2==y_3) {
					System.out.print("c");
				}else {
					System.out.print("d");
				}
			}else { // 두번째가 하단에 존재
				if(x_1>x_4&&y_1>y_4) {
					System.out.print("a");
				} else if((x_1==x_4&&y_4>y_1)||(x_4>x_1&&y_1==y_4)) {
					System.out.print("b");
				}else if(x_1==x_4&&y_1==y_4) {
					System.out.print("c");
				}else {
					System.out.print("d");
				}
			}
			
			
//			if(x_1>x_2&&y_1>y_2) {
//				System.out.print("a");
//			}else if((x_1==x_2&&y_1>y_2)||(x_1>x_2&&y_1==y_2)) {
//				System.out.print("b");
//			}else if(x_1==x_2&&y_1==y_2) {
//				System.out.print("c");
//			}else {
//				System.out.print("d");
//			}
			if(i!=3) {
				System.out.println();
			}
		}
	}
}
