package snail;

import java.util.Scanner;

public class snail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int upper_limit = 0;
		int lower_limit = size;
		int left_limit = 0;
		int right_limit= size;
		int[][] snail = new int[size][size];
		int count =1;
		int r=0;
		int c=0;
		int r_switch=0;
		int c_switch=0;
		int n_switch=0;
		snail[0][0]=1;
		// 생각의 공간 size=3>4, size=4>6,size=5>8 turn횟수는 2(size-1)
		while(count<(size*size+1)) {
			if(r_switch==0&&c_switch==0) {
				c++;
				count++;
				snail[r][c]=count;
				if(n_switch==1) {
					n_switch=0;
					left_limit+=1;
				}
				if(c==right_limit-1) {
					c_switch=1;
					n_switch=1;
				}
			}else if(r_switch==0&&c_switch==1){
				r++;
				count++;
				snail[r][c]=count;
				if(n_switch==1) {
					n_switch=0;
					upper_limit+=1;
				}
				if(r==lower_limit-1) {
					r_switch=1;
					n_switch=1;
				}
			}else if(r_switch==1&&c_switch==1){
				c--;
				count++;
				snail[r][c]=count;
				if(n_switch==1) {
					n_switch=0;
					right_limit-=1;
				}
				if(c==left_limit) {
					c_switch=0;
					n_switch=1;
				}
			}else if(r_switch==1&&c_switch==0){
				r--;
				count++;
				snail[r][c]=count;
				if(n_switch==1) {
					n_switch=0;
					lower_limit-=1;
				}
				if(r==upper_limit) {
					r_switch=0;
					n_switch=1;
				}
			}
			
			if(count==size*size) {
				break;
			}
			
		}
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(snail[i][j]);
			}
			System.out.println();
		}
		
	}
}