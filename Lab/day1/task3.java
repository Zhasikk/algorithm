import java.util.Scanner;

public class task3{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		int count=1;
		int result=0;
		int expression=0;
		while(number!=0){
			expression=number%2;
			result=expression*count+result;
			count*=10;
			number=(int)(number/2);		
		}
		System.out.println(result);
	}
}