import java.util.*;
import java.io.*;
import java.lang.*;

public class findvertex{
public static void main(String[]args){
  Scanner input=new Scanner(System.in);
  int size=input.nextInt();
  int INF=1000000000;
  int[] p=new int[size];
  p[0]=-1;
  int[] d=new int[size];
  boolean[] used=new boolean[size];
  int min;
  int[][] map=new int[size][size];
  for(int row=0;row<size;row++){
    used[row]=false;
    d[row]=INF;
    p[row]=-1;
    for(int column=0;column<size;column++){
      map[row][column]=input.nextInt();
      if (map[row][column]==0){
        map[row][column]=2*INF;
      }
    }
  }
  d[0]=0;
  for(int i=0;i<size;i++){
    int v=-1;
    for(int j=0;j<size;j++){
      if( used[j]==false && (v==-1 || d[j]<d[v]) ){
        v=j;
      }
    }
    if(d[v]==INF){
      break;
    }
    used[v]=true;
    for(int j=0;j<size;j++){
      if(map[v][j]==2*INF){
        continue;
      }
      int to=j;
      int len=map[v][j];
      if(d[v]+len<d[to]){
        d[to]=d[v]+len;
        p[to]=v;
      }
    }
  }
  p[0]=-1;
  System.out.println(d[size-1]);
  int cur=p[size-1];
  int [] res = new int[size];
  int k = 1;
  while(cur!=-1){
    res[k++]=cur;
    cur=p[cur];
  }
  res[0]=size-1;
  for (int i = k-1; i >=0 ; --i){
      System.out.print(res[i]+" ");
  }
}
}
