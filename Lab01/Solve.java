import java.util.Scanner;

public class Solve {
    public void FirstDegreeEquation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        if(a == 0) {
            if(b == 0) {
                System.out.print("Infinite solution");
            }
            else {
                System.out.print("No solution");
            }
        }
        else {
            System.out.print("x = " + (-a/b));
        }
    }

    public void SystemOfFirstDegreeEquations() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a1 = ");
        double a1 = scanner.nextDouble();
        System.out.print("b1 = ");
        double b1 = scanner.nextDouble();
        System.out.print("c1 = ");
        double c1 = scanner.nextDouble();
        System.out.print("a2 = ");
        double a2 = scanner.nextDouble();
        System.out.print("b2 = ");
        double b2 = scanner.nextDouble();
        System.out.print("c2 = ");
        double c2 = scanner.nextDouble();

        double det = a1 * b2 - a2 * b1;
        double detX = b2 * c1 - b1 * c2;
        double detY = c2 * a1 - c1 * a2;

        if (det != 0) {
            System.out.println("x = " + detX/det);
            System.out.println("y = " + detY/det);
        } else if (detX == 0 || detY == 0) {
            System.out.println("Infinite solution");
        } else {
            System.out.println("No solution");
        }
    }

    public void SecondDegreeEquation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();

        double delta = b*b - 4*a*c;

        if(delta > 0) {
            System.out.println("x1 = " + ((-b + Math.sqrt(delta))/(2*a)) + "\nx2 = " + ((-b - Math.sqrt(delta))/(2*a)));
        } else if (delta == 0) {
            System.out.println("x = " + (-b/(2*a)));
        } else {
            System.out.println("No solution");
        }

    }
    public static void main(String[] args) {
        System.out.println("Select the type of equation you want to solve:\n1, The first-degree equation with one variable\n2, The system of first-degree equations with two variables\n3, The second-degree equation with one variable");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        Solve solve = new Solve();
        switch (a) {
            case 1: 
                solve.FirstDegreeEquation();
                break;
            case 2:
                solve.SystemOfFirstDegreeEquations();
                break;
            case 3:
                solve.SecondDegreeEquation();
                break;
            default:
                System.out.println("Error");
        }
    }
}
