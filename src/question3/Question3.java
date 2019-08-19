package question3;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        //c=a+b
        System.out.println("add-" + a + b);
        //a*b
        System.out.println("multiply-" + a * b);
        //a-b
        if (a > b)
            System.out.println(a - b);
        else System.out.println(b - a);
        //a/b
        System.out.println("devide-" + a / b);

        scanner.close();
    }
}
