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

public class ShellToJava {//��ϰ(ѧϰ)һ��java��IO����
	
	
//	 FileReader ��ȡ�ַ�������read()�����char���飬
//	  ������bufferedreader�������ж�ȡ�����Ϊstring
//	 
//	  ò��input��read��char��������֮������bufferedreader��input����û�����ݵ�
	 

	public static void main(String[] args) {
		try {
			alizhaopin();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return;
	}
	public static void alizhaopin() throws IOException{
//		ʵ��һ��java���򣬴ﵽ�������shell������ͬ��Ч����
//		cat /home/admin/logs/data.log | grep alibaba | sort | uniq -c | sort -nr > /home/admin/logs/data-result.txt
//		��ͷһ��һ����������⣬�������ƺܱ�׾ 
		
		
		FileReader fr= new FileReader("D:\\eclipseworkspace\\test\\src\\test\\input.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		//��bufferedreader���е�string line
		
		
		ArrayList<String> ans=new ArrayList<String>();
		//����ans<String>������line
		HashMap<String, Integer> counter =new HashMap<String,Integer>();
		//map������¼line�ĳ��ִ���
		
		while((line=br.readLine())!=null){
			if(line.contains("alibaba")){//�Ƿ��йؼ��֣�ָ��|grep
				if(!counter.containsKey(line)){//��map����û��line���м���+1��û��putһ���µ�
					counter.put(line, 1);
					
					if(ans.size()==0) ans.add(line);//ans�и���line���ֵ�������
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
		}//���������cat |grep|sort|uniq -c ������sort�����ans�����������map��
		
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
		}//�ܴ��ȵ�ð������(����)������map��ÿ��line�Ĵ������ٸ�ans�е�line����ʵ��sort -nr
		
		for(String str :ans) {
			System.out.print(counter.get(str)+" ");
			System.out.println(str);
		}//�����һ��Ч��
		
		FileWriter fw =new FileWriter("D:\\eclipseworkspace\\test\\src\\test\\output.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		for(String str:ans){
			bw.write(counter.get(str)+" ");
			bw.write(str+"\n");
		}//������ļ�
		
		br.close();
		bw.close();
	}	
}
