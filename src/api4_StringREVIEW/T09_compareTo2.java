package api4_StringREVIEW;

import java.util.Objects;

public class T09_compareTo2 { //문자 비교 메소드
	public static void main(String[] args) {
		
		String str = "Seoul";
		str += "/Busan";
		str += "/Chungju";
		
		System.out.println("str : " +str);
		System.out.println();
		
		String a = "Seoul";
		String b = "seoul";
		String c = a + b; //c = Seoulseoul
		System.out.println("c : " + c);
		System.out.println();
		
		//compareTo() : 문자열 비교 메소드(0:동일자료, 음수:앞의 문자열이 뒤의 문자열보다 작을 때, 양수 :앞의 문자열이 뒤의 문자열보다 클 때
		//a,b,c 비교
		System.out.println(a.compareTo(b)); //0 같다 //대소문자 차이 //소문자 s -32
		System.out.println(a.compareTo(c)); //-5 a가 c보다 문자열이 5개 적다?
		System.out.println(c.compareTo(a)); //5 c가 a보다 문자열이 5개 많다?
		System.out.println();
		
		//공백 비교 : equals(), isBlank(), isEmpty()
		System.out.println("1.c가 공백? " + c.equals("")); //false
		System.out.println("2.c가 공백? " + c.equals(" ")); //false
		System.out.println("3.c가 공백? " + c.isBlank()); //false
		System.out.println("4.c가 공백? " + c.isEmpty()); //false
		System.out.println();
		
		String d = ""; 
		System.out.println("11.d가 공백? " + d.equals("")); //true //똑같이 비교
		System.out.println("12.d가 공백? " + d.equals(" ")); //false
		System.out.println("13.d가 공백? " + d.isBlank()); //true //블랭크 맞음
		System.out.println("14.d가 공백? " + d.isEmpty()); //true //엠티 맞음
		System.out.println("15.d가 공백? " + Objects.isNull(d)); //false
		
		
	}
}
