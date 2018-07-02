package test;

public class heapSortTest {
	//����ڵ�i�ĸ��ڵ�,i==0?null:(i-1)/2
	//����ڵ�i�����Ҷ���,i*2+1,i*2+2
	public static void main(String[] args) {
		int[] heapArray={9,5,1,2,8,4,3};
		createMaxHeap(heapArray);
		heapSort(heapArray);
	
		for(int i:heapArray) System.out.print(i+" ");
	}
	
	public static void createMaxHeap(int[] array){//���������
		for(int i=(array.length-2)/2;i>=0;i--){//�����һ���ڵ�ĸ��ڵ㿪ʼ���Ӻ���ǰ����
			adjustToMaxHeap(array,i,array.length);
		}
		return;
	}
	
	public static void adjustToMaxHeap(int[] array,int k,int length){//���µ���(�ؼ�)�����ɴ����
		int temp=array[k];
		
		for(int i=k*2+1;i<length;i=i*2+1){
			if(i+1<length&&array[i]<array[i+1]) i=i+1;//k���Ҷ��Ӵ��ڣ��������ȱ�
			
			if(array[i]<temp) {//�ϴ�Ķ������ûk��,�������
				break;		
			}
			else{              //�ϴ�Ķ��Ӻ�k����ֵ
				array[k]=array[i];
				k=i;
			}
		}
		array[k]=temp;
		
		return;
	}
	
	public static void heapSort(int[] array){//���ڵ������ֵ,���������һ��ֵ����λ��,Ȼ���ʣ���������������
		for(int i=array.length-1;i>0;i--){
			int temp=array[0];
			array[0]=array[i];
			array[i]=temp;
			adjustToMaxHeap(array, 0, i);
		}
	}

}
