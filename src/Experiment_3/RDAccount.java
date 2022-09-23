package Experiment_3;

import java.util.Scanner;

public class RDAccount {
    double interestRate;
    double amount;
    double no_of_months, age;
    double gen_interest, sen_interest;
    Scanner RDScanner = new Scanner(System.in);


    public double calculateInterest(double amount) throws InvalidAgeException, InvalidAmountException, InvalidDaysException, InvalidMonthsException{
        this.amount = amount;

        System.out.println("Enter number of months: ");
        no_of_months = RDScanner.nextInt();
        System.out.println("Enter the age of account holder: ");
        age = RDScanner.nextInt();

        if(amount < 0) throw new InvalidAmountException();
        if (age<0) throw new InvalidAgeException();
        if(no_of_months<0) throw new InvalidDaysException();

        if (no_of_months <= 6) {
            gen_interest = .0750;
            sen_interest = 0.080;
        } else if (no_of_months <= 9) {
            gen_interest = .0775;
            sen_interest = 0.0825;
        } else if (no_of_months <= 12) {
            gen_interest = .0800;
            sen_interest = 0.0850;
        } else if (no_of_months <= 15) {
            gen_interest = .0825;
            sen_interest = 0.0875;
        } else if (no_of_months <= 18) {
            gen_interest = .0850;
            sen_interest = 0.0900;
        } else if (no_of_months >= 22) {
            gen_interest = .0875;
            sen_interest = 0.0925;
        }

        interestRate = (age < 50) ? gen_interest:sen_interest;

        return amount * interestRate;
    }


}
