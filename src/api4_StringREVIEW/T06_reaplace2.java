package api4_StringREVIEW;
//치환
public class T06_reaplace2 {
	//바꾸고 싶은 특정 문자(열)을 지정한 다른 문자(열)로 변경
	public static void main(String[] args) {
		//                       1         2      
		//             012345678901234567890
		String msg1 = "Welcome to Korea!!!";
		String msg2 = "한국에 방문하신 것을 환영합니다.!!!";
		
		System.out.println("msg1 : " + msg1);
		System.out.println("msg2 : " + msg2);
		
		//.replace(기존 문자(열), 바꿀 문자(열)), 대소문자 구분
		System.out.println("1.'Korea'를 'USA'로 변경하시오~! " +msg1.replace("Korea", "USA"));
		System.out.println("2.'한국'을 '미국'으로로 변경하시오~! " +msg2.replace("한국", "미국"));
		System.out.println("3.'o'을 'O'으로로 변경하시오~! " +msg1.replace("o", "O"));
		System.out.println("4.'o'을 'O'으로로 변경하시오~! " +msg1.replaceAll("o", "O")); //검색어에 '정규식'을 사용할 때 replaceAll 사용한다.
		System.out.println();
		
		String msg3 = "  ! H  e  l  l  o  !  ";
		System.out.println("msg3 : " + msg3);
		System.out.println("msg1+msg3+msg3 : " + msg1+msg3+msg2);
		System.out.println("msg1+msg3+msg3 : " + msg1+msg3.trim()+msg2);
		
		//msg3 안에 포함된 모든 공백을 삭제 후 msg1+msg3+msg2 출력하시오
		System.out.println("msg1+msg3+msg3 : " + msg1+msg3.trim().replace(" ", "")+msg2); //명령어 줄줄이 사용 .명령어 :: 체인기법
		System.out.println("msg1+msg3+msg3 : " + msg1+msg3.replace(" ", "")+msg2);
		
		// msg3 안에는 'hello'문자열을 포함하고 있는가? (indexOr(), contains() - 대소문자 구별한다.)
		String msg4 = "hello";
		//System.out.println(msg3.replace(" ", "").indexOf(msg4));//-1 없다 : 대소문자 구문
		System.out.println(msg3.replace(" ", "").toLowerCase().indexOf(msg4)); //소문자 변환 //1 있다
		System.out.println(msg3.replace(" ", "").toLowerCase().contains(msg4)); //true 포함하고 있다.
		System.out.println(msg3.replace(" ", "").contains(msg4));//false 대소문자 구분한다.
		
		//지정한 문자(열)을 반복처리 한다. repeat(); ==자바 9이후 사용 가능한 함수  
		System.out.println(msg3.repeat(3));
		System.out.println("=".repeat(3));
	}
}
//천천히 읽어 보기
