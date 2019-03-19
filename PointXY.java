
public class PointXY {
	int x,y;
	PointXY(int x,int y){ //생성자 메소드
		this.x=x;
		this.y=y;
	}
	
	 void setX(int x) {
		 this.x=x;
	 }
	 
	 void setY(int y) {
		 this.y=y;
	 }
	 
	 void moveXY(int x,int y){ 
			this.x=+x;
			this.y=+y;
		}
}
//자바로 배우는 쉬운 자료구조 참고
