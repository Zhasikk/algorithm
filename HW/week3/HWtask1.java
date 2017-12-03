import java.util.*;
import java.io.*;

public class HWtask1{

	private static int[] sortMerge(int[] arr) {
	int len = arr.length;
	if (len < 2) return arr;
	int middle = len / 2;
	return merge(sortMerge(Arrays.copyOfRange(arr, 0, middle)),
	             sortMerge(Arrays.copyOfRange(arr, middle, len)));
	}

	private static int[] merge(int[] arr_1, int[] arr_2) {
	int len_1 = arr_1.length; 
	int len_2 = arr_2.length;
	int a = 0;
	int b = 0;
	int len = len_1 + len_2;
	int[] result = new int[len];
	for (int i = 0; i < len; i++) {
		if (b < len_2 && a < len_1) {
			if (arr_1[a] > arr_2[b]) 
				result[i] = arr_2[b++];
			else result[i] = arr_1[a++];
		} else if (b < len_2) {
			result[i] = arr_2[b++];
		} else {
			result[i] = arr_1[a++];
		}
	}
	return result;
}

	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		String[] str=input.nextLine().split(" ");
		int[] array=new int[str.length];
		for(int i=0;i<str.length-1;i++){
			array[i]=Integer.parseInt(str[i]);
		}
		int[] fresult=sortMerge(array);
		for(int o=1;o<fresult.length;o++){
			System.out.print(fresult[o]+" ");
		}
	}
}