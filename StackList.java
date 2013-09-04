package dataStructures;

public class StackList {
	AnkitaNode top=null;
	public StackList() {
		// TODO Auto-generated constructor stub
	}
	
	public void push(int key){
		if(top==null){
			top=new AnkitaNode(key);
			top.nextNode=null;
			return;
		}
			
		AnkitaNode temp;
		temp=top;
		top=new AnkitaNode(key);
		top.nextNode=temp;
		System.out.println(key + " inserted");
	}

	public int pop(){
		if(top==null){
			System.out.println("Stack Empty... cant pop");
			return 0;
		}
			
		int element  = top.key;
		top=top.nextNode;
		System.out.println(element + " popped");
		return  element;
	}
	public void display(){
		AnkitaNode temp=top;
		System.out.println();
		while(temp!=null){
			System.out.print(temp.key+ " ");
			temp=temp.nextNode;
		}
		System.out.println();
	}
	
}
