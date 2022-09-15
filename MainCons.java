import java.io.*;
class Int {
  private int i;
  public void GetData (){
    try{
      BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter Number");
      i=Integer.parseInt(br.readLine());

    }
      catch (IOException e) {
        System.out.println("Error in Input , try again ");
      }
  }

public void SetData(int j){
  i=j;
}
public Int(){
  System.out.println("value of i in zero constructor function "+i);
} // zero argument constructor
public Int(int j){
  i=j; // one argument constructor
  System.out.println("value of i in constructor with argument int j= "+i);
}

public void ShowData(){
  System.out.println("value of i in ShowData fx "+i);
  System.out.println("____________________________________________");
}
}

class MainCons{
  public static void main(String[] args) {
    Int i1, i2,i3;
    i1=new Int(100);
    i1.ShowData();


    i2=new Int();
    i2.ShowData();
    i2.GetData();
    i2.ShowData();

    i3=new Int();
    i3.ShowData();
    i3.GetData();
    i3.ShowData();
    System.out.println("____________________________________________");
    i1.ShowData();
    i2.ShowData();
    i3.ShowData();
  }
}
