package leetcode;

public class leetcode240 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean searchMatrix(int[][] array, int target) {
        if(array.length==0) return false;
        int i=0;
        int j=array[0].length-1;
        while(i<array.length&&j>=0){
            if(array[i][j]==target) return true;
            if(array[i][j]<target) i++;
            else j--;
        }
        return false; 
    }
//leetcode240 �������򡱶�ά���������������������ϵ�������(�����º����ϵĹ�ϵ����)
//����˼·�������Ͻǿ�ʼ�Ƚϣ�һ��һ�������ų�һ���л�����
}
