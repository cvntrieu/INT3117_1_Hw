import java.util.*;

public class Main {

    public static int payment_amount(int age, boolean student_or_disabled, boolean officer_or_local) {

        if (age < 0) {return -1;}
        if (age < 6) {return 0;}
        if (officer_or_local) {return 50000;}

        int charge = 400000;
        if (age < 18) {charge = 200000;}
        if (student_or_disabled) {charge /= 2;}
        return charge;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        boolean student_or_disabled = scanner.nextBoolean();
        boolean officer_or_local = scanner.nextBoolean();
        System.out.println(payment_amount(age, student_or_disabled, officer_or_local));
        scanner.close();
    }
}
