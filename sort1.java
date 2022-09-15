import java.util.*;
public class sort1{
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter size of Array ");
    int i,j,temp,size;
    size=sc.nextInt();
    int num[]=new int[size];
    System.out.println("Please enter "+size+" Int type data");

    for(i=0;i<size;i++){
         num[i]=sc.nextInt();
    }

    for(i=0;i<size;i++){
        System.out.println("value  in num["+i+"] =" + num[i]);
    }

    System.out.println("sorting program");
    for (i=0;i<size ;i++ )    {

      for (j=i+1;j<size ;j++ ) {
       // algorithm  for sorting
    if(num[j]<num[i]) {
      // Swapping
                   temp = num[i];
                   num[i] = num[j];
                   num[j] = temp;
    }
}
System.out.println(num[i]);
   }
  }
}
