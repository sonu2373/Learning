package Collections;
import java.util.*;
public class Stack_1 {

	private static Object Integer;


	static void stack_push(Stack<Integer> str)
	{
		for(int i=0;i<5;i++)
		str.push(i);
	}
	
	static void stack_pop(Stack<Integer> stack) 
    { 
        System.out.println("Pop :"); 
  
        for(int i = 0; i < 5; i++) 
        { 
            Integer y = (Integer) stack.pop(); 
            System.out.println(y); 
        } 
    } 
	static void stack_peek(Stack<Integer> stack) 
    { 
        Integer element = (Integer) stack.peek(); 
        System.out.println("Element on stack top : " + element); 
    } 
	
	static void  stack_search(Stack<Integer> stack,int el)
	{
		
		Integer pos = (Integer) stack.search(el);
		
		 if(pos == -1) 
	            System.out.println("Element not found"); 
	        else
	            System.out.println("Element is found at position " + pos); 
	}
	
	
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack_push(stack);
		stack_pop(stack);
		stack_push(stack);
		//stack_push(stack);
		stack_peek(stack);
		stack_search(stack,1);
		
		
		

	}

}
