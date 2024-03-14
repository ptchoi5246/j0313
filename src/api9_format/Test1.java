package api9_format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Test1 {
	public static void main(String[] args) {
		//DecimalFormat() : 데이터 출력 포맷을 지정한다.
		//서식기호 - 0: 숫자를 표시(해당 자리에 숫자가 없으면 0으로 표시)
		//서식기호 - #: 숫자를 표시(의미가 없는 0(무효의 0)을 화면에 출력시켜주지 않는다. 
		
		double su = 12345.0;
		System.out.println("원본 : " + su);
		
		DecimalFormat df = new DecimalFormat();
		System.out.println("1. " + df.format(su)); //천단위마다 ,출력
		
		df = new DecimalFormat("0");
		System.out.println("2. 0 : " + df.format(su)); //정수만 출력, 소수이하 안 나옴
		
		df = new DecimalFormat("0,000");
		System.out.println("3. 0,000 : " + df.format(su)); //정수만 출력, 소수 이하 안 나옴, 천단위마다 , 출력 //작은 데이터는 앞자리 남는 부분 0으로 채움
		
		df = new DecimalFormat("#,###");
		System.out.println("4. #,### : " + df.format(su)); //정수만 출력, 소수 이하 안 나옴, 천단위마다 , 출력 //작은 데이터는 앞자리 남는 부분 출력하지 않음
		
		df = new DecimalFormat("#");
		System.out.println("5. # : " + df.format(su)); //정수만 출력, 소수 이하 안 나옴
		
		df = new DecimalFormat("#,##0");
		System.out.println("6. #,##0 : " + df.format(su)); //정수만 출력, 소수 이하 안 나옴
		
		df = new DecimalFormat("#,##0.#");
		System.out.println("7. #,##0.# : " + df.format(su)); //정수만 출력, 소수 이하 안 나옴 //마지막 0은 무조건출력
		
		df = new DecimalFormat("#,##0.0");
		System.out.println("8. #,##0.0 : " + df.format(su)); //정수만 출력, 소수 이하 안 나옴 //마지막 0은 무조건출력 //0은 자리에 숫자가 없어도 무조건 0으로 자리 채움
		//소수 이하 무조건 표시해야 된다 - .0 사용
		
		df = new DecimalFormat("@@@@@@@@@@@.0");
		System.out.println("9. @@@@@@@@@@@.0 : " + df.format(su));
		
		double su2 = 0.9576;
		df= new DecimalFormat("0.0%"); //백분율% : 숫자 *100 
		System.out.println("10. 0.0% : " + df.format(su2));
		
		//화폐단위
		df = new DecimalFormat("W#,##0");
		System.out.println("11. W#,##0 : " + df.format(su));
		
		df = new DecimalFormat("\u00A4#,##0"); //원화 유니코드 \u00A4
		System.out.println("12. \u00A4#,##0 : " + df.format(su));
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US); //달러
		nf.setMinimumFractionDigits(2);
		System.out.println("13. " + nf.format(su));
		
		
	}
}
