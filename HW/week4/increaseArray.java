import java.util.Scanner;
import java.util.ArrayList;


public class increaseArray{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of your array:");
		int size = in.nextInt();
		int[] array = new int[size];
		System.out.println("Now enter your array: ");
		for(int i= 0; i < size; i++){
			int n = in.nextInt();
			array[i] = n;
		}
		for(int i = 0; i < size; i++){
			int k = 0;
			for(int j = i+1; j < size; j++){
				if(array[i]<array[j]){
					array[i] = array[j];
					k = 1;
					break;
				}
			}
			if(k==0){
				array[i] = 0;
			}
		}
		System.out.print("[");
		int k = 1;
		for(int i = 0; i < size; i++){
			System.out.print(array[i]);
			if(k<size){
				System.out.print(",");
				k++;
			}

		}
		System.out.print("]");

	}
}