import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner in = new Scanner(System.in);
      int option = in.nextInt();
      switch(option)
      {
        case 1:
          int side = in.nextInt();
          int area_square = side * side ;
          System.out.print(area_square);
          break;
        case 2:
          int length = in.nextInt();
          int breadth = in.nextInt();
          int area_rect = length*breadth ;
          System.out.print(area_rect);
          break;
        case 3:
          int base = in.nextInt();
          int height = in.nextInt();
          double area_triangle = 0.5 * base * height ;
          System.out.print(area_triangle);
          break;
        case 4:
          int rad = in.nextInt();
          double area_cir = 3.14 * rad * rad ;
          System.out.print(area_cir);
          break;
      }
    }
}