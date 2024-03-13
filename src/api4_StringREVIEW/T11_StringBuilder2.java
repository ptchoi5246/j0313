package api4_StringREVIEW;

public class T11_StringBuilder2 {
	public static void main(String[] args) {
		
		String res = new StringBuffer()
				.append("Seoul")
				.append("/Busan")
				.append("/ChungJu")
				.append("/Jeju")
				.toString(); //체인기법
		System.out.println("res : " + res);
		System.out.println();
		
		StringBuilder str2 = new StringBuilder();
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
		
		str2.replace(2, 5, "!!!!!!!!!!"); //2번지부터 5번지 앞까지 !!!로 바꿔라
		System.out.println("10.str2 :" + str2);
		System.out.println("11.str2버퍼크기 :" + str2.capacity()); //34

		str2.delete(5, 20); //5번째부터 20개 지우기
		System.out.println("12.str2 :" + str2);
		System.out.println("13.str2버퍼크기 :" + str2.capacity()); //34
		
		
	}
}
