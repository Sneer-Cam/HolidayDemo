package org.cameron.practice;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {
	public static void main(String[] args){
		File file = new File("X:\\Java\\Holiday\\c.txt");
		String content = "����ѧϰ �޷��԰�";
		char[] c = content.toCharArray();//��content�ַ���ֱ��ת��Ϊһ���ַ�����
		int count = 0;
		char[] c2 = new char[100];
		try {
			FileWriter fw = new FileWriter(file);
			fw.write(c);
			fw.close();
			
			FileReader fr = new FileReader(file);
			while((count = fr.read(c2)) != -1){
				String string = new String(c2, 0, count);
				System.out.println(string);
			}
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
