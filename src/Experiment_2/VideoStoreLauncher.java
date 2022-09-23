package Experiment_2;
import java.util.Scanner;

public class VideoStoreLauncher extends VideoStore {
    public static void main(String[] args) {
        VideoStore obj = new VideoStore();
        Scanner sc = new Scanner(System.in);
        int choice;

        obj.addVideo("Interstellar");
        obj.addVideo("Inception");
        obj.addVideo("Deadpool");

        do
        {
            System.out.println("1. Add");
            System.out.println("2. Check out");
            System.out.println("3. Return");
            System.out.println("4. Rate");
            System.out.println("5. List the inventory");
            System.out.println("6. Exit the inventory");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Enter the name of the movie: ");
                    obj.addVideo(sc.next());
                    System.out.println("your movie's added to the inventory successfully");
                    break;
                case 2:
                    System.out.println("movie you'd like to check out?");
                    obj.CheckOut(sc.next());
                    break;
                case 3:
                    System.out.println("which one would you like to return?");
                    obj.returnVideo(sc.next());
                    break;
                case 4:
                    System.out.println("Movie you would like to give rating to:  ");
                    String movie_name = sc.next();
                    System.out.println("How much would you rate it?");
                    int score = sc.nextInt();
                    obj.recieveRating(movie_name, score);
                case 5:
                    obj.listInventory();
                case 6:
                    break;
            }
        }
        while(choice!=6);

    }
}
