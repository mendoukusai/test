package test;

public class josephCircle {//Լɪ������������n����Χ��һȦ����������������k������ȥ���ˣ�Ȼ���k+1���˴�1��ʼ��������������������˭��
	
//���⹫ʽf(k,n)=[f(k-1,n)+n] mod k ,��k��k-1�˵�ʱ����������������һ���ˣ����Ǳ�Ų���n(����ͼ��һ�±�Ź��ɣ���ֱ��)
	
// 1 2 3 4 5 .. n n+1 n+2 n+3       k���ˣ��ɵ�n
// ..           x 1   2   3         n���ɵ��ˣ�ʣ���˵ı��
	
	public static void main(String[] args) {
		System.out.println(josephcircle(10,3));
	}
	
	public static int josephcircle(int k,int n){
		int index=1;//����һ���˿�ʼ���������˵ı��
		
		for(int i=2;i<=k;i++)
			index=(index+n)%i==0?i:(index+n)%i;//������0����0�Ļ�ֵΪi
		
		return index;
	}
}
