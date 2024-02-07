package test01_bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest2 {
	public static void main(String[] args) {
		// ByteStream을 이용해서 이미지(파일)을 입출력
		
		// try with resources
		try (FileInputStream fis = new FileInputStream("dog.jpg");
				FileOutputStream fos =new FileOutputStream("dog-copy.jpg");) { // ()안에 내가 사용할 스트림 변수를 선언 & 생성
			int b; //File로부터 읽어올 데이터를 임시저장할 변수
			// 1 바이트씩 저장, 더 이상 읽을 값이 없으면 -1
			
			while((b = fis.read())!=-1) { // 1바이트씩 읽어와서, -1이 아니라면.
				// b에 바이트를 하나 읽어 왔음
				fos.write(b);
			}
			System.out.println("복사가 끝났습니다.");
			System.out.println("스트림은 알아서 닫힙니다.");
			
		} catch (IOException e) {// IOException이 FileNotFoundException보다 조상
			e.printStackTrace();
		} 
		
		// 사실은, 스트림을 닫아줘야 한다.
//		System.out.println("복사가 끝났습니다.");
	}
}
