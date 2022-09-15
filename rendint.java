import java.lang.Math.*;
import java.util.*;
class rendint{
  public  static void main(String [] args ){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of Number array");
    int j,i,temp;
    int size=sc.nextInt();
    int num[]=new int[size];
      System.out.println("RAW SET_________");
    for (i=0;i<size;i++) {
      double dnum=Math.random()*1000;
      int inum=(int)dnum;
      num[i]=inum;
    }
    for ( i=0;i<size ;i++) {

  System.out.print(num[i]+",");

    }
    System.out.println();
      System.out.println("SORTED SET______");

      for (i=0;i<size;i++ ) {

        for (j=i+1;j<size ;j++ )

        {
          if( num[j]< num[i]){
            temp=num[i];
            num[i]=num[j];
            num[j]=temp;
          }

          }
            System.out.print(num[i]+",");
        }
        System.out.println();
      }
}
