
public class String_03_atoi {
	public static void main(String[] args) {
		String str = "서울8반";
		
		int result = atoi(str);
		
		System.out.println("변환 후 : "+result);
		
	}
	
	public static int atoi(String str) {
		int value=0;
		
		for (int i=0; i<str.length();i++) {
			char c = str.charAt(i);
			if('0'<= c && c<='9') {
				value = value *10+(c-'0');
			}else {
				System.out.println("입력된 문자열이 정수가 아닙니다.");
				return -9999;
			}
		}
		
		return value;
	}
}
