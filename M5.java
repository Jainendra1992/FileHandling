package pack1;

import java.io.File;
import java.io.IOException;

public class M5 {
public static void main(String[] args) {
	System.out.println(1);
	File f1 = new File("F:/abc/test.txt");
	try
	{
		System.out.println("try begin");
		f1.createNewFile();
		System.out.println("try end");
	}
	catch(IOException ex)
	{
		ex.printStackTrace();
	}
	System.out.println(2);
}
}
