package leetcode;

public class leetcode852 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ò�ƺܼ򵥣�leetcode852
	}
	public int peakIndexInMountainArray(int[] A) {
        int i=1;
        while(i<A.length&&A[i]>A[i-1]) i++;
        return i-1;
    }
}
