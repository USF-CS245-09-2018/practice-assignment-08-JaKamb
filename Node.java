public class Node{
	public Object data;
	public Node next;

	public Node(){
		this(null, null);
	}
	public Node(Node next){
		this(null, next);
	}
	public Node(Object obj){
		this(obj, null);
	}
	public Node(Object data, Node next){
		this.next = next;
		this.data = data;
	}
	public void setData(Object data){
		this.data = data;
	}
	public void setNext(Node next){
		this.next = next;
	}
	public Object data(){
		return this.data;
	}
	public Node next(){
		return this.next;
	}	
}