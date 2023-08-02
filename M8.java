package pack1;

import java.io.File;

public class M8 {
public static void main(String[] args) {
	File f1 = new File("images");
	System.out.println(f1.exists());
	System.out.println(f1.mkdir());
	System.out.println(f1.exists());
}
}
/*
 * first time output
 * false
 * true
 * true
 * -------
 *  true
false
true
second time output
*
*/
 