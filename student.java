import java.io.*;
class student{
  public static void main(String[] args) {
    int i , avg,sum=0;
    int [] marks;
    marks =new int[30];

    try
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

      for (i=0;i<=29 ;i++ ) {
        System.out.println("enter marks");
        marks[i]=Integer.parseInt(br.readLine());
      }

      for (i=0;i<=29 ;i++ )
        sum=sum+marks[i];
        avg=sum/30;
        System.out.println("Average marks ="+avg);

      }


    catch (IOException e) {
      System.out.println("error in input");
    }
}
}
