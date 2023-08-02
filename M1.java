package pack1;

import java.io.File;
import java.io.IOException;

public class M1 {
public static void main(String[] args) throws IOException
{
	File  f1 = new File("text1.txt");
	f1.createNewFile();
	
	File  f2 = new File("hello.html");
	f1.createNewFile();
	
	File  f3 = new File("abc.doc");
	f1.createNewFile();
	
	System.out.println("done");
}
}
