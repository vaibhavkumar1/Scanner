package question4;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 0)
            System.out.println("Zero");
        else if (a > 0)
            System.out.println("positive");
        else if (a < 0)
            System.out.println("negative");
        scanner.close();

    }
}
