
public class method_Ex1 {
	public static void main(String [] args) {
		System.out.println("-main �޼ҵ� ����!");
		
		printCh('*',10);
	
	}
		
	static void printCh(char ch,int num) {
			System.out.println("- printCh �޼ҵ� ����!");
			for(int i=0;i<num;i++)
				System.out.print(ch);
			System.out.println();
			System.out.println("-printCh �޼ҵ� ��");
			
	}
	
}
