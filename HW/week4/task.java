import java.util.*;
class task{
  public static int startX, startY, endX, endY, size;
  public static int[][] map;
  public static Queue<Integer> queX = new LinkedList<>();
  public static Queue<Integer> queY = new LinkedList<>();
  public static void main(String []args){
		Scanner in = new Scanner(System.in);
        size = 8;
        map = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                int ch = in.nextInt();
                if(ch == 1) {map[j][i] = 1; startX = j; startY = i;}
                else if(ch == 2){endX = j; endY = i;}
            }
        }
        queX.offer(startX);
        queY.offer(startY);
        while(!queX.isEmpty() && (map[endX][endY] == 0)){
          int x = queX.poll();
          int y = queY.poll();
          int j = 2, i = 1;
            if((x-i)>=0 && (y-j>=0) && (map[x-i][y-j] == 0)){
              map[x-i][y-j] = map[x][y] + 1;
              queX.offer(x-i);
              queY.offer(y-j);
            }
            if((x-i)>=0 && (y+j<size) && (map[x-i][y+j] == 0)){
              map[x-i][y+j] = map[x][y] + 1;
              queX.offer(x-i);
              queY.offer(y+j);
            }
            if((x+i)<size && (y-j>=0) && (map[x+i][y-j] == 0)){
              map[x+i][y-j] = map[x][y] + 1;
              queX.offer(x+i);
              queY.offer(y-j);
            }
            if((x+i)<size && (y+j<size) && (map[x+i][y+j] == 0)){
              map[x+i][y+j] = map[x][y] + 1;                       
              queX.offer(x+i);
              queY.offer(y+j);
            }
            if((x+j)<size && (y+i<size) && (map[x+j][y+i] == 0)){
              map[x+j][y+i] = map[x][y] + 1;
              queX.offer(x+j);
              queY.offer(y+i);
            }
            if((x-j)>=0 && (y+i<size) && (map[x-j][y+i] == 0)){
              map[x-j][y+i] = map[x][y] + 1;
              queX.offer(x-j);
              queY.offer(y+i);
            }
            if((x+j)<size && (y-i>=0) && (map[x+j][y-i] == 0)){
              map[x+j][y-i] = map[x][y] + 1;
              queX.offer(x+j);
              queY.offer(y-i);
            }
            if((x+j)<size && (y+i<size) && (map[x+j][y+i] == 0)){
              map[x+j][y+i] = map[x][y] + 1;
              queX.offer(x+j);
              queY.offer(y+i);
            }
           
          }


          if(map[endX][endY]>0){
            System.out.print("Knight moved in " + (map[endX][endY]-1) + " steps");
          }
          else{
            System.out.print("No solution");
          }
  }
}
