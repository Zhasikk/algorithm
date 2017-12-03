public class HWtask1{
	public static void sudoku(int n){
		boolean check=false;
		int[][] arr = new int[][]{
			{5,3,4,6,7,8,9,1,2},
			{6,7,2,1,9,5,3,4,8},
			{1,9,8,3,4,2,5,6,7},
			{8,5,9,7,6,1,4,2,3},
			{4,2,6,8,5,3,7,9,1},
			{7,1,3,9,2,4,8,5,6},
			{9,6,1,5,3,7,2,8,4},
			{2,8,7,4,1,9,6,3,5},
			{3,4,5,2,8,6,1,7,9}
		};
		int[] count=new int[n*n];
		int[] count3=new int[n*n];
		for(int i=0;i<n*n;i++){
			for(int j=0;j<n*n;j++){
				count[arr[i][j]-1]+=1;
				count3[arr[j][i]-1]+=1;
			}
			for(int p:count){
				if(p==0){
					check=true;
				}
			}
			for(int p:count3){
				if(p==0){
					check=true;
				}
			}
		}
	for(int k=0;k<n;k++){
		for(int t=0;t<n;t++){
		int[] countn=new int[n*n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				countn[arr[i+(k*n)][j+(t*n)]-1]+=1;
			}
		}
		for(int p:countn){
				if(p==0){
					check=true;
				}
			}
	}
}
		if(check){
			System.out.print("Error");
		}
		else{
			System.out.print("Good");
		}
	}
	public static void main(String[]args){
		sudoku(2);
	}
}