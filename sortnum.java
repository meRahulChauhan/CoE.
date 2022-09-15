import java.util.*;
import java.lang.Math.*; 
class sortnum{
    public static void main(String [] args){
 int size,i,j,inum,temp;
 double dnum; 
 System.out.println("Enter Size of An array");
 Scanner sc=new Scanner(System.in);
 size=sc.nextInt();
 int num[]=new int[size];
 System.out.println("Unsorted Array");
 for(i=0;i<size;i++){
 dnum=Math.random()*100;
 inum=(int)dnum;
 num[i]=inum;
 }
 for(i=0;i<size;i++){
    System.out.print(num[i]+",");

 }
 System.out.println("");
  System.out.println("Sorted Array");
 for(i=0;i<size;i++){
    for(j=i+1;j<size;j++){

   
    if(num[j]<num[i]){
    temp=num[i];
    num[i]=num[j];
    num[j]=temp;

    }
 }
 System.out.print(num[i]+",");
 }
 System.out.println("");
    }
}
