package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOlianxi {//��ϰ(ѧϰ)һ��java��IO����
	
	/*
	 * FileReader ��ȡ�ַ�������read()�����char���飬
	 * ������bufferedreader�������ж�ȡ�����Ϊstring
	 * 
	 * 
	 * 
	 * ò��input��read��char��������֮������bufferedreader��input����û�����ݵ�
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
