import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int f = n / 10 ;
      int l = n % 10 ;
      System.out.println(f+l);
      
	}
}