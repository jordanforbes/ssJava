/**
 * 
 */
package com.ss.extra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
	
	public static void main(String[] args) throws IOException {
		GetFiles _getFiles = new GetFiles(); //instantiates class
		_getFiles.read();
	}
	
	
	public BufferedReader setUp(String path) {
		BufferedReader bufStream = null;
		try {
			bufStream = new BufferedReader(new FileReader(path));
		}catch (Exception e){
			e.printStackTrace();
		}
		return bufStream;
	}
	
	public void read() {
		try(BufferedReader bufReader = setUp("./src/com/ss/day3hw/getfiles/folder1/child1/01.txt");){
			System.out.println(bufReader.readLine());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
