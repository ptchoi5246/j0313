package api8_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class T5 {
	public static void main(String[] args) throws ParseException {
		
		String strDate1 = "2024-03-14";
		String strDate2 = "2024-03-13";
		
		//if(strDate1 > strDate2) {	System.out.println("비교 불가");}
		
		Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(strDate1); //문자형식의 날짜를 날짜형식으로 파싱
		Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(strDate2); //문자형식의 날짜를 날짜형식으로 파싱 //날짜 형식으 비교
		
		if(date1.getTime() > date2.getTime()) {	System.out.println("strDate1이 더 크다");}
		else System.out.println("strDate2가 더 크다");
		
		long res1 = (date1.getTime() - date2.getTime()) / 1000; //초
		long res2 = (date1.getTime() - date2.getTime()) / 1000 / 60; //분
		//long res2 = (date1.getTime() - date2.getTime()) / (1000 * 60); //분
		long res3 = (date1.getTime() - date2.getTime()) / 1000 / 60 / 60; //시
		//long res3 = (date1.getTime() - date2.getTime()) / (1000 * 60 * 60); //시
		long res4 = (date1.getTime() - date2.getTime()) / 1000 / 60 / 60 / 24; //일
		//long res4 = (date1.getTime() - date2.getTime()) / (1000 * 60 * 60 * 24); //일
		
		System.out.println("res1 : " + res1 + "초"); //밀리세컨드
		System.out.println("res2 : " + res2 + "분");
		System.out.println("res3 : " + res3 + "시간");
		System.out.println("res4 : " + res4 + "일");
		
		
	}
}
