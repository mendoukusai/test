package test;

public class stringTest {

	public static void main(String[] args) {//通过各种实验来理解，字符串常量池的概念
		//jdk1.6以后字符串常量池移到了堆里面
		
		String str1="abc";
		String str2="abc";
		String str3= new String("abc");
		String str4= new String("abc");
		
		System.out.println(str1==str2);//true,1,2都是字符串常量，所以地址相同
		System.out.println(str1==str3);//false,3是在堆中new了一个新对象，对象内部指向字符串常量池
		System.out.println(str3==str4);//同理，3，4都是在堆中的不同对象而已，地址不同
		

//		面试题：String str4 = new String(“abc”) 创建多少个对象？
//		1.在字符串常量池查找abc是否存在(这里假设不存在),创立abc的对象; 1个对象
//		2.在堆中new一个String("abc")的对象,地址给str4,作为引用; 2个对象,1个引用
//
//		引申：String str1 = new String("A"+"B") ; 会创建多少个对象? 
//			String str2 = new String("ABC") + "ABC" ; 会创建多少个对象?
//
//			str1：
//			字符串常量池："A","B","AB" : 3个
//			堆：new String("AB") ：1个
//			引用： str1 ：1个
//			总共 ： 5个
//
//			str2 ：
//			字符串常量池："ABC","ABCABC" : 2个
//			堆：new String("ABC") ：1个还是2个...这里不清楚
//			引用： str2 ：1个

		//String.intern()的若干实验 ##intern,英语扣留,拘留的意思
		//看网上说的是,如果字符串在常量池里面存在,就返回该字符串地址;如果不存在,就创建并返回该地址;
		
		System.out.println(str3.intern()==str1);//所以这里是true,因为返回的是str3的字符串abc在常量池里面的地址
		System.out.println(str3==str1);//并没有改变str3，这里还是false
		
		//1.6和1.7的差别在于：1.6,如果常量池没有,则创建一个常量并返回地址
		//但是1.7,如果常量池没有,直接返回str对象的引用......感觉这里这么做不太合适
		
		
		
		//続き
		//对于运算符+的研究
		String test1="abc";
		String test2="efg";
		String test3="abcefg";
		String test4=str1+str2;
		String test5="abc"+"efg";
		System.out.println(test3==test4);//false
		System.out.println(test3==test5);//true
		//意味不明中,只知道string的+运算符重载是通过stringbuilder的append
	}
}
