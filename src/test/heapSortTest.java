package test;

public class heapSortTest {
	//任意节点i的父节点,i==0?null:(i-1)/2
	//任意节点i的左右儿子,i*2+1,i*2+2
	public static void main(String[] args) {
		int[] heapArray={9,5,1,2,8,4,3};
		createMaxHeap(heapArray);
		heapSort(heapArray);
	
		for(int i:heapArray) System.out.print(i+" ");
	}
	
	public static void createMaxHeap(int[] array){//创建大根堆
		for(int i=(array.length-2)/2;i>=0;i--){//从最后一个节点的父节点开始，从后往前调整
			adjustToMaxHeap(array,i,array.length);
		}
		return;
	}
	
	public static void adjustToMaxHeap(int[] array,int k,int length){//自下到上(关键)调整成大根堆
		int temp=array[k];
		
		for(int i=k*2+1;i<length;i=i*2+1){
			if(i+1<length&&array[i]<array[i+1]) i=i+1;//k的右儿子存在，则左右先比
			
			if(array[i]<temp) {//较大的儿子如果没k大,调整完成
				break;		
			}
			else{              //较大的儿子和k交换值
				array[k]=array[i];
				k=i;
			}
		}
		array[k]=temp;
		
		return;
	}
	
	public static void heapSort(int[] array){//根节点是最大值,和数组最后一个值交换位置,然后对剩余的数组调整大根堆
		for(int i=array.length-1;i>0;i--){
			int temp=array[0];
			array[0]=array[i];
			array[i]=temp;
			adjustToMaxHeap(array, 0, i);
		}
	}

}
