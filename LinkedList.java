public class LinkedList implements List{
	public Node head;
	public int size;

	public LinkedList(){
		head = new Node();
		size = 0;
	}

	public void add(Object obj) throws Exception{
		Node temp = new Node();
		temp.setData(obj);
		temp.setNext(head);
		head = temp;
		size++;
	}
	public void add(int pos, Object obj) throws Exception{
		if(pos == 0){
			Node temp = new Node();
			temp.setData(obj);
			temp.setNext(head);
			head = temp;
		}
		Node prev = getNode(pos-1);
		Node wen = new Node();
		wen.setData(obj);
		prev.setNext(wen);
		size++;
		/*if(pos >= 0 && pos <= size){
			Node temp = head;
			for(int i = 0; i < pos; i++){
				temp = temp.next;
			}
			temp.next = new Node(obj, temp.next);
			size++;
		}
		else{
			throw new Exception("position outside of list size-1");
		} */
	}
	public Object get(int pos) throws Exception{
		if(size > 0){
			Node node = getNode(pos);
			return node.data;
		}
		throw new Exception("poop");
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
		/*if(pos == 0){
			Node temp = head.next;
			head.next = head.next.next;
			size--;
			return temp.data;
		}
		else if(pos > 0 && pos < size){
			Node temp = 
		}
		else{
			return null;
		}*/
		if(pos < 0){
			throw new Exception("poop");
		}
		if(pos == 0){
			Node temp = head;
			head = head.next;
			size--;
			return temp.data;
		}
		else{
			Node prev = getNode(pos-1);
			Node curr = prev.next;
			prev.next = curr.next;
			size--;
			return curr.data;
		}
		
	}
	public int size(){
		return size;
	}
	public Node getNode(int pos) throws Exception{
		Node node = head;
		for(int i = 0; i < pos ; i++){
			node = node.next();
		}
		return node;
	}
	public static void main(String[] args){
		try{
			LinkedList list = new LinkedList();
			System.out.println(list.get(0));
			System.out.println(".");
			list.add("pls work");
			System.out.println(".");
			System.out.println(list.remove(0));
			System.out.println(".");
			System.out.println(list.size());
			System.out.println(".");
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
			System.out.println(".");
			for(int i = 0; i < movies.length; i++){
				list.add(i, movies[i]);
			}
			System.out.println(".");
			System.out.println(movies.length);
			System.out.println(".");
			System.out.println(list.size());
			System.out.println(".");
			System.out.println(list.get(41));
			System.out.println(".");
			System.out.println(movies[41]);
			System.out.println(".");
		}
		catch(Exception e){
			System.err.println(e);
		}
	}
}