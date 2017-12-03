import java.util.Scanner;

public class HWtask2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int multi=input.nextInt();
		int sum=input.nextInt();
		int dis=(int)Math.pow(sum,2)-(int)4*multi;
		int result1=(sum-(int)Math.pow(dis,0.5))/2;
		int result2=(sum+(int)Math.pow(dis,0.5))/2;
		int result3=sum-result1;
		int	result4=sum-result2;
		if(result4*result3==multi && result3+result1==sum){
			System.out.println("Result1"+"="+result1);
			System.out.println("Result3"+"="+result3);
		}
		else{
			System.out.print("false");
		}
	}
}