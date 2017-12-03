public class goldmine{
		public static void main(String[] args){
			int[][] a = {{8,9,2},
						{9,7,3},
						{2,8,2}};
			int size = 3;
			int max=0;
			for(int j = 1;j<size; j++){
				for(int i = 0; i<size;i++){
					int left = a[i][j-1];
					int leftTop = 0;
					if(i-1>0){ leftTop  = a[i-1][j-1];}
					int leftBottom = 0;
					if(i<size-1 ){ leftBottom = a[i+1][j-1];}
					a[i][j] = Math.max(left,Math.max(leftBottom,leftTop))+ a[i][j];
				}
			}

			for(int i = 0; i<size; i++){
				for(int j = 0 ; j<size; j++){
					if(max<a[i][j]){
						max=a[i][j];
					}
				}
				System.out.println(max);
			}
		}
}
