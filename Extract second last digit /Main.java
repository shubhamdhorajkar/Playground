import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      System.out.print((num%100)/10);
	}
}