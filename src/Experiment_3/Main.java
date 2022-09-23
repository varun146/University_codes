package Experiment_3;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws InvalidAgeException, InvalidAmountException, InvalidDaysException  {

        Scanner sc = new Scanner(System.in);
        double a = 0.0750;
        double b = 20000;
        System.out.println(a*b);
        int choice;

        do{
            System.out.println("************** CALCULATOR OF INTEREST *****************");


            System.out.println("Select the calculator you want to use: ");
            System.out.println("1. For SB account" + "\n" + "2. For FD account" +  "\n" + "3. For RD account" + "\n" + "4. Exit");
            choice = sc.nextInt();
            double amount;
            switch (choice){

                case 1:
                    try {
                        SBAccount sb_acc = new SBAccount();
                        System.out.println("Enter the amount: ");
                        amount = sc.nextDouble();
                        System.out.println("Interest gained is: Rs " + sb_acc.calculateInterest(amount));

                        break;
                    }catch (InvalidAgeException e){
                        System.out.println("Invalid age entered!!");
                    }catch (InvalidAmountException e){
                        System.out.println("Invalid amount entered!!");
                    }catch (InvalidDaysException e){
                        System.out.println("Invalid number of Days");
                    }
                    break;
                case 2:
                    try{
                        FDAccount fd_acc = new FDAccount();
                        System.out.println("Enter the FD amount: ");
                        amount = sc.nextDouble();
                        System.out.println("Interest gained is: Rs " + fd_acc.calculateInterest(amount) );
                    }catch (InvalidAgeException e){
                        System.out.println("Invalid age entered!!");
                    }catch (InvalidAmountException e){
                        System.out.println("Invalid amount entered!!");
                    }catch (InvalidDaysException e) {
                        System.out.println("Invalid number of Days");
                    }

                    break;


                case 3:
                    try{
                        RDAccount rd_acc = new RDAccount();
                        System.out.println("Enter the RD amount: ");
                        amount = sc.nextDouble();
                        System.out.println("Interest gained is: Rs " + rd_acc.calculateInterest(amount));
                        break;
                    }catch (InvalidAgeException e){
                        System.out.println("Invalid age entered!!");
                    }catch (InvalidAmountException e){
                        System.out.println("Invalid amount entered!!");
                    }catch (InvalidDaysException e){
                        System.out.println("Invalid number of Days");
                    }catch(InvalidMonthsException e){
                        System.out.println("Invalid number of months entered!!");
                    }
                    break;
                case 4:
                    System.out.println("Thank You for using our calculator, have a nice day");
                    break;
            }

        }while(choice!=4);


    }
}
