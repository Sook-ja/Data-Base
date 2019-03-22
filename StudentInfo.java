
public class StudentInfo {
	protected String dept, stdNo, name;
	StudentInfo(String dept, String stdNo, String name){
		this.dept=dept;
		this.stdNo=stdNo;
		this.name=name;
	}
	public void getStdIfo(){
		System.out.println("** 학생정보출력 **");
		System.out.println("학과 :" + dept);
		System.out.println("학번 :" + stdNo);
		System.out.println("이름 : "+ name);
	}
	
	
	//protect는 자식 클래스와 같은 패키지 내에 클래스에 한하여 객체 접근 허용
}
