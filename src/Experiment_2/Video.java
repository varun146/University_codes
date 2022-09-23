package Experiment_2;
public class Video {
    String title;
    boolean flag;
    int rating;
    public Video(){}

    public Video(String title){
        this.flag = true;
        this.rating = 0;
        this.title = title;
    }
    public void toCheckOut(String title){flag = false;}
    public void toReturn(String title){flag = true;}
    public void toRate(int number){ this.rating = number;}
}
