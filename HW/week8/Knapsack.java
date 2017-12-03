public class Knapsack{
	public static void main(String[] args){
		int[] p = {5,7,9,11,13};
		int[][] a = new int[6][21];
		for(int i = 1; i<6;i++)
			for(int j = 0; j<21; j++)
				if(j-p[i-1]>=0)
					a[i][j] = Math.max(a[i-1][j],a[i-1][j-p[i-1]]+p[i-1]);
				else
					a[i][j] = a[i-1][j];
					for(int i = 0; i<6;i++){
						for(int j = 0; j<21; j++){
						System.out.print(a[i][j]+" ");}
						System.out.println();
					}

	}
}
