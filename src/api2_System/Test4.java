package api2_System;

public class Test4 {
	public static void main(String[] args) { //시험문제
		//CPU의 처리 속도
		int tot = 0;
		
		long startTime = System.nanoTime();
		
		for(int i=1; i<=100000000; i++) {
			tot += i;
		}
		
		long endTime = System.nanoTime();
		
		System.out.println("작업에 소모된 시간? " + (endTime - startTime));
		System.out.println("작업 끝 :)");
	}
}
