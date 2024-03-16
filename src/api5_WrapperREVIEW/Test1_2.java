package api5_WrapperREVIEW;

//Wrapper 클래스 : 기본 타입을 참조 타입으로(Boxing), 참조 타입을 기본 타입으로(UnBoxing) 형변환
public class Test1_2 {
	public static void main(String[] args) {
		
		int intSu1 = 100, intSu2 = 200;
		System.out.println("1.intSu1 + 100 : " + (intSu1 + 100)); //200
		
		//정수형 Boxing처리 (Integer) - 기본 타입(int)가 참조 타입(객체)로 타입 변환
		Integer objSu1 = new Integer(intSu1); //저절로 integer 중간 밑줄
		System.out.println("2.objSu1 + 100 : " + (objSu1 + 100)); //200 //참조타입(객체)로 변환해도 원래의 성격을 가지고 있다. 
		
		//자동 박싱(Auto Boxint) 처리 예 )
		Integer objSu2;
		objSu2 = intSu1;
		System.out.println("3.objSu2 + 100 : " + (objSu2 + 100)); //200 //참조타입(객체)로 변환해도 원래의 성격을 가지고 있다.
		System.out.println();
		
	//UnBoxing 처리
		String strIntSu1 = "100"; //문자
		System.out.println("strIntSu1 + 100 = " + (strIntSu1 + 100)); //100100
		System.out.println("strIntSu1 + 100 = " + (Integer.parseInt(strIntSu1) + 100)); //200
		//Integer.parseInt() : 문자 -> 숫자로 변환
		System.out.println();
		
	//double <-> Double
		double dblSu= 3.14;
		Double objDblSu = new Double(dblSu);
		System.out.println("4.objDblSu + 100.5 : " + (objDblSu + 100.5));
		System.out.println();
		
		//Boxing
		int su3 = 100;
		Integer objSu3 = Integer.valueOf(su3); //이렇게 박싱해라
		System.out.println("5.objSu3 + 100 : " + (objSu3 + 100));
		System.out.println();
		
		//UnBoxing
		int su4 = Integer.valueOf(objSu3);
		System.out.println("6.su4 + 100 : " + (su4 + 100));
		
	}
}
