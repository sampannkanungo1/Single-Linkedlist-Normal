package arraylist;

public class single_linkedlist {
	node head;
	private int size;
	
	single_linkedlist(){
		size=0;
	}
	public class node{
		String data;
		node next;
		
		node(String data){
			this.data=data;
			this.next=null;
			size++;
		}
	}
	//ADD First Element
	public void addFirst(String data) {
		node newnode = new node(data);
		newnode.next=head;
		head = newnode;
		
	}
	//add Last Element
	public void addLast(String data) {
		node newnode = new node(data);
		
		if(head==null) {
			head = newnode;
			return;
			
		}
		node Lastnode=head;
		while(Lastnode.next!=null) {
			Lastnode=Lastnode.next;
		}
		Lastnode.next=newnode;
}
//PRINT LIST
	public void printlist() {
		node currnode=head;
		while(currnode!=null){
			System.out.print(currnode.data+" -----> ");
			currnode=currnode.next;
		}
		System.out.println("Null");
		
	}
	//Remove FIRST ELEMENT
	public void removeFirst() {
		if(head==null) {
			System.out.println("Empty");
			return;
		}
		head=this.head.next;
		size--;
	}
	//REMOVE LAST
	public void removeLast() {
		if(head==null) {
			System.out.println("Empty");
			return;
		}
		size--;
		if(head.next==null) {
			head=null;
			return;
		}
		node currnode=head;
		node lastnode=head.next;
		while(lastnode.next!=null) {
			currnode=currnode.next;
			lastnode=currnode;
		}
		currnode.next=null;
	}
	//GET SIZE
	public int getsize() {
		return size;
		
	}
	//Main Code
	public static void main(String[]args) {
		single_linkedlist list =new single_linkedlist();
		list.addLast("is");
		list.addLast("a");
		list.printlist();
		
		list.addFirst("this");
		list.printlist();
		System.out.println(list.getsize());
		
		list.removeFirst();
		list.printlist();
		
		list.removeLast();
		list.printlist();
		
		
		
	}
}
