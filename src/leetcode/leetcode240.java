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
//leetcode240 ，“有序”二维数组排序，数组左到右有序，上到下有序，(即左下和右上的关系不清)
//经典思路，从右上角开始比较，一次一定可以排除一整行或者列
}
