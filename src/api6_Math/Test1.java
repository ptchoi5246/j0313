package api6_Math;

public class Test1 {
	//절대값, 반올림(소수 첫째자리, 소수 둘째자리, 소수 셋째자리, 소수 넷째자리), 올림, 버림, 최대값, 최소값, 난수)
	public static void main(String[] args) {
		
		int su1 = 100;
		int su2 = -100;
		
		//절대값 : Math. abs()
		System.out.println("su1 : " + su1); //100
		System.out.println("su2 : " + su2); //-100
		System.out.println("Math.abs(su1) : " + Math.abs(su1)); //100
		System.out.println("Math.abs(su2) : " + Math.abs(su2)); //100 절대값 출력
		System.out.println();
		
		double d1 = 1234.5678;
		double d2 = -1234.5678;
		
		//반올림 : Math.round() - 무조건 정수형 반올림(소수점 이하 첫째 자리에서 반올림 후 정수로 표시)
		//소수 첫째자리에서의 반올림 :: 숫자 +0.5 - Math.round() = 정수형 반올림
		//1234.567 +0.5 = (int)1235.067 = 1235  //Math.round()
		System.out.println("d1 : " + d1); //1234.567
		System.out.println("d2 : " + d2); //-1234.567
		System.out.println("Math.round(d1) : " + Math.round(d1)); //1235 //소수 이하 첫째 자리에서 반올림
		System.out.println("Math.round(d2) : " + Math.round(d2)); //-1235 //부호를 제외하고 반올림 된 값에 - 붙여주기
		System.out.println();
		
		//소수 둘째자리에서의 반올림 :: 숫자 +0.05 
		//1234.567 +0.05 = 1234.617 *10 = (int)12346.17 = 12346 /10 = 1234.6
		System.out.println(Math.round(d1*10) /10.0); //정수형 출력을 위해 10.0 나누기
		
		//소수 셋째자리에서의 반올림 :: 숫자 +0.005
		//1234.567 +0.005 = 1234.572 *100 = (int)123457.2 = 123457 /100 = 1234.57
		System.out.println(Math.round(d1*100) /100.0); 
		//소수 넷째자리에서의 반올림
		System.out.println(Math.round(d1*1000) /1000.0);
		System.out.println();
		
		//String.format("%.nf",실수값) = Math.round() 출력값 같다.
		System.out.println(String.format("%.0f", d1));
		System.out.println(String.format("%.1f", d1));
		System.out.println(String.format("%.2f", d1));
		System.out.println(String.format("%.3f", d1));
		System.out.println();
		
		//소수부 무조건 올림 : Math.ceil()
		System.out.println("1.ceil() : " + Math.ceil(d1)); //1235.0 : 소수 첫째자리 올림 후 실수 표현
		double d3 = 123.45;
		System.out.println("2.ceil() : " + Math.ceil(d3)); //124.0 소수 첫째자리 무조건 올림 후 실수 표현 
		//소수점 이하 둘째자리에서 무조건 올림
		System.out.println("3.ceil()*10 /10 : " + Math.ceil(d1*10) /10); //1234.6
		//소수점 이하 셋째자리에서 무조건 올림
		System.out.println("4.ceil()*100 /100 : " + Math.ceil(d1*100) /100); //1234.57
		System.out.println();
		
		//소수부 무조건 내림(버림) : Math.floor()
		System.out.println("1.ceil() : " + Math.floor(d1)); //d1 = 1234.5678; //1234.0
		double d4 = 123.65;
		System.out.println("2.ceil() : " + Math.floor(d4)); //123.0
		//소수점 이하 둘째자리에서 무조건 버림
		System.out.println("3.ceil()*10 /10 : " + Math.floor(d1*10) /10); //d1 = 1234.5678; //1234.5 //소수이하 첫째자리까지 표시
		//소수점 이하 셋째자리에서 무조건 버림
		System.out.println("4.ceil()*100 /100 : " + Math.floor(d1*100) /100); //d1 = 1234.5678; //1234.56 //소수이하 둘째자리까지 표시
		System.out.println();
		
		//최대값 : max(), 최소값 : min()
		System.out.println("5.max() : " + Math.max(d3, d4)); //두개만 비교 가능 //d3 = 123.45; d4 = 123.65; //123.65
		System.out.println("6.min() : " + Math.min(d3, d4)); //두개만 비교 가능 //d3 = 123.45; d4 = 123.65; //123.45
		//System.out.println("6.count() : " + Math.count(10,20,30)); //자바에서 갯수를 구할 때는
		//length()(문자열 또는 배열 사용), size()(객체 배열 또는 클래스 사용), sizeOf()(바이트수 계산 사용)
		
		//난수 : Math.rand() : 0에서 1미만 실수형 난수, ((int)(Math.random()*(끝+1-시작))+시작))
		System.out.println("0~1 미만의 난수 : " + Math.random());
		System.out.println("1~100까지의 난수 : " + ((int)(Math.random()*100)+1)); //0.4589651234
		System.out.println("1~10까지의 난수 : " + ((int)(Math.random()*10)+1)); //1~10
		System.out.println("5~10까지의 난수 : " + ((int)(Math.random()*(10+1-5))+5)); //5~10
		//+5를 하고 -5해주고 괄호!!!
		System.out.println("20~30까지의 난수 : " + ((int)(Math.random()*(30+1-20))+20)); //20~30
		
	}
}