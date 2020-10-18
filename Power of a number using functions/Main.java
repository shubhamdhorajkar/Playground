import java.util.Scanner;
class Main
{
  public static int power_num(int base , int exp)
  {
    int power=1;
    while(exp>=1)
    {
       power=power*base;
      exp--;
    }
    return power;
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner (System.in);
    int base = in.nextInt();
    int exp = in.nextInt();
    int power = power_num(base , exp );
    System.out.println(power);
  }
}
