package dwarf;

import java.util.Scanner;
import java.util.Arrays;

public class Dwarf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] height_9= new int[9][2];
		int[] height_7 =new int[7];
		int sum=0;
		int dif;
		int check=0;
		
		for(int i =0;i<9;i++) {
			height_9[i][0]=sc.nextInt();
			sum=sum+height_9[i][0];
		}
		
		dif = sum-100;
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(height_9[i][0]+height_9[j][0]==dif&&i!=j) {
					height_9[i][1]=1;
					height_9[j][1]=1;
					check=1;
					break;
				}
			}
			if(check==1) {
				break;
			}
		}
		int k =0;
		for(int i=0;i<9;i++) {
			if(height_9[i][1]!=1) {
				height_7[k]=height_9[i][0];
				k++;
			}
		}
		
		
		
		Arrays.sort(height_7);
		
		
		for(int l=0;l<7;l++) {
			System.out.println(height_7[l]);
		}
		
		
		
		
		
	}
}
