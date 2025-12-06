import java.util.*;
public class LargeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if(x > y && z < x) {
            System.out.println("The is the largest number" + x);
        } else if(y > x && z < y) {
            System.out.println("The is the largest number" + y); //
        } else {
            System.out.println("The is the largest number " + z);
        }
    }
}
