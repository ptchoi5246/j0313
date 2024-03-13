package api2_SystemREVIEW;

public class Test1_2 {
	public static void main(String[] args) {
		//반복문 누적 합계 구하기
		int i, tot=0;
		for(i=1; i<=100000; i++) {
			tot += i; //누적 합계
			if(tot >= 1000) {
				System.out.println("합이 10000이상일 때 i의 값은 : " + i);
				break;
			}
		}
		System.out.println("복습 완료");
	}
}
