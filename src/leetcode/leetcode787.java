package leetcode;

public class leetcode787 {
//	int cost=-1;
//	int ans=-1;
//    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
//        
//        int[][] costA=new int[n][n];
//		for(int i=0;i<n;i++){
//			for(int j=0;j<n;j++){
//				if(i==j) costA[i][j]=0;
//				else costA[i][j]=-1;
//			}
//		}//���ľ����ʼ��-1��0
//		
//		for(int[] i:flights)
//			costA[i[0]][i[1]]=i[2]; //����flighs������costA����	
//		
//		findCheapestPriceImp(n,costA,src,dst,K);
//		return ans;
//    }
//    
//    public void findCheapestPriceImp(int n, int[][] costA, int src, int dst, int K) {//dfs��������
//		if(K<0) return;
//		for(int i=0;i<n;i++){
//			if(costA[src][i]!=0&&costA[src][i]!=-1){
//				K--;
//                boolean costMark=false;
//                if(cost==-1) costMark=true;
//				cost+=costMark?costA[src][i]+1:costA[src][i];
//				if(i==dst){
//					ans=ans==-1?cost:Math.min(cost,ans);
//                    K++;
//                    cost-=costMark?costA[src][i]+1:costA[src][i];
//					continue;
//				}
//				else{
//					findCheapestPriceImp(n,costA,i,dst,K);
//				}	
//                K++;
//                cost-=costMark?costA[src][i]+1:costA[src][i];
//			}
//		}
//    }
	
	/*������������ȱ��������֣�����27/42����ʱ*/
	
	//����dp
	/*
	 * д��ͷ�����͵ľ�Ȼ���ξ͹��ˣ���ʼ�ǰѸ���flightsת���ڽӾ�����ʽ��costA[0][0]=0�����ɴ����-1����Ŀ������ʽ���ᴦ��
	 * dp��Ҫ˼·��ά����
	 *    ��n�� 0 1 2 3 4 5 6
	 * ����K��0
	 *       1
	 *       2
	 *       3
	 *       4
	 * ����һ����ά����
	 */
	int cost=-1;
	int ans=-1;
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        
        int[][] costA=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==j) costA[i][j]=0;
				else costA[i][j]=-1;
			}
		}//���ľ����ʼ��-1��0
		
		for(int[] i:flights)
			costA[i[0]][i[1]]=i[2]; //����flighs������costA����	
		
		
        int[][] dp =new int[K+1][n];
        
        for(int i=0;i<=K;i++){//��ʼ��
            for(int j=0;j<n;j++)
                dp[i][j]=-1;
        }
        for(int i=0;i<n;i++){
            if(costA[src][i]!=0&&costA[src][i]!=-1)
               dp[0][i]=costA[src][i];
        }
        
        for(int i=1;i<=K;i++){
            for(int j=0;j<n;j++){
                if(dp[i-1][j]!=-1){
                    
                    for(int p=0;p<n;p++){
                        if(costA[j][p]!=0&&costA[j][p]!=-1){
                            dp[i][p]=dp[i][p]==-1?costA[j][p]+dp[i-1][j]:Math.min(dp[i][p],costA[j][p]+dp[i-1][j]);
                        }       
                    }    
                }
            }   
        }
        
        int ans=-1;
        for(int i=0;i<=K;i++){
            if(dp[i][dst]!=-1)
                ans=ans==-1?dp[i][dst]:Math.min(ans,dp[i][dst]);
        }

		return ans;
    }
}
