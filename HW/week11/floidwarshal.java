import java.io.*;
import java.util.*;

public class floidwarshal{
 public static void main(String[]args){
   Scanner input = new Scanner(System.in);
   int size=input.nextInt();
   int inf=1000000000;
   int[][] array=new int[size][size];
   for(int i=0;i<size;i++){
     for(int j=0;j<size;j++){
       array[i][j]=input.nextInt();
    }
   }
   for(int i=0;i<size;i++){
     for(int j=0;j<size;j++){
       if(array[i][j]==5){
         array[i][j]=inf;
       }
     }
   }
   for(int k=0;k<size;k++){
     for(int i=0;i<size;i++){
      for(int j=0;j<size;j++){
        if(array[i][k]+array[k][j]<array[i][j]){
          array[i][j]=array[i][k]+array[k][j];
        }
      }
     }
   }
   for(int i=0;i<size;i++){
     System.out.println(" ");
     for(int j=0;j<size;j++){
       System.out.print(array[i][j]+" ");
     }
   }
 }
}
