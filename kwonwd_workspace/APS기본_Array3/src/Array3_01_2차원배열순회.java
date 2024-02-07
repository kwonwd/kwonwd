
public class Array3_01_2차원배열순회 {
	public static void main(String[] args) {
		//2차원 배열 초기화
		int[][] arr= new int[3][3];
		
		// 행 우선순회와 공시에 값 초기화
		int num=1;
		for (int r=0;r<arr.length;r++) {
			for(int c=0;c<arr[r].length;c++) {
				arr[r][c]=num++;
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
		
		// 열 우선순회
		System.out.println("------------");
		for(int c=0;c<arr[0].length;c++) {
			for(int r=0;r<arr.length;r++) {
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
		
		System.out.println("------------");
		// 지그재그 순회
		for(int r=0;r<arr.length;r++) {
			if(r%2==0) {
				//짝수
				for(int c=0;c<arr[r].length;c++) {
					System.out.print(arr[r][c]+ " ");
				}
			}else {
				//홀수
				for(int c=arr[r].length-1;c>-1;c--) {
					System.out.print(arr[r][c]+" ");
				}
			}
			System.out.println();
		}
	}
}
