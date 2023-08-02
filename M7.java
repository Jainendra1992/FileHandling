package pack1;

import java.io.File;

public class M7 {
public static void main(String[] args) {
	File f1 = new File("E:\\App1\\dir1");
	f1.mkdir();
	
	File f2 = new File("E:\\App1\\abc");
	f2.mkdir();
	
	File f3 = new File("E:\\App1\\xyz");
	f3.mkdir();
	
	System.out.println("done");
}
}