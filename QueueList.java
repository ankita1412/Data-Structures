package dataStructures;

public class QueueList {

	AnkitaNode start;
	AnkitaNode end;
	public QueueList() {
		start=null;
		end=null;
		
	}
	public void insert(int key){
		if(end==null){
			start = new AnkitaNode(key);
			end=start;
			return;
		}
		end.nextNode= new AnkitaNode(key);
		end=end.nextNode;
		System.out.println(key+ " inserted");
	
	}
	public int remove(){
		if(start==null){
			System.out.println("Queue empty...cant remove..");
			return 0;
		}
		int element = start.key;
		System.out.println(element+ " removed");
		start=start.nextNode;
		return element;
		
		
	}
	
	public void display(){
		
		AnkitaNode node=start;
		System.out.println();
		while(node!=null){
			
			System.out.print(node.key+ " ");
			node=node.nextNode;
			
		}
		System.out.println();
	}
	
	

}
