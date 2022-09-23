package question;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your name: ");
        String name = sc.next();

        try{
            System.out.println("Enter your age: ");
            age = sc.nextInt();
            if(age < 18){
                throw new AgeLessThan18Exception("ERROR!!!! Age is less than 18");
            }
            else if(age > 60 ){
                throw new AgeGreaterThan60Exception("ERROR!!!  Age is greater than 60");
            } else{
                System.out.println("Your name is " + name + " and you're " + age + " years old");
            }
        }catch (AgeLessThan18Exception | AgeGreaterThan60Exception e){
            System.out.println(e.getCause());
        }

    }
}
