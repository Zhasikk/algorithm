public class heapsort{
public static void main(String[]args){
  int[] arr={8,1,2,3,4,5,6,20};
  sort(arr);
}
public  static void sort(int[] array){
  maxheap(array);
  int n = array.length;
  while(n>1){
    n=n-1;
    int[] arr = new int[n];
    for(int j = 0; j < n; j++){
      arr[j] = array[j+1];
    }
    array = arr;
    maxheap(array);
  }
}
public static void heapify(int[] array,int i){
  int left=2*i;
  int right=2*i+1;
  int max;
  if(left<=array.length && array[i-1]<array[left-1]){
    max=left;
  }
  else{
    max=i;
  }
  if(right<=array.length && array[max-1]<array[right-1]){
    max=right;
  }
  if(max!=i){
    int temp=array[i-1];
    array[i-1]=array[max-1];
    array[max-1]=temp;
  }
}
public static void maxheap(int[] array){
  for(int j=(int)Math.floor(array.length/2);j>=1;j--){
      heapify(array,j);
    }
    System.out.print(array[0]+" ");
  }
}
