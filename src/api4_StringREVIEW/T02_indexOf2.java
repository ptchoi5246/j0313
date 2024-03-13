package api4_StringREVIEW;

public class T02_indexOf2 {
	//특정 문자(열)이 앞에서부터 처음 발견되는 인덱스를 반환하며 만약 찾지 못 했을 경우 '-1'을 반환
	//!!!!!굉장히 중요하다!!!!!
	public static void main(String[] args) {
		//                       1         2      
		//             012345678901234567890
		String msg1 = "I am doing homework";
		String msg2 = "내가 그린 기린 그림은 네가 그린 그림";
		
		System.out.println("1.msg1에 'I' 문자가 있는가? " + msg1.indexOf("I")); //0
		System.out.println("2.msg1에 'm' 문자가 있는가? " + msg1.indexOf("m")); //3
		System.out.println("3.msg1에 'do' 문자가 있는가? " + msg1.indexOf("do")); //5
		System.out.println("4.msg1에 'Home' 문자가 있는가? " + msg1.indexOf("Home")); //-1
		System.out.println("5.msg2에 '그림' 문자가 있는가? " + msg2.indexOf("그림")); // 9
		 
		System.out.println("6.msg1에 'm' 문자가 있는가? " + msg1.lastIndexOf("m")); //13
		//뒤에서부터 찾는데 인덱스 위치값은 앞에서부터의 위치 작성
		System.out.println("복습 완료 :)");
	}
}
