
public class Array2_02_BinarySearch {
	public static void main(String[] args) {
		int[] arr = {23,44,55,77,84,91};
		int result = binarySearch(arr, 44);
		System.out.println(result);
	}
	
	public static int binarySearch(int[] arr, int key) {
		int left=0;
		int right=arr.length-1;
		
		while(left<= right) {
			int mid =(left+right)/2;
			if(key==arr[mid]) {
				return mid;
			} else if(key<arr[mid]) {
				right=mid-1;
			} else {
				left=mid+1;
			}
		}
		return -1;
	}
}
