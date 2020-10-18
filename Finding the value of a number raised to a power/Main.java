import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int exp = in.nextInt();
      int prod = base ;
      while(exp>1)
      {
        prod = prod * base ;
        exp--;
      }
      System.out.print(prod);
    }
}