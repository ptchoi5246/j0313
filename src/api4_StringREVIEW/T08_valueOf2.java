package api4_StringREVIEW;

import java.util.HashMap;

public class T08_valueOf2 { //toString과 마찬가지로 형변환
	public static void main(String[] args) {
	//String.valueOf() : ~~자료형들을 '문자열'로 변환한다.
	//valueOf() : ()안의 객체를 String 객체로 형변환	
	
//	int intSu = 1234;
//	double dblSu = 1234.0;
	Integer intSu = 1234; //일반 타입 - > 객체 타입 변화 :: boxing
	Double dblSu = 1234.0;
	String strSu = "1234";
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	System.out.println(strSu);
	System.out.println(strSu.getClass().getName()); //.getClass = 객체만 관리 기본타입 - 에러
	System.out.println(intSu.getClass().getName());
	System.out.println(dblSu.getClass().getName());
	System.out.println(map.getClass().getName());
	System.out.println();
	
	int intSu2 = 1234;
	System.out.println("1. intSu + 100 = " + (intSu + 100));
	// String strSu2 = (String) intSu2;   // X
	// String strSu2 = intSu2.toString(); // X
	String strSu2 = intSu + "";   // O
	strSu2 = intSu2 + "";         // O
	
	String strSu3 = String.valueOf(intSu2); //.vauleOf() 강제 타입 변환 //가끔 나온다
	System.out.println(strSu3.getClass().getName());

	double dblSu4 = 3.14;
	String strSu4 = String.valueOf(dblSu4); //.vauleOf() 강제 타입 변환
	System.out.println(strSu4.getClass().getName());
	System.out.println();
	
	int a1 = 100, a2  = 200;
	int res = a1 + a2;
	System.out.println(res);
	
	String str5 = String.valueOf(a1) + String.valueOf(a2); //int a1 = 100 -> String a1 = "100" 
	System.out.println(str5); //100200
	
	// int res6 = (int) String.valueOf(a1) + String.valueOf(a2);
	int res6 = Integer.parseInt(String.valueOf(a1))  + Integer.parseInt(String.valueOf(a2)); //String을 Integer 형변환
	System.out.println("res6 : " + res6); //300
	}
}
