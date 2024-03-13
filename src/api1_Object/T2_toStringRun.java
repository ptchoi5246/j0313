package api1_Object;

public class T2_toStringRun {
	public static void main(String[] args) {
		
		T2_toStringVO vo = new T2_toStringVO();
		
		String name = "김말숙";
		int age = 30;
		boolean gender = false;
		String job = ""; //""를 안 쓰면 null 입력
		String add = "청주";
		
		vo.setName(name);
		vo.setAge(age);
		vo.setGender(gender);
		vo.setJob(job);
		vo.setAdd(add);
		
		System.out.println("이름 : " + vo.getName());
		System.out.println("이름 : " + vo.getName().toString()); //문자가 문자로 형변환
		System.out.println("나이 : " + vo.getAge());
		System.out.println("성별 : " + vo.isGender()); //boolean 이라서 get -> is
		System.out.println("직업 : " + vo.getJob());
		System.out.println("주소 : " + vo.getAdd());
		System.out.println();
		
		//System.out.println("vo : " + vo); //vo의 주소 출력
		System.out.println("vo : " + vo.toString()); //VO에 toString 오버라이딩한 내용 출력
		//값의 전달이 제대로 되었는지 찍어보기 위함(출력)으로 사용
		//가장 사용 많이 한다!!!!!
		//System.out.println("vo : " + vo); //둘 다 사용가능
		
	}
}
