package quesion1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine().trim();
        System.out.println("Welcome" + username + "!");
        scanner.close();


    }
}
