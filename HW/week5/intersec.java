import java.util.*;

public class intersec{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int[] x = new int[4]; 
		int[] y = new int[4];
		int[] z = new int[4];
		for(int i=0; i<4; i++){ 
			x[i] = input.nextInt();
			y[i] = input.nextInt();
			z[i] = input.nextInt();
		}
		intersec L = new intersec();
		L.Intersection(x, y, z);
	}
	public void Intersection(int[] X, int[] Y, int[] Z){

		double x, y, z;
		double a1, b1, c1, t1;
		a1 = X[1] - X[0];
		b1 = Y[1] - Y[0];
		c1 = Z[1] - Z[0];
		
		double a2, b2, c2, t2;
		a2 = X[3] - X[2];
		b2 = Y[3] - Y[2];
		c2 = Z[3] - Z[2];
		
		
		double m, n;
		if(a1/a2!=b1/b2){ 
			m = X[2] - X[0];
			n = Y[2] - Y[0];
			if((b2*a1 - a2*b1)!=0){
				t2 = (m*b1 - n*a1)/(b2*a1 - a2*b1);
				x =  X[2] +a2*t2;
				y = Y[2] +b2*t2;
				z = Z[2] +c2*t2;
				System.out.println("("+x+";"+y+";"+z+")");
			}
			else System.out.println("the denominator is 0");
		}
		else if(a1/a2!=c1/c2){
			m = X[2] - X[0];
			n = Z[2] - Z[0];
			if(c2*a1 - a2*c1!=0){
				t2 = (m*c1 - n*a1)/(c2*a1 - a2*c1);
				x =  X[2] +a2*t2;
				y = Y[2] +b2*t2;
				z = Z[2] +c2*t2;
				System.out.println("("+x+";"+y+";"+z+")");
			}
			else System.out.println("the denominator is 0");
		}  
		else if(b1/b2!=c1/c2){
			m = Y[2] - Y[0];
			n = Z[2] - Z[0];
			if(c2*b1 - b2*c1!=0){
				t2 = (m*c1 - n*b1)/(c2*b1 - b2*c1);
				x =  X[2] +a2*t2;
				y = Y[2] +b2*t2;
				z = Z[2] +c2*t2;
				System.out.println("("+x+";"+y+";"+z+")");
			}
			else System.out.println("the denominator is 0");
		}
		else System.out.println("Lines are parallel");
	}
}
