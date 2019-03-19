
public class Swith_Ex {
	public static void main(String [] args) {
		Week nowWeek = Week.FRI;
		switch (nowWeek) {
		case MON:
			System.out.println("오늘은 월요일 입니다.");
			break;
		case TUE:
			System.out.println("오늘은 화요일 입니다.");
			break;
		case WED:
			System.out.println("오늘은 수요일 입니다.");
			break;
		case THU:
			System.out.println("오늘은 목요일 입니다.");
			break;
		case FRI:
			System.out.println("오늘은 금요일 입니다.");
			break;
		case SAT:
			System.out.println("오늘은 토요일 입니다.");
			break;
		default:
			System.out.println("오늘은 일요일 입니다.");

		}
	}
}
