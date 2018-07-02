package test;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class test1 implements Cloneable{
	int a=1;
	char ch='c';
	String str=new String("123");
	//static final int tetst1weqw =1;
//	static{
//		System.out.println("我是一只静态块");
//	}
	test1(){
		System.out.println("im a gou zao qi");
	}
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		int i=0;
		i=i++;
		System.out.println(i);
		ArrayList l =new ArrayList();
		
	}
		
}
class test2{
	static{
		System.out.println("我是一只静态块");
	}
	public static void lalala(){
		System.out.println("我是一只静态方法");
	}
	test2(){
		System.out.println("im a gou zao qi");
	}
	
}


