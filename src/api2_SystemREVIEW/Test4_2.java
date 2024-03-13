package api2_SystemREVIEW;

public class Test4_2 {
	public static void main(String[] args) { //시험문제
		//CPU의 처리 속도
		int tot = 0;
		
		long startTime = System.nanoTime(); //시간
		
		for(int i=1; i<=1000000000; i++) {
			tot += i;
		}
		
		long endTime = System.nanoTime();
		
		System.out.println("작업에 소모된 시간? " + (endTime - startTime));
		//작업 소요 시간 : 끝난 시간 - 시작한 시간
		System.out.println("복습 완료 :)");
	}
}
