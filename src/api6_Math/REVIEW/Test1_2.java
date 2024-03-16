package api6_Math.REVIEW;

public class Test1_2 {
	//절대값, 반올림(소수 첫째자리, 소수 둘째자리, 소수 셋째자리, 소수 넷째자리), 올림, 버림, 최대값, 최소값, 난수)
	public static void main(String[] args) {
		
		//절대값 : Math.abs() 부호 없이 무조건 양수 
		int su1 = 100;
		int su2 = -100;
		
		System.out.println("su1 : " + su1); //100
		System.out.println("su2 : " + su2); //-100
		System.out.println("Math.abs(su1) : " + Math.abs(su1)); //100
		System.out.println("Math.abs(su2) : " + Math.abs(su2)); //100
		System.out.println();
		
		//반올림 : Math.round() : 소수점 첫번째 자리에서 반올림하여 무조건 정수로 표현
		double d1 = 1234.5678;
		double d2 = -1234.5678;
		double d3 = 123.45678;
		double d4 = -123.45678;
		
		System.out.println("d1 : " + d1); //1234.5678
		System.out.println("d2 : " + d2); //-1234.5678
		System.out.println("d3 : " + d3); //123.45678
		System.out.println("d4 : " + d4); //-123.45678
		System.out.println("Math.round(d1) : " +Math.round(d1)); //12345
		System.out.println("Math.round(d2) : " +Math.round(d2)); //-12345
		System.out.println("Math.round(d3) : " +Math.round(d3)); //123
		System.out.println("Math.round(d4) : " +Math.round(d4)); //-123
		System.out.println();
		
		//소수점 두번째 자리에서 반올림 : (Math.round(d1*10)/10.0)
		System.out.println("Math.round(d1) : " +Math.round(d1*10)/10.0); //1234.6
		System.out.println("Math.round(d3) : " +Math.round(d3*10)/10.0); //123.5
		System.out.println();
		
		//소수점 세번째 자리에서 반올림 : (Math.round(d1*100)/100.0)
		System.out.println("Math.round(d1) : " +Math.round(d1*100)/100.0); //1234.57
		System.out.println("Math.round(d3) : " +Math.round(d3*100)/100.0); //123.46
		System.out.println();
		
		//소수점 네번째 자리에서 반올림 : (Math.round(d1*1000)/1000.0)
		System.out.println("Math.round(d1) : " +Math.round(d1*1000)/1000.0); //1234.568
		System.out.println("Math.round(d3) : " +Math.round(d3*1000)/1000.0); //123.457
		System.out.println();
		
		//String.format("%.0f", 실수값) = Math.round(); :: 소수점 첫번째 자리에서 반올림하여 무조건 정수로 표현
		System.out.println("String.format(%.0f, d1)" + String.format("%.0f", d1)); //1235
		System.out.println("Math.round(d1) : " +Math.round(d1)); //12345
		System.out.println("String.format(%.0f, d3)" + String.format("%.0f", d3)); //123
		System.out.println("Math.round(d3) : " +Math.round(d3)); //12345
		System.out.println();
		
		//String.format("%.1f", 실수값) = Math.round(*10)/10; :: 소수점 두번째 자리에서 반올림하여 무조건 정수로 표현
		System.out.println("String.format(%.1f, d1)" + String.format("%.1f", d1)); //1234.6
		System.out.println("Math.round(d1) : " +Math.round(d1*10)/10.0); //1234.6
		System.out.println("String.format(%.1f, d3)" + String.format("%.1f", d3)); //123.5
		System.out.println("Math.round(d3) : " +Math.round(d3*10)/10.0); //123.5
		System.out.println();
		
		//String.format("%.2f", 실수값) = Math.round(*100)/100; :: 소수점 세번째 자리에서 반올림하여 무조건 정수로 표현
		System.out.println("String.format(%.2f, d1)" + String.format("%.2f", d1)); //1234.57
		System.out.println("Math.round(d1) : " +Math.round(d1*100)/100.0); //1234.57
		System.out.println("String.format(%.2f, d3)" + String.format("%.2f", d3)); //123.46
		System.out.println("Math.round(d3) : " +Math.round(d3*100)/100.0); //123.46
		System.out.println();
		
		//String.format("%.3f", 실수값) = Math.round(*1000)/1000; :: 소수점 네번째 자리에서 반올림하여 무조건 정수로 표현
		System.out.println("String.format(%.3f, d1)" + String.format("%.3f", d1)); //1234.568
		System.out.println("Math.round(d1) : " +Math.round(d1*1000)/1000.0); //1234.568
		System.out.println("String.format(%.3f, d3)" + String.format("%.3f", d3)); //123.457
		System.out.println("Math.round(d3) : " +Math.round(d3*1000)/1000.0); //123.457
		System.out.println();
		
		//올림 : Math.ceil() :소수점 무조건 올림하여 실수로 표현
		System.out.println(Math.ceil(d1)); //.0 실수 //1235.0
		System.out.println(Math.ceil(d3)); //.0 실수 //124.0
		System.out.println(Math.ceil(d1*10)/10); //소수점 이하 첫째자리 //1234.6
		System.out.println(Math.ceil(d3*10)/10); //소수점 이하 첫째자리 //123.5
		System.out.println(Math.ceil(d1*100)/100); //소수점 이하 둘째자리 //1234.57
		System.out.println(Math.ceil(d3*100)/100); //소수점 이하 둘째자리 //123.46
		System.out.println(Math.ceil(d1*1000)/1000); //소수점 이하 셋째자리 //1234.568
		System.out.println(Math.ceil(d3*1000)/1000); //소수점 이하 셋째자리 //123.457
		System.out.println();
		
		//버림 : Math.floor() : 소수점 무조건 버림하여 실수로 표현
		System.out.println(Math.floor(d1)); //.0 실수 //1234.0
		System.out.println(Math.floor(d3)); //.0 실수 //123.0
		System.out.println(Math.floor(d1*10)/10); //소수점 이하 첫째자리 //1234.5
		System.out.println(Math.floor(d3*10)/10); //소수점 이하 첫째자리 //123.4
		System.out.println(Math.floor(d1*100)/100); //소수점 이하 둘째자리 //1234.56
		System.out.println(Math.floor(d3*100)/100); //소수점 이하 둘째자리 //123.45
		System.out.println(Math.floor(d1*1000)/1000); //소수점 이하 셋째자리 //1234.567
		System.out.println(Math.floor(d3*1000)/1000); //소수점 이하 셋째자리 //123.456
		System.out.println();
		
		//최대값 : max(), 최소값 : min() //두개만 비교 가능
		System.out.println(Math.max(d1, d3)); //1234.5678
		System.out.println(Math.min(d1, d3)); //123.45678
		System.out.println();
		
		//난수 : Math.rand() : 0에서 1미만 실수형 난수
		//((int)(Math.random()*(끝+1-시작))+시작))
		System.out.println(Math.random());
		System.out.println((int)Math.random()); //0
		System.out.println((int)(Math.random()*10)+1); //1~10까지의 난수
		System.out.println((int)(Math.random()*100)+1); //1~100까지의 난수
		System.out.println((int)(Math.random()*(10+1-5))+5); //5~10까지의 난수
		//((int)(Math.random()*(숫자의 갯수(마지막숫자+1-시작숫자), 마지막 범위의 숫자))+:시작 숫자)
		System.out.println((int)(Math.random()*(30+1-20))+20); //20~30까지의 난수
		System.out.println();
		System.out.println("복습 완료 :)");
	}
}