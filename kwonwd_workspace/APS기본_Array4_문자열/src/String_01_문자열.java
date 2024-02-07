
public class String_01_문자열 {
	public static void main(String[] args) {
		// 리터럴 방식 초기화
		String str1 = "abc";
		// new 키워드 사용
		String str2 = new String("abc");
		
		// 참조 자료형의 경우 == -> 해시코드를 비교
		// 문자열 값 비교는 equals
		
		if(str1.equals(str2)) {
			System.out.println("두 문자열이 같습니다.");
		} else {
			System.out.println("다릅니다");
		}
		
		String str3 = "abc";
		
		if(str1 ==str3) {
			System.out.println("두 문자열이 같습니다.");
		} else {
			System.out.println("다릅니다");
		}
	}

}
