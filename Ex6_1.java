
public class Ex6_1 {
	public static void main(String args[]) {
		LinkedList L = new LinkedList();
		System.out.println("(1) 공백 리스트에 노드 3개 삽입하기");
		L.insertLastNode("월");
		L.insertLastNode("화");
		L.insertLastNode("일");
		L.printList();
		
		System.out.println("(2) 수 노드 뒤에 금 노드 삽입하기");
		ListNode pre = L.searchNode("수");
		
		if(pre ==null) {
			System.out.println("검색실패 >> 찾는 데잍터가 없습니다.");
		}
		else {
			L.insertMiddleNode(pre, "금");
			L.printList();
		}
		
		System.out.println("(3) 리스트의 노드를 역순으로 바꾸기");
		L.reverseList();
		L.printList();
		
		System.out.println("(4) 리스트의 마지막 노드 삭제하기");
		L.deleteLastNode();
		L.printList();
	}
}


//-헷갈리는 부분 : 역으로 연결리스트 짜기
//-이 외에도 이중연결리스트(pre-current-rear)로 앞뒤를 이어줄것
/*ListNode
 * private String data; 
	public ListNode pre_link;
	public ListNode rear_link;
	로 나눠줄것
	
	- 원형 연결리스트(가장 마지막의 연결리스트와 가장 앞의 head 묶어줄 것)
	
	
 * */
