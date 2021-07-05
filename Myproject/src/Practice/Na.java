package Practice;
import java.util.ArrayList;
import java.util.Scanner;
public class Na {
	public static boolean insert(String CPS)
	{
		if(CPS.length()>=6&& CPS.length()<=12)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("MH04CC2");
		cars.add("MH04C2820");
		cars.add("MH04BB3232");
		cars.add("MH04CC2113");
		cars.add("MH04CC2878");
		cars.add("MH04BB8");
		cars.add("MH04CC2888");
		cars.add("MH04CC1313");
		cars.add("MH04CC2222");
		cars.add("MH04CC1201");
		cars.add("MH04CC555");
		cars.add("MH04CC6565");
		cars.add("MH04A7J");
	
		int pos=cars.size();
		int choice=sc.nextInt();
		String Entry;
		switch(choice)
		{
		case 1: Entry=sc.next();
				if(insert(Entry))
				{
					if(pos==cars.size())
					cars.add(Entry);
					
					System.out.println("CAR PARKED AT POSITION:"+cars.size());
				}
				else
				System.out.println("INVALID INPUT");
				break;
		case 2:Entry=sc.next();
				if(insert(Entry))
				{
				if(cars.contains(Entry))
					System.out.println("CAR POSITION:"+(cars.indexOf(Entry)+1));
				else
					System.out.println("CAR DOES NOT EXISTS");
				}
				else
					System.out.println("INVALID INPUT");
				break;
		default:   System.out.println("INVALID INPUT");
		}
		

	}

}
