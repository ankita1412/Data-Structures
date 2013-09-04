package dataStructures;

public class QueueArray {
	int len=10;
	int[] queue = new int[len];
	int start=0;
	int end=0;
	
	public void insert(int key){
		if(start==((end+1) % len)){
			System.out.println("Queue full.....Cant Add");
			return;
		}
		end= (end+1)%len;
		queue[end]=key;
		
	}
	
	public int remove(){
		if(end==start)
		{	System.out.println("Queue Empty..... Cant Remove");
			return 0;
		}
		start=(start+1)%len;
		int element=queue[start];
		queue[start]=0;
		System.out.println(element + " Removed");
		return element;
		
	}
	
	public void display(){
		for(int i=0;i<len;i++)
			System.out.print(queue[i]+" ");
		System.out.println();
	} 
}
