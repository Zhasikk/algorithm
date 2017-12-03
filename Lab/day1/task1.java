import java.util.Scanner;

public class task1{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int delta=b*b-4*a*c;
		if(delta<0){
			System.out.print("delta is false");
		}
		else{
			System.out.println("X1="+(-b+Math.sqrt(delta))/(2*a));
			System.out.println("X2="+(-b-Math.sqrt(delta))/(2*a));
		}
	}
}