
public class LinkedList {
	private ListNode head;
	
	public LinkedList() {
		head=null;
	}
	
	
	//�߰� ���� ���
	public void insertMiddleNode(ListNode pre, String data) {
		ListNode newNode = new ListNode(data); //�� ��忡 ������ �߰�
		newNode.link = pre.link; //������� ���� ���� ���� ���//  '�� '-->'��'
		pre.link = newNode; //������尡 ����Ű�°� �����   //'��'-->'��'
		//¦��⸦ �ű�� �����ϸ� ����
	}
	
	
	//��������忡 �ֱ�
	public void insertLastNode(String data) {
		ListNode newNode = new ListNode(data);
		
		if(head==null) {
			this.head = newNode;
		}
		else {
			ListNode temp = head;
			while(temp.link != null) {//��������尡 ���϶� ���� ã�Ƽ� ���̸� �� �ڿ� �� ��带 ����
				temp.link = newNode;
			}
		}
		
	}
		
	//������ ��� ����
	public void deleteLastNode() {
		ListNode pre,temp;
		if(head == null) return ;
		if(head.link ==null) head = null;
		//�ص尡 ���̰ų� ���� ��尡 �� �ϰ�� ������� Ȥ�� �ص带 ����
		else {
			pre = head;
			temp = head.link;
			while(temp.link != null) { //������ ��尡 ���� ��� ���� �߰���
				pre = temp; 
				temp = temp.link;
			}
			pre.link = null; //������带 ������Ŵ
		}
	}
	
	
	//��� ã��
	public ListNode searchNode (String data) {
		ListNode temp = this.head;
		while (temp != null) {
			if(data == temp.getData())  //����Ÿ�� ������ �����Ͱ� ���� ��� ������ ���� ������
				return temp;
			else temp = temp.link;
			}
		return temp;
		}
	
	//�� �𸣰���......_______________________//
	public void reverseList() {
		ListNode next = head;
		ListNode current = null;
		ListNode pre =null;
		while (next !=null) {
			pre = current;
			current = next;
			next= next.link;
			current.link = pre;
		}
		head = current;
	}
	
	
	//____________________________________//
	public void printList() {
		ListNode temp = this.head;
		System.out.printf("L=(");
		while(temp != null) {
			System.out.printf(temp.getData());
			temp=temp.link;
			if(temp != null) {
				System.out.printf(", ");
			}
		}
		System.out.println(")");
	}
	
		
	
}
