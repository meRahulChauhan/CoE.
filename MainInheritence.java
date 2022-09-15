class Ex {
  public void Fun(){
    System.out.println("Inside Fun function");
  }
  public void Save(){
    System.out.println("Inside Save function");
  }
  public void Enc(){
    System.out.println("Inside Enc function");
  }
  public void Open(){
    System.out.println("Inside Open function");
  }
}

class NewEx extends Ex{
  public void Save(){
    System.out.println("Inside NewEx save function");
    super.Save();
  }

  public void Enc(){
    System.out.println("Inside NewEx Enc function");
  }
  public void AutoUpdate(){
    System.out.println("Inside NewEx AutoUpdate function");
  }
  public  void Open(){
    System.out.println("Inside NewEx Open function");
    super.Open();
  }
}
public class MainInheritence{
  public static void main(String[] args) {
    NewEx e =new NewEx();
    e.Fun();
    e.Save();
    e.Enc();
    e.AutoUpdate();
    e.Open();
  }

}
