/**
 * 
 */
package com.ss.day3hw.getfiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Jordf
 *
 */
public class ListFiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String dirPath= "./src/com/ss/day3hw/getfiles/folder1";
		try(Stream<Path> walk = Files.walk(Paths.get(dirPath))){
			List<String> result = walk.filter(Files::isRegularFile)
					.map(x -> x.toString().substring(dirPath.length()+1)).collect(Collectors.toList());
			
			result.forEach(System.out::println);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
