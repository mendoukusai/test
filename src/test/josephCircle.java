package test;

public class josephCircle {//约瑟夫环问题描述：n个人围成一圈，挨个报数，报到k的拉出去毙了，然后第k+1个人从1开始报数。问最后活下来的是谁。
	
//解题公式f(k,n)=[f(k-1,n)+n] mod k ,即k和k-1人的时候，最后活下来的人是一个人，但是编号差了n(画个图看一下编号规律，很直观)
	
// 1 2 3 4 5 .. n n+1 n+2 n+3       k个人，干掉n
// ..           x 1   2   3         n给干掉了，剩下人的编号
	
	public static void main(String[] args) {
		System.out.println(josephcircle(10,3));
	}
	
	public static int josephcircle(int k,int n){
		int index=1;//从总一个人开始，活下来人的编号
		
		for(int i=2;i<=k;i++)
			index=(index+n)%i==0?i:(index+n)%i;//不能余0，余0的话值为i
		
		return index;
	}
}
