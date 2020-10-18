import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int f = num /100;
    int s = (num /10 )%10;
    int l = num %10;
    
    int rev = l * 100+s*10+f;
    System.out.print(rev);
      
  }
}