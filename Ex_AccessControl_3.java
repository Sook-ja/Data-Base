

public class Ex_AccessControl_3 {
	public static void main(String args[]) {
		AccessControl_3 t1 = new AccessControl_3(10, 20);
		//System.out.println("sum ="+ t1.getSum()); 오류가 나는 이유는? private은 클래스 내에서만 객체에 접근 가능하도록 묶어버림
		//System.out.println("ave ="+ t1.getAve());
	}
}
