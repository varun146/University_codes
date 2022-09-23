package Experiment_2;
import java.util.ArrayList;
import java.util.List;

public class VideoStore extends Video{
    public VideoStore()
    {
        super();
    }
    public VideoStore(String title){
        super(title);
    }
    List<Video> inventory = new ArrayList<Video>(10);
    int counter = 0;

    public void addVideo(String movie){
        Video video = new VideoStore(movie);
        inventory.add(video);
        counter++;
    }

    public void CheckOut(String movie){
        int counter = 0;
        for (int i=0; i<inventory.size(); i++){
            if(inventory.get(i).title.equals(movie)){
                inventory.get(i).toCheckOut(movie);
                System.out.println("Have a great watch");
            }else{
                counter++;
            }
        }

        if(counter == inventory.size()){
            System.out.println("Sorry for the inconvenience ***** We don't have this movie right now");
        }

    }
    public void returnVideo(String movie){
        int counter = 0;
        for (int i=0; i<inventory.size(); i++){
            if(inventory.get(i).title.equals(movie)){
                inventory.get(i).toReturn(movie);
                System.out.println("Movie is returned back to the inventory");
            }else{
                counter++;
            }
        }

        if(counter == inventory.size()){
            System.out.println("There's no such movie right now in the inventory");
        }
    }
    public void recieveRating(String movie, int rating){
        int counter = 0;
        for (int i=0; i<inventory.size(); i++){
            if(inventory.get(i).title.equals(movie)){
                inventory.get(i).toRate(rating);
                System.out.println("");
            }else{
                counter++;
            }
        }

        if(counter == inventory.size()){
            System.out.println("There's no such movie in the inventory right now");
        }
    }
    public void listInventory(){
        if(inventory.size() == 0){
            System.out.println("Inventory is empty!!");
            return;
        }
        for(Video video : inventory){
            System.out.println(video.title + "  "+ video.flag  + "  " + video.rating);

        }
    }
}
