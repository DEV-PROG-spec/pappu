package definations;

import java.util.Objects;

public class Video {
    private String videoName;
    private boolean checkOut;
    private int rating;

    public void doCheckout() {
        if (!checkOut) {
            setCheckOut(true);
        }
    }

    public void doReturn() {
        if (checkOut) {
            setCheckOut(false);
        }
    }

    //Constructor:Used to initialize the values of fields
    public Video() {
        videoName = "War";
        rating = 5;
        checkOut = true;
    }

    public Video(String videoName, int rating, boolean checkOut) {
        this.videoName = videoName;
        this.rating = rating;
        this.checkOut = checkOut;
    }

    public Video(String videoName) {
        this.videoName = videoName;
        rating = 3;
        checkOut = false;
    }
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

    public String toString() {
        return String.format("Video Name=%s,Video Rating=%d,Is video checkout=%b", getVideoName(), getRating(), isCheckOut());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return isCheckOut() == video.isCheckOut() &&
                getRating() == video.getRating() &&
                Objects.equals(getVideoName(), video.getVideoName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVideoName(), isCheckOut(), getRating());
    }
}
