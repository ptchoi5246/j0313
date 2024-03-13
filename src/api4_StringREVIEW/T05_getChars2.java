package api4_StringREVIEW;

public class T05_getChars2 { //문자열을 문자로 처리
	//문자열에서 지정범위의 단일 문자를 문자 배열로 복사
	public static void main(String[] args) {
		
		String str1 = "Hello1";
		
		char[] strArr = new char[str1.length()]; //배열 새로 만들기
		//문자 배열 strArr = new char[문자열 길이의 크기만큼]
		str1.getChars(0, str1.length(), strArr, 0); // 배열 복사
		//.getChars(복사할 문자의 시작 인덱스 번호, 끝 인덱스 번호, 붙여넣을 문자 배열, ???char[]에 붙여넣을 위치의 인덱스번호???) 
		System.out.println("strArr : " + strArr ); //배열 객체 -> 주소 출력
		System.out.println();
		
		//향상된 for문 for(변수:객체)
		String temp = ""; //문자열 누적
		for(char str : strArr) {
			temp += str + "/";
		}
		System.out.println(temp);
	// 마지막 / 빼기 : / 빼고 나머지를 발췌 - substring
	//(strArr.length -1)
		System.out.println(temp.substring(0, temp.length()-1));
			
	}
}
