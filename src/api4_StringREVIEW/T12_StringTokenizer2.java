package api4_StringREVIEW;

import java.util.StringTokenizer;

public class T12_StringTokenizer2 { //split과 비슷한 역할을 하는데 조금 다르다. 책 17장
	//문자 쪼개기
	//문자열을 특정 문자(열)로 분리시킨 후 분리된 각각의 항목(토큰)을 내부반복자(이터레이터I Iterator)로 호출시켜준다.(or 연산자 : |)
	public static void main(String[] args) {
		
		String tel = "010-1234-5678";
		
		StringTokenizer telArr = new StringTokenizer(tel, "-"); //알고 싶은것, -기준 몇덩어리
		
		System.out.println("telArr 토큰의 갯수 : " + telArr.countTokens());
		
		//몇갠지 알면 for문
		//몇갠지 모르면 hasMoreToken 또는 hasMoreElements
		String str = "";
		while(telArr.hasMoreElements()) { //자료를 읽어서 모여있니? hasMoreElements
			str += telArr.nextToken() + "/";
		}		
		System.out.println("str 토큰 : " + str.substring(0,str.length()-1));
		System.out.println();
		System.out.println("복습 완료 :)");
 	}
}
