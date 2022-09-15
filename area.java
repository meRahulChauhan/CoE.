  class area {
  public static void main(String[] args) {
    float length , breadth ,value;
    length=10;
    breadth=20;
    System.out.println("still in main class");
    System.out.println("length ="+length);
    System.out.println("breadth ="+breadth);
    square();
    perimeter();
  }
  static void perimeter(){
    float length , breadth ,value;
    length=20;
    breadth=20;
    System.out.println("length ="+length);
    System.out.println("breadth ="+breadth);
    value=2*(length+breadth);
    System.out.println("Perimeter ="+value+" meter");
  }
  static void square(){
  float length , breadth ,value;
  length=30;
  breadth=20;
  value=length*breadth;
  System.out.println("length ="+length);
  System.out.println("breadth ="+breadth);
  System.out.println("square ="+value+" square meter");
}
}
