package pack1;

import java.io.File;
import java.io.IOException;

public class M2 {
public static void main(String[] args) throws IOException
{
	File  f1 = new File("E:\\App1\\test.txt");
	f1.createNewFile();
	
	File  f2 = new File("E:\\App1\\hello.html");
	f1.createNewFile();
	
	File  f3 = new File("E:\\App1\\abc.doc");
	f1.createNewFile();
	
	System.out.println("done");
}
}
