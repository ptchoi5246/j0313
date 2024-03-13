package api3_ClassREVIEW;

public class Test2_2 {
	public static void main(String[] args) {

		try {
			Class.forName("java.lang.String");
			System.out.println("String 클래스가 존재합니다.");
			
			//객체의 정보(Test1.class) 알아내어 출력하기
   		Class clazz =	Test1_2.class; //다시 공부하기
   		//Test1 파일의 정보를 clazz로 알아볼 수 있다.
   		System.out.println("전체 이름(패키지명 + 파일이름) : " + clazz.getName());
   		System.out.println("패키지 이름 : " + clazz.getPackage());
   		System.out.println("타입 이름 : " + clazz.getTypeName());
   		System.out.println("simple 이름 : " + clazz.getSimpleName());
   		System.out.println();
   		
   		Class imgPath = Test2_2.class;
   		System.out.println("121그림 파일의 경로명 : " + imgPath.getResource("./images/121.jpg").getPath()); //상대경로
   		//getPath : 경로
   		// .은 나 ..은 아래
   		System.out.println("Test2.class의 경로명 : " + imgPath.getResource("Test2.class").getPath()); //현재 위치
   		//알아야 한다. - 파일 업로드, 다운로드를 못 한다.
   		System.out.println("Test2.class의 경로명 : " + clazz.getResource("Test2.class").getPath()); //
   		System.out.println("현재 작업경로의 루트(/)명 : " + clazz.getResource("/").getPath());
   		//src가 bin에 들어간다. = srt = bin
   		//루트 : 작업 경로의 최상위 경로 // 루드 :: 시작점
   		System.out.println("122그림 파일의 경로명1 : " + imgPath.getResource("/api3_Class/images/122.jpg").getPath()); //상대경로 : .을 기준으로 출발한다.
   		//잘못된 경로와 파일명을 입력하면 NullPointExcption 에러 발생
   		//System.out.println("122그림 파일의 경로명2 : " + imgPath.getResource("/images/122.jpg").getPath()); //잘못된 경로
   		System.out.println("api2_System 패키지의 Test1.class 파일의 경로명 : " + imgPath.getResource("/api2_System/Test1.class").getPath()); //절대경로
   		// /는 src
   		System.out.println("api2_System 패키지의 Test1.class 파일의 경로명 : " + imgPath.getResource("../api2_System/Test1.class").getPath()); //상대경로
   		// .. 상위폴더 // ../.. 사용 불가 - 내 루트 안에서만 이동할 수 있다. 더 올라가면 우주로 빵!!
   		//최상위 폴더(src(또는 bin))를 벗어나면 경로와 파일명을 찾아올 수 없다.
   		System.out.println("api2_System 패키지의 Test1.class 파일의 경로명 : " + imgPath.getResource("../../src/api2_System/Test1.class").getPath()); //상대경로
   		
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 파일이 존재하지 않습니다." + e.getMessage());
		} finally {
			System.out.println("작업 끝~! :)");			
		}
	}
}
//파일 경로 모르겠다.
