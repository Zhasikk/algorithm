import java.util.*; 

public class polygon{ 
public static void main(String[] args){ 
Scanner in = new Scanner(System.in); 
System.out.println("Enter the size of polygon: "); 
int size = in.nextInt(); 
int[] xCoord = new int[size]; 
int[] yCoord = new int[size]; 
System.out.println("Enter X coordinates: "); 
for(int i = 0; i<size;i++){ 
xCoord[i]=in.nextInt(); 
} 
System.out.println("Enter Y coordinates: "); 
for(int j = 0; j<size;j++){ 
yCoord[j]=in.nextInt(); 
} 

System.out.println("area: "+findArea1(xCoord,yCoord,size)); 
System.out.println("area: "+findArea2(xCoord,yCoord,size)); 
} 
public static double findArea1(int[] x, int[] y, int size){ 
double area = 0; 
for(int k =0;k<size-1; k++){ 
if(x[k]<x[k+1]){ 
area+=(x[k]*y[k+1]-x[k+1]*y[k]); 
} 
else{ 
int temp = x[k]; 
x[k] = x[k+1]; 
x[k+1] =temp; 
area+=(x[k]*y[k+1]-x[k+1]*y[k]); 
} 
} 
area+=(x[size-1]*y[0]-x[0]*y[size-1]); 
area/=2; 
return Math.abs(area); 
} 
public static double findArea2(int[] x, int[] y, int size){ 
double area=0; 
int centerX=0; 
int centerY=0; 
double[] areaTr = new double[size]; 
double[] distTr = new double[size]; 
double[] distTrCent = new double[size]; 
double[] perTr = new double[size]; 

for(int i =0;i<size;i++){ 
centerX+=x[i]/size; 
centerY+=y[i]/size; 
} 

for(int j =0; j<size-1; j++){ 
distTr[j] = (Math.sqrt(Math.abs((x[j+1]-x[j])*(x[j+1]-x[j])+(y[j+1]-y[j])*(y[j+1]-y[j])))); 
distTrCent[j] = (Math.sqrt(Math.abs((centerX-x[j])*(centerX-x[j])+(centerY-y[j])*(centerY-y[j])))); 
} 
distTr[size-1] = (Math.sqrt(Math.abs((x[0]-x[size-1])*(x[0]-x[size-1])+(y[0]-y[size-1])*(y[0]-y[size-1])))); 
distTrCent[size-1] = (Math.sqrt(Math.abs((centerX-x[size-1])*(centerX-x[size-1])+(centerY-y[size-1])*(centerY-y[size-1])))); 


for(int z =0; z<size-1; z++){ 
perTr[z]=((distTr[z]+distTrCent[z]+distTrCent[z+1])/2); 
} 
perTr[size-1] = ((distTr[size-1]+distTrCent[0]+distTrCent[size-1])/2); 

for(int k =0;k<size-1;k++){ 
areaTr[k] = (Math.sqrt(Math.abs(perTr[k]*(perTr[k]-distTrCent[k])*(perTr[k]-distTrCent[k+1])*(perTr[k]-distTr[k])))); 
} 
areaTr[size-1] = (Math.sqrt(Math.abs((perTr[size-1]*(perTr[size-1]-distTrCent[0])*(perTr[size-1]-distTrCent[size-1])*(perTr[size-1]-distTr[size-1]))))); 

for(int ii =0; ii<size; ii++){ 
area+=areaTr[ii]; 
} 
return area; 


} 
}
