import java.util.Scanner;
import java.util.*;

public class HWtask2{
    static int row;
    static int column;

    static int[][] matrix;
    static int[][] used;
    
    public static void dfs(int x, int y, String dir) {
        used[x][y] = 1;
            if(y<column-1 && matrix[x][y+1]!=1 && used[x][y+1]!=1){ 
                dfs(x,y+1,dir+"right");
            }
            if(y>0 && matrix[x][y-1]!=1 && used[x][y-1]!=1){
                dfs(x,y-1,dir+"left");
            }
            if(x<row-1 && matrix[x+1][y]!=1 && used[x+1][y]!=1){
                dfs(x+1,y,dir+"down");
            }
            if(x>0 && matrix[x-1][y]!=1 && used[x-1][y]!=1){
                dfs(x-1,y,dir+"up");
            }
            used[x][y] = 0;
            if(x==0 || x==row-1 || y==0 || y==column-1){
                System.out.println(dir);
            }
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        
        System.out.print("Row: ");
        row = sr.nextInt();
        System.out.print("Column: ");
        column = sr.nextInt();

        matrix = new int[row][column];
        used = new int[row][column];

        int startC = -1;
        int startR = -1;
        String dir = "";

    	for(int r = 0; r < row; r++){
    		for(int c = 0; c < column; c++){
    			int number = sr.nextInt();
    			matrix[r][c] = number;
    			if(matrix[r][c] == 2){
    				startC = c;
                    startR = r;
    			}
    		}
    	}
    	dfs(startR, startC, dir); 
    }
}