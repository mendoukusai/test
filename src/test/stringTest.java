package test;

public class stringTest {

	public static void main(String[] args) {//ͨ������ʵ������⣬�ַ��������صĸ���
		//jdk1.6�Ժ��ַ����������Ƶ��˶�����
		
		String str1="abc";
		String str2="abc";
		String str3= new String("abc");
		String str4= new String("abc");
		
		System.out.println(str1==str2);//true,1,2�����ַ������������Ե�ַ��ͬ
		System.out.println(str1==str3);//false,3���ڶ���new��һ���¶��󣬶����ڲ�ָ���ַ���������
		System.out.println(str3==str4);//ͬ��3��4�����ڶ��еĲ�ͬ������ѣ���ַ��ͬ
		

//		�����⣺String str4 = new String(��abc��) �������ٸ�����
//		1.���ַ��������ز���abc�Ƿ����(������費����),����abc�Ķ���; 1������
//		2.�ڶ���newһ��String("abc")�Ķ���,��ַ��str4,��Ϊ����; 2������,1������
//
//		���꣺String str1 = new String("A"+"B") ; �ᴴ�����ٸ�����? 
//			String str2 = new String("ABC") + "ABC" ; �ᴴ�����ٸ�����?
//
//			str1��
//			�ַ��������أ�"A","B","AB" : 3��
//			�ѣ�new String("AB") ��1��
//			���ã� str1 ��1��
//			�ܹ� �� 5��
//
//			str2 ��
//			�ַ��������أ�"ABC","ABCABC" : 2��
//			�ѣ�new String("ABC") ��1������2��...���ﲻ���
//			���ã� str2 ��1��

		//String.intern()������ʵ�� ##intern,Ӣ�����,��������˼
		//������˵����,����ַ����ڳ������������,�ͷ��ظ��ַ�����ַ;���������,�ʹ��������ظõ�ַ;
		
		System.out.println(str3.intern()==str1);//����������true,��Ϊ���ص���str3���ַ���abc�ڳ���������ĵ�ַ
		System.out.println(str3==str1);//��û�иı�str3�����ﻹ��false
		
		//1.6��1.7�Ĳ�����ڣ�1.6,���������û��,�򴴽�һ�����������ص�ַ
		//����1.7,���������û��,ֱ�ӷ���str���������......�о�������ô����̫����
		
		
		
		//�A��
		//���������+���о�
		String test1="abc";
		String test2="efg";
		String test3="abcefg";
		String test4=str1+str2;
		String test5="abc"+"efg";
		System.out.println(test3==test4);//false
		System.out.println(test3==test5);//true
		//��ζ������,ֻ֪��string��+�����������ͨ��stringbuilder��append
	}
}
