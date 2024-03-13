package api_ObjectREVIEW;

public class T2_toStringRun2 {
	public static void main(String[] args) {
		
		T2_toStringVO2 vo = new T2_toStringVO2();
		
		String name = "아무개";
		int age = 31;
		boolean gender = false;
		String job = ""; //""를 안 쓰면 null 입력
		String address = "대구";
		
		vo.setName(name);
		vo.setAge(age);
		vo.setGender(gender);
		vo.setJob(job);
		vo.setAddress(address);
		
		System.out.println("이름 : " + vo.getName());
		System.out.println("이름 : " + vo.getName().toString()); //문자가 문자로 형변환
		System.out.println("나이 : " + vo.getAge());
		System.out.println("성별 : " + vo.isGender()); //boolean 이라서 get -> is
		System.out.println("직업 : " + vo.getJob());
		System.out.println("주소 : " + vo.getAddress());
		System.out.println();
		
		//System.out.println("vo : " + vo); //vo의 주소 출력
		System.out.println("vo : " + vo.toString()); //VO에 toString 오버라이딩한 내용 출력
		//값의 전달이 제대로 되었는지 찍어보기 위함(출력)으로 사용
		//가장 사용 많이 한다!!!!!
		//System.out.println("vo : " + vo); //둘 다 사용가능
		System.out.println("복습 완료 :)");
	}
}
