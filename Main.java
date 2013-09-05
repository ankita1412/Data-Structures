package lists;

public class Main {

	public static void main(String[] args) {
		QueueArray queue= new QueueArray();
		
		System.out.println("------------Stack by Array---------------");
		for(int i=1; i<6;i++)
		 queue.insert(i); 		//inserting elements
		
		queue.display();		//displays elements
				
		for(int i=1; i<3;i++)
			 queue.remove(); 	//removing elements
		
		queue.display();
		
		for(int i=11; i<18;i++)
			 queue.insert(i);
		queue.display();
		
		System.out.println("\n------------Queue by Array---------------");
		
		StackArray stack=new StackArray();
		for(int i=1; i<6;i++)
			 stack.push(i); 		//inserting elements
		stack.display();
		for(int i=1; i<3;i++)
			 stack.pop(); 	//removing elements
		stack.display();
		for(int i=5; i<14;i++)
			 stack.push(i); 		//inserting elements
		stack.display();
		for(int i=1; i<12;i++)
			 stack.pop(); 	//removing elements
		stack.display();
		
		System.out.println("\n------------Queue by List------------------");
		
		QueueList qlist=new QueueList();
		for(int  i=2; i<10;i++)
			qlist.insert(i);
		qlist.display();
		for(int  i=1; i<11;i++)
			qlist.remove();
			
		qlist.display();
		
	
		
		System.out.println("\n------------Stack by List------------------");
		StackList stacklist = new StackList();
		for(int  i=2; i<10;i++)
		stacklist.push(i);
		stacklist.display();
		for(int  i=2; i<10;i++)
			stacklist.pop();
		stacklist.display();
		stacklist.pop();
		
		System.out.println("\n------------Linked List------------------");
		LinkedList ll = new LinkedList();
		for(int  i=2; i<5;i++)
			ll.insertFirst(i);
		for(int  i=10; i<14;i++)
			ll.insertLast(i);
		for(int  i=10; i<14;i++)
			ll.insertAfter(i+10,i);
		for(int  i=10; i<15;i++)
			ll.deleteAfter(i);
		ll.deleteFirst();
		ll.display();
		
		//for(int  i=6; i<15;i++)
			//ll.deleteLast();
		ll.reverse();
		
		
		
		
	
	}

}
