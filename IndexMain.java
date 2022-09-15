class Index{
  protected int Count;
public Index(){
  Count=0;
}
public Index(int c){
  Count =c;
}
public void Display(){
  System.out.println("Count ="+Count);
}
public void Increment(){
  Count +=1;
}

}
//derived class
 class Index1 extends Index{
   public void Decrement(){
     Count -=1;
   }
 }
 public class IndexMain{
   public static void main(String[] args) {
     // Index1 i;
     Index1 i =new Index1();
     i.Increment();
     i.Display();
     i.Decrement();
     i.Display();
   }
 }
