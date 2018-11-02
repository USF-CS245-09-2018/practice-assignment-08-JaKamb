/*public class MyIterator implements ListIterator{
	private Node current;
	private Node previous;

	public MyIterator(int index){
		previous = null;
		current = head;
		for(int i = 0; i < index; i++){
			previous = current;
			current = current.next();
		}
	}
	public Object previous(){
		Assert.notFalse(hasPrevious(), "No previous element");
		Object preVal = current.data();
		previous = null;
		Node current_old = current;
		current = head;
		while(current.next() != current_old){
			previous = current;
			current = current.next();
		}
		return preVal;
	}
	public boolean hasPrevious(){
		return current != head && current != null;
	}
	public Object next(){
		Assert.notFalse(hasNext(), "No next element");
		previous = current;
		current = current.next();
		return current.data();
	}
	public boolean hasNext(){
		return current != null && current.next() !=null;
	}
	public void set(Object val){
		Assert.notFalse(current != head && current != null, "Iterator not in list");
		current.setData(val);
	}
	public void remove(){
		Assert.notFalse(current != null && current != null, "Iterator not in list");

		current = previous;
		previous.next() = previous.next().next();
		previous = null;
		sizeDown();
	}
	public void add(Object data){
		Assert.notNull(current, "Iterator not in list");
		current.setNext(new Node(current.next(), data));
		current = current.next();
		sizeUp();
	}

}*/