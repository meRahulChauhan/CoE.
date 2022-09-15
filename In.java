class Human{
 public static  void Name(){
     System.out.println("they have name ");
 }

  public static void Gender(){
     System.out.println("they have gender ");

 }

  public static void Leg(){
     System.out.println("they have leg ");
 }

  public static void Hair(){
     System.out.println("they have hair ");
 }

  public static void Face(){
     System.out.println("they have face ");

 }


}

class rc extends Human{


  public static void Name(){
    System.out.println("Rahul is a name");
    //super.Name();
  }
  public static void Gender(){
    System.out.println("gender is Male");
    //super.Gender();
  }

  public static void Leg(){
    System.out.println("rahul has 2 leg");
    //super.Leg();
  }

  public static void Hair(){
    System.out.println("hair color is black");
    //super.Hair();
  }

  public static void Face(){
    System.out.println("Face is symmetrically good");
    //super.Face();
  }

}
public class In{
    public static void main(String args []){

     Human r=new Human();
     r.Name();
     r.Face();
     r.Gender();
     r.Hair();

     rc rahul= new rc();
     rahul.Name();
     rahul.Face();
     rahul.Gender();
     rahul.Hair();




    }
}
