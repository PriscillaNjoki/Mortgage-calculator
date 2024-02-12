import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final byte PERCENT = 100;
        final byte MONTHS_IN_YEAR = 12;
        Scanner scanner = new Scanner(System.in);
        int Principal = 0;
        double AnnualInterest = 0;
        double monthlyInterest = 0;
        int numberOfPayments = 0;


        while (true) {
            System.out.print("Principal: ");
            Principal = scanner.nextInt();
            if (Principal > 1000 && Principal < 1_000_000)
                break;
            System.out.println("enter a value between 1000 and 1m");
        }
        while (true) {
            System.out.println("Annual interest: ");
            AnnualInterest = scanner.nextDouble();
            monthlyInterest = AnnualInterest / PERCENT / MONTHS_IN_YEAR;
            if (AnnualInterest > 1 && AnnualInterest <= 30)
                break;
            System.out.println("enter a value between 1 and 30");


        }
        while (true) {

            System.out.println("Period: ");
            int Period = scanner.nextInt();
             numberOfPayments = Period * MONTHS_IN_YEAR;
            if (Period >= 1 && Period <= 30)
                break;
            System.out.println("enter a value betweeen 1 and 30");
        }

        double MORTGAGE = Principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) / Math.pow(1 + monthlyInterest, numberOfPayments) - 1;

        String RevisedMORTGAGE = NumberFormat.getCurrencyInstance().format(MORTGAGE);//to get the mortgage in currency.
        System.out.println("MORTGAGE: " + RevisedMORTGAGE);
    }
}





