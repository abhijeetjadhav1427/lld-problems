package filesystem.compositedesign;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		FileSystem file1 = new File("file1");
		FileSystem file2 = new File("file2");
		FileSystem fs2 = new Directory("directory2", Arrays.asList(file2));
		FileSystem fs1 = new Directory("directory1", Arrays.asList(file1, fs2));
		
		fs1.fs();
	}
}
/*
		directory1
		    |
		    |
		    |
   --------------------
   |				  |
   |            	  |
   | 				  |
 file1			  directory2
               	      |
               	      |
               	      |
               	    file2

*/