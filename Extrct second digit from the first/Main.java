import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int first = n ;
    while(first > 100)
    {
      first = first / 10 ;
    }
    System.out.println(first%10);
  }
}