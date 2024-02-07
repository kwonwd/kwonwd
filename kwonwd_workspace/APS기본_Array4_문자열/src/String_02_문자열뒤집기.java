import java.util.Arrays;

public class String_02_문자열뒤집기 {
	public static void main(String[] args) {
		// 리터럴 방식 초기화
		String str = "Hello SSAFY!!";
		
		// String class -> toCharArray
		char[] charArr = str.toCharArray();
		
		int len =str.length();
		//swap 횟수 = str.length()/2
		for( int i=0; i<len/2;i++) {
			char tmp =charArr[i];
			charArr[i] = charArr[len-1-i];
			charArr[len-1-i] = tmp;
		}
		
		System.out.println(Arrays.toString(charArr));
	}

}
