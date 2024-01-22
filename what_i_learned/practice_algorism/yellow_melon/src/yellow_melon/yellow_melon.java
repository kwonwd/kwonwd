package yellow_melon;

import java.util.Scanner;

public class yellow_melon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int[][] land = new int[6][2];
		int hole;
		int hole_side1=0;
		int hole_side2=0;
		int whole_land;
		int max_1=0;
		int max_2=0;
		
		int num1_count =0;
		int num2_count =0;
		int num3_count =0;
		int num4_count =0;
		
		num1 = sc.nextInt();
		for(int i=0;i<6;i++) {
			land[i][0]=sc.nextInt();
			land[i][1]=sc.nextInt();
			
		}
		
		for(int i=0;i<6;i++) {
			if(land[i][0]==1) {
				num1_count++;
				if(num1_count==2&&i>0) {
					hole_side1=land[i][1];
					hole_side2=land[i-1][1];
					break;
				}
			}else if(land[i][0]==2) {
				num2_count++;
				if(num2_count==2&&i>0) {
					hole_side1=land[i][1];
					hole_side2=land[i-1][1];
					break;
				}
			}else if(land[i][0]==3) {
				num3_count++;
				if(num3_count==2&&i>0) {
					hole_side2=land[i][1];
					hole_side1=land[i-1][1];
					break;
				}
			}else if(land[i][0]==4&&i>0) {
				num4_count++;
				if(num4_count==2) {
					hole_side2=land[i][1];
					hole_side1=land[i-1][1];
					break;
				}
			}
		}
		
		hole=hole_side1*hole_side2;
		
		for(int i=0;i<6;i++) {
			if(land[i][0]==1||land[i][0]==2) {
				if(land[i][1]>max_1) {
					max_1=land[i][1];
				}
			}else if(land[i][0]==3||land[i][0]==4) {
				if(land[i][1]>max_2) {
					max_2=land[i][1];
				}
			}
		}
		whole_land=max_1*max_2;
		
		System.out.println((whole_land-hole)*num1);
	}
}
