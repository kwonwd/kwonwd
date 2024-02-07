package prob_1244;

import java.util.Scanner;

public class Problem_1244 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int switch_size;
		int loop_number;
		
		
		switch_size = sc.nextInt();
		int[] switch_show= new int[switch_size];
		
		
		for(int i=0;i<switch_size;i++) {
			switch_show[i]=sc.nextInt();
		}
		
		loop_number = sc.nextInt();
		int[][] check_condition= new int[loop_number][2];
		for(int i =0;i<loop_number;i++) {
			for(int j=0;j<2;j++) {
				check_condition[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<loop_number; i++) {
			if(check_condition[i][0]==1) {
				for(int j =0;j<switch_size;j++) {
					if((j+1)%(check_condition[i][1])==0) {
						if(switch_show[j]==0) {
							switch_show[j]=1;
						}else {
							switch_show[j]=0;
						}
					}
				}
			}else {
				if(switch_show[check_condition[i][1]-1]==0) {
					switch_show[check_condition[i][1]-1]=1;
				}else {
					switch_show[check_condition[i][1]-1]=0;
				}
				
				for(int j=1;j<switch_size/2+1;j++) {
					int nu = check_condition[i][1]-1+j*1;
					int nd = check_condition[i][1]-1-j*1;
					if(nu<switch_size&&nd>=0) {
						if(switch_show[nu]==switch_show[nd]) {
							if(switch_show[nu]==1) {
								switch_show[nu]=0;
								switch_show[nd]=0;
							} else {
								switch_show[nu]=1;
								switch_show[nd]=1;
							}
						} else {
							break;
						}
					}
				}
				
			}
		}
		int count =0;
		for(int i=0;i<switch_size;i++) {
			System.out.printf("%d",switch_show[i]);
			
			if(count==19) {
				System.out.printf("%n");
				count=-1;
			}else if(i!=switch_size-1) {
				System.out.print(" ");
			}
			count++;
		}
	
	}
}
