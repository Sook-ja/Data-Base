
public class Array_2 {
	public static void main(String [] args) {
		int arr2[][] = new int[2][3];
		
		arr2[0][0] = 0;
		arr2[0][1] = 1;
		arr2[0][2] = 2;
		arr2[1][0] = 10;
		arr2[1][1] = 11;
		arr2[1][2] = 12;
		
		for(int a = 0; a<3; a++) {
			System.out.print(arr2[0][a] + " " );
		}
		System.out.println();
		for(int a = 0; a<3; a++) {
			System.out.print(arr2[1][a] + " " );
		}
		
	}
}

//자바로 배우는 쉬운 자료구조