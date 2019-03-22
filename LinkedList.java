
public class LinkedList {
	private ListNode head;
	
	public LinkedList() {
		head=null;
	}
	
	
	//중간 삽입 노드
	public void insertMiddleNode(ListNode pre, String data) {
		ListNode newNode = new ListNode(data); //새 노드에 데이터 추가
		newNode.link = pre.link; //새노드의 다음 노드는 이전 노드//  '금 '-->'일'
		pre.link = newNode; //이전노드가 가르키는건 새노드   //'수'-->'금'
		//짝대기를 옮긴다 생각하면 쉬움
	}
	
	
	//마지막노드에 넣기
	public void insertLastNode(String data) {
		ListNode newNode = new ListNode(data);
		
		if(head==null) {
			this.head = newNode;
		}
		else {
			ListNode temp = head;
			while(temp.link != null) {//마지막노드가 널일때 까지 찾아서 널이면 그 뒤에 새 노드를 넣음
				temp.link = newNode;
			}
		}
		
	}
		
	//마지막 노드 삭제
	public void deleteLastNode() {
		ListNode pre,temp;
		if(head == null) return ;
		if(head.link ==null) head = null;
		//해드가 널이거나 다음 노드가 널 일경우 이전노드 혹은 해드를 삭제
		else {
			pre = head;
			temp = head.link;
			while(temp.link != null) { //마지막 노드가 널일 경우 까지 쭉가서
				pre = temp; 
				temp = temp.link;
			}
			pre.link = null; //이전노드를 삭제시킴
		}
	}
	
	
	//노드 찾기
	public ListNode searchNode (String data) {
		ListNode temp = this.head;
		while (temp != null) {
			if(data == temp.getData())  //데이타와 템프의 데이터가 같을 경우 템프를 리턴 시켜줌
				return temp;
			else temp = temp.link;
			}
		return temp;
		}
	
	//잘 모르겠음......_______________________//
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
