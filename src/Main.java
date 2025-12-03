import java.util.*;
class Main
{
    public static void main(String args[])
    {
      int x,y;     //initialization
      Scanner sc = new Scanner(System.in);
      x = sc.nextInt();
      y = sc.nextInt();

      x = x + y;
      y = x - y;
      x = x - y;

        System.out.println(x);
        System.out.println(y);
    }
}