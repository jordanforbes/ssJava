/**
 * 
 */
package com.ss.day3hw.getfiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Jordf
 *
 */
public class GetFiles {

	/**
	 * @param args
	 * @throws IOException 
	 */
	static String dirName = "C:\\Users\\Jordf\\OneDrive\\Documents\\smoothstack\\java\\ssJava\\src\\com\\ss\\day3hw\\getfiles";
	
	public static void main(String[] args) throws IOException {
		printLongPath(dirName);
	}
	
	//prints full path from the root
	public static void printLongPath(String folder) throws IOException {
		Files.walk(Paths.get(dirName))
		.filter(Files::isRegularFile)
		.forEach(System.out::println);
		
		
	}
	
	//relatavize (doesn't work yet)
	public void printFiles(Path start) throws IOException{
		Files.walk(start)
			.filter(path -> path.toFile().isFile())
			.forEach(path -> System.out.println(start.relativize(path)));
	}
	
}
