package arraylesson;

import java.util.Arrays;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of student : ");
        n = scanner.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter score " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }
        System.out.println("All Scores: ");
        System.out.println(Arrays.toString(scores));
        System.out.println("All even scores: ");
        for (int num : scores) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\nAll odd scores: ");
        for (int num : scores) {
            if (num % 2 == 0) continue;
            System.out.print(num + " ");
        }
        System.out.println();
        int sum = 0;
        for (int num : scores) {
            sum = sum + num;
        }
        System.out.println("Total Score : " + sum);
        float avg = sum / (float) n;
        System.out.println("Average is : " + avg);

        int max = scores[0];
        for( int i = 1; i < n; i++ ) {
            if(scores[i] > max) max = scores[i];
        }
        System.out.println("Max is : " + max);
        Arrays.sort(scores);
        
        System.out.println("Final Scores: ");
        System.out.println(Arrays.toString(scores));
    }
}
