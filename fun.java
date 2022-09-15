public class fun {
static int count=0;
static void p() {
count++;
if(count <=5270)
{
System.out.println("I am @ number "+count);
p();
}
}
public static void main(String [] args)
{
p();
}
}
