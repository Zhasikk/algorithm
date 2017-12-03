import java.util.*;
public class HWtask2 {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arrayOfTimes = new int[1439];
		for (int i = 0; i < n; i++){
			String start = input.next();
			String end = input.next();
			
			int startT = (Integer.parseInt(start.split(":")[0]) *60)  + Integer.parseInt(start.split(":")[1]);
			int endT = (Integer.parseInt(end.split(":")[0]) *60)  + Integer.parseInt(end.split(":")[1]);
			
			for (int j = startT; j <= endT; j++){
				arrayOfTimes[j]++;
			}
		}
		int max = 0;
		for(int count : arrayOfTimes){
			if(count > max){
				max = count;
			}
		}
		System.out.println(max);
	}
}