package api8_DateREVIEW;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

//날짜 비교
public class T4_Compare_2 {
	public static void main(String[] args) {
		//날짜 시간 비교
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("현재 날짜, 시간 : " + currentDateTime); //나노초까지 비교
		System.out.println();
		
		//나노초 자르기
		String tempToday = currentDateTime.toString();
		String strToday = tempToday.substring(0,tempToday.indexOf("."));
		//.substring (start, end) end : tempToday의 .전까지 : indexOf
		System.out.println("현재 날짜, 시간 : " + strToday);
		
		//날짜와 시간 구분하기 split("T")
		String strDate = strToday.split("T")[0];
		String strTime = strToday.split("T")[1];
		System.out.println("현재 날짜 : " + strDate);
		System.out.println("현재 시간 : " + strTime);
		System.out.println("=======================================");
		
		//비교할 날짜, 시간
		LocalDateTime targetDT = LocalDateTime.of(2024, 10, 29, 10, 30, 01);
		System.out.println("타겟(비교) 날짜, 시간 : " + targetDT);
		System.out.println();
		
		//나노초 자르기
		String strTarget = targetDT.toString(); //비교 날짜 시간에는 나노초 안 나옴
		System.out.println("타겟(비교) 날짜, 시간 / 나노초 자름 : " + strTarget);
		
		//날짜와 시간 구분하기 spilit("T")
		String targetDate = strTarget.split("T")[0];
		String targetTime = strTarget.split("T")[1];
		System.out.println("타겟 날짜 : " + targetDate);
		System.out.println("타겟 시간 : " + targetTime);
		
		if(strDate.equals(targetDate)) System.out.println("같은 날");
		else System.out.println("다른 날");
		
		//날짜를 날짜 형식 그대로 비교 // isEqual(), isBefore(), isAfter()
		System.out.println("is Equal() : " + currentDateTime.isEqual(targetDT));
		System.out.println("is Before() : " + currentDateTime.isBefore(targetDT));
		System.out.println("is After() : " + currentDateTime.isAfter(targetDT));
		
		//날짜 차이 계산 : Period 클래스
		LocalDate startDate = LocalDate.now();
		LocalDate targetDate1 = LocalDate.of(2024, 10, 29);
		Period period = Period.between(startDate, targetDate1);
		System.out.println(period.getYears()); //0
		System.out.println(period.getMonths()); //7
		System.out.println(period.getDays()); //12

		//해당 월의 마지막날 찾기 .atEndOfMonth();
		String lastDay = "2024-03-14";
		System.out.println(lastDay + "달의 마지막 일자 : " + YearMonth.from(LocalDate.parse(lastDay, DateTimeFormatter.ofPattern("yyyy-MM-dd"))).atEndOfMonth());
		
		String lastDay2 = "2024-2-1";
		System.out.println(lastDay2 + "달의 마지막 일자 : " + YearMonth.from(LocalDate.parse(lastDay2, DateTimeFormatter.ofPattern("yyyy-M-d"))).atEndOfMonth());
		
		System.out.println();
		System.out.println("복습 완료 :)");
	}
}
