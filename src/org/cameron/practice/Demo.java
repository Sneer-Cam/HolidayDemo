package org.cameron.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
	public static void main(String[] args){
		File file = new File("X:\\Java\\Holiday\\a.txt");
		File file2 = new File("X:\\Java\\Holiday\\b.txt");
		byte[] b = new byte[100];
		int count = 0;
		String txt = "Imagine Dragon!!";
		byte[] b2 = txt.getBytes();
		try {
			FileInputStream is = new FileInputStream(file);
			while((count = is.read(b)) != -1){
				String string = new String(b, 0, count);
				System.out.println(string);
			}
			is.close();
			
			FileOutputStream os = new FileOutputStream(file2);
			os.write(b2);
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
