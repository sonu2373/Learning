import java.io.*;

public class User_Stream {

	public static void main(String[] args)throws IOException {
		DataInputStream ds=new DataInputStream(System.in);
		String str=ds.readLine();
		int age=ds.readInt();
		
		FileOutputStream fos=new FileOutputStream("Text.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		
		dos.writeUTF(str);
		dos.writeInt(age);
		
		ds.close();
		dos.close();
	}

}
