import java.util.Scanner;

public class task2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String a=input.next();
		int result=0;
		int t=0;
		for(int i=a.length()-1;i>=0;i--){
		result+=Math.pow(2,i)*(a.charAt(t)-'0');
		t++;
		}
		System.out.print(result);
	}
}