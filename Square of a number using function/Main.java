import java.util.Scanner;
class Main
{
  public static int square_num(int num)
  {
    int square = num*num;
    return square;
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sq = square_num(n);
      System.out.print(sq);
    }
	} 
