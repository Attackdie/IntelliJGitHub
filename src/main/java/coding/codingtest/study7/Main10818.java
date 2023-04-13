package coding.codingtest.study7;
import java.util.Scanner;


public class Main10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 1000000;
        int max = -1000000;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        System.out.println(min + " " + max);
    }
}