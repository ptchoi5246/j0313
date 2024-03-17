package api8_DateREVIEW;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class T4_DateCompare_2 {
	public static void main(String[] args) {
		LocalDateTime startDateTime = LocalDateTime.now();
		LocalDateTime endDateTime1 = LocalDateTime.of(2018, 03, 24, 0, 0, 0);
		LocalDateTime endDateTime2 = LocalDateTime.of(2023, 10, 29, 0, 0, 0);
		
		
		//startDateTime > endDateTime 음수 / startDateTime < endDateTime 양수
		//만난지, 결혼한지 ~가 지났다 : endDateTime.until(startDateTime, ChronoUnit.YEARS,MONTHS,DAYS)
		//다가올 디데이 확인 : startDateTime.until(endDateTime,ChronoUnit.YEARS,MONTHS,DAYS)
		System.out.println("우리가 만난지 " +endDateTime1.until(startDateTime, ChronoUnit.DAYS)+ "일이 지났다.");
		System.out.println("우리가 결혼한지 " +endDateTime2.until(startDateTime, ChronoUnit.DAYS) +"일이 지났다.");
		System.out.println("우리가 만난지 " +endDateTime1.until(startDateTime, ChronoUnit.WEEKS)+ "주가 지났다.");
		System.out.println("우리가 결혼한지 " +endDateTime2.until(startDateTime, ChronoUnit.WEEKS) +"주가 지났다.");
		System.out.println("우리가 만난지 " +endDateTime1.until(startDateTime, ChronoUnit.MONTHS)+ "달이 지났다.");
		System.out.println("우리가 결혼한지 " +endDateTime2.until(startDateTime, ChronoUnit.MONTHS) +"달이 지났다.");
		System.out.println("우리가 만난지 " +endDateTime1.until(startDateTime, ChronoUnit.YEARS)+ "년이 지났다.");
		System.out.println("우리가 결혼한지 " +endDateTime2.until(startDateTime, ChronoUnit.YEARS) +"년이 지났다.");
		System.out.println();
		System.out.println("복습 완료");
	}
}
