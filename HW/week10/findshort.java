import java.util.*;
import java.io.*;

public class findshort{
public static void main(String[]args){
  Scanner input=new Scanner(System.in);
  int size=input.nextInt();
  int[][] map=new int[size][size];
  int[] count=new int[size];
  boolean[] used= new boolean[size];
  int i=0;
  for(int row=0;row<size;row++){
    used[row]=false;
    count[row]=0;
    for(int column=0;column<size;column++){
      map[row][column]=input.nextInt();
    }
  }
  for(int row=0;row<size;row++){
    for(int column=0;column<size;column++){
      if(map[row][column]!=0){
        count[column]=map[row][column];
      }
    }
  }

  for(int column=0;column<size;column++){
    System.out.print(" "+sum[column]);
  }


  for(int row=0;row<size;row++){
    sum[row]+=map[row][i];
    i++;
  }
  System.out.println(" ");

    for(int column=0;column<size;column++){
      System.out.print(" "+sum[column]);
    }
}
}
