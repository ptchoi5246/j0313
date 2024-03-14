package api5_Wrapper;

public class Test2 {
	public static void main(String[] args) {
		//객체에 정수값 대입시, 1Byte 저장범위인 -128~127 사이의 값은 해당 번지에 저장시키기에 '=='로 비교하면 같은 값으로 출력
		//결론은 객체 비교 .equals 사용
		Integer objInt1 = 300; //객체
		Integer objInt2 = 300;
		System.out.println(" == : " + (objInt1 == objInt2)); //false
		//-128~127 수치 범위의 값만 입력 가능
		System.out.println("equals : " + (objInt1.equals(objInt2))); //true
		
		Integer objInt3 = 10;
		Integer objInt4 = 10;
		System.out.println(" == : " + (objInt3 == objInt4)); //true :: 값이 -128~127 사이라 번지 비교 -> true 출력
		System.out.println("equals : " + (objInt3.equals(objInt4))); //true
		
		
	}
}
