package prob_1592;

import java.util.Scanner;

public class Problem_1592 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int ball_limit =sc.nextInt();
		int ball_num = sc.nextInt();
		int[] recieve = new int[num];
		int count=0;
		int tmp=0;
		int end=0;
		
		recieve[0]=1;
		
		while(recieve[0]!=ball_limit)
		{
			count++;
			if(recieve[tmp]%2==1) {
				tmp=tmp+ball_num;
				if(tmp>=num) {
					tmp=tmp-num;
				}
				recieve[tmp]++;
			}else {
				tmp=tmp-ball_num;
				if(tmp<0) {
					tmp=tmp+num;
				}
				recieve[tmp]++;
			}
			
			for(int i=0;i<num;i++) {
				if(recieve[i]==ball_limit) {
					end=1;
					break;
				}
			}
			if(end==1) {
				break;
			}
			
		}
		
		
		System.out.println(count);
	}

}
