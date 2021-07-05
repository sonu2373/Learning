

public class UserThread extends Thread{
	public UserThread(String s)
	{
		this.setName(s);
	}
	public void run()
	{
		try
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println(this.getName()+"Printing loop"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		UserThread t1=new UserThread("t1");
		UserThread t2=new UserThread("t2");
		t1.start();
		t2.start();

	}

}
