package leetcode;

public class leetcode845 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int longestMountain(int[] A) {//leetcode 845,���˼·����һ���ƣ�����Ҫ��1�������O(1)�ռ䣬���ǿ�����ǩ��two pointer��������˫ָ��˼·
        if(A.length==1) return 0;
        int ans=1;
        
        for(int i=1;i<A.length;i++){
            int temp=1;
            
            if(A[i]<=A[i-1]) continue;
            
            while(i<A.length&&A[i]>A[i-1]){
                temp++;
                i++;
            }
            
            if(i==A.length) break;
            
            if(A[i]==A[i-1]) continue;
                
            while(i<A.length&&A[i]<A[i-1]){
                temp++;
                i++;
            }
            
            ans=temp>ans?temp:ans;
            i--;  
        }
        return ans==1?0:ans;
    }

}
