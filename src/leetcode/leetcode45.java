package leetcode;

public class leetcode45 {

	public static void main(String[] args) {
		// leetcode45,再做，之前貌似暴力解的

	}
//	public int jump(int[] nums) {
//        int[] ans=new int[nums.length];
//        ans[0]=0;
//        for(int i=0;i<ans.length;i++){
//        	for(int j=i+1;j<ans.length&&j<=i+nums[i];j++){
//        		ans[j]=ans[j]==0?ans[i]+1:Math.min(ans[i]+1, ans[j]);
//        	}
//        }
//        return ans[nums.length-1];
//    }//没有任何处理的写法，超时了俩组数据
	
	public int jump(int[] nums) {
        int[] ans=new int[nums.length];
        ans[0]=0;
        int step=1;
        int cur=nums[0];
        int next=cur;
        
        int i=1;
        while(i<ans.length){
            while(i<ans.length&&i<=cur){
                ans[i]=step;
                next=next>i+nums[i]?next:i+nums[i];
                i++;
            }
            step++;
            i=cur+1;
            cur=next;
        }
        return ans[nums.length-1];
    }
}
