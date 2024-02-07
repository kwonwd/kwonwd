package prob_11399;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int[] arr = new int[num];
		int sum=0;
		
		for(int i=0;i<num;i++) {
			arr[i]= sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i=0;i<num;i++) {
			int j=i;
			while(j<num) {
			sum=sum+arr[i];
			j++;
			}
		}
		
		System.out.println(sum);
		
	}
}
