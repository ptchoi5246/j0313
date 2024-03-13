package api_ObjectREVIEW;

public class T2_toStringVO2 {
	//필드 선언은 무조건 private! 외부 접근 불가 - 접근 방법 : 생성자, 게터, 세터
	private String name;
	private int age;
	private boolean gender;
	private String job;
	private String address;
	
	//getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//Alt s*3 , enter*2
	@Override
	public String toString() {
		return "T2_toStringVO2 [name=" + name + ", age=" + age + ", gender=" + gender + ", job=" + job + ", address="
				+ address + "]";
		//매번 sysout으로 이름,나이,성별,직업,주소 다 적기 귀찮아서 VO 오버라이딩 해서 출력
	}
}
//복습 완료
