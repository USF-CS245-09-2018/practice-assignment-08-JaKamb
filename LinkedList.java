public class LinkedList implements List{
	public Node head;
	public Node tail;
	public int size;

	public LinkedList(){
		tail = new Node();
		head = tail;
		size = 0;
	}

	public void add(Object obj) throws Exception{
		tail.setNext(new Node(obj, null));
		tail = tail.next;
		size++;
	}
	public void add(int pos, Object obj) throws Exception{
		if(pos >= 0 && pos <= size){
			Node temp = head;
			for(int i = 0; i < pos; i++){
				temp = temp.next;
			}
			temp.next = new Node(obj, temp.next);
			size++;
		}
		else{
			throw new Exception("position outside of list size");
		} 
	}
	public Object get(int pos) throws Exception {
		Node node = getNode(pos);
		return node.data;
	}
/*	public Object get(int pos) throws Exception{
		if(pos >= 0 && pos < size){
			Node temp = head.next;
			for(int i = 0; i < size; i++){
				temp = temp.next;
			}
			return temp.data;
		}
		else{
			throw new IllegalArgumentException("position outside of list");
		}
	}*/
	public Object remove(int pos) throws Exception{
		if(pos >= 0 && pos < size){
			Node temp = head;
			for(int i = 0; i < pos; i++){
				temp = temp.next;
			}
			Object deleted = temp.next.data;
			temp.next = temp.next.next;
			size--;
			return deleted;
		}
		else{
			throw new Exception("position outside of list size");
		}
	}
	public int size(){
		return size;
	}
	public Node getNode(int pos) throws Exception {
		Node node = head;
		for(int i = 0; i < pos ; i++){
			node = node.next();
		}
		return node;
	}
	public void clear(){
		head.setNext(null);
		tail = head;
		size = 0;
	}

	public static void main(String args){
		LinkedList list = new LinkedList();
		System.out.println(list.get(0));
		list.add("pls work");
		System.out.println(list.remove(0));
		System.out.println(list.size());
		String [] movies = {"The Adventures of Robin Hood", "Au revoir les enfants",
				"Back to the Future", "Beauty and the Beast", "Bicycle Thieves",
				"Billy Elliot", "A Day at the Races", "E.T. the Extra-Terrestrial",
				"Edward Scissorhands", "Etre et Avoir", "Finding Nemo", "It's a Wonderful Life",
				"Jason and the Argonauts", "Kes", "The Kid", "King Kong", "Kirikou et la sorciere",
				"La Belle et la Bete", "Le Voyage dans la Lune", "The 400 Blows",
				"Monsieur Hulot's Holiday", "My Life as a Dog", "My Neighbour Totoro",
				"The Night of the Hunter", "Oliver Twist", "The Outsiders", "Pather Panchali",
				"Playtime", "The Princess Bride", "Rabbit-Proof Fence", "Raiders of the Lost Ark",
				"The Railway Children", "The Red Balloon", "Romeo + Juliet", "The Secret Garden",
				"Show Me Love", "Singin' in the Rain", "Snow White and the Seven Dwarfs",
				"Some Like It Hot", "The Spirit of the Beehive", "Spirited Away", "Star Wars",
				"To Kill a Mockingbird", "Toy Story", "Walkabout", "Whale Rider", 
				"Where Is the Friend's Home?", "Whistle Down the Wind", "The White Balloon",
				"The Wizard of Oz"};
		for(int i = 0; i < movies.length; i++){
			list.add(i, movies[i]);
		}
		System.out.println(movies.length);
		System.out.println(list.size());
		System.out.println(list.get(41));
		System.out.println(movies[41]);
	}
}