package prob_2941;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char[] cArr =input.toCharArray();
		int answer = input.length();
		
		for (int i=1;i<input.length();i++) {
			if(cArr[i]=='-') {
				if(cArr[i-1]=='d'||cArr[i-1]=='c') {
					answer--;
				}
			}else if(cArr[i]=='j') {
				if(cArr[i-1]=='l'||cArr[i-1]=='n') {
					answer--;
				}
			}else if(cArr[i]=='=') {
				if(cArr[i-1]=='c'||cArr[i-1]=='s') {
					answer--;
				}else if(cArr[i-1]=='z') {
					answer--;
					if(i>1&&cArr[i-2]=='d') {
						answer--;
					}
				}
			}
			
		}
		
		System.out.println(answer);
	}
}
