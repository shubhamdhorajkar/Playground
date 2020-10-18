import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int first = n ;
      int last = n % 10;
      while(first > 10)
      {
        first = first / 10 ;
      }
      System.out.print(first+last);
      
      
	}
}