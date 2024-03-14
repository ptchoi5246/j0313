package api4_StringREVIEW;

public class T07_split2 {
	public static void main(String[] args) {
		//String[] split(String regex) : 입력 받은 정규 표현식 또는 특정 문자를 기준으로 문자열을 나누어 배열에 저장하여 리턴
		
		String tel = "010-1234-5678";
		
		//앞의 전화번호를 '-'으로 분리시킨 후 배열로 저장시켜준다.
		String[] telArr = tel.split("-");
		System.out.println(telArr[0]); //010
		System.out.println(telArr[1]); //1234
		System.out.println(telArr[2]); //5678
		System.out.println();
		
		//향상된 for : for(자료형 변수명 : 배열명 {문장}
		String telTemp = "";
		for(String t : telArr ) {
			telTemp += t + "/"; //누적
		}
		
		System.out.println(telTemp);
		System.out.println(telTemp.substring(0, telTemp.length()-1)); //마지막 / 빼고 출력 외우기!
		System.out.println();
		
		String[] title = {"지역번호", "국번호", "전화번호"};
		for(int i=0; i<telArr.length; i++) {
			System.out.println(title[i] + " : " + telArr[i]);
		}
		System.out.println();
		
		// 각 이름의 구분좌를 '/'로 통일해서 출력하시오
		String names = "홍길동/이기자&김말숙:오하늘;소나무 고인돌";
		System.out.println(names);
		
		String[] nameArr = names.split("/|&|:|;| ");     //split - 배열로 받아야한다.
		
		//방법 1
		String nameTemp = "";
		for(String name : nameArr) {
			nameTemp += name + "/";
			
		}
		System.out.println("성명 : " + nameTemp.substring(0, nameTemp.length()-1));
		//이름 제일 마지막 / 제외 출력
		
		//방법 2 : join() 배열에 분리 저장되어 있는 항목들을 특정 문제로 결합시켜준다.
		String nameJoin = String.join("/", nameArr);
		System.out.println("성명 : " + nameJoin);
 	}
}
//방법2 이해 불가
