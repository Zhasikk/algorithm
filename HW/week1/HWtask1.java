import java.util.Scanner;

public class HWtask1{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String str=input.next();
		int max=0;
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='0'){
				count++;
					if(count>max){
						max=count;
				}
			}
			else{
				count=0;
			}
		}
		System.out.print(max);
	}
}