
public class Point_Ex {
	public static void main(String [] args) {
		int i=100;
		int j=i;
		System.out.printf("i = (%d)%n",i);
		System.out.printf("j = (%d)%n",j);
		
		Point p1 = new Point(10,20);
		Point p2 = p1;
		System.out.printf("p1 = (%d, %d)%n",p1.x,p1.y);
		System.out.printf("p2 = (%d, %d)%n",p2.x,p2.y);
		
		i = 300;
		System.out.printf("i = (%d)%n",i);
		System.out.printf("j = (%d)%n",j);
		
		p1.x = 30;
		System.out.printf("p1 = (%d, %d)%n",p1.x,p1.y);
		System.out.printf("p2 = (%d, %d)%n",p2.x,p2.y);
		//실제 데이터 값이 아닌 p1의 힙값 자체를 p2가 받았으니(참조타입)
		//p2또한 p1과 같은 값이 됨
	}
}
