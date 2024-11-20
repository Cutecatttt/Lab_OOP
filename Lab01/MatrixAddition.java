import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("m = ");
        int m = scanner.nextInt();
        System.out.print("n = ");
        int n = scanner.nextInt();
        Double[][] matrix = new Double[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("a" + (i+1) + (j+1) + " = ");
                matrix[i][j] = scanner.nextDouble();
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("b" + (i+1) + (j+1) + " = ");
                Double k = scanner.nextDouble();
                matrix[i][j] += k;
            }
        }
        System.out.println("Matrix a + Matrix b : ");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.err.println();
        }
    }
}
