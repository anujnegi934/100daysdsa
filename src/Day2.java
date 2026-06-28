//delete element from an array

import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int pos = scanner.nextInt();

        if (pos >= 1 && pos <= n) {

            for (int i = pos - 1; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            for (int i = 0; i < n - 1; i++) {
                System.out.print(arr[i]);

                if (i < n - 2) {
                    System.out.print(" ");
                }
            }
            System.out.println();

        } else {
            System.out.println("Invalid position");
        }

        scanner.close();
    }
}