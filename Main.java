class Main {
  public static void main(String[] args) {
    System.out.println("I am in main ");
    italy();

    System.out.println("I am finallyh back in main menu");
  }
  static void italy (){
    System.out.println("italian ducati");
    austria();
    System.out.println("back in italy");
  }
  static void austria(){
    System.out.println("I am austrian ktm");
    india();
    System.out.println("back in ustria");
  }
  static void india(){
    System.out.println("I am Indian Apache");
    america();
    System.out.println("back in india");
  }
  static void america(){
    System.out.println("i am American Harley Davidson");
    System.out.println("back in america");
  }
}
