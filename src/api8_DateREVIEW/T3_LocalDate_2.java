package api8_DateREVIEW;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//T2 업그레이드 버젼
public class T3_LocalDate_2 {
	//LocalDate :날짜 LocalTime :시간 LocalDateTime :날짜 시간
	public static void main(String[] args) {
		
		//시스템의 현재 날짜 정보 가져오기 LocalDate.now();
		LocalDate currentDate = LocalDate.now();
		System.out.println("자동 오늘 날짜 : " + currentDate);
		System.out.println();
		
		//날짜 지정 세팅 LocalDate.of(년도, 월, 일);
		LocalDate targetDate = LocalDate.of(2024, 10, 29);
		System.out.println("지정한 날짜 : " + targetDate);
		System.out.println();
		
		//시스템의 현재 시간 정보 가져오기 //LocalTime.now();
		LocalTime currentTime = LocalTime.now();
		System.out.println("자동 현재 시간 : " + currentTime);
		//초 뒤에 엄청 세세하게 나온다.
		System.out.println("자동 현재 시간 : " + currentTime.toString().substring(0, 8));
		//초 뒤에 엄청 세세하게 나온거 제외하고 시간, 분, 초만 발췌
		System.out.println();
		
		//시간 지정 세팅 LocalTime.of(시, 분, 초);
		LocalTime targetTime = LocalTime.of(10, 30, 01);
		System.out.println("지정한 시간 : " + targetTime);
		System.out.println();
		
		//시스템 현재 날짜 시간
		LocalDateTime currentDT = LocalDateTime.now();
		System.out.println("자동 현재 날짜, 시간 : " + currentDT);
		System.out.println();
		
		//currentDT에서 날짜, 시간 따로 출력 (split("나눌 기준") : 배열에 저장하여 리턴) 사용
		String[] strToday = currentDT.toString().split("T");
		System.out.println("자동 현재 날짜 : " + strToday[0]);
		System.out.println("자동 현재 시간 : " + strToday[1].substring(0,8));
		
		System.out.println("자동 현재 날짜 : " + currentDT.toString().substring(0,10));
		System.out.println("자동 현재 시간 : " + currentDT.toString().substring(11,19));
		System.out.println();
		
		//날짜 시간 지정 세팅
		LocalDateTime targetDT = LocalDateTime.of(2024, 10,29,10,30,01);
		System.out.println("지정 날짜 시간 : " + targetDT);
		System.out.println();
		
		//targetDT에서 날짜, 시간 따로 출력
		String[] strTarget = targetDT.toString().split("T");
		System.out.println("지정 날짜 : " + strTarget[0]);
		System.out.println("지정 시간 : " + strTarget[1]);
		
		System.out.println("지정 날짜 : " + targetDT.toString().substring(0,10));
		System.out.println("지정 시간 : " + targetDT.toString().substring(11,19));
		System.out.println();
		
		//날짜 연산하기
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd a HH:mm:ss");
		System.out.println("현재 날짜 시간 : " + now.format(dtf));
		
		LocalDateTime res = now.plusYears(1);
		System.out.println("1년 더하기 : " + res.toString().substring(0,10));
		
		res = now.minusYears(1);
		System.out.println("1년 빼기 : " + res.toString().substring(0,10));
		
		res = now.plusMonths(3);
		System.out.println("3달 더하기 : " + res.toString().substring(0,10));
		
		res = now.minusMonths(3);
		System.out.println("3달 빼기 : " + res.toString().substring(0,10));
				
		res = now.plusDays(15);
		System.out.println("15일 더하기 : " + res.toString().substring(0,10));
		
		res = now.minusDays(15);
		System.out.println("15일 빼기 : " + res.toString().substring(0,10));
		System.out.println();
		System.out.println("복습 끝");
	}
}
