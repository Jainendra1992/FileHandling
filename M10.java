package pack1;

import java.io.File;
import java.io.IOException;

public class M10 {
public static void main(String[] args) throws IOException{
	File f1 = new File("abc");
	File f2 = new File(f1,"test.txt");
	f2.createNewFile();
	System.out.println("done");
}
}
// file class there are serval  construtor