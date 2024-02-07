
public class Array2_01_SequentialSearch {
	public static void main(String[] args) {
		
		int[] arr = {23,17,55,33,78};
		int result = searchByFor(arr, 33);
		int result2 = searchByWhile(arr, 172);
		
		System.out.println(result);
		System.out.println(result2);
	}
	
	public static int searchByFor(int[] arr, int key) {
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	
	public static int searchByWhile(int[] arr, int key) {
		int i=0;
		while(i<arr.length) {
			
			if(arr[i]==key) {
				return i;
			}
			
			i++;
		}
		return -1;
	}
}
