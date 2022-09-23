package Experiment_3;

import java.util.Scanner;

public class FDAccount extends Account {
    double interestRate;
    double amount;
    double no_of_days, age;
    double gen_interest, sen_interest;
    Scanner FDScanner = new Scanner(System.in);

    double calculateInterest(double amount) throws InvalidAgeException, InvalidAmountException, InvalidDaysException {
        this.amount = amount;

        System.out.println("Enter number of days: ");
        no_of_days = FDScanner.nextInt();
        System.out.println("Enter your age: ");
        age = FDScanner.nextInt();

        if(amount < 0) throw new InvalidAmountException();
        if (age<0) throw new InvalidAgeException();
        if(no_of_days<0) throw new InvalidDaysException();



        if (amount < 10000000) {
            if (no_of_days >= 7 && no_of_days <= 14) {
                gen_interest = 0.045;
                sen_interest = 0.050;
            } else if (no_of_days >= 15 && no_of_days <= 29) {
                gen_interest = 0.047;
                sen_interest = 0.0525;
            } else if (no_of_days >= 30 && no_of_days <= 44) {
                gen_interest = 0.055;
                sen_interest = 0.060;
            } else if (no_of_days >= 45 && no_of_days <= 60) {
                gen_interest = 0.070;
                sen_interest = 0.075;
            } else if (no_of_days >= 61 && no_of_days <= 184) {
                gen_interest = 0.075;
                sen_interest = 0.080;
            } else if (no_of_days >= 185 && no_of_days <= 365) {
                gen_interest = 0.080;
                sen_interest = 0.085;
            }
            interestRate = (age < 50) ? gen_interest : sen_interest;
        } else {
            if (no_of_days >= 7 && no_of_days <= 14) {
                interestRate = 0.065;
            } else if (no_of_days >= 15 && no_of_days <= 29) {
                interestRate = 0.0675;
            } else if (no_of_days >= 30 && no_of_days <= 45) {
                interestRate = 0.00675;
            } else if (no_of_days >= 45 && no_of_days <= 60) {
                interestRate = 0.080;
            } else if (no_of_days >= 61 && no_of_days <= 184) {
                interestRate = 0.085;
            } else if (no_of_days >= 185 && no_of_days <= 365) {
                interestRate = 0.10;
            }
        }

        return amount * interestRate;
    }
}
