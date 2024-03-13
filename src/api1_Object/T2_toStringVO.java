package api1_Object;

public class T2_toStringVO {
	//필드 선언은 무조건 private! 외부 접근 불가 - 접근 방법 : 생성자, 게터, 세터
	private String name;
	private int age;
	private boolean gender;
	private String job;
	private String add;
	//게터,세터 무조건 public!!
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
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	@Override
	public String toString() {
		return "T2_toStringVO [name=" + name + ", age=" + age + ", gender=" + gender + ", job=" + job + ", add=" + add
				+ "]";
	}
	
//	@Override
//	public String toString() {
//		return "VO = [name="+name+", age="+age+", gender="+gender+", job="+job+", add="+add+"]";
//	}
	
}
