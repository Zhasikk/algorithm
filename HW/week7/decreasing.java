import java.util.*;
import java.util.Collection;
import java.io.*;

public class decreasing{
  public static void main(String[]args){
    int[] array={5,0,3,2,1,8};
    dec(array);
    }
    public static void dec(int[]array){
    int size=6;
    int[] sortarray={8,5,3,2,1,0};
    int[][] a=new int[size][size];
    for(int i=0;i<size;i++){
      for(int j=0;j<size;j++){
        a[i][j]=0;
      }
    }
    for(int i=0;i<size;i++){
      for(int j=0;j<size;j++){
        if(sortarray[i]==array[j] && i>0 && j>0){
          a[i][j]=a[i-1][j-1]+1;
        }
        else if(sortarray[i]==array[j]){
          a[i][j]=1;
        }
        else if(j-1>0 && i-1>0){
          a[i][j]=Math.max(a[i][j-1],a[i-1][j]);
        }
        else if(i-1>0){
          a[i][j]=a[i-1][j];
        }
        else if(j-1>0){
          a[i][j]=a[i][j-1];
        }
      }
    }
    System.out.print(a[size-1][size-1]);
    }
}
