package leetcode;

public class leetcode779 {

	public static void main(String[] args) {
		//779�⣬��һ��ȫ��0���ڶ��п�ʼ0����01,1����10
		// 000000
		// 010101
		// 01100110
		// .....
		//
		//���N�е�K������1����0
		
		//K��ż����f(N,K)=!f(N-1,K/2)   ��Ϊ����ֻ��1��0�����Ե���boolean����
		//K��������f(N,K)=f(N-1,K+1/2)
		
		//ѭ��ֹͣ������N����KΪ1��ʱ��ֵһ����0�����ʱ��mark��true��return 0����֮1
	}
    public int kthGrammar(int N, int K) {
        boolean mark=true;
        while(N>1&&K!=1){
            if(K%2==0) mark=!mark;
            else K+=1;
            
            K=K/2;
            N--;
        }
        
        if(!mark) return 1;
        return 0;
    }
}
