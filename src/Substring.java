import java.lang.*;
import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your string: ");
        String s = scanner.next();
        System.out.print("Start of the string: ");
        int start = scanner.nextInt();
        System.out.print("End of the string: ");
        int end = scanner.nextInt();

        String subst;

//        prints the substring from the specified beginning to the end specified
        if ((s.length()) >= 1 && (s.length()) <= 100) {
            if (start > 0 && start <= end) {
                subst = s.substring(start, end);
                System.out.println("substring = " + subst);
            }
            else System.out.println("Not the required length");
            } else
                System.out.println("String too long or too short");
        }
    }


//public class Substring {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter Your string: ");
//        String s = scanner.next();
//        System.out.print("Start of the string: ");
//        int start = scanner.nextInt();
//        System.out.print("End of the string: ");
//        int end = scanner.nextInt();
//
//        String substr;
//
//// prints the substring from the specified beginning to the end specified
//        if ((s.length()) >= 1 && (s.length()) <= 100) {
//            if (start > 0 && start <= end) {
//                substr = s.substring(start, end);
//                System.out.println("substring = " + substr);
//            }
//            else System.out.println("Not the required length");
//        }
//        else
//            System.out.println("String too long or too short");
//
//        }
//    }

