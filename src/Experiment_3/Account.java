package Experiment_3;

public abstract class Account {
    double interestRate;
    double amount;
    abstract double calculateInterest(double amount) throws InvalidAgeException, InvalidAmountException, InvalidDaysException;
}
