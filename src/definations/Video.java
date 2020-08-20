package definations;

public class Video {
    private String videoName;
    private boolean checkOut;
    private int rating;
    // Some specials types of methods in java

    //1.The getter method:Used to read the value of private fields.
    //Observer method / Accessor method
    public String getVideoName() {
        return videoName;
    }

    //2.The setter method:Used to write the value of private fields.
    //Transformer method / Mutator method.
    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    //exception for booleans: name of getter method start with is .

    public boolean isCheckOut() {
        return checkOut;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }
}
