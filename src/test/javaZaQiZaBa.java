package test;

public class javaZaQiZaBa {//java�����Ӱ˵��ܽ�

	public static void main(String[] args) {
		String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program" + "ming";

	}
	public static void testDuanLuYu(){//����ع�һ��&��&&
		//������&�İ�λ��Ĺ���
		int a=1;
		int b=2;
//		System.out.println(a&b);//��λ��
//		System.out.println(a^b);//��λ���
//		System.out.println(a|b);//��λ��
		
		//Ȼ����&���߼����&&�Ķ�·��
		
		if(a==2 && b++ ==2){};//��Ϊǰ�����Ѿ�false,û�б�Ҫ�������,&&��·�˺����ʽ,b����++
		System.out.println(b);
		
		if(a==2 & b++ ==2){};//&�����·,�������ʽ��ִ��,b++Ϊ3
		System.out.println(b);	
	}
	public static void testEqualheDengHao(){//��һ��equal��==�Ĺ�ϵ
		//== ���жϵ�ַ�Ƿ���ͬ,û�б���д��equal����ֱ�ӷ��� this == obj ��==��Ч
		//��string ��������д��equal��,�����ַ��һ��,Ҳ����忴����(char����)��ֵ��Ȳ����
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
