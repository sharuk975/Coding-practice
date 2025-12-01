import java.util.*;
public class evenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");99
        int a = sc.nextInt();

        if(a%2 == 0) {
            System.out.println("The given number is even");
        } else {
            System.out.println("It's a odd number");
        }
    }
}
