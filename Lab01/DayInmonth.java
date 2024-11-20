import java.util.Scanner;

public class DayInmonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Month: ");
        String m = scanner.nextLine();
        System.out.print("Year: ");
        int y =  scanner.nextInt();
        if(m.equals("January") || m.equals(m == "Jan.") || m.equals(m == "Jan") || m.equals(m == "1")) {
            System.out.println("31");
        } else if(m.equals("February") || m.equals("Feb.") || m.equals("Feb") || m.equals("2")) {
            if(y%4 != 0 || (y%100 == 0 && y%400 != 0)) {
                System.out.println("28");
            } else {
                System.out.println("29");
            }
        }else if(m.equals("March") || m.equals("Mar.") || m.equals("Mar") || m.equals("3")) {
            System.out.println("31");
        }else if(m.equals("April") || m.equals("Apr.") || m.equals("Apr") || m.equals("4")) {
            System.out.println("30");
        }else if(m.equals("May") || m.equals("5")) {
            System.out.println("31");
        }else if(m.equals("June") || m.equals("Jun") || m.equals("6")) {
            System.out.println("30");
        }else if(m.equals("July") || m.equals("Jul") || m.equals("7")) {
            System.out.println("31");
        }else if(m.equals("August") || m.equals("Aug.") || m.equals("Aug") || m.equals("8")) {
            System.out.println("31");
        }else if(m.equals("September") || m.equals("Sep.") || m.equals("Sep") || m.equals("9")) {
            System.out.println("3");
        }else if(m.equals("October") || m.equals("Oct.") || m.equals("Oct") || m.equals("10")) {
            System.out.println("31");
        }else if(m.equals("November") || m.equals("Nov.") || m.equals("Nov") || m.equals("11")) {
            System.out.println("30");
        }else if(m.equals("December") || m.equals("Dec.") || m.equals("Dec") || m.equals("12")) {
            System.out.println("31");
        } else {
            System.out.println("Error");
        }
    }

    
}
