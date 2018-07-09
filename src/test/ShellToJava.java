package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class ShellToJava {//复习(学习)一下java的IO流，
	
	
//	 FileReader 读取字符流，用read()输出到char数组，
//	  可以用bufferedreader进行整行读取，输出为string
//	 
//	  貌似input流read到char数组里面之后，在用bufferedreader读input，是没有内容的
	 

	public static void main(String[] args) {
		try {
			alizhaopin();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return;
	}
	public static void alizhaopin() throws IOException{
//		实现一个java程序，达到和下面的shell命令相同的效果：
//		cat /home/admin/logs/data.log | grep alibaba | sort | uniq -c | sort -nr > /home/admin/logs/data-result.txt
//		从头一点一点解决这个问题，方法估计很笨拙 
		
		
		FileReader fr= new FileReader("D:\\eclipseworkspace\\test\\src\\test\\input.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		//用bufferedreader读行到string line
		
		
		ArrayList<String> ans=new ArrayList<String>();
		//数组ans<String>用来存line
		HashMap<String, Integer> counter =new HashMap<String,Integer>();
		//map用来记录line的出现次数
		
		while((line=br.readLine())!=null){
			if(line.contains("alibaba")){//是否有关键字，指令|grep
				if(!counter.containsKey(line)){//看map中有没有line，有计数+1，没有put一个新的
					counter.put(line, 1);
					
					if(ans.size()==0) ans.add(line);//ans中根据line的字典序排序
					else{
						for(int i=0;i<=ans.size();i++){
							if(i==ans.size()){
								ans.add(line);
								break;
							}
							if(line.compareTo(ans.get(i))<0){
								ans.add(i, line);
								break;
							}
						}
					}	
				}
				else counter.put(line, counter.get(line)+1);	
			}
		}//这样完成了cat |grep|sort|uniq -c ，其中sort结果在ans，计数结果在map中
		
		for(int i=1;i<ans.size();i++){
			for(int j=0;j<ans.size()-i;j++){
				int v1=counter.get(ans.get(j));
				int v2=counter.get(ans.get(j+1));
				if(v1<v2){
					String temp=new String(ans.get(j));
					String temp2=new String(ans.get(j+1));
					ans.set(j, temp2);
					ans.set(j+1, temp);
				}
			}
		}//很呆萌的冒泡排序(倒序)，根据map中每个line的次数，再给ans中的line排序，实现sort -nr
		
		for(String str :ans) {
			System.out.print(counter.get(str)+" ");
			System.out.println(str);
		}//输出看一下效果
		
		FileWriter fw =new FileWriter("D:\\eclipseworkspace\\test\\src\\test\\output.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		for(String str:ans){
			bw.write(counter.get(str)+" ");
			bw.write(str+"\n");
		}//输出到文件
		
		br.close();
		bw.close();
	}	
}
