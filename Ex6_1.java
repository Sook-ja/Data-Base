
public class Ex6_1 {
	public static void main(String args[]) {
		LinkedList L = new LinkedList();
		System.out.println("(1) ���� ����Ʈ�� ��� 3�� �����ϱ�");
		L.insertLastNode("��");
		L.insertLastNode("ȭ");
		L.insertLastNode("��");
		L.printList();
		
		System.out.println("(2) �� ��� �ڿ� �� ��� �����ϱ�");
		ListNode pre = L.searchNode("��");
		
		if(pre ==null) {
			System.out.println("�˻����� >> ã�� �����Ͱ� �����ϴ�.");
		}
		else {
			L.insertMiddleNode(pre, "��");
			L.printList();
		}
		
		System.out.println("(3) ����Ʈ�� ��带 �������� �ٲٱ�");
		L.reverseList();
		L.printList();
		
		System.out.println("(4) ����Ʈ�� ������ ��� �����ϱ�");
		L.deleteLastNode();
		L.printList();
	}
}


//-�򰥸��� �κ� : ������ ���Ḯ��Ʈ ¥��
//-�� �ܿ��� ���߿��Ḯ��Ʈ(pre-current-rear)�� �յڸ� �̾��ٰ�
/*ListNode
 * private String data; 
	public ListNode pre_link;
	public ListNode rear_link;
	�� �����ٰ�
	
	- ���� ���Ḯ��Ʈ(���� �������� ���Ḯ��Ʈ�� ���� ���� head ������ ��)
	
	
 * */
