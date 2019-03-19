
public class Array_1 {
	public static void main(String args[] ) {
		int arr[];
		arr = new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=arr[0];
		arr[4]= arr[1]+arr[2];
		
		for(int a:arr) {
			System.out.println(a);
		}
		
	}
}

//자바로 배우는 쉬운 자료구조 p.106