package api8_DateREVIEW;

import java.util.TimeZone;

public class T6_TimeZone_2 {
	public static void main(String[] args) {
		
		String[] timeZoneID = TimeZone.getAvailableIDs();
		
		for(String id : timeZoneID) {
			System.out.println(id);
		}
	}
}
