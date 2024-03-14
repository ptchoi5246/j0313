package api8_Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
//T2 업그레이드 버젼
public class T3_LocalDate {
	public static void main(String[] args) {
		//LocalDate 객체
		LocalDate currentDate = LocalDate.now(); //날짜 java.time //오류 - 객체생성 불가 :: 클래스명으로 불러야 한다. static 멤버
		System.out.println("자동 오늘 날짜 : " + currentDate);

		//날짜 지정 세팅
		currentDate = LocalDate.of(2024, 12, 25);
		System.out.println("지정한 오늘 날짜 : " + currentDate);
		
		//시스템의 현재 시간 정보 가져오기
		LocalTime currentTime = LocalTime.now();
		System.out.println("자동 현재 시간 : " + currentTime);
		System.out.println("자동 현재 시간 : " + currentTime.toString().substring(0,8)); //현지 시간을 뒤에 초 빼고 뽑으려면 시간을 String 타입 변환 - .substring으로 뽑아내기
		
		//시간 지정 세팅
		LocalTime targetTime = LocalTime.of(12, 50, 30);
		System.out.println("설정 시간 : " + targetTime);
		
		//날짜 시간
		LocalDateTime currentTime2 = LocalDateTime.now();
		System.out.println("오늘 날짜 시간 : " + currentTime2);
		
		//currentTime2에서 날짜 시간 따로 출력
		String[] strToday = currentTime2.toString().split("T");
		System.out.println("오늘 날짜 : " + strToday[0]);
		System.out.println("현재 시간 : " + strToday[1].substring(0,8));
		
//		System.out.println("오늘 날짜 : " + currentTime2.toString().substring(0,10));
//		System.out.println("현재 시간 : " + currentTime2.toString().substring(11,19));
		
		//날짜/시간 지정 셋팅
		LocalDateTime targetDateTime = LocalDateTime.of(2024, 3, 14, 13, 5, 10);
		System.out.println("설정 날짜/시간 : " + targetDateTime);
		System.out.println();
		
		//날짜 연산하기 //잘 봐두기
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd a HH:mm:ss");
		System.out.println("현재 날짜 시간 : " + now.format(dtf));
				
		LocalDateTime res = now.plusYears(1);
		System.out.println("1년 더하기 : " + res.toString().substring(0,4) +"년"); //날짜 설정해서 날짜 연산하기
		
		res = now.minusYears(1);
		System.out.println("1년 빼기 : " + res.toString().substring(5,7) +"년"); //날짜 설정해서 날짜 연산하기
		
		res = now.plusMonths(2);
		System.out.println("2달 더하기 : " + res.toString().substring(5,7) + "월"); //날짜 설정해서 날짜 연산하기
		
		res = now.minusMonths(2);
		System.out.println("2달 빼기 : " + res.toString().substring(5,7) + "월"); //날짜 설정해서 날짜 연산하기
		
		res = now.plusDays(7);
		System.out.println("7일 더하기 : " + res.toString().substring(8,10) + "일"); //날짜 설정해서 날짜 연산하기
		
		res = now.minusDays(7);
		System.out.println("7일 빼기 : " + res.toString().substring(8,10) + "일"); //날짜 설정해서 날짜 연산하기
		System.out.println();
		//날짜 계산, 날짜 비교 연습하기
	}
}
