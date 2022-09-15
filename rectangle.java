import java.io.*;
class rectangle_f{
  private  int len , brd;
  public void GetData(){
    try {
      BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter Length ");
      len=Integer.parseInt(br.readLine());
      System.out.println("Enter  breadth ");
      brd=Integer.parseInt(br.readLine());
    }
    catch (IOException e) {
      System.out.println("Error in input");
    }
  }

  public void SetData(int l,int b){
    len=l;
    brd=b;
  }
  public void ShowData(){
    System.out.println("breadth "+brd);
    System.out.println("Length "+len);
  }
  public void AreaPeri(){
    int a ,p;
    a=len*brd;
    p=2*(len+brd);
    System.out.println("Area "+a);
    System.out.println("Perimeter "+p);
  }
}
 public class  rectangle {
   public static void main(String[] args) {
     rectangle_f r1,r2,r3;

 r1=new rectangle_f();
 r2=new rectangle_f();
 r3=new rectangle_f();

 r1.GetData();
 r2.GetData();
 r3.GetData();

 r1.SetData(10,20);
 // r2.SetData();
 // r3.SetData();
 r1.ShowData();
 r2.ShowData();
 r3.ShowData();
 
 r1.AreaPeri();
 r2.AreaPeri();
 r3.AreaPeri();

   }
 }
