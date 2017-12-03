import java.util.*;

public class rectmaxsum{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int row=input.nextInt();
    int column=input.nextInt();
    int[][] array=new int[row][column];
    int max=0;
    for(int i=0;i<row;i++){
      for(int j=0;j<column;j++){
        array[i][j]=input.nextInt();
      }
    }
    for(int i=0;i<row;i++){
      for(int j=0;j<column;j++){
        int sum=0;
        for(int l=0;l<=i;l++){
          for(int m=0;m<=j;m++){
              sum+=array[l][m];
     }
    }
    if(sum>max){
      max=sum;
    }
  }
}
    System.out.println("Max sum is : "+max);
  }
}
