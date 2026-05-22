import java.util.Scanner;
public class inputoutput {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        System.out.printf("first num + second num: %d + %d", num1, num2 );
        System.out.println();
        int ans = num1 + num2;
        System.out.println(ans);
        System.out.println("Enter the flag value:");
        boolean flag = sc.nextBoolean();
        System.out.println(flag);
        sc.close();
    }
}