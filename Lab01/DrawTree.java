import java.util.Scanner;

public class DrawTree {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.err.print("n = ");
        int n = scaner.nextInt();
        for(int i = 1; i <= n; i++) {
            int k = n - i;
            for(int j = 1; j <= k; j++) {
                System.out.print(" ");
            }
            int l = 2*i - 1;
            for(int j = 1; j <= l; j++) {
                System.out.print("*");
            }
            for(int j = 1; j <= k; j++) {
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
