package api4_StringREVIEW;

public class T02_substring2 {
	//문자열 자르기
	//substring() : 지정된 위치(인덱스번지)의 값을 출력
	//substring(n) : 지정된 위치(인덱스번지)의 위치부터 마지막까지 문자열을 출력
	//substring(n,m) : n 위치(인덱스번지)의 위치부터 (m-1)위치까지 문자열을 출력
	public static void main(String[] args) {
		//                       1         2      
		//             012345678901234567890
		String msg1 = "I am doing homework";
		String msg2 = "내가 그린 기린 그림은 네가 그린 그림";
		
		System.out.println("1.msg1에 3번째 인덱스위치부터 출력? " + msg1.substring(3)); //m~ 끝까지
		System.out.println("2.msg2에 3번째부터 12번째 인덱스앞부터 출력? " + msg2.substring(3,12)); //그~ 까지
				
		
		//찾는거 index
		System.out.println("am : " + msg1.indexOf("am")); //2
		System.out.println("work : " + msg1.indexOf("wo")); //15
		System.out.println("am~home : " + msg1.substring(msg1.indexOf("am"),msg1.indexOf("wo")));//am doing home
		//substring(start, end) am doing home //문자열 발췌
		System.out.println("복습 완료 :)");
	}
}
