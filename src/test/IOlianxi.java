package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOlianxi {//复习(学习)一下java的IO流，
	
	/*
	 * FileReader 读取字符流，用read()输出到char数组，
	 * 可以用bufferedreader进行整行读取，输出为string
	 * 
	 * 
	 * 
	 * 貌似input流read到char数组里面之后，在用bufferedreader读input，是没有内容的
	 * */

	public static void main(String[] args) {
		try {
			input();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return;
	}
	public static void input() throws IOException{
	
		FileReader input =new FileReader("D:\\eclipse workspace\\test\\src\\test\\input.txt");
		char cbuf[]=new char[50];

//		input.read(cbuf);		
//		for(char ch:cbuf) System.out.println(ch);
//			
		BufferedReader bfrd=new BufferedReader(input);
		String line =new String();
		while((line=bfrd.readLine())!=null) System.out.println(line);
		
		input.close();
		return;
	}

}
