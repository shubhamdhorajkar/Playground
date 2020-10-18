import java.util.Scanner;
class Main
{
  public static int sum_num(int num)
  {
    int sum = 0 ;
    while( num >= 0)
    {
      sum = sum + num ;
      num--;
    }
    return sum;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int s = sum_num(n);
      System.out.println(s);
	}
}