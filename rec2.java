class rec2{
  public static void main(String[] args) {
    recursion();
  }
  public static void recursion(){

    String msg="I am recursion message becuase I call function again and again itself";
    System.out.println(msg);
    recursion();
  }
}
