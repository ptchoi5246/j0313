package api2_System;

public class Test2 {
	public static void main(String[] args) {
		
		int i, tot=0;
		for(i=1; i<=100000000; i++) {
			tot +=i;
			if(tot >= 10000) {
				System.out.println("합이 10000 이상일 때 i 값은?  " + i );
				//break;
				//메소드 탈출 - 메소드 앞에 리턴타입 void 대신에 다른 리턴타입 작성
				return; //작업 끝 출력 안됨
			}
		}
		System.out.println("작업 끝 :)");
	}
}
