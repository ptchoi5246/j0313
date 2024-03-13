package api4_StringREVIEW;

public class T03_charAt2 {
	public static void main(String[] args) {
		//성별코드가 '1' 또는 '3'이면  남자, '2'또는 '4'이면 '여자'로 출력해주세요.
		//						  01234567890123
		String jumin = "123456-1234567";
		char gender = jumin.charAt(7); //문자열을 숫자로 추출
		//charAt() : String으로 저장된 문자열 중에서 한 글자만 선택해서 char 타입으로 변환 str.charAt(index no.)
		String strGender = "";
				
		if(gender == '1' || gender == '3') strGender = "남자";
		else if(gender == '2' || gender == '4') strGender = "여자";
		else strGender = "주민번호 오류";
		
		System.out.println("주민번호 :  "+jumin+" , 성별 : " +strGender);
		System.out.println("복습 완료");
	}
}
