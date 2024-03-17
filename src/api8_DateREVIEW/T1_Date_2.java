package api8_DateREVIEW;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class T1_Date_2 {
	//날짜 //굉장히 중요하다!!!
	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println("1.오늘의 날짜 (기본형식) : " + now);
		
		String strNow = now.toString();
		//날짜 객체를 String 객체로 변환
		System.out.println("2.오늘의 날짜 (string) : " + strNow);
		System.out.println();
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		//기본 날짜 형태 Date가 마음에 안 들어서 SimpleDateFormat 생성
		//날짜 형식을 사용자 지정에 따라서 변경 가능
		//년 yy, yyyy. 월 M, MM. 일 d, dd.
		//시 h, hh, H(24시간), HH. 분 m, mm. 초 s, ss.
		String strNow1 = sdf.format(now);
		System.out.println("기본 날짜 시간 포맷 : " + strNow1); //yy. M. d. H:m /체크해보기
		
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		//사용자 정의 날짜 시간 포맷
		strNow1 = sdf.format(now);
		System.out.println("사용자 정의 날짜 시간 포맷 (yyyy-MM-dd) : " + strNow1);
		
		sdf = new SimpleDateFormat("MM/dd/yyyy");
		strNow1 = sdf.format(now);
		System.out.println("사용자 정의 날짜 시간 포맷 (MM/dd/yyyy) : " + strNow1);
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		strNow1 = sdf.format(now);
		System.out.println("사용자 정의 날짜 시간 포맷 (yyyy년 MM월 dd일) : " + strNow1);
		
		sdf = new SimpleDateFormat("yy년 M월 d일");
		strNow1 = sdf.format(now);
		System.out.println("사용자 정의 날짜 시간 포맷 (yy년 M월 d일) : " + strNow1);
		System.out.println();
		
		//시간
		sdf = new SimpleDateFormat("hh:mm:ss");
		strNow1 = sdf.format(now);
		System.out.println("사용자 정의 날짜 시간 포맷 (hh:mm:ss) : " + strNow1);
		//h : 오전인지 오후인지 나타나지 않고 시간만 출력
		
		sdf = new SimpleDateFormat("h:m:s");
		strNow1 = sdf.format(now);
		System.out.println("사용자 정의 날짜 시간 포맷 (h:m:s) : " + strNow1);
		
		sdf = new SimpleDateFormat("HH:m:s");
		strNow1 = sdf.format(now);
		System.out.println("사용자 정의 날짜 시간 포맷 (HH:m:s) : " + strNow1);
		//H : 24시간 출력
		
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		strNow1 = sdf.format(now);
		System.out.println("사용자 정의 날짜 시간 포맷 (yyyy-MM-dd HH:mm:ss) : " + strNow1);
		System.out.println("오늘 날짜 : " + strNow1.substring(0,10));
		
		sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		strNow1 = sdf.format(now);
		System.out.println("사용자 정의 날짜 시간 포맷 (yyyy.MM.dd HH:mm:ss) : " + strNow1);
				
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일  HH시 mm분 ss초");
		strNow1 = sdf.format(now);
		System.out.println("사용자 정의 날짜 시간 포맷 (yyyy년 MM월 dd일  HH시 mm분 ss초) : " + strNow1);
		System.out.println();
		
		sdf = new SimpleDateFormat("오늘은 E요일"); //요일은 E
		strNow1 = sdf.format(now);
		System.out.println(strNow1);
		
		sdf = new SimpleDateFormat("오늘은 올해의 D번째 날"); //올해의 D번째 날
		strNow1 = sdf.format(now);
		System.out.println(strNow1);
		
		sdf = new SimpleDateFormat("오늘은 이번달의 d번째 날"); //이번달의 d번째 날
		strNow1 = sdf.format(now);
		System.out.println(strNow1);
		
		sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:sss", Locale.ENGLISH);
		//Locale import 걸기
		//ENGLISH, JAPANESE, CHINESE, FRENCH 가능
		strNow1 = sdf.format(now);
		System.out.println(strNow1);
		
		System.out.println();
		System.out.println("복습 완료 :)");
	}
}
