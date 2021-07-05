import java.util.*;
public class Set_Demo {

	public static void main(String[] args) {
		Set<Integer> hash=new HashSet<Integer>();
			hash.add(1);
			hash.add(4);
			hash.add(3);
			hash.add(43);
			hash.add(8);
			hash.add(1);
			
			System.out.print(hash);
			Set<Integer> hash1=new TreeSet<Integer>(hash);
			System.out.print(hash1);
	}

}
