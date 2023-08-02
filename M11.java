package pack1;

import java.io.File;
import java.io.IOException;

public class M11 {
public static void main(String[] args) throws IOException{
	File f1 = new File("abc");
	File f2 = new File(f1,"hello");
	f2.mkdir();
	System.out.println("done");
}
}