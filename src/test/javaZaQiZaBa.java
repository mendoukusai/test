package test;

public class javaZaQiZaBa {//java杂七杂八的总结

	public static void main(String[] args) {
		String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program" + "ming";

	}
	public static void testDuanLuYu(){//这里回顾一下&和&&
		//首先是&的按位与的功能
		int a=1;
		int b=2;
//		System.out.println(a&b);//按位与
//		System.out.println(a^b);//按位异或
//		System.out.println(a|b);//按位或
		
		//然后是&的逻辑与和&&的短路与
		
		if(a==2 && b++ ==2){};//因为前半项已经false,没有必要看后半项,&&短路了后半表达式,b不会++
		System.out.println(b);
		
		if(a==2 & b++ ==2){};//&不会短路,俩个表达式都执行,b++为3
		System.out.println(b);	
	}
	public static void testEqualheDengHao(){//看一下equal和==的关系
		//== 是判断地址是否相同,没有被重写的equal就是直接返回 this == obj 和==等效
		//像string 等类有重写过equal类,就算地址不一样,也会具体看内容(char数组)的值相等不相等
		//
		
		String a = new String("ab"); 
		String b = new String("ab"); 
		String aa = "ab"; 
		String bb = "ab"; 
		if (aa == bb) // true
			System.out.println("aa==bb");
		if (a == b) // false
			System.out.println("a==b");
		if (a.equals(b)) // true
			System.out.println("aEQb");
		if (42 == 42.0)  // true
			System.out.println("true");
	}
}
