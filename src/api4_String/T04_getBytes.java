package api4_String;

import java.io.UnsupportedEncodingException;

//웹 : 파일 업로드, 다운로드 
public class T04_getBytes {
	public static void main(String[] args) {
		//아스키코드 - 영문1글자 : 1Byte, 한글1글자 : 2Byte
		//EUC-KR 유럽형 한글 - 영문1글자 : 1Byte, 한글1글자 : 2Byte
		//유니코드 UTR-8 -  영문1글자 : 1Byte, 한글1글자 : 3Byte
		String str1 = "안녕하세요!";
		String str2 = "Hello!";
		
		System.out.println("str1의 길이 : " + str1.length()); //한글 1Byte
		System.out.println("str2의 길이 : " + str2.length()); //영문 1Byte
		System.out.println();
		
		byte[] b1 = str1.getBytes();  //무조건 쓴다. //통신 //문자열을 byte로 바꿔서 배열을 해준다 //getBytes()의 기본값 UTF-8
		System.out.println("b1의 길이 : " + b1.length); //3Byte *5 + 느낌표 1Byte

		byte[] b2 = str2.getBytes();  //무조건 쓴다.
		System.out.println("b2의 길이 : " + b2.length); //6Byte
		System.out.println();
		
		
		//인코딩 : 코드를 바꾸는 것 /디코딩 : 인코딩 복화
		//자료 보낼때 Byte getBytes 인코딩 , 자료 받을 때 디코딩
		try {
			// EUC-KR
			//한글 인코딩 <-> 디코딩
			byte[] b3 = str1.getBytes("EUC-KR");
			System.out.println("b3의 길이 : " + b3.length); //11
			System.out.println("b3 : " + b3.toString()); //주소 출력 //.toString() 생략 가능
			System.out.println("b3[0] : " + b3[0]); //b3의 0번째 글자 //코드 출력
			System.out.println("~~~~~~~~~~전송중~~~~~~~~~~");
			//디코딩 무조건 문자로 바꿔야한다.
			String str3 = new String(b3, "EUC-KR"); //디코딩 //b3를 EUC-KR로 복화한다.
			System.out.println("str3 : " + str3); //안녕하세요!
			System.out.println();
			
			//영문 인코딩 <-> 디코딩
			byte[] b4 = str2.getBytes("EUC-KR");
			System.out.println("b2의 길이 : " + b2.length);
			System.out.println("b2 : " + b2.toString());
			System.out.println("b2[0] : " + b2[0]);
			System.out.println("~~~~~~~~~~전송중~~~~~~~~~~");
			//디코딩 무조건 문자로 바꿔야한다.
			String str4 = new String(b4, "EUC-KR");
			System.out.println("str4 : " + str4);
			System.out.println("====================================");
			
			// UTF-8
			//한글 인코딩 <-> 디코딩
			b3 = str1.getBytes("UTF-8");
			System.out.println("b3의 길이 : " + b3.length); //11
			System.out.println("b3 : " + b3.toString()); //주소 출력 //.toString() 생략 가능
			System.out.println("b3[0] : " + b3[0]); //b3의 0번째 글자 //코드 출력
			System.out.println("~~~~~~~~~~전송중~~~~~~~~~~");
			//디코딩 무조건 문자로 바꿔야한다.
			str3 = new String(b3, "UTF-8"); //디코딩 //b3를 EUC-KR로 복화한다.
			System.out.println("str3 : " + str3); //안녕하세요!
			System.out.println();
			
			//영문 인코딩 <-> 디코딩
			b4 = str2.getBytes("UTF-8");
			System.out.println("b2의 길이 : " + b2.length);
			System.out.println("b2 : " + b2.toString());
			System.out.println("b2[0] : " + b2[0]);
			System.out.println("~~~~~~~~~~전송중~~~~~~~~~~");
			//디코딩 무조건 문자로 바꿔야한다.
			str4 = new String(b4, "UTF-8");
			System.out.println("str4 : " + str4);
			System.out.println();
			
			
			
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
