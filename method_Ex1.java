
public class method_Ex1 {
	public static void main(String [] args) {
		System.out.println("-main 메소드 시작!");
		
		printCh('*',10);
	
	}
		
	static void printCh(char ch,int num) {
			System.out.println("- printCh 메소드 시작!");
			for(int i=0;i<num;i++)
				System.out.print(ch);
			System.out.println();
			System.out.println("-printCh 메소드 끝");
			
	}
	
}
