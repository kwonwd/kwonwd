import java.util.Arrays;

public class Array2_03_SelectionSort {
	public static void main(String[] args) {
		int[] arr = {32,55,27,94,75,69};
		selectionSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectionSort(int[] arr) {
		// 전체 사이즈 반복문 
		for (int i =0; i<arr.length-1;i++) {
			
			int minIdx = i;
			// 현 사이클에 대한 반복문
			// 정렬되지 않은 원소들 중 최솟값을 찾아서 swap
			for(int j=i+1; j<arr.length;j++) {
				// minIdx가 가리키는 원소보다 j가 가리키는 원소가 작다면 minIdx 갱신
				if(arr[minIdx]>arr[j]) {
					minIdx=j;
				}
			}
			// minIdx와 기준위치 i swap
			int tmp =arr[i];
			arr[i]=arr[minIdx];
			arr[minIdx]=tmp;
		}
	}
}
