import java.util.Scanner;
public class Power{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value:");
        int a=sc.nextInt();
        System.out.println("Enter Exponent value:");
        int b=sc.nextInt();
        System.out.println("power is:" + Math.pow(a, b));
        sc.close();
    }
}
