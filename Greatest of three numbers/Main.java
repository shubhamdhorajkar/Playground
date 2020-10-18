import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      
      int greater = 0 ;
      if(a>greater)
      {
        greater = a ;
      }
      if(b>greater)
      {
        greater = b ;
      }
    if(c>greater)
      {
        greater = c ;
      }
      System.out.print(greater);
    }
}