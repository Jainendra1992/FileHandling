package pack1;

import java.io.File;

public class M6 {
public static void main(String[] args) {
	File f1 = new File("dir1");
	f1.mkdir();
	
	File f2 = new File("abc");
	f2.mkdir();
	
	File f3 = new File("xyz");
	f3.mkdir();
	
	System.out.println("done");
}
}
// mkdir does not requied throws int  not checked exception