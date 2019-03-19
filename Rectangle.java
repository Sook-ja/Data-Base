
public class Rectangle implements Shape {
	int x,y;
	double area;
	Rectangle (int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public void getArea() {
		this.area = this.x*this.y;

	}

}
