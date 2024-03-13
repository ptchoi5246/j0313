package api4_String;

public class T02_substring {
	public static void main(String[] args) {
		//                       1         2      
		//             012345678901234567890
		String msg1 = "Welcome to Korea!!!";
		String msg2 = "한국에 방문하신 것을 환영합니다.!!!";
		
		// substring() : 지정된 위치(인덱스번지)의 값을 출력
		// substring(n) : 지정된 위치(인덱스번지)의 위치부터 마지막까지 문자열을 출력
		// substring(n,m) : n 위치(인덱스번지)의 위치부터 (m-1)위치까지 문자열을 출력
		System.out.println("1.msg1에 3번째 인덱스위치부터 출력? " + msg1.substring(3)); //시작 위치부터 출력
		System.out.println("2.msg1에 3번째부터 12번째 인덱스앞부터 출력? " + msg1.substring(3,12));
				
		// Ko~ 단어를 출력?
		//찾는거 index
		System.out.println("Ko~ " + msg1.indexOf("Ko")); //11
		System.out.println("!!! " + msg1.indexOf("!!!")); //16
		System.out.println("Korea : " + msg1.substring(msg1.indexOf("Ko"),msg1.indexOf("!!!")));
		
		//문장을 입력받아
		//찾고자 하는 문자열을 입력 받아 몇번째에 있다
		//몇개있다
		//몇개의 첫번째 - 몇번지 두번째 - 몇번지...
		//string.length (배열의 길이) 사용 //charAT 사용
		
	}
}
