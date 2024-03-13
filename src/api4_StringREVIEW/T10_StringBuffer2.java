package api4_StringREVIEW;

/*
 => mutable(가변) / immutable(불가변)
 String 객체 : immutable객체로서 class로서 한번 크기가 생성된 값을 그 값을 유지하게 된다. 짧은 문자열 처리에 적합
 StrinBuffer(문자 저장) 객체 : mutable 객체로서 크기를 변경할 수 있다. 동기화를 제공 (마트 카운터 1개), 가장 안정적, 멀티스레드를 제공/적절. 가변길이 문자열에 적당
 StringBuilder 객체 : mutable 객체로서 크기를 변경할 수 있다. 동기화 여부가 불분명 (마트 카운터 여러개). 가변길이 문자열에 적당
 TSS (시분할방식) CPU가 시간을 쪼개서 쪼개서 진행 / 우선순위가 높으면 시간을 조금 더 제공한다 / ex) 이세돌 VS 제자9명 바둑
 성능 : StringBuilder > StrinBuffer >>> String / 시간은 반대
 */
public class T10_StringBuffer2 {
	public static void main(String[] args) {
		
		String str = new String("홍길동");
		System.out.println("1.str : " + str); //불가변 immutable. 문자열이 고정
		
		str += "/홍길동2";
		System.out.println("2.str : " + str);
		
		//capacity() : 현재 버퍼의 크기(용량)를 알아낸다.
		//str.capacity();
		
		//StringBuffer() 객체 : 가변 길이 클래스로서 기본크기는 16, 자료가 넘치면 상황에 따라서 크기를 변경처리한다.
		//append : 값을 추가, insert : 값을 삽입 , delete : 특정 위치의 값을 지정한 개수만큼 삭제처리, replace : 치환
		StringBuffer str2 = new StringBuffer();
		System.out.println("3.str2버퍼크기 :" + str2.capacity());
		str2.append("atom");
		System.out.println("4.str2 :" + str2);
		System.out.println("5.str2버퍼크기 :" + str2.capacity());
		
		str2.append("0123456789012345");
		System.out.println("6.str2 :" + str2);
		System.out.println("7.str2버퍼크기 :" + str2.capacity()); //34
		
		str2.insert(2, "abcedfg"); //2번지 위치에 추가해서 삽입 출력
		System.out.println("8.str2 :" + str2);
		System.out.println("9.str2버퍼크기 :" + str2.capacity()); //34

		str2.delete(5, 20); //5번째부터 20개 지우기
		System.out.println("10.str2 :" + str2);
		System.out.println("11.str2버퍼크기 :" + str2.capacity()); //34
		
		
		
	}
}
