package pack1;

import java.io.File;
import java.io.IOException;

public class M4 {
public static void main(String[] args) {
	File f1 = new File("Manager.java");
	System.out.println(1 + ":" + f1.exists());
	try
	{
		System.out.println(2 + ":" + f1.createNewFile());
	}
	catch(IOException ex)
	{
		ex.printStackTrace();
	}
	System.out.println(3 + ":" + f1.exists());
}
}
// cfreate new file a checked 