package Experiment_3;

import java.util.Scanner;

public class SBAccount {

    double interestRate;
    double amount;
    double normal_int, NRI_int;
    Scanner SBScanner = new Scanner(System.in);


    public double calculateInterest(double amount) throws InvalidAgeException, InvalidAmountException, InvalidDaysException{
        this.amount= amount;
        System.out.println("Select the type of your account: "+"\n"+"1. Normal"+"\n"+"2. NRI");
        int c = SBScanner.nextInt();
        switch (c){
            case 1:
                interestRate =  amount * 0.04;
                break;
            case 2:
                interestRate = amount * 0.06;
                break;
            default:
                System.out.println("Error!! Try again with a valid choice");
        }

        return interestRate;
    }
}
