package dataStructures;

public class StackArray {
	int len=10;
	int[] stack= new int[len];
	int top=-1;
	
	public void push(int key){
		if(top==stack.length-1)
			{
			System.out.println("Stack Full....");
			return ;
			}
		stack[++top]=key;
		
	}
	
	public int pop(){
		if(top==-1)
			{
			System.out.println("Stack Empty....");
			return 0;
			}
		System.out.println(stack[top]+" popped");
		int element= stack[top];
		 stack[top--]=0;
		return element;
		
		
	}
	public void display(){
		for(int i=0;i<len;i++)
			System.out.print(stack[i]+" ");
		System.out.println();
		
	} 

}
