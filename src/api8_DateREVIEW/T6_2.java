package api8_DateREVIEW;

import java.util.Calendar;
import java.util.TimeZone;

//외국 시간 출력
public class T6_2 {
	public static void main(String[] args) {
		
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar cal = Calendar.getInstance(timeZone);
		
		int amPm = cal.get(Calendar.AM_PM);
		String strAmPm = "";
		if(amPm == Calendar.AM) strAmPm = "오전";
		else strAmPm = "오후";
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println("미국 로스엔젤레스 현재 시각 : " + strAmPm + " "+hour+"시 "+minute+"분 "+second+"초");
	}
}
