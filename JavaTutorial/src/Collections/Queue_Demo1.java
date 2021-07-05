package Collections;
import java.util.*;

public class Queue_Demo1 {

	public static void main(String[] args) {
		Queue<Integer> que=new LinkedList<Integer>();
		
		for(int i=0;i<5;i++)
			que.add(i);
		
		System.out.println(que);
		
		int remdel=que.remove();
		System.out.println(remdel);
		
		System.out.println(que);
		
		int head=que.peek();
		System.out.println(head);
		
		int size=que.size();
		System.out.println(size);
		
		

	}

}
