package api8_Date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class T1_Date {
	//날짜 //필수!!! 잘해야 된다!!!
	public static void main(String[] args) {
		//Date 객체 java.util 무조건!!!!!
		Date now = new Date();
		System.out.println("1.오늘의 날짜(기본형식) : " + now); //요일 월 일 시간 표준시간기준 년
		
		//날짜 객체를 문자로 변환 : toString()
		String strNow = now.toString();
		System.out.println("2.오늘의 날짜(문자형식) : " + strNow); //요일 월 일 시간 표준시간기준 년
		System.out.println();
		
		//날짜 형식을 사용자 지정에 따라서 변경 : SimpleDateFormat()
		//매개변수 : 년도(yy, yyyy - 대소문자 구별), 월(M - 무조건 대문자), 일(d - 대소문자 구별), 시간(h, H-24시간), 분(m - 소문자 : 월과 중복, 무조건 소문자), 초(s) //외우기
		SimpleDateFormat sdf = new SimpleDateFormat(); //SimpleDateFormat : java.text
		//기본 날짜 형식이 마음에 안 들어서 SimpleDateForma 사용
		String strNow1 = sdf.format(now); //sdf. ctrl space 확인 메모
		System.out.println("기본 날짜 시간 포맷 (SimpleDateFormat) : " + strNow1); //년. 월. 일 시간:분
		
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		strNow1 = sdf.format(now);
		System.out.println("사용자정의 날짜 시간 포맷 (yyyy-MM-dd) : " + strNow1); 
		
		sdf = new SimpleDateFormat("MM/dd/yyyy");
		strNow1 = sdf.format(now);
		System.out.println("사용자정의 날짜 시간 포맷 (MM/dd/yyyy) : " + strNow1); 
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		strNow1 = sdf.format(now);
		System.out.println("사용자정의 날짜 시간 포맷 (yyyy년 MM월 dd일) : " + strNow1); 
		
		sdf = new SimpleDateFormat("yy년 M월 d일");
		strNow1 = sdf.format(now);
		System.out.println("사용자정의 날짜 시간 포맷 (yy년 M월 d일) : " + strNow1); 
		System.out.println();
		//날짜 포맷 타입 확인하기
		//연습 많이 하기
		
		//시간
		sdf = new SimpleDateFormat("hh:mm:ss");
		strNow1 = sdf.format(now);
		System.out.println("사용자정의 날짜 시간 포맷 (hh:mm:ss) : " + strNow1); 
		
		sdf = new SimpleDateFormat("h:m:s");
		strNow1 = sdf.format(now);
		System.out.println("사용자정의 날짜 시간 포맷 (h:m:s) : " + strNow1); 
		
		sdf = new SimpleDateFormat("HH:m:s");
		strNow1 = sdf.format(now);
		System.out.println("사용자정의 날짜 시간 포맷 (HH:m:s) : " + strNow1); //HH 24시간
		
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		strNow1 = sdf.format(now);
		System.out.println("사용자정의 날짜 시간 포맷 (yyyy-MM-dd HH:mm:ss) : " + strNow1);
		//이 형식을 제대로 맞추고 날짜, 시간 뽑아내기 .substring(start,end) //MM dd 때문에 애먹는다.
		System.out.println("오늘 날짜 : " + strNow1.substring(0,10)); 
		
		sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		strNow1 = sdf.format(now);
		System.out.println("사용자정의 날짜 시간 포맷 (yyyy-MM-dd HH:m:s) : " + strNow1);
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		strNow1 = sdf.format(now);
		System.out.println("사용자정의 날짜 시간 포맷 (yyyy년 MM월 dd일 HH시 mm분 ss초) : " + strNow1);
		System.out.println();
		
		sdf = new SimpleDateFormat("오늘은 E요일");
		System.out.println(sdf.format(now)); // System.out.println(strNow); 같다..
		
		sdf = new SimpleDateFormat("오늘은 올해의 D번째 날"); //D : 1월 1일부터 계산
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("오늘은 이번달의 d번째 날"); //d : 월의 1일부터 계산
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss", Locale.ENGLISH);
		System.out.println(sdf.format(now));
		
		//date, simpledateformat, format 한쌍이다.
	}
}
