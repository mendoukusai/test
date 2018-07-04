package leetcode;

public class leetcode779 {

	public static void main(String[] args) {
		//779题，第一行全是0，第二行开始0换成01,1换成10
		// 000000
		// 010101
		// 01100110
		// .....
		//
		//求第N行第K个数是1还是0
		
		//K是偶数，f(N,K)=!f(N-1,K/2)   因为这里只有1和0，所以当做boolean处理
		//K是奇数，f(N,K)=f(N-1,K+1/2)
		
		//循环停止条件，N或者K为1的时候，值一定是0，这个时候mark是true，return 0，反之1
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
